public class EstadoEntregue implements OrderState {
    @Override
    public void pagar(Order order) {
        System.out.println("O pedido já foi pago e entregue.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("O pedido já foi entregue ao cliente.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("O pedido já está entregue.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Não é possível cancelar um pedido que já foi entregue.");
    }
}
