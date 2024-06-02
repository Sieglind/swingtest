package org.example.gestor;

import java.util.HashMap;
import java.util.Map;

public class GestorDeHotel {

    private static GestorDeHotel gestorDeHotel;
    private final static Map<String,String> users = new HashMap<>();

    private GestorDeHotel() {
        users.put("Admin","1234");
    }

    public static GestorDeHotel getGestorDeHotel() {
        if (gestorDeHotel == null) {
            gestorDeHotel = new GestorDeHotel();
        }
        return gestorDeHotel;
    }

    public boolean login(String user, String pass) {
        return users.containsKey(user) && users.get(user).equals(pass);
    }
}
