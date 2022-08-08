package serialization.arraySerialization;

import serialization.Person;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

    public static void main(String[] args) {
        Person[] people = {new Person(1, "Denis"),
                           new Person(2, "Dania"),
                           new Person(3, "Sania")};
        try {
            FileOutputStream fos = new FileOutputStream("peoples.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

