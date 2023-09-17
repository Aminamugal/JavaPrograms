
public class Assignment{
  static void myfun(int val) throws AssignedExceptionBySirWahab{
    if(val==10||val==20||val==30){
    throw new AssignedExceptionBySirWahab(val);
    }
  }
  public static void main(String[] args){
    try{
    myfun(10);
    }catch(AssignedExceptionBySirWahab ae){
     ae.print();
    }
  }

}
class  AssignedExceptionBySirWahab extends Exception{
  public int cause;
  
  AssignedExceptionBySirWahab(int n){
  cause = n;
  }
  public void print(){
    System.out.println("Program has Thrown a User Defined Checked Exception.");
    System.out.println("Given Number "+cause+" is not Aloowed!");
  }

}