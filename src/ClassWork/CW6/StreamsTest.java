package ClassWork.CW6;

import java.io.*;
import java.util.Arrays;

public class StreamsTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        StreamsTest st = new StreamsTest();
        st.fileWriter();
        st.writePerson();
        st.readPerson();

    }

    public static void console() {
        Console c = System.console();
        if (c == null) {
            System.out.println("No console");
            return;
        }
        String name = c.readLine("Enter name");
        System.out.println(name);
        char[] password = c.readPassword("Enter password");
        System.out.println(Arrays.toString(password));
    }

    private void fileWriter() {
        try {
            FileWriter outputStream = new FileWriter("characteroutput.txt");
            outputStream.write("Hello");
            outputStream.flush();
            outputStream.write("World");
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writePerson() throws IOException {
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Person(1, "User1"));
        oos.close();
    }

    private void readPerson() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object p = ois.readObject();
        System.out.println(p);
        fis.close();
    }
}
