package Array;

public class ClassA {
    static boolean issorted(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1] && arr[i]!=arr[i+1]){
                count++;
            }
        }
        if(count==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,50,50};

        System.out.println(ClassA.issorted(arr));
    }
}