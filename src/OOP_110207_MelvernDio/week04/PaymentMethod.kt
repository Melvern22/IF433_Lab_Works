package OOP_001_MelvernDio.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}