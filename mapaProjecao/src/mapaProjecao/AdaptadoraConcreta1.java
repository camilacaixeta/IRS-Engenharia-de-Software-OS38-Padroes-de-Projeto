package mapaProjecao;

public class AdaptadoraConcreta1 extends AdaptadoraBase{

	private BibliotecaCalculosGeograficos1 biblioteca;

	public AdaptadoraConcreta1() {
		this.biblioteca = new BibliotecaCalculosGeograficos1();
	}

	@Override
	public float calcularDistanciaUTM(float x1, float x2, float y1, float y2){
		return this.biblioteca.distanciaUTM(x1, x2, y1, y2);
	}

	@Override
	public float calcularDistanciaLatLong(float x1, float x2, float y1, float y2){
		return this.biblioteca.distanciaLatLong(x1, x2, y1, y2);
	}

}
