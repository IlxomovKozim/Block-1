package hasteen;

public class HasTeen {
    public boolean hasTeen(int a, int b, int c){
    if((a >=13 && a <= 19) || (b >=13 && b <= 19) || (c >=13 && c <= 19)){
            return true;
        }
        else
            return false;
        
    }
    public static void main(String[] args) {
        
        HasTeen obj = new HasTeen();
        
        System.out.println(obj.hasTeen(13, 20, 10));
        System.out.println(obj.hasTeen(20, 19, 10));
        System.out.println(obj.hasTeen(20, 10, 13));
    }
    
}
