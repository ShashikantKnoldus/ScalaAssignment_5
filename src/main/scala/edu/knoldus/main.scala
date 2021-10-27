package edu.knoldus

object main extends App {
  val zero=Zero
  val one =new Succ(zero)
  val two= new Succ(one)
  val three =new Succ(two)
 println(zero.successor)
  //println(three.-(two).predecessor.isZero)

}
