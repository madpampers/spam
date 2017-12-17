package ru.test.messengers;

public class WhatsUp extends Messenger {
    @Override
    protected void sendWithConcreteProtocol(String message) {
        System.out.println("Sending WhatsUp: " + message);
    }
}
