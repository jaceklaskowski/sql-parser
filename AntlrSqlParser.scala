package pl.japila.antlr

object AntlrSqlParser {
  def main(args: Array[String]) = {
    val inputText = "{1,2,3,4}"
    println(s"Parsing $inputText")

    import org.antlr.v4.runtime._
    import org.antlr.v4.runtime.tree._

    val input = new ANTLRInputStream(inputText)

    // Generated Lexer based on the grammar SqlBase.g4
    val lexer = new SqlBaseLexer(input)

    val tokens = new CommonTokenStream(lexer)

    // Generated Parser based on the grammar SqlBase.g4
    val parser = new SqlBaseParser(tokens)

    val tree = parser.init()
    println(tree.toStringTree(parser))
  }
}
