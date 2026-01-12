public class AcoplamientoErroneo {

    public static void main(String args[]) {

        Person p = new Person("juan");

        p.notifyPerson();

    }
}

class EmailService {

    public void sendEmail(String message) {

        System.out.println("Sending email: " + message);
    }
}

class Person {

    private String name;
    private String email;
    private EmailService emailService;

    public Person(String name) {
        this.name = name;
        this.emailService = new EmailService();
    }

    public void notifyPerson() {
        emailService.sendEmail("Hello, my name is " + name);
    }
}
