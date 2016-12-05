name := "nephar"

organization := "NexT"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalafx"   %% "scalafx"   % "8.0.102-R11",
  "org.scalatest" %% "scalatest" % "3.0.0"  % "test" //http://www.scalatest.org/download
)

shellPrompt := { state => System.getProperty("user.name") + "> " }

// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
mainClass in (Compile, run) := Some("nephar.ScalaFXHelloWorld")

// Fork a new JVM for 'run' and 'test:run' to avoid JavaFX double initialization problems
fork := true