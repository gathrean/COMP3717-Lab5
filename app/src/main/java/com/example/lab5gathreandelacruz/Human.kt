package com.example.lab5gathreandelacruz

/**
 * Human class that inherits from Minion
 */
class Human : Minion {
    override val race: String = "Human"
    override val baseHealth: Int = 5
    override val baseSpeed: Int = 5
    override val backpackSize: Int = 5
    override val catchphrase: String = ""
}