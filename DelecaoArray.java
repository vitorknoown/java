import java.util.Arrays;

public class DelecaoArray {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        int removerIndice = 1;

        for(int i = removerIndice; i < 5 -1; i++){
            array[i] = array[i + 1];
        }
        System.out.println("array pós deleção " + Arrays.toString(array));

    }
}
