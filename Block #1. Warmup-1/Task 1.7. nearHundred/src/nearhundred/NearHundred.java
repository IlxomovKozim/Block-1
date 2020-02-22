package nearhundred;

public class NearHundred {
    public boolean nearHundred(int n) { 
        
    if(n+10 >= 100 || n+10 >= 200){
        return true;
        
    }
    else{
        return false;
    }
    }
    public static void main(String[] args) {
       
         NearHundred obj = new  NearHundred();
         
         System.out.println(obj.nearHundred(93));
         System.out.println(obj.nearHundred(90));
         System.out.println(obj.nearHundred(89));       
    }
    
}
