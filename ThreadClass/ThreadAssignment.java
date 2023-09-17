
public class ThreadAssignment{
  static void EvenOdd(int n){
    if(n%2==0){
    EvenThread t1 = new EvenThread();
    t1.runFor(n);
    }else{
    OddThread t2 = new OddThread();
    t2.runFor(n);
    }
  }
  public static void main(String[] args){
    EvenOdd(3);
    EvenOdd(4);
  }

}
class EvenThread extends Thread{
  public void runFor(int n){
   System.out.println("A Speacial Thread is Running to Tell You That");
   System.out.println("Given Number "+n+" is Even");
  }
}
class OddThread extends Thread{
  public void runFor(int n){
   System.out.println("A Speacial Thread is Running to Tell You That");
   System.out.println("Given Number "+n+" is Odd");
  }
}
