package OOP_001_MelvernDio.week05

class MathHelper {

    // Fungsi 1: Menghitung luas persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Fungsi 2: Menghitung luas persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Fungsi 3: Menghitung luas lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}