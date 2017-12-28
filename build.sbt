name := "scala-docker-example"

lazy val root = (project in file("."))
  // JavaAppPackaging: Archetype of command line application
  // AshScriptPlugin : Using Ash command line
  // DockerPlugin    : Docker package plugin
  .enablePlugins(JavaAppPackaging, AshScriptPlugin, DockerPlugin)
  .settings(
    organization := "io.github.atty303",
    name := "example01",
    version := "1.0.0-SNAPSHOT",
    scalaVersion := "2.11.8",
    mainClass in (Compile, run) := Some("Boot"),

    dockerBaseImage := "java:8-jdk-alpine"
  )