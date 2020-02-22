package mixstart;

public class MixStart {
    public boolean mixStart(String str){
        
       String subString = str.substring(1, 4);
       String ix = "ix ";
       if(subString.equals(ix)){
           return true;
       } 
       else 
           return false;
       
}
    public static void main(String[] args) {
        
        MixStart obj = new MixStart();
        
        System.out.println( obj.mixStart("mix snacks") );
        System.out.println( obj.mixStart("pix snacks") );
        System.out.println( obj.mixStart("piz snacks") );
        
    }   
}
