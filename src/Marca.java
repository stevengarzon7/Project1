public class Marca {
    private String nombre;
    private int nrDeModelos;
    private int añoDeLanzamiento;
    private String codigoId;

    public Marca(String nombre,  String codigoId){
        this.nombre=nombre;
        this.codigoId=codigoId;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    public void setAñoDeLanzamiento(int añoDeLanzamiento) {
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    public String getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(String codigoId) {
        this.codigoId = codigoId;
    }
}
