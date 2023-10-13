package com.example.lab5gathreandelacruz

import kotlin.random.Random

/**
 * Gather class
 * @param minion Minion
 * @author Gathrean Dela Cruz
 */
class Gather(minion: Minion) : Mission(minion) {

    /*
     * Determines the mission time
     * @return Int
     */
    override fun determineMissionTime(): Int {
        return minion.backpackSize * minion.baseSpeed * Random.nextInt(0, 5)
    }

    /*
     * Determines the reward
     * @param time Int
     */
    override fun reward(time: Int): String {
        return when (time) {
            in 10..21 -> "bronze"
            in 22..33 -> "silver"
            in 34..45 -> "gold"
            else -> "nothing"
        }
    }
}