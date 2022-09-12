object q1 extends App{

        val x=new Rational(5,6)
        val y=x.neg
        println(y)
}

class Rational(n:Int,m:Int){
    require(m>0,"Denominator must be a positive intiger")
    def numer=n
    def deno=m
    
    // private def gcd(a: Int, b: Int): Int ={if (b == 0) a else gcd(b, a % b) } 
    
    def neg= new Rational(-this.numer,this.deno)

    override def toString(): String = numer+"/"+deno

}