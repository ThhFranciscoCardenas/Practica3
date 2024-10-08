package Alumnos;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

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
                        System.out.println("Correo "+persona.getCorreo());
                        System.out.println("Telefono "+persona.getTelefono());
                        System.out.println("Sexo "+persona.getSexo());
                        System.out.println("Curp "+persona.getCurp());
                        System.out.println("Discapacidad "+persona.getDiscapacidad());
                        System.out.println("Edad: " + persona.calcularEdadCurp());


                        Path path= Path.of("/Users/pako/Desktop/archivo.txt");
                        String contenido = "Nombre: "+persona.getNombre()+"\n"+
                                           "Apellido Paterno: "+persona.getApPaterno() + "\n"+
                                           "Apellido Materno: "+persona.getApMaterno() + "\n"+
                                           "Correo: " + persona.getCorreo() + "\n"+
                                           "Telefono: "+ persona.getTelefono() + "\n"+
                                           "Sexo: "+ persona.getSexo() + "\n"+
                                           "CURP: "+ persona.getCurp() + "\n"+
                                           "Discapacidad: "+ persona.getDiscapacidad()+ "\n"+
                                           "Edad: "+persona.calcularEdadCurp()+"\n";
                                ;


                        try(FileWriter archivo = new FileWriter(path.toFile(),true)){
                            PrintWriter pw = new PrintWriter(archivo);
                            //pw.println(contenido);
                            archivo.write(contenido);
                        }
                        catch (IOError e){e.getMessage();} catch(IOException e){
                            throw new RuntimeException(e);
                        }
                    }
                });
        }


        });

    }
}
