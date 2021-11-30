package ClaseYObjetos;

import java.util.Scanner;

public class marcadores {

    private Scanner entrada;
    private String punta;
    private String Marca;
    private String color;
    private String forma;
    private String material;
    private String tamaño;
    private int precio;

    public void inicializar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual seria la punta:");
        punta = entrada.next();

        System.out.println(" Cual seria la marca:");
        Marca = entrada.next();
        System.out.println("Cual seria el color:");
        color = entrada.next();
        System.out.println("Cual seria la forma:");
        forma = entrada.next();
        System.out.println("Cual seria el material:");
        material = entrada.next();
        System.out.println("Cual seria el tamaño:");
        tamaño = entrada.next();
        System.out.println("Cual seria el precio:");
        precio = entrada.nextInt();
    }


    public String getPunta() {
        return punta;
    }

    public String getMarca() {
        return Marca;
    }

    public String getColor() {
        return color;
    }

    public String getForma() {
        return forma;
    }

    public String getMaterial() {
        return material;
    }

    public String getTamaño() {
        return tamaño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPunta(String punta) {
        this.punta = punta;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
