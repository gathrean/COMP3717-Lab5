package com.example.lab5gathreandelacruz

/**
 * Archer class that inherits from Minion
 */
class Elf : Minion {
    override val race: String = "Elf"
    override val baseHealth: Int = 2
    override val baseSpeed: Int = 8
    override val backpackSize: Int = 3
    override val catchphrase: String = "My arrows never miss!"
    fun huntReward(time: Int): String {
        return when (time) {
            in 11..20 -> "a fish"
            in 21..30 -> "a forest bear"
            in 31..40 -> "an orc"
            in 41..60 -> "a troll"
            else -> "nothing"
        }
    }
}
