package com.muhuk.csfj.part.i

final class ScalaClass(aString: String, val anInteger: Int) {
  def this(aBool: Boolean) {
    this("defaultString", -1)
  }

  val theString = "theString"

  var someString = "some"

  def plus(x: Int, y: Int): Int = x + y
}
