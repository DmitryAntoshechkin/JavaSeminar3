//(Дополнительное) Реализовать алгоритм сортировки слиянием

package seminar3_Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите  количество элементов массива: ");
        int size = myScanner.nextInt();
        myScanner.nextLine();
        myScanner.close();
        List<Integer> array = GetRandomArray(size);
        System.out.println("Исходный массив: " + array);
        array = MergeSort(array);
        System.out.print("Отсортированный массив: " + array);
    }

    public static ArrayList<Integer> GetRandomArray(int size) {
        ArrayList<Integer> array = new ArrayList<>(size);
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            array.add(rnd.nextInt(100));
        }
        return array;
    }

    public static List<Integer> MergeSort(List<Integer> array) {
        if (array.size() == 1) {
            return array;
        }

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();
        leftArray = array.subList(0, array.size() / 2);
        rightArray = array.subList(array.size() / 2, array.size());
        leftArray = MergeSort(leftArray);
        rightArray = MergeSort(rightArray);

        List<Integer> mergedArray = new ArrayList<>();
        int leftPos = 0, rightPos = 0;
        for (int i = 0; i < leftArray.size() + rightArray.size(); i++) {
            if (leftPos == leftArray.size()) {
                mergedArray.add(rightArray.get(rightPos));
                rightPos++;
            } else if (rightPos == rightArray.size()) {
                mergedArray.add(leftArray.get(leftPos));
                leftPos++;
            } else if (leftArray.get(leftPos) < rightArray.get(rightPos)) {
                mergedArray.add(leftArray.get(leftPos));
                leftPos++;
            } else {
                mergedArray.add(rightArray.get(rightPos));
                rightPos++;
            }
        }
        return mergedArray;

    }

}
