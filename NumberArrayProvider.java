import java.util.Arrays;
import java.util.Random;

public class NumberArrayProvider {
    public static final int[] numbers = new int [1000000];

    static{
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
        numbers[i] = random.nextInt(100);
    }
}

public static int[] getNumbers(){
        return Arrays.copyOf(numbers, numbers.length);
    }
}
