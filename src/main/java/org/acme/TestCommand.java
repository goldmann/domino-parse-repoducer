package org.acme;

import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Path;
import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "test", mixinStandardHelpOptions = true)
public class TestCommand implements Callable<Integer> {
	@Option(names = { "-c",
			"--config", }, paramLabel = "FILE", description = "Location of the runtime configuration file.", required = true)
	Path configPath;

	@Override
	public Integer call() throws Exception {

		ProcessBuilder processBuilder = new ProcessBuilder().redirectOutput(Redirect.INHERIT)
				.redirectError(Redirect.INHERIT);
		processBuilder.command(
				"java",
				"-jar",
				"domino-0.0.90.jar",
				"from-maven",
				"report",
				String.format("--project-dir=."),
				String.format("--output-file=./bom.json"),
				"--manifest",
				"--include-non-managed",
				"--warn-on-missing-scm");

		Process process = null;
		process = processBuilder.start();
		int exitCode = -1;
		exitCode = process.waitFor();

		if (exitCode != 0) {
			throw new RuntimeException("SBOM generation failed, see logs above");
		}

		return 0;
	}
}
