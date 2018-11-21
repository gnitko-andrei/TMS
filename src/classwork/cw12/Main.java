package classwork.cw12;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Main instance = new Main();
        ReflectionTest obj = new ReflectionTest();
        instance.reflectionTest();
        ReflectionTest1 obj1 = new ReflectionTest1();
        instance.reflectionTest1(obj1);
        ReflectionTest1 obj2 = new ReflectionTest1();
        instance.reflectionTest1WithStreams(obj2);
    }

    private void reflectionTest() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ReflectionTest obj = new ReflectionTest();
        System.out.println("initial " + obj);

        Class<?> clazz = obj.getClass();
        System.out.println("declared fields" + Arrays.toString(clazz.getDeclaredFields()));

        Field field = clazz.getDeclaredField("id");
        field.setAccessible(true);
        field.set(obj, 1);

        field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(obj, "test");

        Method method = clazz.getDeclaredMethod("privatePrint");
        method.setAccessible(true);
        method.invoke(obj);

        System.out.println("final object " + obj);
    }

    private void reflectionTest1(Object obj) throws NoSuchFieldException, IllegalAccessException {

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

    private void reflectionTest1WithStreams(Object obj) throws NoSuchFieldException, IllegalAccessException {

        System.out.println("initial " + obj);

        Class<?> clazz = obj.getClass();
        System.out.println("declared fields" + Arrays.toString(clazz.getDeclaredFields()));

        Field[] field = clazz.getDeclaredFields();
        Arrays.stream(field)
                .forEach(
                        b -> {
                            b.setAccessible(true);
                            if (b.getType().equals(int.class)) {
                                try {
                                    b.setInt(obj, 1);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            }
                            if (b.getType().equals(boolean.class)) {
                                try {
                                    b.setBoolean(obj, true);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            }
                            if (b.getType().equals(String.class)) {
                                try {
                                    b.set(obj, "hacked");
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            }

                        }

                );

        System.out.println("final object " + obj);
    }
}