package Alumnos;

public class Alumno
{
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String telefono;
    private String correo;
    private boolean discapacidad;
    private String curp;
    private int edad;
    private String estadoNacimiento;

public Alumno(String nombre, String apPaterno, String apMaterno, String telefono, Boolean discapacidad, String curp, String estadoNacimiento)
    {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.telefono = telefono;
        this.correo = correo;
        this.discapacidad = discapacidad;
        this.curp = curp;
        this.estadoNacimiento = estadoNacimiento;
    }

    public String getNombre(){
    return nombre;
    }

    public String getApPaterno(){
    return apPaterno;
    }
}
