package close10;

public class Close10 {
    public int close10(int a, int b){
        
        int nearest1 = Math.abs(a-10);
        int nearest2 = Math.abs(b-10);
        if(nearest1 < nearest2){
            return a;
        }
        else if(nearest1 > nearest2){
            return b;
        }
        else
            return 0;
        
    } 
    public static void main(String[] args) {
        
        Close10 obj = new Close10();
        
        System.out.println( obj.close10(8, 13) );
        System.out.println( obj.close10(13, 8) );
        System.out.println( obj.close10(13, 7) );
        
    }  
}
