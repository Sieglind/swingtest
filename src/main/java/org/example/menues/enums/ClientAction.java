package org.example.menues.enums;

public enum ClientAction {
    CREAR_CLIENTE("Nuevo Cliente"),
    BUSCAR_CLIENTE("Buscar Cliente"),
    BORRAR_CLIENTE("Borrar Cliente");

    private final String etiqueta;

    ClientAction(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
}
