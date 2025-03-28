package Interface.funcionalidades.Navegador;

public interface Navegador {
 public void exibirPagina(String url);

 public void adicionarNovaAba();

 public void fecharAba();

 public void atualizarPagina();

 default void armazenaHistorico(){
    System.out.println("Armazenando historico");
 }

}
