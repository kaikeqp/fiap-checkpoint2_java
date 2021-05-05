package oracle;

public class Programa {

	public static void main(String[] args) {
		
		Utilizador utilizador = new Utilizador();
		
		utilizador.setApelido("Kacike");
		utilizador.setCodPostal("03611050");
		utilizador.setDistrito("Paratibu");
		utilizador.setEmail("kaike@gmail.com");
		utilizador.setLocalidade("SP");
		utilizador.setMorada("São Paulo");
		utilizador.setNome("Kaike Santana");
		utilizador.setNomeEmp("Jiska");
		utilizador.setPais("Brasil");
		utilizador.setSenha("arrozefeijao");
		utilizador.setTelefoneTrab("11956748293");
		utilizador.setTituloFunc("Desenvolvedor");

		System.out.println(utilizador.getApelido());
		System.out.println(utilizador.getCodPostal());
		System.out.println(utilizador.getDistrito());
		System.out.println(utilizador.getEmail());
		System.out.println(utilizador.getLocalidade());
		System.out.println(utilizador.getMorada());
		System.out.println(utilizador.getNome());
		System.out.println(utilizador.getNomeEmp());
		System.out.println(utilizador.getPais());
		System.out.println(utilizador.getSenha());
		System.out.println(utilizador.getTelefoneTrab());
		System.out.println(utilizador.getTituloFunc());
		
	}

}
