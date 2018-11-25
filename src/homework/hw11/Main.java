package homework.hw11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import homework.hw11.students.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {

        Student student = new Student(); //(1, "Bob",22, Arrays.asList(10, 9, 6, 8, 9) );
        student.setId(1);
        student.setAge(22);
        student.setName("Bob");
        student.setMarks(Arrays.asList(10, 9, 6, 8, 9));

        System.out.println("XML");
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(student, System.out);

        System.out.println("JSON");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(System.out, student);


    }
}
