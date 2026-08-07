

public class print_decreasing_order {
    public static void number(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.println(n);
        number(n-1);
    }
    public static void main(String args[]){
        //System.out.println(number(10));
        number(10);
    }
}
