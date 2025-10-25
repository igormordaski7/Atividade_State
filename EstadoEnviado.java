public class EstadoEnviado implements OrderState {
    @Override
    public void pagar(Order order) {
        System.out.println("O pedido já foi pago e enviado.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("O pedido já foi enviado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Pedido entregue ao cliente. Mudando estado para 'Entregue'.");
        order.setEstado(new EstadoEntregue());
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Não é possível cancelar um pedido que já foi enviado.");
    }
}
