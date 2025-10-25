public class Order {
    private OrderState estadoAtual;

    public Order() {
        this.estadoAtual = new EstadoNovo();
        System.out.println("Pedido criado. Estado atual: Novo.");
    }

    public void setEstado(OrderState novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void pagar() {
        estadoAtual.pagar(this);
    }

    public void enviar() {
        estadoAtual.enviar(this);
    }

    public void entregar() {
        estadoAtual.entregar(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }
}
