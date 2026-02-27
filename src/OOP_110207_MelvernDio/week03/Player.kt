package OOP_110207_MelvernDio.week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelumnya = this.level

            xp += amount

            if (this.level > levelSebelumnya) {
                println("Level Up! Selamat $username naik ke level ${this.level}")
            }
        } else {
            println("Peringatan: XP yang ditambahkan harus angka positif!")
        }
    }
}