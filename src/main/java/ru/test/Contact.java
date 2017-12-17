package ru.test;

import ru.test.messengers.Messenger;

public class Contact {
    private final Messenger messenger;

    public Contact(Messenger messenger) {
        this.messenger = messenger;
    }

    public void sendMessage(String message) {
        messenger.sendMessage(message);
    }
}
