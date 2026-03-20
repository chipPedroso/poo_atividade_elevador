public class Elevador {

    int andarAtual = 0;
    int totalAndares = 5;
    boolean portaAberta = false;

    void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta aberta");
    }

    void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta fechada");
    }

    void subir() {
        if (portaAberta) {
            System.out.println("Feche a porta primeiro!");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para " + andarAtual);
        }
    }

    void descer() {
        if (portaAberta) {
            System.out.println("Feche a porta primeiro!");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para " + andarAtual);
        }
    }

    

    void mostrarAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }

    void statusPorta() {
        if (portaAberta) {
            System.out.println("Porta aberta");
        } else {
            System.out.println("Porta fechada");
        }
    }
}