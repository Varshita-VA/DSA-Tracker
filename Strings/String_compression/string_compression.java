import java.util.*;
public class string_compression {
    public static String compression(String str){
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        for(Character key: hm.keySet()){
            sb.append(key);
            if(hm.get(key)==1){

            }
            else{sb.append(hm.get(key));}
        }

        return sb.toString();

    }
     public static void main(String args[]){
        String str="aaabc";
        System.out.print(compression(str));
    }
}
