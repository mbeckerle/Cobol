lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.tresys",
      version      := "0.0.1-SNAPSHOT",
      scalaVersion := "2.12.6",
      crossPaths := false,
      retrieveManaged := true, // important so sbt eclipse doesn't put homedir paths in .classpath
      testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
      // resolvers += "Apache Daffodil (incubating)" at "https://repository.apache.org/content/repositories/orgapachedaffodil-1009/"
    )),
    name := "cobol1",
    libraryDependencies := Seq(
      "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.4.0" % "test",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test",
    )
  )
  //
  // Uncomment this line below to run against IBM DFDL.
  // You need to have IBM DFDL installed and the IBM DFDL Cross Tester
  //
  // Note: This requires a 2.3.0 release of daffodil. (See version of daffodil-tdml-processor above)
  // or a development snapshot (e.g., version "latest.integration")
  // 
  //.settings(IBMDFDLCrossTesterPlugin.settings)


