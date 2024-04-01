/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hw_1_12;
import java.util.Scanner;

/**
 *
 * @author Jginyue B760M
 */
public class HW_1_12 {

    public static void main(String[] args) {
        System.out.println("Балковский Александр, РИБО-02-22, вариант 2");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите путь к файлу для десериализации:");
            String filePath = scanner.nextLine();

            MessageDeserializer deserializer = new MessageDeserializer(filePath);
            Thread thread = new Thread(deserializer);
            thread.start();
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
