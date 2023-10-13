package com.example.lab5gathreandelacruz

/**
 * Orc class that inherits from Minion
 */
class Orc(elf: Elf) : Minion by elf {
    override val race: String = "Orc"
    override val catchphrase: String = "ARRGH!"
}