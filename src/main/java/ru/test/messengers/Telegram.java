package ru.test.messengers;

public class Telegram extends Messenger {
    protected void sendWithConcreteProtocol(String message) {
        System.out.println("Sending Telegram: " + message);
    }
}
