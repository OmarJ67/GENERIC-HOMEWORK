public class Main {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = {
            new Circulo(5),
            new Cuadrado(4),
            new Circulo(3)
        };

        ManejadorFiguras.mostrarInformacion(figuras);
    }

}