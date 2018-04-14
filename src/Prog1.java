
/**
 *
 * Kishan Malaviya
 */
import java.util.regex.Pattern;

public class Prog1 {

    private static final Pattern PATTERN = Pattern.compile(
            "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    public static boolean validate(final String ip) {
        return PATTERN.matcher(ip).matches();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //args=new String[]{"10.0.0.1","11.199.88.254","10.43.59.96"};
        if (args.length == 3) {
            for (String x : args) {
                if (!validate(x)) {
                    System.out.print("InValid");
                    System.exit(0);
                }
            }

            String[] start_ip = args[0].split("\\.");
            String[] end_ip = args[1].split("\\.");
            String[] check_ip = args[2].split("\\.");

            // System.out.print(start_ip.toString()+ "-" + end_ip.toString() + "-" + end_ip.toString());
            for (int i = 0; i < 4; i++) {
                if (Integer.valueOf(start_ip[i]) > Integer.valueOf(check_ip[i]) || Integer.valueOf(end_ip[i]) < Integer.valueOf(check_ip[i])) {
                    System.out.print("OutRange");
                    System.exit(0);
                }
            }
            System.out.print("InRange");
        }
    }
}
