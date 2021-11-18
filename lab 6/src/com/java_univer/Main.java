package com.java_univer;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Введите 5 карт первого игрока: ");
        for (int i = 0; i < 5; i++) {
            arr1.add(scan.nextInt());
        }
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите 5 карт второго игрока: ");
        for (int i = 0; i < 5; i++) {
            arr2.add(scan2.nextInt());
        }
        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (((arr1.get(0) > arr2.get(0)) && (arr1.get(0) != 0) && (arr2.get(0) != 9) && (arr1.get(0) != 9) && (arr2.get(0) != 0)) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (((arr1.get(0) < arr2.get(0)) && (arr2.get(0) != 0) && (arr1.get(0) != 9) && (arr2.get(0) != 9) && (arr1.get(0) != 0)) || ((arr2.get(0) == 0) && (arr1.get(0) == 9))) {
                arr2.add(arr1.get(0));
                arr2.add(arr2.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);
            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            }else if (arr2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}
