import java.io.IOException;

public class LabelPrinter {
    public static void main(String[] args) throws IOException {
        OptionSeperator optionSeperator = new OptionSeperator(args);
        FileProcessor fileProcessor = new FileProcessor(optionSeperator.file);
        fileProcessor.printDetails(optionSeperator.choice, optionSeperator.country);
    }
}