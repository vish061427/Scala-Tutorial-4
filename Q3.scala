object Q3 extends App{
  def toUpper(a:String):String={
      a.toUpperCase()
   }
  def toLower(a:String):String={
     a.toLowerCase()
   }
  def formatNames(name: String)(func: String => String): String = {
   func(name)
 }
  println(formatNames("Benny")(toUpper(_)))
  println(formatNames("Niroshan".substring(0,2))(toUpper(_))+"Niroshan".substring(2,8))
  println(formatNames("Saman")(toLower(_)))
  println("Kumara".substring(0,5)+formatNames("Kumara".substring(5))(toUpper(_)))
}
