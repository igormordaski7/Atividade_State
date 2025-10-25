public class EstadoPago implements OrderState {
    @Override
    public void pagar(Order order) {
        System.out.println("O pedido já foi pago.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Pedido enviado ao cliente. Mudando estado para 'Enviado'.");
        order.setEstado(new EstadoEnviado());
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Não é possível entregar um pedido que ainda não foi enviado.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Pedido cancelado. Mudando estado para 'Cancelado'.");
        order.setEstado(new EstadoCancelado());
    }
}
