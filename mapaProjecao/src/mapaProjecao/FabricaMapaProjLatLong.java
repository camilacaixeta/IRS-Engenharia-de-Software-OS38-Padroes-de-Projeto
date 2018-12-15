package mapaProjecao;

public class FabricaMapaProjLatLong extends FabricaAbstrata {

	private static FabricaMapaProjLatLong instancia;

	private FabricaMapaProjLatLong() {}

	@Override
	public MapaProjecao criarMapaProjecao() {
		System.out.println("Criando instância de MapaProjecaoLatLong");
		return new MapaProjecaoLatLong();
	}

	public static FabricaAbstrata instancia() {
		System.out.println("Obtendo instância de FabricaMapaProjLatLong");
		if(instancia == null){
			instancia = new FabricaMapaProjLatLong();
		}
		return instancia;
	}

}
