package americanas;

public class Usuario {

	private String email;
	private String senha;
	private String CPF;
	private String nomeSobrenome;
	private String dataNasc;
	private String sexo;
	private String telefone;
	private boolean notifWhats;
	private boolean notifEmail;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getNomeSobrenome() {
		return nomeSobrenome;
	}
	public void setNomeSobrenome(String nomeSobrenome) {
		this.nomeSobrenome = nomeSobrenome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isNotifWhats() {
		return notifWhats;
	}
	public void setNotifWhats(boolean notifWhats) {
		this.notifWhats = notifWhats;
	}
	public boolean isNotifEmail() {
		return notifEmail;
	}
	public void setNotifEmail(boolean notifEmail) {
		this.notifEmail = notifEmail;
	}
	
	
}
