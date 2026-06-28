package Array;

public class First {
    int second(int arr[]) {
        int large = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                second = large;
                large = arr[i];
            } else if (arr[i] > second && arr[i] != large) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 40, 19, 18, 25 };
        System.out.println(new First().second(arr));
    }
}