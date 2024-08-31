class Par(val valor: Int) : Numero {
    override fun esPrimo(): Boolean {
        if (valor < 2) return false
        for (i in 2 until valor) {
            if (valor % i == 0) return false
        }
        return true
    }

    override fun esPar() = valor % 2 == 0
    override fun esImpar() = valor % 2 != 0
}
