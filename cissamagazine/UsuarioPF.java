package cissamagazine;

public class UsuarioPF {

	private String email;
	private String senha;
	private String CPF;
	private String nomeSobrenome;
	private String dataNasc;
	private String sexo;
	private String telefonePri;
	private String telefoneSec;
	private boolean recebEmail;
	
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
	public String getTelefonePri() {
		return telefonePri;
	}
	public void setTelefonePri(String telefonePri) {
		this.telefonePri = telefonePri;
	}
	public String getTelefoneSec() {
		return telefoneSec;
	}
	public void setTelefoneSec(String telefoneSec) {
		this.telefoneSec = telefoneSec;
	}
	public boolean isRecebEmail() {
		return recebEmail;
	}
	public void setRecebEmail(boolean recebEmail) {
		this.recebEmail = recebEmail;
	}
}
