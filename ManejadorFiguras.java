// Clase genérica que maneja todas las figuras
class ManejadorFiguras {
    public static void mostrarInformacion(FiguraGeometrica[] figuras) {
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.obtenerNombre());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}
