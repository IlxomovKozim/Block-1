package lloneteen;

public class LoneTeen {
    public boolean loneTeen(int a, int b){  
        
        if(a == b){
            return false;
        }
        else if((a >=13 && a <= 19) || (b >=13 && b <= 19)){
            return true;
        }
        
        else
            return false;
        
    }
    public static void main(String[] args) {
       
        LoneTeen obj = new LoneTeen();
        
        System.out.println(obj.loneTeen(13, 99));
        System.out.println(obj.loneTeen(21, 19));
        System.out.println(obj.loneTeen(13, 13));
        
    } 
}
