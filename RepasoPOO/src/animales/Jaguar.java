package animales;

public class Jaguar extends Animal implements IFelino {
    private int edad;
    private float peso;

    public Jaguar() {
        this.setEdad(0);
        this.setPeso(0.0f);
    }

    public Jaguar(int edad) {
        this.setEdad(edad);
        this.setPeso(0.0f);
    }
    public Jaguar(float peso) {
        this.setEdad(0);
        this.setPeso(peso);
    }

    public Jaguar(int edad, float peso) {
        this.setEdad(edad);
        this.setPeso(peso);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mi edad es" + this.getEdad() + " Mi peso es " + this.getPeso();
    }

    public void dormir() {
        System.out.println("El jaguar duerme!");
    }

    public void comer() {
        System.out.println("El jaguar come!");
    }
    @Override
    public void rugir() {
        System.out.println("El jaguar ruge!");
    }

    @Override
    public void maullar() {
        throw new UnsupportedOperationException("El juguar no maulla");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza!");
    }
}
