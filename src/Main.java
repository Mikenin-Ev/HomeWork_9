import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //красиво с for:)
//        System.out.println("Задача № 1.");
//        int sum = 0;
//        int max = 0;
//        int min = 300000;
//        int arithmeticMean = 0;
//        Random rand = new Random();
//        int inputArry1[] = new int[5];
//        for (int i = 0; i < inputArry1.length; i++) {
//            inputArry1[i] = (rand.nextInt(20000) + 1) * 10;
//            sum = sum + inputArry1[i];
//            if (max < inputArry1[i]){
//                max = inputArry1[i];
//            }else if (min > inputArry1[i]){
//                min = inputArry1[i];
//            }
//        }
//        arithmeticMean = sum / inputArry1.length;
//        int[] outputArry1 = new int[4];
//        outputArry1[0] = sum;
//        outputArry1[1] = max;
//        outputArry1[2] = min;
//        outputArry1[3] = arithmeticMean;
//        System.out.println("inputArry1: " + Arrays.toString(inputArry1));
//        System.out.println("outputArry1: " + Arrays.toString(outputArry1));
//        System.out.println(" ");
//        System.out.println("Задача № 2.");
//        float tax = 0.13f;
//        float[] outputArry2 = new float[5];
//        float inputArry2[] = new float[5];
//        for (int i = 0; i < inputArry2.length; i++){
//            inputArry2[i] = (rand.nextFloat(20000) + 1) * 100;
//            outputArry2[i] = inputArry2[i] * tax;
//        }
//        System.out.println("inputArry2: " + Arrays.toString(inputArry2));
//        System.out.println("outputArry2: " + Arrays.toString(outputArry2));
//        System.out.println(" ");
//        System.out.println("Задача № 3.");
//        int bonus = 5000;
//        boolean[] outputArry3 = new boolean[5];
//        int inputArry3[] = new int[5];
//        for (int i = 0; i < inputArry3.length; i++) {
//            inputArry3[i] = rand.nextInt(3000,8000);
//            if (inputArry3[i] <= bonus){
//                outputArry3[i] = false;
//            }else
//                outputArry3[i] = true;
//        }
//        System.out.println("inputArry3: " + Arrays.toString(inputArry3));
//        System.out.println("outputArry3: " + Arrays.toString(outputArry3));
//        System.out.println(" ");
//        System.out.println("Задача № 4.");
//        boolean[] outputArry4 = new boolean[5];
//        int inputArry4[] = new int[5];
//        for (int i = 0; i < inputArry4.length; i++) {
//            inputArry4[i] = rand.nextInt(-3000, 3000);
//            if (inputArry4[i] < 0) {
//                outputArry4[i] = false;
//                break;
//            }else
//                outputArry4[i] = true;
//        }
//        System.out.println(Arrays.toString(inputArry4));
//        System.out.println(Arrays.toString(outputArry4));
//        System.out.println(" ");
//        System.out.println("Задача № 5.");
//        int month = 0;
//        int[] outputArry5 = new int[5];
//        int inputArry5[] = new int[5];
//        for (int i = 0; i < inputArry5.length; i++) {
//            inputArry5[i] = rand.nextInt(-500, 5000);
//            if (inputArry5[i] <= 0){
//                outputArry5[i] = 0;
//            }else {
//                outputArry5[i] = 1;
//            }
//            month = month + outputArry5[i];
//        }
//        System.out.println(Arrays.toString(inputArry5));
//        System.out.println(Arrays.toString(outputArry5));
//        System.out.println(month);
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.println(" ");

        //не красиво через for ech
        System.out.println("Задача № 1.");
        int sumPayout = 0;
        int maxPayout = 0;
        int minPayout = 300000;
        int arithmeticMeanPayout = 0;
        Random rand = new Random();
        int inputArry1[] = new int[5];
        for (int i = 0; i < inputArry1.length; i++) {
            inputArry1[i] = (rand.nextInt(20000) + 1) * 10;
        }
        for (int payout : inputArry1) {
            sumPayout = sumPayout + payout;
            if (maxPayout < payout){
                maxPayout = payout;
            }else if (minPayout > payout){
                minPayout = payout;
            }
        }
        System.out.println("inputArry1: " + Arrays.toString(inputArry1));
        arithmeticMeanPayout = sumPayout / inputArry1.length;
        int[] outputArry1 = new int[4];
        outputArry1[0] = sumPayout;
        outputArry1[1] = maxPayout;
        outputArry1[2] = minPayout;
        outputArry1[3] = arithmeticMeanPayout;
        System.out.println("outputArry1: " + Arrays.toString(outputArry1));
        System.out.println(" ");
        System.out.println("Задача № 2.");
        float tax = 0.13f;
        int index = 0;
        float[] inputArry2 = new float[5];
        float[] outputArry2 = new float[inputArry2.length];
        for (int i = 0; i < inputArry2.length; i++){
            inputArry2[i] = (rand.nextFloat(20000.0f) + 1.0f) * 100.0f;
        }
        for (float element : inputArry2) {
            outputArry2[index] = element * tax;
            index++;
        }
        System.out.println("inputArry2: " + Arrays.toString(inputArry2));
        System.out.println("outputArry2: " + Arrays.toString(outputArry2));
        System.out.println(" ");
        System.out.println("Задача № 3.");
        int bonus = 5000;
        int index3 = 0;
        int[] inputArry3 = new int[5];
        boolean[] outputArry3 = new boolean[inputArry3.length];
        for (int i = 0; i < inputArry3.length; i++) {
            inputArry3[i] = rand.nextInt(3000, 8000);
        }
        for (int flag : inputArry3) {
            if (flag > bonus){
                outputArry3[index3] = true;
            }else {
                outputArry3[index3] = false;
            }
            index3++;
        }
        System.out.println("inputArry3: " + Arrays.toString(inputArry3));
        System.out.println("outputArry3: " + Arrays.toString(outputArry3));
        System.out.println(" ");
        System.out.println("Задача № 4.");
        int inputArry4[] = new int[5];
        boolean[] outputArry4 = new boolean[1];
        for (int i = 0; i < inputArry4.length; i++) {
           inputArry4[i] = rand.nextInt(-3000, 3000);
        }
        for (int balance : inputArry4) {
            if (balance < 0) {
                outputArry4[0] = false;
                break;
            } else {
                outputArry4[0] = true;
            }
        }
        System.out.println(Arrays.toString(inputArry4));
        System.out.println(Arrays.toString(outputArry4));
        System.out.println(" ");
        System.out.println("Задача № 5.");
        int counter = 0;
        int index5 = 0;
        int inputArry5[] = new int[5];
        int[] outputArry5 = new int[1];
        for (int i = 0; i < inputArry5.length; i++) {
            inputArry5[i] = rand.nextInt(-500, 5000);
        }
        for (int profit : inputArry5) {
            if (profit > 0){
                outputArry5[0] = 1;
                counter++;
            }
        }
        System.out.println("inputArry5: " + Arrays.toString(inputArry5));
        System.out.println("outputArry5: " + Arrays.toString(outputArry5));
        System.out.println("Месяцев в плюс: " + counter);
    }
}