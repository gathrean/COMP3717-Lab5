package com.example.lab5gathreandelacruz

/**
 * Dwarf class that inherits from Minion
 */
class Dwarf : Minion {
    override val race: String = "Dwarf"
    override val baseHealth: Int = 8
    override val baseSpeed: Int = 2
    override val backpackSize: Int = 8
    override val catchphrase: String = "Where's me trusty ol hammer?"
}