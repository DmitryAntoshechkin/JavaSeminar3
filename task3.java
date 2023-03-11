//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package seminar3_Homework;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите  количество элементов массива: ");
        int size = myScanner.nextInt();
        myScanner.nextLine();
        myScanner.close();
        ArrayList<Integer> array = GetRandomArray(size);
        System.out.print(array);
        System.out.println();

        Optional<Integer> min = array.stream().min(Integer::compare);
        Optional<Integer> max = array.stream().max(Integer::compare);
        int sum = array.stream()
                        .mapToInt(a->a)
                        .sum();        
        System.out.println("Минимальное значение: "+min.get());
        System.out.println("Максимальное значение: "+max.get());
        System.out.println("Среднее арифметическое: "+sum/size);
     }

    public static ArrayList<Integer> GetRandomArray(int size) {
        ArrayList<Integer> array = new ArrayList<>(size);
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            array.add(rnd.nextInt(100));
        }
        return array;
    }

}
