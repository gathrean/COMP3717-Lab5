package com.example.lab5gathreandelacruz

/**
 * Interface for Repeatable tasks with a specified number
 */
interface Repeatable {
    val repeatNum: Int
    fun repeat(times: Int, listener: MissionListener)
}