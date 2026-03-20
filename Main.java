public class Main {
    public static void main(String[] args) {

        Elevador e = new Elevador();

        e.abrirPorta();
        e.subir();

        e.fecharPorta();
        e.subir();

        // 👇 COLOCA AQUI
        e.mostrarAndar();
        e.statusPorta();
    }
}