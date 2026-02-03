package ak.com;

public class LargestSecondLargestNo {
    public static void main(String[] args) {
        //O(n)
        int[] arr = {23,25,67,89};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
