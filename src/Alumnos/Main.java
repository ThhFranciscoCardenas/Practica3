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
                        System.out.println("Nombre "+persona.getNombre());
                        System.out.println("Apellido Paterno "+persona.getApPaterno());
                        System.out.println("Apellido Materno "+persona.getApMaterno());
                        System.out.println("Curp "+persona.getCurp());
                        System.out.println("Correo "+persona.getCorreo());
                        System.out.println("Telefono "+persona.getTelefono());
                        System.out.println("Discapacidad "+persona.getDiscapacidad());
                        System.out.println("Sexo "+persona.getSexo());
                    }
                });
        }


        });

    }
}
