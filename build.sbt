import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(Seq(
      organization := "me.sueka",
      scalaVersion := "2.11.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "libcp",
    libraryDependencies += scalaTest % Test,
    autoCompilerPlugins := false,
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked"
    )
  )
