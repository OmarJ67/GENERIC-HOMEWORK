class PersonajeGenerica<T> implements Personaje<T> {
    private String nombre;
    private int puntosVida;

    public PersonajeGenerica(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    public void atacar(T objetivo) {
        System.out.println(this.obtenerNombre() + " ataca a " + ((Personaje<?>)objetivo).obtenerNombre());
    }

    public void recibirDanio(int cantidadDanio) {
        puntosVida -= cantidadDanio;
        if (puntosVida <= 0) {
            System.out.println(this.obtenerNombre() + " ha sido derrotado.");
        }
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerPuntosVida() {
        return puntosVida;
    }
}

