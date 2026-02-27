package OOP_110207_MelvernDio.week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji Budi: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== TES TUGAS MANDIRI: WEAPON ===")

    // Buat objek Weapon
    val pedang = Weapon("Excalibur")

    // Coba set damage ke -50 (Harus gagal dan print peringatan)
    pedang.damage = -50
    println("Damage pedang sekarang: ${pedang.damage}")

    // Coba set damage ke 9999 (Harus dipaksa jadi 1000)
    pedang.damage = 9999
    println("Damage pedang sekarang: ${pedang.damage}")

    // Print Tier-nya (Karena 1000 > 800, harusnya Legendary)
    println("Tier senjata ${pedang.name}: ${pedang.tier}")
}
