package OOP_110207_MelvernDio.week03

fun main() {
    val e = Employee("Budi")

    println("--- Tes Gaji Positif (Benar) ---")
    e.salary = 5000
    println("Gaji Budi sekarang: ${e.salary}")

    println("\n--- Tes Gaji Negatif (Salah) ---")
    e.salary = -1000
    println("Gaji Budi sekarang: ${e.salary}")
}