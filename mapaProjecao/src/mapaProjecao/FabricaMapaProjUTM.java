package mapaProjecao;

public class FabricaMapaProjUTM extends FabricaAbstrata {

	private static FabricaAbstrata instancia;

	private FabricaMapaProjUTM() {}

	@Override
	public MapaProjecao criarMapaProjecao() {
		System.out.println("Criando instância de MapaProjecaoUTM");
		return new MapaProjecaoUTM();
	}

	public static FabricaAbstrata instancia() {
		System.out.println("Obtendo instância de FabricaMapaProjUTM");
		if(instancia == null){
			instancia = new FabricaMapaProjUTM();
		}
		return instancia;
	}

}
