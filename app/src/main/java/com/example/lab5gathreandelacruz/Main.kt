package com.example.lab5gathreandelacruz

import kotlin.random.Random

/*
    Gathrean Dela Cruz
    A0167248
 */

fun main() {

    fun getRandomMinion(): Minion {
        return when (Random.nextInt(3)) {
            0 -> Human()
            1 -> Dwarf()
            2 -> Elf()
            else -> throw IllegalArgumentException("random value")
        }
    }

    val randomMinion = getRandomMinion()
    val mission: Mission = if (Random.nextBoolean()) Gather(randomMinion, Item.MAP) else Hunt(randomMinion)



    val listener = object : MissionListener {
        override fun missionStart(minion: Minion) {
            println(minion.catchphrase)
            println("A ${minion.race} started a new ${if (mission is Gather) "gathering" else "hunt"}!")
        }

        override fun missionProgress() {
            println("...")
            println("...")
            println("...")
        }

        override fun missionComplete(minion: Minion, result: String) {
            println("A ${minion.race} has returned from ${if (mission is Gather) "gathering" else "hunting"}, and found $result!")
        }
    }

    // check if the mission is Repeatable call the appropriate function
    if (mission is Repeatable) {
        mission.repeat(mission.repeatNum, listener)
    } else {
        mission.start(listener)
    }
}

//fun main() {
//    // New Elf
//    println("\n--------------------------------------------------------------------")
//    println("--------------------------------------------------------------------\n")
//    val elf = Elf()
//    val huntMission = Hunt(elf, 3)
//
//    huntMission.start(object : MissionListener {
//        override fun missionStart(minion: Minion) {
//            println("${minion.catchphrase}\n")
//            println("${minion.race} was sent off to gather some resources!")
//        }
//
//        override fun missionProgress() {
//            println("...\n...\n...")
//        }
//
//        override fun missionComplete(minion: Minion, message: String) {
//            if (minion is Elf) {
//                // Check if the minion is an instance of Elf
//                val elfReward = minion.huntReward(huntMission.determineMissionTime())
//                println("A ${minion.race} has returned from a hunt, and found $elfReward!")
//            } else {
//                println("A ${minion.race} has returned from a hunt, and found $message!")
//            }
//        }
//    })
//
//    fun main() {
//
//        fun getRandomMinion(): Minion {
//            return when (Random.nextInt(3)) {
//                0 -> Human()
//                1 -> Dwarf()
//                2 -> Elf()
//                else -> throw IllegalArgumentException("random value")
//            }
//        }
//
//        val randomMinion = getRandomMinion()
//    val mission: Mission = if (Random.nextBoolean()) Gather(randomMinion, Item.MAP) else Hunt(randomMinion)
//
//
//
//        val listener = object : MissionListener {
//            override fun missionStart(minion: Minion) {
//                println(minion.catchphrase)
//                println("A ${minion.race} started a new ${if (mission is Gather) "gathering" else "hunt"}!")
//            }
//
//            override fun missionProgress() {
//                println("...")
//                println("...")
//                println("...")
//            }
//
//            override fun missionComplete(minion: Minion, result: String) {
//                println("A ${minion.race} has returned from ${if (mission is Gather) "gathering" else "hunting"}, and found $result!")
//            }
//        }
//
//        // check if the mission is Repeatable call the appropriate function
//        if (mission is Repeatable) {
//            mission.repeat(mission.repeatNum, listener)
//        } else {
//            mission.start(listener)
//        }
//    }
//
////
////    println("\n")
////    huntMission.repeat(5, object : MissionListener {
////        override fun missionStart(minion: Minion) {
////            println("${minion.catchphrase}\n")
////            println("${minion.race} was sent off to gather some resources!")
////        }
////
////        override fun missionProgress() {
////            println("...\n...\n...")
////        }
////
////        override fun missionComplete(minion: Minion, message: String) {
////            println("A ${minion.race} has returned from a hunt, and found $message!")
////        }
////    })
////
////
////    // New Dwarf
////    println("\n--------------------------------------------------------------------")
////    println("--------------------------------------------------------------------\n")
////    val dwarf = Dwarf()
////    val gatherMission = Gather(dwarf)
////    gatherMission.start(object : MissionListener {
////        override fun missionStart(minion: Minion) {
////            println("${minion.catchphrase}\n")
////            println("${minion.race} is gathering fruit")
////        }
////
////        override fun missionProgress() {
////            println("...\n...\n...")
////        }
////
////        override fun missionComplete(minion: Minion, message: String) {
////            println("A ${minion.race} has returned from gathering, and found $message!")
////        }
////    })
////
////
////    // New Human
////
////    println("\n--------------------------------------------------------------------")
////    println("--------------------------------------------------------------------\n")
////    val human = Human()
////    val huntMissionHuman = Hunt(human, 2)
////    huntMissionHuman.start(object : MissionListener {
////        override fun missionStart(minion: Minion) {
////            println("${minion.catchphrase}\n")
////            println("${minion.race} was sent off to gather some resources!")
////        }
////
////        override fun missionProgress() {
////            println("...\n...\n...")
////        }
////
////        override fun missionComplete(minion: Minion, message: String) {
////            println("A ${minion.race} has returned from a hunt, and found $message!")
////        }
////    })
//
//}