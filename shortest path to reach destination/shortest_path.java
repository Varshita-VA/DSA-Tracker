

public class shortest_path {
    public static float shortest(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else{
                x--;
            }
            
        }
        int X=x*x;
        int Y=y*y;
        return (float)Math.sqrt(X+Y);
    }
    public static void main(String args[]){
        String str="WNEENESENNN";
        System.out.print(shortest(str));
    }
}
