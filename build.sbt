val scalaVersionNumber = "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "projet_data-engineer",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersionNumber,
    resolvers += "Maven Central" at "https://repo1.maven.org/maven2/",
    resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases/",
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core" % "0.14.1",
      "io.circe" %% "circe-generic" % "0.14.1",
      "io.circe" %% "circe-parser" % "0.14.1",
      "org.apache.kafka" %% "kafka-streams-scala" % "2.8.0",
      "org.apache.kafka" % "kafka-streams" % "2.8.0",
      "org.apache.kafka" % "kafka-clients" % "2.8.0",
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.14.1",
      "org.apache.logging.log4j" % "log4j-api" % "2.14.1",
      "org.apache.logging.log4j" % "log4j-core" % "2.14.1",
      "javax.activation" % "activation" % "1.1.1",
      "com.twilio.sdk" % "twilio" % "8.25.0",
      "software.amazon.awssdk" % "s3" % "2.17.182"
    )
  )