name := "twitter-streams-manager"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "net.debasishg" % "redisclient_2.10" % "2.12",
  "org.mongodb" %% "casbah" % "2.5.0",
  "com.sksamuel.elastic4s" %% "elastic4s" % "1.0.1.1"
)     

play.Project.playScalaSettings
