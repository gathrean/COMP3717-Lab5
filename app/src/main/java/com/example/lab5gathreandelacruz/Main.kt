package com.example.lab5gathreandelacruz

/*
    Gathrean Dela Cruz
    A0167248
 */
fun main() {
    // New Archer
    println("\n--------------------------------------------------------------------")
    println("--------------------------------------------------------------------\n")
    val archer = Archer()
    val huntMission = Hunt(archer)

    huntMission.start(object : MissionListener {
        override fun missionStart(minion: Minion) {
            println("${minion.catchphrase}\n")
            println("${minion.race} was sent off to gather some resources!")
        }

        override fun missionProgress() {
            println("...\n...\n...")
        }

        override fun missionComplete(minion: Minion, message: String) {
            println("A ${minion.race} has returned from a hunt, and found $message!")
        }
    })

    println("\n")
    huntMission.repeat(5, object : MissionListener {
        override fun missionStart(minion: Minion) {
            println("${minion.catchphrase}\n")
            println("${minion.race} was sent off to gather some resources!")
        }

        override fun missionProgress() {
            println("...\n...\n...")
        }

        override fun missionComplete(minion: Minion, message: String) {
            println("A ${minion.race} has returned from a hunt, and found $message!")
        }
    })


    // New Dwarf
    println("\n--------------------------------------------------------------------")
    println("--------------------------------------------------------------------\n")
    val dwarf = Dwarf()
    val gatherMission = Gather(dwarf)
    gatherMission.start(object : MissionListener {
        override fun missionStart(minion: Minion) {
            println("${minion.catchphrase}\n")
            println("${minion.race} is gathering fruit")
        }

        override fun missionProgress() {
            println("...\n...\n...")
        }

        override fun missionComplete(minion: Minion, message: String) {
            println("A ${minion.race} has returned from gathering, and found $message!")
        }
    })


    // New Human

    println("\n--------------------------------------------------------------------")
    println("--------------------------------------------------------------------\n")
    val human = Human()
    val huntMissionHuman = Hunt(human)
    huntMissionHuman.start(object : MissionListener {
        override fun missionStart(minion: Minion) {
            println("${minion.catchphrase}\n")
            println("${minion.race} was sent off to gather some resources!")
        }

        override fun missionProgress() {
            println("...\n...\n...")
        }

        override fun missionComplete(minion: Minion, message: String) {
            println("A ${minion.race} has returned from a hunt, and found $message!")
        }
    })

}