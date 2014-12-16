name := "mongodb-example"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "org.mongodb" % "casbah_2.11" % "2.7.4",
  "com.novus" % "salat_2.11" % "1.9.9"
)

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)