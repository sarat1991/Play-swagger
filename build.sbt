name := "swagtest"
 
version := "1.0" 
      
lazy val `swagtest` = (project in file(".")).enablePlugins(PlayJava)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq( javaJdbc , cache , javaWs, /*"com.wordnik" %% "swagger-play2" % "1.3.12",*/
  "org.webjars" %% "webjars-play" % "2.5.0-4",
  "org.webjars" % "swagger-ui" % "2.2.0",
  "io.swagger" %% "swagger-play2" % "1.5.3",
    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    "org.projectlombok" % "lombok" % "1.18.2" % "provided"

/*  "com.wordnik" %% "swagger-play2" % "1.3.12" exclude("org.reflections", "reflections"),
  "org.reflections" % "reflections" % "0.9.8" notTransitive (),
  "org.webjars" % "swagger-ui" % "2.1.8-M1"*/
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      