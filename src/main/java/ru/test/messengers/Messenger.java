package ru.test.messengers;

public abstract class Messenger {

    private void connect() {
        System.out.println("Connecting...");
    }

    private void syncronize() {
        System.out.println("Synchronizing...");
    }

    private void closeConnection() {
        System.out.println("Closing connection");
    }

    public void sendMessage(String message) {
        connect();
        syncronize();
        sendWithConcreteProtocol(message);
        closeConnection();
    }

    protected abstract void sendWithConcreteProtocol(String message);
}
