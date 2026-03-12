package OOP_001_MelvernDio.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    // Properti untuk melacak jumlah yang sudah digunakan, default 0.0
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        // Cek apakah total penggunaan ditambah nominal bayar masih di bawah atau sama dengan limit
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran sukses sebesar $$amount. Total penggunaan CC: $$usedAmount / Limit: $$limit")
        } else {
            println("[$accountName] Transaksi ditolak: Melebihi limit Kartu Kredit!")
        }
    }
}