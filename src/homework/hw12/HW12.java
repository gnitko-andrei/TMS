package homework.hw12;

import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс содержащий ДЗ №12.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW12 extends AbstractRunnableHomework {

    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ.
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW12() throws InvalidHomeworkNumberException {
        setTasksAmount(7);
        initialize(12);
    }


    /**
     * @param number - номер задания
     * @throws InvalidTaskNumberException исключение выбрасывается в случае несовпаденя номера задания с перечисленными в блоке switch
     */
    @Override
    public void chooseTask(int number) throws InvalidTaskNumberException {
        switch (number) {
            case 1: {
                try {
                    this.task1();
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                try {
                    this.task2();
                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                try {
                    this.task3();
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                try {
                    this.task4();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 5: {
                try {
                    this.task5();
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 6: {
                try {
                    this.task6();
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 7: {
                System.out.println("Создать приложение, используя modules.");
                break;
            }
            default: {
                throw new InvalidTaskNumberException(number + " неправильный номер задания");
            }
        }
        System.out.println();
    }

    /**
     * Task 1
     * Сделать private поле доступным и поменять его значение.
     */
    private void task1() throws NoSuchFieldException, IllegalAccessException {
        ReflectionTest obj = new ReflectionTest();
        System.out.println("initial " + obj);

        Class<?> clazz = obj.getClass();
        System.out.println("declared fields" + Arrays.toString(clazz.getDeclaredFields()));

        Field field = clazz.getDeclaredField("id");
        field.setAccessible(true);
        field.set(obj, 15);

        System.out.println("result " + obj);
    }

    /**
     * Task 2
     * Вызвать private метод.
     */
    private void task2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ReflectionTest obj = new ReflectionTest();

        Class<?> clazz = obj.getClass();

        Method method = clazz.getDeclaredMethod("privatePrint");
        method.setAccessible(true);
        method.invoke(obj);
    }

    /**
     * Task 3
     * Изменить значение private static переменной.
     */
    private void task3() throws NoSuchFieldException, IllegalAccessException {
        System.out.println("initial " + ReflectionTest.getSt());

        Class<?> clazz = ReflectionTest.class;

        clazz.getDeclaredFields();
        Field field = clazz.getDeclaredField("st");
        field.setAccessible(true);
        field.set(null, 1);

        System.out.println("result " + ReflectionTest.getSt());
    }

    /**
     * Task 4
     * Реализовать метод, который сможет преобразовывать любой объект следующим образом:
     * Все int поля установить равными 1.
     * Все String поля поменять на hacked.
     * Всем полям типа boolean установить true.
     */
    private void task4() throws IllegalAccessException {
        ReflectionTest obj = new ReflectionTest();
        System.out.println("initial " + obj);

        Class<?> clazz = obj.getClass();
        System.out.println("declared fields" + Arrays.toString(clazz.getDeclaredFields()));


        Field[] field1 = clazz.getDeclaredFields();
        for (Field field1a : field1) {
            field1a.setAccessible(true);
            if (field1a.getType().equals(int.class))
                field1a.setInt(obj, 1);
            if (field1a.getType().equals(boolean.class))
                field1a.setBoolean(obj, true);
            if (field1a.getType().equals(String.class))
                field1a.set(obj, "hacked");
        }
        System.out.println("final object " + obj);
    }

    /**
     * Task 5
     * Попробовать изменить значение final переменной.
     */
    private void task5() throws NoSuchFieldException, IllegalAccessException {
        ReflectionTest obj = new ReflectionTest();
        System.out.println("initial " + obj);

        Class<?> clazz = obj.getClass();
        System.out.println("declared fields" + Arrays.toString(clazz.getDeclaredFields()));

        Field field = clazz.getDeclaredField("fin");
        field.setInt(obj, 10);

        System.out.println("result " + obj);
    }

    /**
     * Task 6
     * Попробовать изменить параметр size у HashMap, используя JDK 11 и JDK 8.
     */
    private void task6() throws NoSuchFieldException, IllegalAccessException {
        Map<String, String> map = new HashMap<>();
        System.out.println("initial " + map.size());

        Class<?> clazz = map.getClass();
        Field field = clazz.getDeclaredField("size");
        field.setInt(map, 1000);

        System.out.println("result " + map.size());

    }


}
