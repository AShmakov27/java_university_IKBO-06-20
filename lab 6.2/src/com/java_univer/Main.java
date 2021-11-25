package com.java_univer;
import java.util.Scanner;
import com.java_univer.MyArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyArrayList<String> one = new MyArrayList<String>();
        MyArrayList<String> two = new MyArrayList<String>(15);
        System.out.println("Введите кол-во элементов для ввода в первый лист: ");
        int a = scanner.nextInt();
        for (int i = 0; i<a; i++){
            one.add(scanner.next());
        }
        System.out.println("Введите кол-во элементов для ввода во второй лист: ");
        int b = scanner.nextInt();
        for (int i = 0; i<b; i++){
            two.add(scanner.next());
        }
        System.out.println(one.size());
        System.out.println(two.size());
        System.out.println("Введите индекс под которым хотите вставить во второй лист элемент: ");
        int с = scanner.nextInt();
        two.add(с, scanner.next());
        System.out.println(two.size());
        one.clear();
        if (one.isEmpty())
            System.out.println("Is empty");
        System.out.println(two.toString());
    }
}
