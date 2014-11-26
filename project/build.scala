
import sbt._
import Process._
import Keys._

object Build extends android.AutoBuild {
  lazy val root = (project in file(".")).
    settings(
      scalaVersion := "2.11.4",
      libraryDependencies += "org.scaloid" %% "scaloid" % "3.6.1-10" withSources() withJavadoc()
  )
}
