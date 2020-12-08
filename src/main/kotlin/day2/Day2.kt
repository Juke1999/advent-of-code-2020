package day2

class Day2 {
    fun day2pt1(pwList: Array<String>) {
        val startTime = System.nanoTime()
        var matchingPWs = 0

        pwList.forEach { i ->
            val splitList = i.split("-", " ", ":")
            val passwordToCheck = splitList[4]
            val letter = splitList[2].toCharArray()[0]
            val rangeStart = splitList[0].toInt()
            val rangeEnd = splitList[1].toInt()
            val letters = passwordToCheck.count { c -> c == letter }

            if(letters in rangeStart..rangeEnd) {
                matchingPWs++
            }
        }
        println(matchingPWs)
        println("Execution time: ${(System.nanoTime() - startTime) * 1e-9}s")
    }

    fun day2pt2(pwList: Array<String>) {
        val startTime = System.nanoTime()
        var matchingPWs = 0

        pwList.forEach { i ->
            var matchingFirstConstraint = false
            var matchingSecondConstraint = false
            val splitList = i.split("-", " ", ":")
            val passwordToCheck = splitList[4]
            val letter = splitList[2].toCharArray()[0]
            val rangeStart = splitList[0].toInt() - 1
            val rangeEnd = splitList[1].toInt() - 1

            if(passwordToCheck[rangeStart] == letter) {
                matchingFirstConstraint = true;
            }

            if(passwordToCheck[rangeEnd] == letter) {
                matchingSecondConstraint = true;
            }

            if((matchingFirstConstraint).xor(matchingSecondConstraint)) {
                matchingPWs++
            }
        }
        println(matchingPWs)
        println("Execution time: ${(System.nanoTime() - startTime) * 1e-9}s")
    }

}