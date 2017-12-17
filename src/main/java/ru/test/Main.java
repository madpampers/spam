package ru.test;

import ru.test.messengers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<Contact>();
        for (int i = 0; i < 100; i++) {
            Messenger messenger = getRandomMessenger();
            contactList.add(new Contact(messenger));
        }
        Spamer spamer = new Spamer(contactList);
        spamer.startSpam();
    }

    private static Messenger getRandomMessenger() {
        Random random = new Random();
        int i = random.nextInt(3);
        System.out.println(i);
        switch (i) {
            case (0): {
                return new Viber();
            }
            case (1): {
                return new Telegram();
            }
            case (2): {
                return new WhatsUp();
            }
        }
        return null;
    }
}
