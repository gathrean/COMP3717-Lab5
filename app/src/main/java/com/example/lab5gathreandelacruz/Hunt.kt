package com.example.lab5gathreandelacruz

import kotlin.properties.Delegates
import kotlin.random.Random

class Hunt(minion: Minion, item: Item? = null) : Mission(minion, item), Repeatable {
    override var repeatNum: Int by Delegates.vetoable(Random.nextInt(4)) { _, _, newValue ->
        newValue <= 3
    }

    override fun repeat(times: Int, missionListener: MissionListener) {
        repeatNum = times
        if(repeatNum > 3) {
            println("A minion cannot repeat a hunt more than 3 times! Repeating a hunt 3 times...")
            for (i in 1..3) start(missionListener)
        } else {
            println("Repeating a hunt $repeatNum times...")
            for (i in 1..repeatNum) start(missionListener)
        }
    }



    override fun determineMissionTime(): Int {
        return (minion.baseHealth + minion.baseSpeed + itemTimeModifier) * Random.nextInt(5)
    }

    override fun reward(): String {
        val time = determineMissionTime()
        return if (minion is Elf) {
            minion.huntReward(time)
        } else {
            when (time) {
                in 11..20 -> "mouse"
                in 21..30 -> "fox"
                in 31..40 -> "buffalo"
                in 41..60 -> "dinosaur"
                else -> "nothing"
            }
        }
    }
}
