object q2 extends App{

    val x= new Rational(3,4)
    val y= new Rational(5,8)
    val z= new Rational(2,7)

    println(x-y-z)
}

class Rational(n:Int,m:Int){
    require(m>0,"Denominator must be a positive intiger")
    
    private def gcd(a: Int, b: Int): Int ={if (b == 0) a else gcd(b, a % b) } 

    private val g=gcd(n,m)

    def this(n:Int) = this(n,1)

    def numer = if(g>0) n/g else n/(-g)

    def deno= if(g>0) m/g else m/(-g)

    def +(r:Rational) = new Rational(numer*r.deno + deno*r.numer, deno*r.deno)

    def neg= new Rational(-this.numer,this.deno)

    def -(r:Rational) = this + r.neg

    override def toString = numer + "/" + deno
    

}