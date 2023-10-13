package com.example.lab5gathreandelacruz

import kotlin.random.Random

/**
 * Gather class
 * @param minion Minion
 * @author Gathrean Dela Cruz
 */
class Gather(minion: Minion, item: Item? = null) : Mission(minion, item) {
    override fun determineMissionTime(): Int {
        return (minion.backpackSize + minion.baseSpeed + itemTimeModifier) * Random.nextInt(5)
    }

    override fun reward(): String {
        val time = determineMissionTime()
        return when(time) {
            in 10..21 -> "bronze"
            in 22..33 -> "silver"
            in 34..44 -> "gold"
            in 45..60 -> "diamond"
            else -> "nothing"
        }
    }
}