import scala.compiletime.ops.int
object caseclass extends App{

    val p1=Point(1,2)
    val p2=Point(3,4)
    println(p1+p2)
    println(p1.move(1,2))
    val p3=Point(6,8)
    println(p3.distance(p2))
    println(p2.invert())


}

case class Point(x:Int,y:Int){

    def +(a:Point) = Point(this.x+a.x,this.y+a.y)

    def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)

    def distance=(b:Point)=>math.sqrt(math.pow((b.x-this.x),2)+math.pow((b.y-this.y),2)) 

    def invert=()=>Point(this.y,this.x)


}