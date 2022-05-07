import java.util.Scanner;
public class Array {
    public static int Max(int[] nums) {
        int max = nums[0];
        //int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static int Min(int[] x){
        int min = x[0];
        for (int i = 1; i < x.length; i++){
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        int[] values = { 50, 60, 1, 4, 90, 8 };
        Max(values);
        System.out.println("The maximum array value is " + Max(values));
        Min(values);
        System.out.println("The minimum array value is " + Min(values));
    }
}

