public class Acoplamiento {

    public static void main(String args[]){

        Person juan = new Person("juan", new EmailService());
    
        juan.notifyPerson();
    }
}

    class EmailService{
        
        public void sendEmail(String message){

            System.out.println("Sending email: " + message);
        }
    }

    class Person{

        private String name;
        private String email;
        private EmailService emailService;

        public Person(String name , EmailService emailService){
            this.name = name;
            this.emailService = emailService;
        }

        public void notifyPerson(){
            emailService.sendEmail("Hello, my name is " + name);
        }
    }
