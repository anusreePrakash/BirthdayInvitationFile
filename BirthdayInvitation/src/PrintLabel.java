import java.io.IOException;
import java.util.ArrayList;

public class PrintLabel {

    private String choice;
    private ArrayList<Person> guests;

    public PrintLabel(ArrayList guests, String choice) {
        this.guests = guests;
        this.choice = choice;
    }

    public void consoleLabels() throws IOException {
        for (Person each : guests) {
            System.out.println(each.getSpecifiedFormat(choice));
        }
    }
}
