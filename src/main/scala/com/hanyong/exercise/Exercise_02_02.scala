package com.hanyong.exercise

import scala.annotation.tailrec

object Exercise_02_02 {
  def asc(x:Int,y:Int) = if(x.compareTo(y)>0) false else true
  def desc(x:Int,y:Int) = if(x.compareTo(y)<0) false else true

  def main(args: Array[String]): Unit = {
    val ascArray = Array(1,2,3,4,5,6,7)
    val descArray = Array(7,6,5,4,3,2,1,0)

    val noneArray = Array()
    val oneArray = Array(1)

//    val asc = (x:Int,y:Int) => if(x.compareTo(y)>0) false else true
//    val desc = (x:Int,y:Int) => if(x.compareTo(y)<0) false else true


    println(isSorted(ascArray, asc))
    println(isSorted(ascArray, desc))

    println(isSorted(descArray, asc))
    println(isSorted(descArray, desc))

    println(isSorted(noneArray, asc))
    println(isSorted(noneArray, desc))


    println(isSorted(oneArray, asc))
    println(isSorted(oneArray, desc))


  }

  def isSorted[A](as:Array[A], p: (A,A)=> Boolean) :Boolean ={
    @tailrec
    def loop(n:Int) :Boolean = {
      if(n == as.length-1) true
      else if(!p(as(n),as(n+1))) false
      else loop(n+1)
    }
    if(as.isEmpty) true
    else loop(0)
  }
}
