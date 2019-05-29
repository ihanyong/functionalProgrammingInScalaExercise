package com.hanyong.exercise

object Exercise_02_03 {

  def main(args: Array[String]): Unit = {
  }

  def curry[A,B,C] (f: (A,B) => C): A => (B => C) =
    a => b => f(a,b)


  def uncurry[A,B,C] (f: A => B => C): (A,B) => C =
    (a, b) => f(a)(b)
}
