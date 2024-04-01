/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw_1_12;
import com.mirea.kt.example.Message;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author Jginyue B760M
 */
public class MessageDeserializer implements Runnable {
    private String filePath;

    public MessageDeserializer(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Message message = (Message) objectIn.readObject();
            System.out.println("ID: " + message.getId());
            System.out.println("Body: " + message.getBody());
            System.out.println("Type: " + message.getType());
            System.out.println("Has Attachments: " + message.isHasAttachments());
            System.out.println("Timestamp: " + message.getTimestamp());
        } catch (Exception e) {
            System.out.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}
