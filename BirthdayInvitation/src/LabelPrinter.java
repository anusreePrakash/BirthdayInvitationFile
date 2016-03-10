import java.util.ArrayList;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {
        OptionSeparator optionSeparator = new OptionSeparator(args);
        ReadFile reader = new ReadFile();
        char[] content = reader.readFile(optionSeparator.separateFile());
        GuestGenerator guestGenerator = new GuestGenerator(content);
        ArrayList guests = guestGenerator.generateGuests();
        PrintLabel printLabel = new PrintLabel(guests, optionSeparator.separateChoice());
        printLabel.consoleLabels();
    }
}