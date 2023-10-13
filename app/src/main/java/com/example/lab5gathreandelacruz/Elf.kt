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
}
