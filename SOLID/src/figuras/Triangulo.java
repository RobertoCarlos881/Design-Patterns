package figuras;

public class Triangulo implements IFigura{
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
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
        return (getBase() * getAltura() )/2;
    }
}
