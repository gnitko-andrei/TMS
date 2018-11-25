package homework.hw6;

import java.io.Serializable;

/**
 * Класс User для задания 5
 *
 * @author Gnitko Andrei
 */
public class User1 implements Serializable {
    private int id;
    private String name;
    private String password;

    public User1(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
