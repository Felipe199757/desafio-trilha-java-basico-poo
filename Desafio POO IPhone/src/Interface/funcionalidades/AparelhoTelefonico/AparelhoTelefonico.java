package Interface.funcionalidades.AparelhoTelefonico;

public interface AparelhoTelefonico {
    public void realizarChamada(String numero);

    public void atenderChamada();

    public void iniciarCorreioVoz();

    default void verificarCredito(){
        System.out.println("verificando credito");
    };

    default void verificarNumero(){
        System.out.println("Verificando nnumero");
    };

}
