package com.example.lab5gathreandelacruz

interface MissionListener {
    fun missionStart(minion: Minion)
    fun missionProgress()
    fun missionComplete(minion: Minion, message: String)
}