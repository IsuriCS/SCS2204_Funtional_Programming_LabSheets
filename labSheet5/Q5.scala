package labSheet5

import util.control.Breaks

object Q5 {

  def main(args:Array[String]): Unit = {
    print(sum(5))
  }


  def sum(i:Int):Int={
    if (i==0){
      return i
    }
    else if(i%2==0){
      return i+ sum(i-2)
    }
    else {
      sum(i-1)
    }
  }


}
