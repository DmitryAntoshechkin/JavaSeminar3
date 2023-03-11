// Пусть дан произвольный список целых чисел, удалить из него чётные числа


package seminar3_Homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in, "Cp866");
    System.out.println("Введите  количество элементов массива: ");
    int size = myScanner.nextInt();
    myScanner.nextLine();
    myScanner.close();
    ArrayList<Integer> array = GetRandomArray(size);
    System.out.print(array);
    System.out.println();

    for (int i = array.size() - 1; i >= 0; i--) {
        if (array.get(i) %2 == 0) {
            array.remove(i);
        }
    }        
    System.out.print(array);
  }  

  public static ArrayList<Integer> GetRandomArray(int size) {
    ArrayList<Integer> array = new ArrayList<>(size);
    Random rnd = new Random();
    for (int i = 0; i < size; i++) {
        array.add (rnd.nextInt(100));      
    }
    return array;    
  }
}


