package org.acme;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@QuarkusMain
@Command(name = "cli", mixinStandardHelpOptions = true, subcommands = { TestCommand.class })
public class GreetingCommand implements QuarkusApplication {
    @Inject
    CommandLine.IFactory factory;

    @Override
    public int run(String... args) throws Exception {
        CommandLine commandLine = new CommandLine(this, factory);

        return commandLine.execute(args);
    }

}
