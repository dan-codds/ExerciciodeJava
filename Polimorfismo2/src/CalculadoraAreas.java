public class CalculadoraAreas {

    public double calcularArea(int lado) {
        return lado * lado;
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public double calcularArea(double raio) {
        return Math.PI * raio * raio;
    }
}
