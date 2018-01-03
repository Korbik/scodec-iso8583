name := "scodec-iso-8583"

organization := "org.korbik"

scalaVersion := "2.12.4"

val scodecVersion = "1.10.3"

libraryDependencies ++= Seq(
 "org.scodec" %% "scodec-core" % scodecVersion,
 "org.specs2" %% "specs2-core" % "4.0.2" % "test"
)
    
scalacOptions in Test ++= Seq("-Yrangepos")
