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
    private String sexo;

public Alumno(String nombre, String apPaterno, String apMaterno, String telefono, Boolean discapacidad, String curp, String estadoNacimiento, String sexi)
    {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.telefono = telefono;
        this.correo = correo;
        this.discapacidad = discapacidad;
        this.curp = curp;
        this.estadoNacimiento = estadoNacimiento;
        this.sexo= sexo;
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
    public String getDiscapacidad(){
    if(discapacidad==true)
        return "si";
    else
        return "no";
    }
    public String getCurp(){
    return curp;
    }
    public String getSexo(){
    return sexo;
    }


}
