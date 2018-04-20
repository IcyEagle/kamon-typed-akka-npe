name := "kamon-typed-akka-npe"
version := "1.0"
scalaVersion := "2.12.5"
resolvers += Resolver.bintrayRepo("kamon-io", "releases")

lazy val akkaVersion = "2.5.12"
lazy val akkaTypedVersion = "2.5.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-typed" % akkaTypedVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
)

// tag:base-dependencies:start
libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "1.1.0",
  "io.kamon" %% "kamon-akka-2.5" % "1.0.1",
)
// tag:base-dependencies:end