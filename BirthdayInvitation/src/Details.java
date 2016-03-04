import Gender.Gender;

public class Details {
    private int age;
    protected Address address;
    protected PersonName name;
    protected Gender gender;

    public Details(PersonName name,int age, Address address){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public void setGender(Gender gender){
        this.gender =  gender;
    }
    public Gender getGender(){
        return this.gender;
    }
    public String setPrefix(){
        if (getGender().toString().equals("MALE"))
            return "Mr";
        else
            return "Ms";
    }
    public String firstNameFirst(){
        return this.setPrefix()+" "+name.getFirstName();
    }
    public String lastNameFirst(){
        return this.setPrefix()+" "+name.getLastName();
    }
    public String firstNameFirstwithCountry(){
        return this.setPrefix()+" "+name.getFirstName()+", "+address.country;
    }
    public String lastNameFirstwithCountry(){
        return this.setPrefix()+" "+name.getLastName()+", "+address.country;
    }
}
