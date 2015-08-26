name := "kickr"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
DigestKeys.algorithms += "sha1"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "4.0",
  "javax.inject" % "javax.inject" % "1",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.5.0.akka23",
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "org.webjars.bower" % "react" % "0.13.3",
  "org.webjars" % "jquery" % "2.1.4",
  "org.webjars.bower" % "react-bootstrap" % "0.24.5",
  "org.webjars.bower" % "react-router" % "0.13.3"
)