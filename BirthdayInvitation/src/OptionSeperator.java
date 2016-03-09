import java.io.File;

public class OptionSeperator {
    protected String file;
    protected String choice;
    protected String country;

    public OptionSeperator(String[] args) {
        for (String arg : args) {
            if (arg.startsWith("-")) {
                this.choice = arg;
            }
            File f = new File(arg);
            if(f.exists() && !f.isDirectory()) {
                this.file = arg;
            }
        }

        if (args.length >= 3) {
            this.country = args[2];
        }
    }
}
