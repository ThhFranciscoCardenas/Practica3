package Alumnos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FRMAlumnos pantalla = new FRMAlumnos();
                pantalla.setVisible(true);
                pantalla.setBotonGuardarListener(new BotonGuardarListener() {
                    @Override
                    public void guardando(Alumno persona) {
                        System.out.println("Nombre"+persona.getNombre());
                        System.out.println("Apellido Paterno"+persona.getApPaterno());
                    }
                });
        }


        });

    }
}
