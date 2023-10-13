package com.example.lab5gathreandelacruz

/**
 * Interface for Repeatable tasks with a specified number
 */
interface Repeatable {
    abstract val repeatNum: Int
    abstract fun repeat(repeatNum: Int, listener: MissionListener)
}