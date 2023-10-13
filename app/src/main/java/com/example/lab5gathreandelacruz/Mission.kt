package com.example.lab5gathreandelacruz

abstract class Mission(protected val minion: Minion, protected val item: Int?) {
    protected abstract fun determineMissionTime(): Int;
    protected abstract fun reward(time: Int): String;
    open fun start(listener: MissionListener) {
        listener.missionStart(minion)
        listener.missionProgress()
        listener.missionComplete(minion, reward(determineMissionTime()))
    }
}