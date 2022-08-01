import scala.compiletime.ops.string 
object q3 extends App{

    def toUpper(x:String)={
        x.toUpperCase();
    }

    def toLower(y:String)={
        y.toLowerCase();
    }


    def formatNames(f:String=>String,name:String):String={
        val a=f(name)
        return a;
    }

    print(formatNames(toUpper,"Benny"));
    println()
    print(formatNames(toUpper,"Niroshan".slice(0,2))+formatNames(toLower,"Niroshan".slice(2,8)))
    println();
    print(formatNames(toLower,"Saman"))
    println()
    print(formatNames(toUpper,"Kumara".slice(0,1))+formatNames(toLower,"Kumara".slice(1,5))+formatNames(toUpper,"Kumara".slice(5,6)))

}
