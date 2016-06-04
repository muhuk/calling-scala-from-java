package com.muhuk.csfj.part.ii

trait ScalaTrait {
  def foo(j: Int): Int

  def bar(k: Int): Int = foo(k * 2) + 3
}
