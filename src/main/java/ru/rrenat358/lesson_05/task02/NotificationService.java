package ru.rrenat358.lesson_05.task02;

import java.util.ArrayList;

public class NotificationService {

    private final EmailSender emailSender = new EmailSender();
    private final SmsSender smsSender = new SmsSender();


    public void sendSms(String phone, String message) {
        smsSender.send(phone, message);
    }


    public void subscribe(NotificationChannel channel) {
        channels.add(channel);
    }

    public void unSubscribe(NotificationChannel channel) {
        channels.remove(channel);
    }

    ArrayList<NotificationChannel> channels = new ArrayList<>();


    public void notifyAllChannels() {
        for (NotificationChannel channel : channels) {
            channel.notifyAllChannel();
        }
    }


}
