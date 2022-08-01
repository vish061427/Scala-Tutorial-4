object Q1 extends App {
  def interest(deposit: Double):Double = {
    if (deposit>2000000) {
      return deposit*(0.065);
    }
    else if (deposit>200000){
      return deposit*(0.04);
    }
    else if (deposit>20000){
      return deposit*(0.035);
    }
    else{
      return deposit*(0.02);
    }
  }

  println("The interest is " + interest(20000));
}
