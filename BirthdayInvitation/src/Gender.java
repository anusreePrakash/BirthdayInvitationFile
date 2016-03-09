public enum Gender {
    Male("Mr"),
    Female("Ms");
    private final String prefix;

    Gender(String gender) {
        prefix = gender;
    }
    public String getPrefix(){
        return prefix;
    }
}
