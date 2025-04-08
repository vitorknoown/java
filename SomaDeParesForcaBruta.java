public class SomaDeParesForcaBruta {
    public static int ContagemDeParesForcaBruta(int[]nums, int target){
        int count = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1;j < n; j++){
                if(nums[i] + nums[j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = NumberArrayProvider.getNumbers(); // Criar um metodo para gerar numero
        int target = 6;

        long startTime = System.nanoTime();

        int result = ContagemDeParesForcaBruta(nums, target);

        long endTime = System.nanoTime();

        System.out.println("Numero de pares encontrados: "+ result);
        System.out.println("Tempo de execução: "+(endTime - startTime)/1_000_000_0+"Segundos");

    }
}
