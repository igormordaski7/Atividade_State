public class EstadoNovo implements OrderState {
    @Override
    public void pagar(Order order) {
        System.out.println("Pagamento recebido. Mudando estado para 'Pago'.");
        order.setEstado(new EstadoPago());
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Não é possível enviar um pedido que ainda não foi pago.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Não é possível entregar um pedido que ainda não foi pago.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Pedido cancelado. Mudando estado para 'Cancelado'.");
        order.setEstado(new EstadoCancelado());
    }
}
