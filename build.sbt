name := "Boilerplate"

organization := "nl.tvogels"

version:= "2.0-SNAPSHOT"

scalaVersion := "2.10.4"

cancelable in Global := true
fork in run := true

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.4" % "test"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.1"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.4.1"

libraryDependencies += "org.mongodb" %% "casbah" % "3.1.0"


javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

initialize := {
  val _ = initialize.value
  val javaVersion = sys.props("java.specification.version")
  if (javaVersion != "1.8")
    sys.error("Java 1.8 is required for this project. Found " + javaVersion + " instead")
}