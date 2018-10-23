package classwork.cw6;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private  String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name;
    }
}

