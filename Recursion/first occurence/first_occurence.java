

public class first_occurence {
    public static int first(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr,key,i+1);
        
    }
    public static void main(String args[]){
        int arr[]={2,4,5,6};
        System.out.println(first(arr,6,0));
    }
}
