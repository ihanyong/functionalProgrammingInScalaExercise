package com.hanyong.exercise

import scala.annotation.tailrec

object Exercise_02_01 {

  def main(args: Array[String]): Unit = {
    -1 to 10 map {x=>(x, fib(x))} foreach println
  }

  def fib(n : Int) : Int = {
    @tailrec
    def go(x: Int, y: Int, n: Int): Int =
      if (n <= 0) -1
      else if (n == 1) x
      else if (n == 2) y
      else go(y, x + y, n - 1)

    go(0, 1, n)
  }
}
