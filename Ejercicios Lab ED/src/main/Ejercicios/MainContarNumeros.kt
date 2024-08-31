fun contarNumeros(n: Int) {
    var primos = 0
    var pares = 0
    var impares = 0

    for (i in 1..n) {
        val numero = Primo(i)
        if (numero.esPrimo()) primos++
        if (numero.esPar()) pares++
        if (numero.esImpar()) impares++
    }

    println("Prime numbers count: $primos")
    println("Even numbers count: $pares")
    println("Odd numbers count: $impares")
}
