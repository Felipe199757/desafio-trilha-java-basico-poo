import Interface.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        // metodos do Aparelho telefonico
        iphone.realizarChamada("1998325003");
        iphone.atenderChamada();
        iphone.iniciarCorreioVoz();
        // metodos do Navegador
        iphone.exibirPagina("http://teste.com.br");
        iphone.adicionarNovaAba();
        iphone.fecharAba();
        iphone.atualizarPagina();
        // metodos do reprodutor musical
        iphone.tocarMusica("Let it be");
        iphone.pausarMusica();
        iphone.ajustarVolume();

    }
}
