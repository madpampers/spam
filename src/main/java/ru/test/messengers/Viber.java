package ru.test.messengers;

public class Viber extends Messenger {
    protected void sendWithConcreteProtocol(String message) {
        System.out.println("Sending Viber: " + message);
    }
}
