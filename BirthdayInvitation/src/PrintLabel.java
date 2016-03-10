import java.util.ArrayList;

public class PrintLabel {

    private String choice;
    private ArrayList<Person> guests;

    public PrintLabel(ArrayList guests, String choice) {
        this.guests = guests;
        this.choice = choice;
    }

    public void consoleLabels() {
        for (Person each : guests) {
            System.out.println(each.getSpecifiedFormat(choice));
        }
    }
}
