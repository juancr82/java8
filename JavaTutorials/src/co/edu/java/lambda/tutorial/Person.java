package co.edu.java.lambda.tutorial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
	
	public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private int age;
    LocalDate birthday;
    private Sex gender;
    private String emailAddress;
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public static List<Person> createRoster() {
    	List<Person> persons = new ArrayList<>();
    	Person person = null;
    	for(int i = 1 ; i < 50 ; i++){
    		person = new Person();
    		person.setAge(i);
    		person.setName("name " + i);
    		person.setEmailAddress("email " + i);
    		if((i%2)==0){
    			person.setGender(Sex.FEMALE);
    		}else{
    			person.setGender(Sex.MALE);
    		}
    		persons.add(person);
    	}
    	return persons;
    }
	
	public void printPerson() {
        System.out.println("name: " + getName() + " age: " + getAge());
    }

}
