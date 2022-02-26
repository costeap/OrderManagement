package Incepe;

import javax.swing.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Costea Paula
 * @since Aprilie, 2021
 */
public class Reflection {

    public static void retrieveProperties(Object object) {

        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value;
            try {
                value = field.get(object);
                System.out.println(field.getName() + "=" + value);

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * @param objects
     * @param o
     * @param <T>
     * @return tabelul cu toate informatiile dintr-o anumita tabela
     */
    public static <T> JTable retrieveProperties1(List<T> objects, Object o) {
        List<String> header = new ArrayList<>();
        for (Field field : o.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value;
            try {
                header.add(field.getName());
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        Object[][] data = new Object[objects.size()][header.size()];
        for (int i = 0; i < objects.size(); i++) {
            int j = 0;
            for (Field field : objects.get(i).getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object value;
                try {
                    value = field.get(objects.get(i));
                    data[i][j] = value;
                    j++;
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        JTable jt = new JTable(data, header.toArray());
        return jt;

    }
}
