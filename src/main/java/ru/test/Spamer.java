package ru.test;

import java.util.List;

public class Spamer {
    private final List<Contact> spamList;

    public Spamer(List<Contact> spamList) {
        this.spamList = spamList;
    }

    public void startSpam() {
        for (Contact contact : spamList) {
            contact.sendMessage("Реклама чего-то");
        }
    }
}
