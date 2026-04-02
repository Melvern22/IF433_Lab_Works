package OOP_110207_MelvernDio.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(50),
    RARE(20),
    EPIC(5),
    LEGENDARY(1)
}

// --- KODE BARU UNTUK CHECKPOINT 14 ---
data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)