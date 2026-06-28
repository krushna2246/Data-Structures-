public class First {

   static int findSecondLargest(int arr[]){
       int large=0;
       int secondlarge=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>large){
            large=arr[i];
        }
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>secondlarge && secondlarge<large){
            secondlarge=arr[i];
        }
    }
    return secondlarge;
   }
    public static void main(String[] args) {

        int arr[]={100,10,20,30,40,50};

        System.out.println(First.findSecondLargest(arr));
    }
}
