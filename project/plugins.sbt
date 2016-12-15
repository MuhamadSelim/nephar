addSbtPlugin("org.ensime" % "sbt-ensime" % "1.12.3")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.20-R6"

libraryDependencies += "org.scalafx" %% "scalafxml-core-sfx8" % "0.2.2"
