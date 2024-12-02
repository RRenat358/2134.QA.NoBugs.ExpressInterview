package ru.rrenat358.lesson_05.task02;

public class EmailSender extends NotificationChannel{

    private String email;



    public void sendEmail(String email, String message) {
        emailSender.send(email, message);
    }


    @Override
    public void notifyAllChannel(String messaage) {
        System.out.println("Send " + messaage);
    }
}
