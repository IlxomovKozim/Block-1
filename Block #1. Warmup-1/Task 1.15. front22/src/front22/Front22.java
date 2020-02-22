package front22;

public class Front22 {
    public String front22(String str){
        
            String getFront22 = str.substring(0, 2);
                String new_str = getFront22+str+getFront22;
            return new_str;
            
    }
    public static void main(String[] args) {
       
        Front22 obj = new Front22();
        
        System.out.println(obj.front22("kitten"));
        System.out.println(obj.front22("Ha"));
        System.out.println(obj.front22("abc"));
        
    }   
}
