public class PersonName {
    private String last;
    private String first;

    public PersonName(String first, String last){
        this.first = first;
        this.last = last;
    }
    public String formalNameFormat(){
        return first+" "+last;
    }
    public String inFormalNameFormat(){
        return  last+", "+first;
    }
}
