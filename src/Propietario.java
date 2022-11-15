import java.util.Date;

public class Propietario {
    private String nombre;
    private String cpf;
    private String rg;
    private Date fechaDeNacimiento;

    private String expresar;

    private Direccion direccion;



    public Propietario(String nombre,String cpf,String rg, Direccion direccion) {
        this.nombre=nombre;
        this.cpf=cpf;
        this.rg=rg;
        this.setDireccion(direccion);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }


    public String getExpresar() {
        return expresar;
    }

    public void setExpresar(String expresar) {
        this.expresar = expresar;
    }


    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
