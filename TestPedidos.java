
public class TestPedidos {
    public static void main(String[] args) {
    
        // Elementos del menú
        Articulo articulo1 = new Articulo("Moka",8.2);
        Articulo articulo2 = new Articulo("Late",5.7);
        Articulo articulo3 = new Articulo("Cafe de goteo",4.3);
        Articulo articulo4 = new Articulo("Capuchino",8.9);
    

        Pedidos pedido1 = new Pedidos("Cindhuri");
        Pedidos pedido2 = new Pedidos("Jimmy");
        Pedidos pedido3 = new Pedidos("Noah");
        Pedidos pedido4 = new Pedidos("Sam");

        //Imprime la variable pedido1 en la consola para ver qué sucede.
        //2da forma la mas recomendable:
        String name = pedido1.getNombre();
        System.out.println("Nombre:" + name);
    

        System.out.println("--P1--");
        //pruebas al pedido 1
        pedido1.addItem(articulo2);
        pedido1.addItem(articulo3);
        pedido1.display();
        //El pedido de Cindhuri ya está listo. Actualiza su estado.
        pedido1.setlisto(true);
        System.out.println(pedido1.getStatusMessage());
        
        System.out.println("--P2--");
        // Agrega el artículo1 a la lista de artículos del pedido2 e incrementa el total del pedido.
        pedido2.addItem(articulo1);
        pedido2.addItem(articulo2);
        pedido2.display();
        //El pedido de Jimmy ya está listo. Actualiza su estado.
        pedido2.setlisto(true);
        System.out.println(pedido2.getStatusMessage());
        // System.out.println(articulo2.precio);

        System.out.println("--P3-");
        //pedido3 pidió un capuchino. Agrega el capuchino a su lista de pedido y a su cuenta.
        pedido3.addItem(articulo4);
        pedido3.display();

        System.out.println("--P4--");
        //pedido4 agregó un latte. Actualiza en consecuencia.
        pedido4.addItem(articulo2);

        //Sam pidió más bebidas: 2 latte. Actualiza su pedido también.
        pedido4.addItem(articulo2);
        pedido4.addItem(articulo2);
        pedido4.display();
        

        






    }
}