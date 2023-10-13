package com.example.lab5gathreandelacruz

/**
 * Orc class that inherits from Minion
 */
class Orc : Minion {
    override val race: String = "Orc"
    override val baseHealth: Int = 2
    override val baseSpeed: Int = 8
    override val backpackSize: Int = 3
    override val catchphrase: String = "ARRGH!"
}