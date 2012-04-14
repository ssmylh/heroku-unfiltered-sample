import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

organization := "com.github.ssmylh"

name := "heroku-unfiltered-sample"

scalaVersion := "2.9.1"

version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.6.1",
  "net.databinder" %% "unfiltered-jetty" % "0.6.1",
  "org.clapper" %% "avsl" % "0.3.8"
)

resolvers ++= Seq(
  "typesafe" at "http://repo.typesafe.com/typesafe/releases/"
)
