package serialization;

import java.io.*;

public class WriteObject {

    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Misha");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            oos.writeObject(person1);
            oos.writeObject(person2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
