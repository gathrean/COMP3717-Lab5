package com.example.lab5gathreandelacruz

import kotlin.random.Random

/**
 * Hunt class
 * @param minion Minion
 * @author Gathrean Dela Cruz
 */
class Hunt(minion: Minion, override val repeatNum: Int) : Mission(minion, null), Repeatable {

    override fun repeat(times: Int, listener: MissionListener) {
        for (i in 1..times) {
            start(listener)
        }
    }

    override fun determineMissionTime(): Int {
        return minion.baseHealth * minion.baseSpeed * Random.nextInt(0, 5)
    }

    override fun reward(time: Int): String {
        return when (time) {
            in 11..20 -> "a mouse"
            in 21..30 -> "a fox"
            in 31..40 -> "a buffalo"
            in 41..60 -> "a dinosaur"
            else -> "nothing"
        }
    }
}