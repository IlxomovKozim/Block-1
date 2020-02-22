package stringe;

public class StringE {
    public boolean stringE(String str){
        
    if(str.charAt(1) == 'e'){
        return true;
    }  
    else
        return false;
        
} 
    public static void main(String[] args) {
        
        StringE obj = new StringE();
        
        System.out.println( obj.stringE("Hello") );
        System.out.println( obj.stringE("Heelle") );
        System.out.println(obj.stringE("Heelele") );
        
    } 
}
