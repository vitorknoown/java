import java.util.Arrays;

public class insercaoArray {

    public static void main(String[] args) {

        int[]array = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[3] = 999;

        System.out.println("array: " + Arrays.toString(array));
    }
}

