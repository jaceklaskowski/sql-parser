import com.simplytyped.Antlr4Plugin._

scalaVersion := "2.11.8"

antlr4Settings

antlr4PackageName in Antlr4 := Some("pl.japila.antlr")
antlr4GenListener in Antlr4 := true
antlr4GenVisitor in Antlr4 := true

resolvers += Resolver.mavenLocal
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.0-SNAPSHOT"
