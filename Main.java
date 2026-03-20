public class Main {
    public static void main(String[] args) {

        Elevador e = new Elevador();

        System.out.println("TESTE 1 - Porta aberta e tentar subir");
        e.abrirPorta();
        e.subir();

        System.out.println("\nTESTE 2 - Subir normalmente");
        e.fecharPorta();
        e.subir();
        e.subir();

        System.out.println("\nTESTE 3 - Tentar ultrapassar limite");
        for (int i = 0; i < 10; i++) {
            e.subir();
        }

        System.out.println("\nTESTE 4 - Descer até o térreo");
        for (int i = 0; i < 10; i++) {
            e.descer();
        }

        System.out.println("\nTESTE 5 - Status final");
        e.mostrarAndar();
        e.statusPorta();
    }
}