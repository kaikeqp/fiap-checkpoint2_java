package cissamagazine;

public class UsuarioPJ {

	private String email;
	private String senha;
	private String CNPJ;
	private String inscEstUF;
	private long inscEst;
	private String razaoSocial;
	private String nomeFant;
	private String respNome;
	private String respCPF;
	private String telefonePri;
	private String telefoneSec;
	private boolean ICSM;
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
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	public String getInscEstUF() {
		return inscEstUF;
	}
	public void setInscEstUF(String inscEstUF) {
		this.inscEstUF = inscEstUF;
	}
	public long getInscEst() {
		return inscEst;
	}
	public void setInscEst(long inscEst) {
		this.inscEst = inscEst;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFant() {
		return nomeFant;
	}
	public void setNomeFant(String nomeFant) {
		this.nomeFant = nomeFant;
	}
	public String getRespNome() {
		return respNome;
	}
	public void setRespNome(String respNome) {
		this.respNome = respNome;
	}
	public String getRespCPF() {
		return respCPF;
	}
	public void setRespCPF(String respCPF) {
		this.respCPF = respCPF;
	}
	public String getTelefonePri() {
		return telefonePri;
	}
	public void setTelefonePri(String telefonePri) {
		this.telefonePri = telefonePri;
	}
	public boolean isICSM() {
		return ICSM;
	}
	public void setICSM(boolean ICSM) {
		this.ICSM = ICSM;
	}
	public boolean isRecebEmail() {
		return recebEmail;
	}
	public void setRecebEmail(boolean recebEmail) {
		this.recebEmail = recebEmail;
	}
	
	public String getTelefoneSec() {
		return telefoneSec;
	}
	
	public void setTelefoneSec(String telefoneSec) {
		this.telefoneSec = telefoneSec;
	}
}
