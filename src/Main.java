import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Peaksoft peaksoft = new Peaksoft();
        peaksoft.setJava("Java 100 okuuchu okuit ");
        peaksoft.setJs("Jste da 100 okuuchu okuit ");
        System.out.println(peaksoft.getJava());
        System.out.println(peaksoft.getJs());*/

     /*   Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Write name: ");
        person.setFullName(scanner.nextLine());
        System.out.println("Write old: ");
        person.setAge(scanner.nextInt());
        System.out.println("Salary: ");
        person.setSalary(scanner.nextInt());
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write email: ");
        person.setEmail(scanner1.nextLine());
        System.out.println(person);*/


        Contact contact = new Contact("Abdumalik",502462105);
        Contact contact1 = new Contact("Manas",502462145);
        Contact contact2 = new Contact("Eldan",502462167);
        Contact contact3 = new Contact("Adilet",502462189);
        Contact[] contacts = {contact,contact3};



        Phone phone = new Phone("IPhone","11",500,"Torgeldi",contacts);
        Phone phone1 = new Phone("IPhone","8",300,"Bilal",new Contact[] {contact3,contact2});
        Phone [] phones = {phone,phone1};
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getContactCount());
        }


    }
}