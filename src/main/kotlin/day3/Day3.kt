package day3

class Day3 {

    fun day3pt1(treeList: Array<String>) {
        val startTime = System.nanoTime()

        var trees = 0

        treeList.withIndex().forEach { (loopCount, s) ->
            if (s.elementAt((loopCount * 3) % treeList[0].length) == '#') {
                trees++
            }
        }
        println("Es werden $trees Baeume gesehen.")
        println("Execution time: ${(System.nanoTime() - startTime) * 1e-9}s")
    }

    fun day3pt2(treeList: Array<String>) {
        val startTime = System.nanoTime()

        var trees1 = 0
        var trees2 = 0
        var trees3 = 0
        var trees4 = 0
        var trees5 = 0

        treeList.withIndex().forEach { (loopCount, s) ->
            if (s.elementAt(loopCount % treeList[0].length) == '#') {
                trees1++
            }
            if (s.elementAt((loopCount * 3) % treeList[0].length) == '#') {
                trees2++
            }
            if (s.elementAt((loopCount * 5) % treeList[0].length) == '#') {
                trees3++
            }
            if (s.elementAt((loopCount * 7) % treeList[0].length) == '#') {
                trees4++
            }
            if (s.elementAt((loopCount / 2) % treeList[0].length) == '#' && loopCount %2 == 0) {
                trees5++
            }
        }
        println("Execution time: ${(System.nanoTime() - startTime) * 1e-9}s")
        println("Es werden insgesamt ${trees1 * trees2 * trees3 * trees4 * trees5} Baeume gefunden.")
    }

}