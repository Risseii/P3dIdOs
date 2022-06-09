import java.util.ArrayList;

class Pedidos{
    public String nombre;
    public double total;
    public boolean listo;
    public ArrayList<Articulo> items = new ArrayList<Articulo>(); //creo un arraylist denominada items y luego del arraylist se coloca el nombre de la clase a la cual se hace referencia
    

    public Pedidos(String nombre){  //Se utiliza this cuando hay argumentos???
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void addItem(Articulo lista){
        this.items.add(lista);
    }

    //listo:
    public void setlisto(boolean listo){
        this.listo = listo;

    }

    public boolean getListo(){
        return listo;
    }

    public String getStatusMessage(){
        if(listo){
            return "Tu pedido está listo";
        }
        return "Tu pedido estará listo pronto";
    }

    public ArrayList<Articulo> getItems(){ //revisar
        return items; //cuando es return no es necesario utilizar this
    }

    public double getTotal(){
        double total = 0.0;
        for (Articulo items : getItems()){  //this
            total += items.getPrecio();
        }

        return total;
    }

    public void display(){
        System.out.println(getNombre());

        for (Articulo items : getItems()){
            System.out.println(items.getNombreArt()+" "+ items.getPrecio()); //this
        }

        System.out.println(getTotal());
        
    }

}