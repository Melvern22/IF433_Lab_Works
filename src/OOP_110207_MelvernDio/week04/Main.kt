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

    println("\n=== SIMULASI PEMBAYARAN (POLYMORPHISM) ===")

    // 1. Buat objek EWallet dan CreditCard
    val dompetKu = EWallet(accountName = "Dompet Digital", balance = 50000.0)
    val kartuKreditKu = CreditCard(accountName = "Kartu Kredit Bank", limit = 100000.0)

    // 2. Masukkan ke dalam list bertipe parent (PaymentMethod)
    val daftarMetodeBayar: List<PaymentMethod> = listOf(dompetKu, kartuKreditKu)

    // 3. Lakukan perulangan dan panggil processPayment dengan nominal 75000.0
    val tagihan = 75000.0
    println("Mencoba membayar tagihan sebesar $$tagihan...\n")

    for (metode in daftarMetodeBayar) {
        metode.processPayment(tagihan)
    }
}
