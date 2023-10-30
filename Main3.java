public class Main3 {
    public static void main(String[] args) {
        // Crear una paleta de fresa utilizando la clase genérica
        Paleta<PaletaFresa> paletaFresa = new Paleta<>("Fresa", 1.5, new PaletaFresa());

        // Mostrar información de la paleta
        paletaFresa.mostrarInformacion();
    }
}
