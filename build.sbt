name := "org.sustain-clustering"

version := "0.0.4"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.mongodb.spark" %% "mongo-spark-connector" % "2.1.6",
  "org.apache.spark" %% "spark-core" % "2.2.1" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.1.3"
)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

test in assembly := {}