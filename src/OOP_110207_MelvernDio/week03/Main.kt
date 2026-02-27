package OOP_110207_MelvernDio.week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji Budi: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}