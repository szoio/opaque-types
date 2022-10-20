val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "opaque-types",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "io.circe" %% "circe-generic" % "0.14.3",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
