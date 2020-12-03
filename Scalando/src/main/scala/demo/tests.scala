package demo
import scala.io.StdIn.{readLine, readInt}

object tests {
  def main(args: Array[String]): Unit = {
  println("--------- SCALA CALCULATOR ---------")

    def calculator(): Unit = {

      var first_operand = {
        println("First Operand: ");
        readInt()
      }

      var second_operand = {
        println("Second Operand: ");
        readInt()
      }

      var operator = {
        println("Operator [+ - * /]: ");
        readLine()
      }

      if (operator == "+") {
        var result = {first_operand + second_operand};
        println(s"Result: $first_operand + $second_operand = $result")
      }
      if (operator == "-") {
        var result = {first_operand - second_operand};
        println(s"Result: $first_operand - $second_operand = $result")
      }
      if (operator == "*") {
        var result = {first_operand * second_operand};
        println(s"Result: $first_operand * $second_operand = $result")
      }
      if (operator == "/") {
        var result = {first_operand / second_operand};
        println(s"Result: $first_operand / $second_operand = $result")
      }
    }

    var continue : String = "S"

    while(continue != "N") {
      calculator()
      continue = readLine("Do you want to continue? [Y/N]: ").strip().toUpperCase()
    }

    val name = readLine("What's your name? ")
    println(s"Good bye, $name!")

  }
}
