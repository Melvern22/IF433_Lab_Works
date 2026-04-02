package OOP_110207_MelvernDio.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            // Smart cast otomatis, kita bisa langsung akses properti 'monsterName'
            println("AWAS! Kamu berhadapan dengan monster: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            // Menggunakan teknik Destructuring dari data class GameItem
            val (itemName, itemDamage, itemRarity) = event.item
            println("HORE! Musuh menjatuhkan loot: $itemName (Damage: $itemDamage, Rarity: $itemRarity)")
        }
        is BattleState.GameOver -> {
            println("YAH! Game Over. Alasan kekalahan: ${event.reason}")
        }
        BattleState.SafeZone -> { // Tidak pakai 'is' karena SafeZone adalah object (Singleton)
            println("FIUH... Kamu telah memasuki Safe Zone. Beristirahatlah dengan tenang.")
        }
    }
}