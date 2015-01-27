import play.sbt.forkrun.PlayForkRun
import PlayForkRun.autoImport._

name := "play-scala"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

fork in run := true

logLevel in (Compile, run) := Level.Debug

PlayForkRunKeys.playForkLogSbtEvents := true

resolvers += Resolver.typesafeIvyRepo("releases")

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
