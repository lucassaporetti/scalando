package demo
import scala.io.StdIn.{readLine, readFloat}

object calculator {
  def main(args: Array[String]): Unit = {
  println("--------- SCALA CALCULATOR ---------")

    def get_operation(): Unit = {

      val first_operand = {
        println("First Operand: ")
        readFloat()
      }

      val operator = {
        println("Operator [+ - * /]: ")
        readLine()
      }

      val second_operand = {
        println("Second Operand: ")
        readFloat()
      }

      def sum(first_operand: Float, second_operand: Float): Float = {
        return first_operand + second_operand
      }

      def subtract(first_operand: Float, second_operand: Float): Float =
        first_operand - second_operand

      def multiply(first_operand: Float, second_operand: Float): Float = first_operand * second_operand

      def divide(first_operand: Float, second_operand: Float) = first_operand / second_operand

      if (operator == "+") {
        val result = sum(first_operand, second_operand)
        println(s"Result: $first_operand + $second_operand = $result")
      }
      if (operator == "-") {
        val result = subtract(first_operand, second_operand)
        println(s"Result: $first_operand - $second_operand = $result")
      }
      if (operator == "*") {
        val result = multiply(first_operand, second_operand)
        println(s"Result: $first_operand * $second_operand = $result")
      }
      if (operator == "/") {
        val result = divide(first_operand, second_operand)
        println(s"Result: $first_operand / $second_operand = $result")

//      var result_list = List()
//      result_list.appended
//      for (operation <- result_list) {
//        println(s"Result list appends new operation $operation")
//        }

      }
    }

    for (x <- 1 to 5) {
      println("x using to " + x)
    }

    for (y <- 1 until 6) {
      println("y using until " + y)
    }

    for (z <- 1 to 5; w <- 1 until 6) {
      println("z using to " + z + " w using until " + w)
    }

    val a_list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for {number <- a_list; if number == 10} yield {
      println("We catch 10!")
    }

    val a_number = 18

    a_number match{
      case 12 => println("Cirão da massa!!!")
      case 13 | 45 | 17 => println("Vagabonds!")
      case _ => println("Default value!")
    }

    var continue : String = "S"

    do {
      get_operation()
      continue = readLine("Do you want to continue? [Y/N]: ").strip().toUpperCase()
    } while(continue != "N")

    val name = readLine("What's your name? ")
    println(s"Good bye, $name!")

  }
}
