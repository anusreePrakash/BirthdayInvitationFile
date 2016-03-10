import java.util.ArrayList;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {
        OptionSeparator optionSeparator = new OptionSeparator(args);
        ReadFile reader = new ReadFile();
        String content = reader.readFile(optionSeparator.fileSeparator());
        GuestGenerator guestGenerator = new GuestGenerator();
        ArrayList guests = guestGenerator.generateGuests(content);
        PrintLabel printLabel = new PrintLabel(guests, optionSeparator.choiceSeparator());
        printLabel.consoleLabels();
    }
}