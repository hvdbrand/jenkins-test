Class Comp implements Comparable {
  Integer a
  Integer b
  Comp(Integer a, Integer b) {
    this.a = a
    this.b = b
  }
  int compareTo(Object obj) {
    return 0
  }
}
