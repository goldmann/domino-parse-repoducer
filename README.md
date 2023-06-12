Run with:

```
./mvnw quarkus:dev -Dquarkus.args="test --config abc"
```

Expect this:

```
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2023-06-12 14:14:57,325 INFO  [io.quarkus] (Quarkus Main Thread) code-with-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.1.1.Final) started in 0.102s.

2023-06-12 14:14:57,326 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-06-12 14:14:57,326 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, picocli]
2023-06-12 14:14:57,327 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (Aesh InputStream Reader) Live reload total time: 0.172s

--
Tests paused
Press [r] to resume testing, [o] Toggle test output, [:] for the terminal, [h] for more options>java.lang.RuntimeException: Failed to initialize Maven artifact resolver
	at io.quarkus.domino.cli.BaseDepsToBuildCommand.getArtifactResolver(BaseDepsToBuildCommand.java:361)
	at io.quarkus.domino.cli.BaseDepsToBuildCommand.call(BaseDepsToBuildCommand.java:224)
	at io.quarkus.domino.cli.BaseDepsToBuildCommand.call(BaseDepsToBuildCommand.java:25)
	at picocli.CommandLine.executeUserObject(CommandLine.java:2041)
	at picocli.CommandLine.access$1500(CommandLine.java:148)
	at picocli.CommandLine$RunLast.executeUserObjectOfLastSubcommandWithSameParent(CommandLine.java:2461)
	at picocli.CommandLine$RunLast.handle(CommandLine.java:2453)
	at picocli.CommandLine$RunLast.handle(CommandLine.java:2415)
	at picocli.CommandLine$AbstractParseResultHandler.execute(CommandLine.java:2273)
	at picocli.CommandLine$RunLast.execute(CommandLine.java:2417)
	at io.quarkus.picocli.runtime.PicocliRunner$EventExecutionStrategy.execute(PicocliRunner.java:26)
	at picocli.CommandLine.execute(CommandLine.java:2170)
	at io.quarkus.picocli.runtime.PicocliRunner.run(PicocliRunner.java:40)
	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:129)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
Caused by: io.quarkus.bootstrap.resolver.maven.BootstrapMavenException: Failed to load current project at /home/goldmann/Downloads/code-with-quarkus/./pom.xml
	at io.quarkus.bootstrap.resolver.maven.BootstrapMavenContext.resolveCurrentProject(BootstrapMavenContext.java:327)
	at io.quarkus.bootstrap.resolver.maven.BootstrapMavenContext.<init>(BootstrapMavenContext.java:173)
	at io.quarkus.bootstrap.resolver.maven.MavenArtifactResolver.<init>(MavenArtifactResolver.java:91)
	at io.quarkus.bootstrap.resolver.maven.MavenArtifactResolver$Builder.build(MavenArtifactResolver.java:75)
	at io.quarkus.domino.cli.BaseDepsToBuildCommand.getArtifactResolver(BaseDepsToBuildCommand.java:359)
	... 16 more
Caused by: java.lang.IllegalStateException: Failed to parse command line arguments [quarkus:dev, -Dquarkus.args=test, --config, abc]
	at io.quarkus.bootstrap.resolver.maven.options.BootstrapMavenOptions.invokeParser(BootstrapMavenOptions.java:250)
	at io.quarkus.bootstrap.resolver.maven.options.BootstrapMavenOptions.parse(BootstrapMavenOptions.java:70)
	at io.quarkus.bootstrap.resolver.maven.options.BootstrapMavenOptions.newInstance(BootstrapMavenOptions.java:121)
	at io.quarkus.bootstrap.resolver.maven.options.BootstrapMavenOptions.newInstance(BootstrapMavenOptions.java:117)
	at io.quarkus.bootstrap.resolver.maven.BootstrapMavenContext.getCliOptions(BootstrapMavenContext.java:211)
	at io.quarkus.bootstrap.resolver.maven.BootstrapMavenContext.isOffline(BootstrapMavenContext.java:260)
	at io.quarkus.bootstrap.resolver.maven.BootstrapMavenContext.newRepositorySystem(BootstrapMavenContext.java:741)
	at io.quarkus.bootstrap.resolver.maven.BootstrapMavenContext.getRepositorySystem(BootstrapMavenContext.java:265)
	at io.quarkus.bootstrap.resolver.maven.BootstrapModelResolver.newInstance(BootstrapModelResolver.java:43)
	at io.quarkus.bootstrap.resolver.maven.workspace.WorkspaceLoader.<init>(WorkspaceLoader.java:91)
	at io.quarkus.bootstrap.resolver.maven.workspace.LocalProject.loadWorkspace(LocalProject.java:113)
	at io.quarkus.bootstrap.resolver.maven.BootstrapMavenContext.resolveCurrentProject(BootstrapMavenContext.java:325)
	... 20 more
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.bootstrap.resolver.maven.options.BootstrapMavenOptions.invokeParser(BootstrapMavenOptions.java:246)
	... 31 more
Caused by: java.lang.IllegalStateException: Failed to parse Maven command line arguments
	at io.quarkus.bootstrap.resolver.maven.options.BootstrapMavenOptionsParser.parse(BootstrapMavenOptionsParser.java:102)
	... 36 more
Caused by: org.apache.commons.cli.UnrecognizedOptionException: Unrecognized option: --config
	at org.apache.commons.cli.Parser.processOption(Parser.java:383)
	at org.apache.commons.cli.Parser.parse(Parser.java:210)
	at org.apache.commons.cli.Parser.parse(Parser.java:88)
java.lang.RuntimeException: SBOM generation failed, see logs above66)
	at org.acme.TestCommand.call(TestCommand.java:39)
	at org.acme.TestCommand.call(TestCommand.java:10)
	at picocli.CommandLine.executeUserObject(CommandLine.java:2041)
	at picocli.CommandLine.access$1500(CommandLine.java:148)
	at picocli.CommandLine$RunLast.executeUserObjectOfLastSubcommandWithSameParent(CommandLine.java:2461)
	at picocli.CommandLine$RunLast.handle(CommandLine.java:2453)
	at picocli.CommandLine$RunLast.handle(CommandLine.java:2415)
	at picocli.CommandLine$AbstractParseResultHandler.execute(CommandLine.java:2273)
	at picocli.CommandLine$RunLast.execute(CommandLine.java:2417)
	at picocli.CommandLine.execute(CommandLine.java:2170)
	at org.acme.GreetingCommand.run(GreetingCommand.java:19)
	at org.acme.GreetingCommand_ClientProxy.run(Unknown Source)
	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:132)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.runner.bootstrap.StartupActionImpl$1.run(StartupActionImpl.java:104)
	at java.base/java.lang.Thread.run(Thread.java:833)

2023-06-12 14:14:57,833 INFO  [io.quarkus] (Quarkus Main Thread) code-with-quarkus stopped in 0.000s
```