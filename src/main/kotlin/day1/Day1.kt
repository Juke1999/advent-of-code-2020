package day1

class Day1 {
  fun day1pt1(list: IntArray) {
    val startTime = System.nanoTime()
    var found = false;

    list.indices.forEach { i ->
      if (found.not()) {
        list.indices.forEach { j ->
          if (list[i].plus(list[j]) == 2020) {
            found = true;
            println("1. Zahl: ${list[i]}; 2.Zahl: ${list[j]}")
            println(list[i] * list[j])
          }
        }
      }
    }
    println("Execution time: ${(System.nanoTime() - startTime) * 1e-9}s")
  }

  fun day1pt2(list: IntArray) {
    val startTime = System.nanoTime()
    var found = false

    list.indices.forEach { i ->
      list.indices.forEach { j ->
        if(found.not()) {
          list.indices.forEach { k ->
            if (list[i].plus(list[j]).plus(list[k]) == 2020) {
              found = true;
              println("1. Zahl: ${list[i]}; 2. Zahl: ${list[j]}; 3. Zahl: ${list[k]}")
              println(list[i] * list[j] * list[k])
            }
          }
        }
      }
    }
    println("Execution time: ${(System.nanoTime() - startTime) * 1e-9}s")
  }

}