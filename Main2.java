public class Main2 {
    public static void main(String[] args) {
        Personaje<Personaje<?>> guerrero = new Guerrero("omar", 100);
        Personaje<Personaje<?>> mago = new Mago("Gandalf", 80);

        guerrero.atacar(mago);
        mago.recibirDanio(20);
        guerrero.atacar(mago);
        mago.recibirDanio(60);
    }
}
