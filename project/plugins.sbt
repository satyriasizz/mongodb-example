resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")