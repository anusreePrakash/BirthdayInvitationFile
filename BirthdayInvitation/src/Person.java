public class Person {

    protected int age;
    protected String gender;
    protected PersonName name;
    protected Address address;

    public Person(PersonName name, int age, String gender, Address address) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.address = address;
    }

    public String setPrefix() {
        if (this.gender.equals("Male")) {
           return  Gender.Male.getPrefix();
        }
        if(this.gender.equals("Female")){
            return  Gender.Female.getPrefix();
        }
        return "";
    }

    protected String formalLabel() {
        String prefix = this.setPrefix();
        return prefix+" "+name.formalNameFormat();
    }

    protected String informalLabel() {
        String prefix = this.setPrefix();
        return prefix+" "+name.inFormalNameFormat();
    }


    public String getSpecifiedFormat(String format) {
        setPrefix();
        switch (format) {
            case "--firstLast":
                return formalLabel();
            case "--lastFirst":
                return informalLabel();

            default:
                return formalLabel();
        }
    }
}