package OOP_001_MelvernDio.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }
    println("\n=== PENGUJIAN MATH HELPER (OVERLOADING) ===")

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas Persegi (sisi 5) = $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(4, 6)
    println("Luas Persegi Panjang (4 x 6) = $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0) = $luasLingkaran")
}