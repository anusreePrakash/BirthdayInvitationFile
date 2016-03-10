import java.io.File;

public class OptionSeparator {
    private String[] args;

    public OptionSeparator(String[] args) throws Exception {
        this.args = args;
    }

//    public String separateCountry() throws Exception {
//        if (args.length >= 3) {
//            return args[1];
//        }
//        else
//            throw new Exception("countries Not Found");
//    }
    public String choiceSeparator() throws Exception {
        for (String arg : args) {
            if (arg.startsWith("-")) {
                return arg;
            }
        }
        throw new Exception("choices not found");
    }


    public String fileSeparator() throws Exception {
        for (String arg : args) {
            File f = new File(arg);
            if (f.exists() && !f.isDirectory())
                return arg;
        }
        throw new Exception("file not found");
    }
}
