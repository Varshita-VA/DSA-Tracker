
public class remove_duplicate_in_string {

    public static void remove_duplicate(String word,int idx,StringBuilder newstr, boolean arr[]){

        if(idx==word.length()){
            System.out.print(newstr);
            return;
        }
        char ch=word.charAt(idx);
        if(arr[ch-'a']==true){
            remove_duplicate(word,idx+1,newstr,arr);
        }
        else{
            arr[ch-'a']=true;   
            remove_duplicate(word,idx+1,newstr.append(ch),arr);
        }

    }
    public static void main(String args[]){
        String word="appnnacollege";
        remove_duplicate(word,0,new StringBuilder(""),new boolean[26]);
    }
}
