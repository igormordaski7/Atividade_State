public class EstadoCancelado implements OrderState {
    @Override
    public void pagar(Order order) {
        System.out.println("Não é possível pagar um pedido cancelado.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Não é possível enviar um pedido cancelado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Não é possível entregar um pedido cancelado.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("O pedido já está cancelado.");
    }
}
