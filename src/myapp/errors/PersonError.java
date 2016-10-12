package myapp.errors;

public class PersonError {
	
	private String personIDErr;
	private String nomErr,prenomErr,adresseMailErr;
	private String dateNaissanceErr;
	private boolean hasError;

	public PersonError() {
		hasError = false;
	}

	public String getPersonIDErr() {
		return personIDErr;
	}

	public void setPersonIDErr(String personIDErr) {
		this.personIDErr = personIDErr; hasError = true;
	}

	public String getNomErr() {
		return nomErr;
	}

	public void setNomErr(String nomErr) {
		this.nomErr = nomErr; hasError = true;
	}

	public String getPrenomErr() {
		return prenomErr;
	}

	public void setPrenomErr(String prenomErr) {
		this.prenomErr = prenomErr; hasError = true;
	}

	public String getAdresseMailErr() {
		return adresseMailErr;
	}

	public void setAdresseMailErr(String adresseMailErr) {
		this.adresseMailErr = adresseMailErr; hasError = true;
	}

	public String getDateNaissanceErr() {
		return dateNaissanceErr;
	}

	public void setDateNaissanceErr(String dateNaissanceErr) {
		this.dateNaissanceErr = dateNaissanceErr; hasError = true;
	}

	public boolean isHasError() {
		return hasError;
	}

}
