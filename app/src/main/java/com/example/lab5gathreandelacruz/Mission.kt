package com.example.lab5gathreandelacruz

abstract class Mission(val minion: Minion, val item: Item? = null) {
    protected val itemTimeModifier: Int = item?.timeModifier ?: 0

    fun start(listener: MissionListener) {
        listener.missionStart(minion)
        listener.missionProgress()
        val rewardResult = reward()
        listener.missionComplete(minion, rewardResult)
    }

    protected abstract fun determineMissionTime(): Int
    abstract fun reward(): String
}