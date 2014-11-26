import android.Keys._

android.Plugin.androidBuild

name := "hello-scaloid-sbt"

scalaVersion := "2.11.4"

proguardCache in Android ++= Seq(
  ProguardCache("org.scaloid") % "org.scaloid"
)

proguardOptions in Android ++= Seq("-dontobfuscate", "-dontoptimize", "-keepattributes Signature", "-printseeds target/seeds.txt", "-printusage target/usage.txt"
  , "-dontwarn scala.collection.**" // required from Scala 2.11.4
)

libraryDependencies += "org.scaloid" %% "scaloid" % "3.6.1-10" withSources() withJavadoc()

// TODO: would like to only add this to the test configuration

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1"

scalacOptions in Compile += "-feature"

run <<= run in Android

install <<= install in Android
