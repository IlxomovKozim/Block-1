package intmax;

public class IntMax {
    
  public int intMax(int a, int b, int c){ 
  if(a>b && a>c){
    return a;
  }
  if(b>a && b>c){
    return b;
  }
  else
  return c;
  
}
  public static void main(String[] args) {
   
   IntMax obj = new IntMax();
   
   System.out.println(obj.intMax(1, 2, 3));
   System.out.println(obj.intMax(1, 3, 2));
   System.out.println(obj.intMax(3, 2, 1));
   
  }
}
