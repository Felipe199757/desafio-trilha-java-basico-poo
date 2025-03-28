package Interface;

import Interface.funcionalidades.AparelhoTelefonico.AparelhoTelefonico;
import Interface.funcionalidades.Navegador.Navegador;
import Interface.funcionalidades.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical {
    // Métodos do Aparelho telefonico
    public void realizarChamada(String numero) {
        verificarCredito();
        verificarNumero();
        System.out.println("Ligando para " + numero);
    }

    public void atenderChamada() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("iniciando o correio de voz");
    }

    // Metodos do Navegador

    public void atualizarPagina() {
        System.out.println("Atualizando a Pagina");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
        armazenaHistorico();
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void fecharAba() {
        System.out.println("Aba fechada");
    }

    // métodos do Reprodutor musical

    public void pausarMusica() {
        System.out.println("musica pausada");
    }

    public void ajustarVolume() {
        System.out.println("ajustando volume");
    }

    public void tocarMusica(String musica) {
        System.out.println("Tocando a música " + musica);
    }

}
