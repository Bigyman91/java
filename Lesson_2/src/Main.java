import Exceptions.MyArrayDataException;
import Exceptions.MySizeArrayException;

import static Counter.Counter.counter;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = {{"1", "2", "3", "58"}, {"2", "2", "2", "3"}, {"1", "2", "xv", "2"}, {"2", "2", "2", "2"}};
        String[][] arr2 = {{"1", "2", "3", "58"}, {"2", "2", "8", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"},{"5","5","5","4"}};
        String[][] arr3 = {{"1", "2", "3", "58"}, {"2", "2", "8", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = counter(arr1);
                System.out.println(result);
            } catch (MySizeArrayException e) {
                System.out.println("Размер массива превышен!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
        try {
            try {
                int result = counter(arr2);
                System.out.println(result);
            } catch (MySizeArrayException e) {
                System.out.println("Размер массива превышен!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
        try {
            try {
                int result = counter(arr3);
                System.out.println(result);
            } catch (MySizeArrayException e) {
                System.out.println("Размер массива превышен!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }
}







