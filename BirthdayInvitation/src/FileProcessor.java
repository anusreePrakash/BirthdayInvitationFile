import java.io.IOException;
import java.util.ArrayList;

public class FileProcessor {
    private String fileName;
    private ArrayList<Person> allDetails = new ArrayList<>();

    public FileProcessor(String fileName) {
        this.fileName = fileName;
    }

    private void extractor(char[] buffer) {
        String[] data, csv;
        data = new String(buffer).split("\n");
        for (String string : data) {
            csv = string.split(",");
            PersonName personName = new PersonName(csv[0], csv[1]);
            Country country = new Country(csv[6]);
            Address address = new Address(csv[4], csv[5], country);
            Person person = new Person(personName, Integer.parseInt(csv[3]), csv[2], address);
            allDetails.add(person);
        }
    }

    public void printDetails(String choice, String country) throws IOException {
        ReadFile reader = new ReadFile();
        char[] buffer = reader.readFile(fileName);
        extractor(buffer);
        for (Person each : allDetails) {
            System.out.println(each.getSpecifiedFormat(choice));
        }
    }
}
