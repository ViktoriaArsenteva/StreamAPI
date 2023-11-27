import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task1 {

    public static void numsOperations() {

        // Создать список из 1_000 рандомных чисел от 1 до 1_000_000 

        List<Integer> nums = new ArrayList<Integer>();
        int maxLen = 1000;
        int maxNum = 1000000;
        int minNum = 0;
        Random rn = new Random();

        for(int i = 0; i < maxLen; i++){
            nums.add(rn.nextInt(maxNum- minNum + 1) + minNum);

        }

        // Найти максимальное

        int maximum = nums.stream().max(Integer::compareTo).get();
        System.out.println("max = " + maximum);
        
        // Все числа, большие, чем 500_000, умножить на 5, отнять от них 150 и просуммировать

        int sum = nums.stream().filter(n -> n > 500000).map(n -> n * 5).map(n -> n - 150).reduce(Integer::sum).orElse(0);
        System.out.println("sum = " + sum);

        // Найти количество чисел, квадрат которых меньше, чем 100_000

        long count = nums.stream().filter(n -> (n*n) < 100000).count();
        System.out.println("count = " + count);


    }
    
}
 