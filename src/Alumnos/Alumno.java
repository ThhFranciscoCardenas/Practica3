package Alumnos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Alumno
{
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String telefono;
    private String correo;
    private boolean discapacidad;
    private String curp;
 //   private int edad;
    private String sexo;

public Alumno(String nombre, String apPaterno, String apMaterno,String curp,Boolean discapacidad, String correo, String telefono,  String sexi)
    {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.telefono = telefono;
        this.correo = correo;
        this.discapacidad = discapacidad;
        this.curp = curp;
        this.sexo= sexi;
    }

    public String getNombre(){
    return nombre;
    }
    public String getApPaterno(){
    return apPaterno;
    }
    public String getApMaterno(){
    return apMaterno;
    }
    public String getTelefono(){
    return telefono;
    }
    public String getCorreo(){
    return correo;
    }
    public Boolean cuentaConDiscapacidadCheckBox(){
    return discapacidad;
    }
    public String getCurp(){
        return curp;
    }
    public String getSexo(){
        return sexo;
    }
    public String getDiscapacidad(){
    if(discapacidad==true)
        return "si";
    else
        return "no";
    }


    public int calcularEdadCurp(){
    String añoS = curp.substring(4,6);
    String mesS = curp.substring(6,8);
    String diaS = curp.substring(8,10);

    int año = Integer.parseInt(añoS);
    int mes = Integer.parseInt(mesS);
    int dia = Integer.parseInt(diaS);

    if(año>LocalDate.now().getYear()%100){
        año += 1900;
    } else{
        año += 2000;
    }

    LocalDate fechaNacimiento;
        try {
            fechaNacimiento = LocalDate.of(año, mes, dia);
        } catch (DateTimeParseException e) {
            System.out.println("Error al analizar la fecha: " + e.getMessage());
            return -1;
        }


    return Period.between(fechaNacimiento,LocalDate.now()).getYears();
    }

    public void imprimirEdadCurp(){
    System.out.println("Edad: "+calcularEdadCurp());
    }
}



