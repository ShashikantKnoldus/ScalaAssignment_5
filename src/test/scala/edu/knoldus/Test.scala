package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class Test extends AnyFlatSpec  {
  val zero=Zero
  val one =new Succ(zero)
  val two= new Succ(one)
  val three =new Succ(two)
  //Test case of is zero
  "isZero of one"should "return false "in{
    assert(one.isZero==false)
  }
  "isZero of zero"should "return true "in{
    assert(zero.isZero==true)
  }

  //Test case of predecessor
  "predecessor of three"should "return two "in{
    assert(three.predecessor==two)
  }

  //Test case of successor and +
  "successor of one isZero"should "show false"in{
    assert(one.+(zero).successor.isZero==false)
  }
  //Test case of -
  "- of zero from one"should "show false"in{
    assert(one.-(zero).isZero==false)
  }
  //Test case of -
  "- of one isZero"should "show True"in{
    assert(one.-(one).isZero==true)
  }
}
