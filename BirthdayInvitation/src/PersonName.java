public class PersonName {
    private String last;
    private String first;

    public PersonName(String first, String last){
        this.first = first;
        this.last = last;
    }
    public String getFirstName(){
        return first+" "+last;
    }
    public String getLastName(){
        return last+", "+first;
    }
}
