fun main() {
    // Lógica para contar números primero
    val n = 10 // Puedes cambiar este valor para probar con diferentes números
    if (n <= 0) {
        println("N debe ser un número positivo.")
    } else {
        contarNumeros(n)
    }

    // Luego, lógica para FizzBuzz
    val fizzBuzz = FizzBuzz(100)
    fizzBuzz.imprimirFizzBuzz()
}
