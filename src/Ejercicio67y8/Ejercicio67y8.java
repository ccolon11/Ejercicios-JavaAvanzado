public class Ejercicio67y8 {
    public static void main(String[] args) {
        Caballo elcaballo = Caballo.getInstance();
        elcaballo.setPaseo(1);

        Caballo elcaballo1 = Caballo.getInstance();
        elcaballo1.setPaseo(3);
        System.out.println("Cantidad de paseos: " + elcaballo1.getPaseo());
    }

    public static class Caballo {
        private static Caballo instancia;
        public int paseo;

        private Caballo() { }

        public static Caballo getInstance() {
            if (instancia == null) {
                instancia = new Caballo();
            }
            return instancia;
        }

        public void setPaseo(int paseo) {
            this.paseo = paseo;
        }

        public int getPaseo() {
            return paseo;
        }
    }
}

