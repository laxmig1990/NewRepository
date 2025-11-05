package git;

public class SecondLargest {

    public static void main(String[] args)
    {

        int[] arr = {1, 6, 2, 8, 10};

        int largest = arr[0];
        int secondlargest = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        for (int j=0; j<arr.length;j++)
        {
            if(arr[j] < largest && arr[j] != largest )
            {
                secondlargest= arr[j];
            }
        }
        System.out.println(secondlargest);
    }
}
