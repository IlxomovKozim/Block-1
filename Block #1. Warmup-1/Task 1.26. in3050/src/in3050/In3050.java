package in3050;

public class In3050 {
  public boolean in3050(int a, int b){
      
   if( (a>=30 && a<=40) && (b>=30 && b<=40) ){
     return true;
   } 
   else if( (a>=40 && a<=50) && (b>=40 && b<=50) ){
     return true;
   }
   else
   return false;
   
}       
   public static void main(String[] args){
   
   In3050 obj = new In3050();
   
   System.out.println(obj.in3050(30, 31));
   System.out.println(obj.in3050(30, 41));
   System.out.println(obj.in3050(40, 50));
  
  }
}
