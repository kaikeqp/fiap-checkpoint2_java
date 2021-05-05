package americanas;
public class Programa {

	public static void main(String[] args) {
		
		Usuario usuario= new Usuario();
		
		usuario.setEmail("pablo@gmail.com");
		usuario.setSenha("232432a");
		usuario.setCPF("378392928-73");
		usuario.setNomeSobrenome("Pablo Ferreira");
		usuario.setDataNasc("23/02/2002");
		usuario.setSexo("masculino");
		usuario.setTelefone("119958-3947");
		usuario.setNotifWhats(true);
		usuario.setNotifEmail(true);
		
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getSenha());
		System.out.println(usuario.getCPF());
		System.out.println(usuario.getNomeSobrenome());
		System.out.println(usuario.getDataNasc());
		System.out.println(usuario.getSexo());
		System.out.println(usuario.getTelefone());
		System.out.println(usuario.isNotifWhats());
		System.out.println(usuario.isNotifEmail());
		
	}

}
