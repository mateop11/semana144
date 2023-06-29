class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;
    private double area;
    private double perimetro;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(new Punto(0, 0, 0));
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularArea() {
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }

    @Override
    public void calcularVolumen() {
        // No se aplica para un triángulo en el espacio tridimensional
    }

    @Override
    public String toString() {
        return "Triángulo:\n" +
                "Lado 1 = " + lado1 + "\n" +
                "Lado 2 = " + lado2 + "\n" +
                "Lado 3 = " + lado3 + "\n" +
                "Área = " + area + "\n" +
                "Perímetro = " + perimetro + "\n";
    }
}
