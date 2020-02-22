package front3;

public class Front3 {
    public String front3(String str){ 
        int length = str.length();
        if(length > 2){
            String getFront3 = str.substring(0, 3);
                String new_str = getFront3+getFront3+getFront3;
            return new_str;
        }
        else
            return str;
    }
    public static void main(String[] args) {
       
        Front3 obj = new Front3();
        
       System.out.println(obj.front3("Java")); 
       System.out.println(obj.front3("Chocolate")); 
       System.out.println(obj.front3("abc"));
    }
    
}
