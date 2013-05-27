import sbt._
import sbt.Keys._

object TypoSafeBuild extends Build {
val test = Seq(
  // "org.scalatest" % "scalatest_2.10.0-M4" % "1.9-2.10.0-M4-B1"
  // "org.scalatest" %% "scalatest" % "2.0.M6-SNAP8" % "test"
  // "org.scalatest" %% "scalatest" % "1.6.1" % "test"
    "org.scalatest" %% "scalatest" % "2.0.M4" % "test",
      "org.seleniumhq.selenium" % "selenium-java" % "2.25.0" % "test"
)
val default = test

lazy val typoSafe = Project(
id = "stat",
base = file("."),
settings = Project.defaultSettings ++ Seq(
name := "stat",
scalaVersion := "2.9.1",
version := "1.0",
resolvers += "scala-tools releases" at "http://scala-tools.org/repo-releases",
resolvers += "releases" at "http://oss.sonatype.org/content/repositories/releases",
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
libraryDependencies := default
)
)
}
