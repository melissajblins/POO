import dispositivos.LampadaInteligente;

public class GerenciadorLampadas{
		
	private LampadaInteligente[] vetorLampadas = new LampadaInteligente[10];
	private int numeroLampadas = 0;
		
	public void adicionarLampada(){
		vetorLampadas[numeroLampadas] = new LampadaInteligente();
			numeroLampadas++;
	}
		
	public void ligarLampada(int indiceLampada){
		if(!vetorLampadas[indiceLampada].getEstado()){
			vetorLampadas[indiceLampada].ligar();
		}
	}
		
	public void desligarLampada(int indiceLampada){
		if(vetorLampadas[indiceLampada].getEstado()){
			vetorLampadas[indiceLampada].desligar();
		}
	}
		
	public void ligarTodasLampadas(){
		for (int i = 0; i < numeroLampadas; i++){
			ligarLampada(i);
		}
	}
		
	public void desligarTodasLampadas(){
		for (int i = 0; i < numeroLampadas; i++){
			desligarLampada(i);
		}
	}
}