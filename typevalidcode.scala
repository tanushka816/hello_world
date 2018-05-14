//import scala.util.parsing.combinator.RegexParsers
import scala.util.parsing.RegexParsers


object SimpleExample extends RegexParsers {
  def boolTrue: Parser[Boolean] = "true" ^^ (_ => true)
  // если читаем строчку "true", то вызывается функция, которая преобразует строчку в истинное значение boolean

  def bool: Parser[Boolean] = ("true" | "false") ^^ (_ == "true")
  // можно сгруппировать парсеры и применить функцию к результату

  def alternativeBool: Parser[Boolean] = "true" ^^ (_ => true) | "false" ^^ (_ => false)
  // или преобразовать каждый результат по отдельности

  def int: Parser[Int] = "[0-9]+".r ^^ (_.toInt)
  // парсим последовательность цифр и преобразуем в число.
  // метод .r создаёт регулярное выражение из строки

  def id: Parser[Id] = "[a-zA-Z][a-zA-Z0-9_]*".r ^^ Id
  // Id - функция, которая делает из строки объект типа Id
}