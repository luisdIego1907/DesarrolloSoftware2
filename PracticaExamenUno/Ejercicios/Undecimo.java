public class Undecimo {

    /*
     * Hacer un programa que declare un arreglo de objetos Carro e inicialice cuatro
     * carros, cada uno con una marca de coche.El programa debe recorrer el
     * arreglo utilizando un bucle for-each e imprimir por pantalla las marcas de
     * los
     * coches almacenados.
     */
    public static void main(String[] args) {

        Carro[] carros = { new Carro(Marca.HONDA, "123") , new Carro(Marca.MERCEDEZ, "456") ,
             new Carro(Marca.TOYOTA, "789") , new Carro(Marca.HONDA, "000")};


        java.util.Arrays.stream(carros).forEach(n -> System.out.println(n.getMarca()));
    }
}

class Carro{
    private Marca marca;
    private String placa;

    public Carro(){

    }

    public Carro(Marca marca , String placa){
        this.marca = marca;
        this.placa = placa;
    }

    public Marca getMarca(){
        return marca;
    }
}

enum Marca{
    TOYOTA,MERCEDEZ,HONDA
}
