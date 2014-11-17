name := "play-scala"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.4"

resolvers += Resolver.typesafeIvyRepo("releases")

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
