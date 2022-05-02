
public class Alquiler extends Pedido{
	private int num_dias;

	Alquiler(int cod_copia, int num_articulos, int num_dias,double precio){
		super(cod_copia, num_articulos);
		this.precio = precio;
		this.num_dias = num_dias;
	}
	@Override
	public String toString() {
		return "Alquiler [cod_pedido= " + cod_pedido + ", num_articulos=" + num_articulos + " cod_copia = " + cod_copia + " Numero de dias " + num_dias + " precio= " + precio + "]";
	}

	

}
