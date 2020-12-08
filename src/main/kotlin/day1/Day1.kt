package day1

class Day1 {
  fun day1pt1(list: IntArray) {
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
  }

  fun day1pt2(list: IntArray) {
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
  }

}