package monkeytrouble;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) { 
    if(aSmile == bSmile){
        return true;
    }
    else{
        return false;
    }
    } 
    public static void main(String[] args) {
     MonkeyTrouble obj = new MonkeyTrouble(); 
     
     System.out.println(obj.monkeyTrouble(true, true)); 
     System.out.println(obj.monkeyTrouble(false, false)); 
     System.out.println(obj.monkeyTrouble(true, false)); 
     
    }
    
}
