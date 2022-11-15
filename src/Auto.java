
public class Auto {
    private String modelo;
    private String color;
    private int año;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroDePuertos;
    private Boolean tieneUnTechoSolar;
    private int numeroDeMarchas;
    private Boolean tieneTransmisionAutomatica;

    private Boolean marchaAtras;

    private int cantidadGalones;

    public Auto(Propietario propietario, Marca marca){
        this.propietario=propietario;
        this.marca=marca;
    }
    public void aceleracion(){
        int velocidadTemp=getVelocidadActual();
        velocidadTemp+=1;
        setVelocidadActual(velocidadTemp);

    }

    public void frenado(){
        setVelocidadActual(0);
    }
    public void cambioDeMarcha(){
        int marchaTemp=getNumeroDeMarchas();
        marchaTemp+=1;
        setNumeroDeMarchas(marchaTemp);
    }
    public void reduceLaMarcha(){
        int marchaTemp=getNumeroDeMarchas();
        marchaTemp-=1;
        setNumeroDeMarchas(marchaTemp);
    }

    public void marchaAtras() {
        int velocidadTemp = getVelocidadActual();
        if (velocidadTemp > 0) {
            setMarchaAtras(false);
            System.out.println("No puede dar marcha atras su velocidad es mayor a 0");
        } else {
            setMarchaAtras(true);
        }
    }

    public int autonomiaViaje(int consumoGasolinaPasado, int consumoDistanciaPasado){
        int gasolina= getCantidadGalones();
        int autonomia= ((consumoDistanciaPasado)*(gasolina))/(consumoGasolinaPasado);
        return autonomia;
    }
    public int volumenCombustible(){
        return getCantidadGalones();
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getNumeroDePuertos() {
        return numeroDePuertos;
    }

    public void setNumeroDePuertos(int numeroDePuertos) {
        this.numeroDePuertos = numeroDePuertos;
    }

    public Boolean getTieneUnTechoSolar() {
        return tieneUnTechoSolar;
    }

    public void setTieneUnTechoSolar(Boolean tieneUnTechoSolar) {
        this.tieneUnTechoSolar = tieneUnTechoSolar;
    }

    public Boolean getTieneTransmisionAutomatica() {
        return tieneTransmisionAutomatica;
    }

    public void setTieneTransmisionAutomatica(Boolean tieneTransmisionAutomatica) {
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public Boolean getMarchaAtras() {
        return marchaAtras;
    }

    public void setMarchaAtras(Boolean marchaAtras) {
        this.marchaAtras = marchaAtras;
    }

    public int getCantidadGalones() {
        return cantidadGalones;
    }

    public void setCantidadGalones(int cantidadGalones) {
        this.cantidadGalones = cantidadGalones;
    }
}
