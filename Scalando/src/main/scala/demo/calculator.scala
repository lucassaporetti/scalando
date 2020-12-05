package demo
import scala.io.StdIn.{readLine, readFloat}

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

    val a_number = 12

    a_number match{
      case 12 => println("Cirão da massa!!!")
      case _ => println("Não é o Cirão!")
    }

    var continue : String = "S"

    do {
      calculate()
      continue = readLine("Do you want to continue? [Y/N]: ").strip().toUpperCase()
    } while(continue != "N")

    val name = readLine("What's your name? ")
    println(s"Good bye, $name!")

  }
}
