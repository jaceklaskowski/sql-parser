package org.apache.spark.sql

import org.apache.spark.sql.execution.SparkSqlParser
import org.apache.spark.sql.internal.SQLConf

object SparkParser {
  def main(args: Array[String]) = {
    val inputText = "SHOW DATABASES"
    println(s"Parsing $inputText")

    val parser = new SparkSqlParser(new SQLConf)
    val expr = parser.parseExpression(inputText)
    val info = s"""|sql:     ${expr.sql}
                   |simple:  ${expr.simpleString}
                   |verbose: ${expr.verboseString}""".stripMargin
    println(info)
  }
}
