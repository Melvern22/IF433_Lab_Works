package OOP_001_MelvernDio.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    // Meng-override fungsi abstract dari parent class
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount // Kurangi saldo
            println("[$accountName] Pembayaran sukses sebesar $$amount. Sisa saldo E-Wallet: $$balance")
        } else {
            println("[$accountName] Transaksi ditolak: Saldo tidak cukup. Saldo saat ini: $$balance")
        }
    }

    // Fungsi khusus untuk EWallet
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up sukses sebesar $$amount. Total saldo sekarang: $$balance")
    }
}