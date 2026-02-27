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

    pedang.damage = -50
    println("Damage pedang sekarang: ${pedang.damage}")

    pedang.damage = 9999
    println("Damage pedang sekarang: ${pedang.damage}")

    println("Tier senjata ${pedang.name}: ${pedang.tier}")

    println("\n=== TES TUGAS MANDIRI: PLAYER ===")

        val player1 = Player("Melvern")

        println("Menambahkan 50 XP...")
        player1.addXp(50)
        println("Level ${player1.username} sekarang: ${player1.level}") // Masih level 1

        println("\nMenambahkan 60 XP...")
        player1.addXp(60)

    }

