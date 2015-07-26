name := """module-sample-project"""

version := "1.0-SNAPSHOT"

lazy val module = (project in file("module")).enablePlugins(PlayJava)

lazy val root = (project in file(".")).enablePlugins(PlayJava).aggregate(module).dependsOn(module)


scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
