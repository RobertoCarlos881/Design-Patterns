package figuras;

public class Rectangulo implements IFigura{
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Base " + this.getBase() + " Altura " + this.getAltura();
    }

    public float area() {
        return this.getBase() * this.getAltura();
    }

    //Esto de aqui no cumple con responsabilidad simple o single responsability
    /*public void imprimir() {
        System.out.println(this);
    }*/
}