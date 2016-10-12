package myapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import myapp.errors.PersonError;

public class PersonManager {

    final private Map<Integer, Person> persons;

    public PersonManager() {
    	persons = new HashMap<>();
    	Person p0 = new Person(); p0.setPersonID("0"); p0.setNom("Bob"); p0.setPrenom("Michel"); p0.setDateNaissance("12/12/2012"); p0.setAdresseMail("bob.michel@mail.com");
    	Person p1 = new Person(); p0.setPersonID("1"); p0.setNom("Franky"); p0.setPrenom("leGrandFrère"); p0.setDateNaissance("18/18/2018"); p0.setAdresseMail("frankylebg@mail.com");
    	Person p2 = new Person(); p0.setPersonID("2"); p0.setNom("Alex"); p0.setPrenom("Terieure"); p0.setDateNaissance("01/06/1998"); p0.setAdresseMail("grosseblague@mail.com");
    	persons.put(0, p0);
    	persons.put(1, p1);
    	persons.put(2, p2);
    }

    public Collection<Person> findAll() {
        throw new IllegalStateException("Not yet implemented");
    }

    public void save(Person p) throws Exception {
    	persons.put(Integer.valueOf(p.getPersonID()),p);
    }

    public PersonError check(Person p) throws Exception {
    	PersonError error = new PersonError();
		if (p.getPersonID().isEmpty()) {
			error.setPersonIDErr("ID is empty");
		}
		if (p.getNom().isEmpty()) {
			error.setNomErr("Nom is empty!");
		}
		if (p.getPrenom().isEmpty()) {
			error.setPrenomErr("Prenom is empty");
		}
		if (p.getAdresseMail().isEmpty()) {
			error.setAdresseMailErr("Adress is empty!");
		}
		else if(!isValidEmailAddress(p.getAdresseMail())){
			error.setAdresseMailErr("Adress is not valid!");
		}
		if (p.getDateNaissance().isEmpty()){
			error.setDateNaissanceErr("Adress is empty!");
		}
		return error;
    }
    
    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
 }

}
