package example
/*
// A simple prime number generator that asks the user for integer on how many primes to print
// TODO: 1) Try catch for user inputting bad value
// 2) Export value into a text file and save to computer. 
*/

object PrimeGenerator extends App 
{
  def IsPrime(n: Int, c: Int): Boolean = 
    {
      //println("In IsPrime. n: " + n + " c: " + c)
      var count  = c
      if(n == 0)
        false
      else if (n == 1)
        false
      else if(n == count)
        true
      else if (n % count == 0)
        false
      else
      {
        count += 1
        IsPrime(n, count)
      }
    }

  def PrintPrime(num: Int) = println("Prime Number: " + num)

  if(args.size == 0)
  {
    println("Hello, this is a prime number Generator\nPlease input number to go to for prime number generation: ")
    val input = scala.io.StdIn.readInt() //get the integer.
    println("Printing prime numbers up to " + input)

    var i = 0
    while(i <= input)
    {
      if(IsPrime(i, 2))
        PrintPrime(i)

      i += 1
    }
  }
  else
  {
    val input : Int = args(0).toInt
    var i = 0
    while(i <= input)
    {
      if(IsPrime(i, 2))
        PrintPrime(i)

      i += 1
    }
  }
}