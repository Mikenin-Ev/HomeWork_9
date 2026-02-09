import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1.");
        int sum = 0;
        int max = 0;
        int min = 300000;
        int arithmeticMean = 0;
        Random rand = new Random();
        int inputArry1[] = new int[5];
        for (int i = 0; i < inputArry1.length; i++) {
            inputArry1[i] = (rand.nextInt(20000) + 1) * 10;
            sum = sum + inputArry1[i];
            if (max < inputArry1[i]){
                max = inputArry1[i];
            }else if (min > inputArry1[i]){
                min = inputArry1[i];
            }
        }
        arithmeticMean = sum / inputArry1.length;
        int[] outputArry1 = new int[4];
        outputArry1[0] = sum;
        outputArry1[1] = max;
        outputArry1[2] = min;
        outputArry1[3] = arithmeticMean;
        System.out.println("inputArry1: " + Arrays.toString(inputArry1));
        System.out.println("outputArry1: " + Arrays.toString(outputArry1));
        System.out.println(" ");
        System.out.println("Задача № 2.");
    }
}