public class Main {
    public static void main(String[] args) {

        String nombre="Camilo porras";
        String cpf="122345";
        String rg="Cedula de ciudadania";
        String calle="Avenida siempre viva 123";
        String vecindario="Colina";
        String ciudad="Springfield";
        String codigoPostal="111156";
        String complementar="torre 2";
        Direccion direccion= new Direccion(calle,vecindario,ciudad,codigoPostal,complementar);
        Propietario propietario= new Propietario(nombre, cpf, rg,direccion);
        String nombreMarca="Truffade";
        String codigo="1234F";
        Marca marca=new Marca(nombreMarca,codigo);
        Auto auto=new Auto(propietario,marca);
    }
}