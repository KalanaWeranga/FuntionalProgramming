object q3 extends App{


    var a=2
    var b=3
    var c=4
    var d=5
    var k=4.3f
  
    //println( - -b * a + c *d - -);//in scala this will not run because it does not has an decrement operator
                                  //But if we evaluate this in java it gives us 
                                  //println(--3*2+4*5--)
                                  //println(2*2+4*5)
                                  //4+20=24
    b-=1;
    println(b*a+c*d);
    d-=1;
   
   
    //println(a++);//in scala this will not run because it does not has an increment operator
                //But if we evaluate this in java it gives us 
                //println(2++)
                //In here 2++ will return 2 and after increment it by 1
                //output is 2
    println(a);
    a+=1;
    
    println (–2 * ( g – k ) +c);// this will execute both languages output is 4.6
    //println (c=c++); in scala this will not execute because of increment operator. In java output is 4 
    println(c);
    //println (c=++c*a++);in scala this will not execute because of increment operator. In java output is 15
    c+=1;
    println(c*a)
    a+=1;

} 
