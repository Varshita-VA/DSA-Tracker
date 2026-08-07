
public class print_increasing {
    public static void increase(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        increase(n-1);
        System.out.println(n);
        
    }
    public static void main(String args[]){
        increase(5);
    }   
}
