import scala.util.parsing.combinator._

object CommandParser extends RegexParsers {
	def commandName: Parser[String] = """(\w*)""".r ^^ { _.toString}  // + '_' for name_name
	def commandLongName: Parser[String] = commandName | "(" ~> commandName <~ ")" ^^ { _.toString }
	def anonimity: Parser[Boolean] = "yes" | "no" ^^ { _.toString}
	def whenRead: Parser[String] = "afterstop" | "continuous" ^^ { _.toString }
	def date: Parser[String] = """(\d\d\.\d\d\.\d\d\.\d\d) ^^ { _.toString}
	
}
