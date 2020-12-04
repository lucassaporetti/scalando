package demo
import scala.io.StdIn.{readLine, readInt, readFloat}

object calculator {
  def main(args: Array[String]): Unit = {
  println("--------- SCALA CALCULATOR ---------")

    def calculate(): Unit = {

      val first_operand = {
        println("First Operand: ")
        readFloat()
      }

      val second_operand = {
        println("Second Operand: ")
        readFloat()
      }

      val operator = {
        println("Operator [+ - * /]: ")
        readLine()
      }

      if (operator == "+") {
        val result = {first_operand + second_operand}
        println(s"Result: $first_operand + $second_operand = $result")
      }
      if (operator == "-") {
        val result = {first_operand - second_operand}
        println(s"Result: $first_operand - $second_operand = $result")
      }
      if (operator == "*") {
        val result = {first_operand * second_operand}
        println(s"Result: $first_operand * $second_operand = $result")
      }
      if (operator == "/") {
        val result = {first_operand / second_operand}
        println(s"Result: $first_operand / $second_operand = $result")
      }
    }

    var continue : String = "S"

    while(continue != "N") {
      calculate()
      continue = readLine("Do you want to continue? [Y/N]: ").strip().toUpperCase()
    }

    val name = readLine("What's your name? ")
    println(s"Good bye, $name!")

  }
}
