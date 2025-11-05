package git;

public class Smallest {
    public static void main(String[] args) {

        int[] arr ={1,6,2,8,10};

        int smallest =arr[0];

        for (int i=1; i<arr.length; i++)
        {
            if(arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.println("Smallest no is " +smallest);
    }
}
