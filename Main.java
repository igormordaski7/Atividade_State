public class Main {
    public static void main(String[] args) {
        Order pedido = new Order();

        pedido.enviar();  
        pedido.pagar();    
        pedido.enviar();   
        pedido.entregar();
        pedido.cancelar();
    }
}
