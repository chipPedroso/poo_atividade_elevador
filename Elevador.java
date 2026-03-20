public class Elevador {

    int andarAtual = 0;
    int totalAndares = 5;
    boolean portaAberta = false;

    void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta aberta!");
    }

    void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta fechada!");
    }

    void subir() {
        if (portaAberta) {
            System.out.println("Feche a porta primeiro!");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para " + andarAtual + " Andar");
        } else {
            System.out.println("Você já está no último andar!");
        }
    }

    void descer() {
        if (portaAberta) {
            System.out.println("Feche a porta primeiro!");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para " + andarAtual + " Andar");
        } else {
            System.out.println("Você já está no térreo!");
        }
    }

    

    void mostrarAndar() {
        System.out.println("Andar atual: " + andarAtual + " Andar");
    }

    void statusPorta() {
        if (portaAberta) {
            System.out.println("Porta aberta!");
        } else {
            System.out.println("Porta fechada!");
        }
    }
}