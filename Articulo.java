class Articulo {
    public String nombre;
    public double precio;


    public Articulo(String nombre,double precio){
        this.nombre = nombre;
        this.precio = precio;

    }

    //Precio:
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    //Nombre:
    public void setNombreArt(String nombre){
        this.nombre = nombre;

    }

    public String getNombreArt(){
        return nombre;
    }

}