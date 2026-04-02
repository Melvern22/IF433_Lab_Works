package OOP_110207_MelvernDio.week07

fun main() {
    // Baris ini akan error (garis merah) karena konstruktornya private.
    // Dibiarkan saja error, karena memang ini tujuannya.
    val client = NetworkClient("https://api.umn.ac.id")
}