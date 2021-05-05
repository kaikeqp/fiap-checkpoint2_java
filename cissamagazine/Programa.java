package cissamagazine;

public class Programa {

	public static void main(String[] args) {

		UsuarioPJ usuariopj = new UsuarioPJ();
		
		usuariopj.setCNPJ("3897483492-23");
		usuariopj.setEmail("paraiso@gmail.com");
		usuariopj.setICSM(true);
		usuariopj.setInscEst(33333548652l);
		usuariopj.setInscEstUF("SP");
		usuariopj.setNomeFant("Paraiso");
		usuariopj.setRazaoSocial("Parabenizar");
		usuariopj.setRecebEmail(true);
		usuariopj.setRespCPF("3746830932-23");
		usuariopj.setRespNome("Carlos da Silva");
		usuariopj.setSenha("34323jsk");
		usuariopj.setTelefonePri("112434-2342");
		usuariopj.setTelefoneSec("119373-4949");

		System.out.println("--------------------------------------------------");
		System.out.println("PESSOA JURIDICA");
		System.out.println("--------------------------------------------------");
		System.out.println(usuariopj.getCNPJ());
		System.out.println(usuariopj.getEmail());
		System.out.println(usuariopj.getInscEst());
		System.out.println(usuariopj.getInscEstUF());
		System.out.println(usuariopj.getNomeFant());
		System.out.println(usuariopj.getRazaoSocial());
		System.out.println(usuariopj.getRespCPF());
		System.out.println(usuariopj.getRespNome());
		System.out.println(usuariopj.getSenha());
		System.out.println(usuariopj.getTelefonePri());
		System.out.println(usuariopj.getTelefoneSec());
		System.out.println(usuariopj.isICSM());
		System.out.println(usuariopj.isRecebEmail());
		
		
		UsuarioPF usuariopf = new UsuarioPF();
		
		usuariopf.setEmail("dagoberto@gmail.com");
		usuariopf.setSenha("2323332a");
		usuariopf.setCPF("1432392928-73");
		usuariopf.setNomeSobrenome("Dagoberto Santos");
		usuariopf.setDataNasc("20/02/2002");
		usuariopf.setSexo("masculino");
		usuariopf.setTelefonePri("1139478-4934");
		usuariopf.setTelefoneSec("1139484-9303");
		usuariopf.setRecebEmail(false);
		
		System.out.println("--------------------------------------------------");
		System.out.println("PESSOA FISICA");
		System.out.println("--------------------------------------------------");
		System.out.println(usuariopf.getEmail());
		System.out.println(usuariopf.getSenha());
		System.out.println(usuariopf.getCPF());
		System.out.println(usuariopf.getNomeSobrenome());
		System.out.println(usuariopf.getDataNasc());
		System.out.println(usuariopf.getSexo());
		System.out.println(usuariopf.getTelefonePri());
		System.out.println(usuariopf.getTelefoneSec());
		System.out.println(usuariopf.isRecebEmail());
	}

}
