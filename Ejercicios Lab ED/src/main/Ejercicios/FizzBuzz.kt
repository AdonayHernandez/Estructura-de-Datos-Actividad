class FizzBuzz(val rango: Int) : FizzBuzzInterface {

    override fun imprimirFizzBuzz() {
        if (rango <= 0) {
            println("El rango debe ser un número positivo.")
            return
        }

        for (i in 1..rango) {
            when {
                i % 15 == 0 -> print("FizzBuzz")
                i % 3 == 0 -> print("Fizz")
                i % 5 == 0 -> print("Buzz")
                else -> print(i)
            }
            if (i % 10 == 0) println()
            else print(" ")
        }
        println()
    }
}
