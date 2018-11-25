package homework.hw6;

import java.io.Serializable;

/**
 * Класс User для задания 6
 *
 * @author Gnitko Andrei
 */
public class User2 implements Serializable {
    private int id;
    private String name;
    private transient String password;

    public User2(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
