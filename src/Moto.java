import java.util.Date;

/**
 * classe che rappresenta la moto
 * è un estensione della classe veicolo, quindi avrà stessi gli metodi e attributi
 * @author gabriele
 * @version 1
 * */

public class Moto extends Veicolo{

	/**
	 * costruttore moto
	 * */
	public Moto(String nome, String marca, String targa, Date dataArrivo)
	{
		super(nome,marca,targa,dataArrivo);
	}
}
