import sbt._
import sbt.Keys._

object ApplicationBuild extends Build {
  val appName = "twitter-streams-manager"
  val appVersion = "1.0"
  val salatVersion = "1.9.2"

  val appDependencies = Seq(
    "com.typesafe.play" %% "play-cache" % "2.2.2",
    "com.typesafe" %% "play-plugins-redis" % "2.1.1",
    "com.novus" %% "salat" % salatVersion ,
    "com.novus" %% "salat-core" % salatVersion,
    "org.mongodb" %% "casbah-core" % "2.5.0",
    "org.elasticsearch" % "elasticsearch" % "1.0.1"
  )

  val main = play.Project(appName, appVersion, appDependencies)
    .settings(
      resolvers += Resolver.url("Objectify Play Repository", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
      resolvers += "Sedis Repo" at "http://pk11-scratch.googlecode.com/svn/trunk"
    )
}