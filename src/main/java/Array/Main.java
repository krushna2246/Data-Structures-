package Array;

class Main {
    static int removeDuplicates(int arr[]) {
        int i = 0;


            for (int j = 1; j < arr.length; j++) {

                if (arr[j] != arr[i]) {
                    arr[i+1] = arr[j ];
                    i++;
                }
            }

        return i;

}

    public static void main(String[] args) {
        int arr[] = {10,10, 20, 20, 30, 30, 40, 50};

        int n = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}