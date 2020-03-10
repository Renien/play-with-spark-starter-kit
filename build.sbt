name := """play-with-spark-starter-kit"""
organization := "play-spark"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies  ++= Seq(
  "org.apache.hadoop" % "hadoop-client" % "2.7.2",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.10.2",
  guice,
  javaWs,
  "org.apache.spark" %% "spark-core" % "2.4.0",
  "org.apache.spark" %% "spark-sql" % "2.4.0",
  "org.apache.spark" %% "spark-mllib" % "2.4.0"
)
