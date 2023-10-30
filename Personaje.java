// Definición de una interfaz genérica para personajes del videojuego
interface Personaje<T> {
    void atacar(T objetivo);
    void recibirDanio(int cantidadDanio);
    String obtenerNombre();
    int obtenerPuntosVida();
}