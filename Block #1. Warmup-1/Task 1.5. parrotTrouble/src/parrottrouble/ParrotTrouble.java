package parrottrouble;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour){
        
    if(hour<7 || hour>20){
           return true;
    } 
    else if(talking == false){
           return false;
    }
    else
        return false;
    
} 
    public static void main(String[] args) {
        
       ParrotTrouble obj = new ParrotTrouble();
       
       System.out.println(obj.parrotTrouble(true, 6)); 
       System.out.println(obj.parrotTrouble(true, 7)); 
       System.out.println(obj.parrotTrouble(false, 6));
       
    }  
}
