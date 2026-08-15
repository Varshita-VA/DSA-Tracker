
public class merge_sort {
    public static void mergesort(int arr[],int si, int ei){

        //base case 
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;

        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

        
        
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //left part array pointer
        int j=mid+1; //right part array pointer
        int k=0; //to track temp array 

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];

            }
            else{
                temp[k++]=arr[j++];
            }
        } 
        while(i<=mid){ //i am clearing here the left array which is left 
            temp[k++]=arr[i++];
        } 
        while(j<=ei){ //clearing and adding right array which was left out
            temp[k++]=arr[j++];
        }

        //copying temp array values into the original array
        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void prin(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        prin(arr);

    }   
}
