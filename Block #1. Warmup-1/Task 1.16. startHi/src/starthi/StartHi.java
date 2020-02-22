package starthi;

public class StartHi {
    public boolean startHi(String str){  
        
       if(str.startsWith("hi")){
           return true;
       }
       else
           return false;
       
    }
    public static void main(String[] args) {
        
        StartHi obj = new StartHi();
        
        System.out.println(obj.startHi("hi there"));
        System.out.println(obj.startHi("hi"));
        System.out.println(obj.startHi("hello hi"));
        
    }
}
