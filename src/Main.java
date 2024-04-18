import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.ALL);

        Scanner scanner = new Scanner("10");
        int number = scanner.nextInt();

        long result = factorial(number);

        String msg = String.format("d%! = %d", number, result);

        LOGGER.info(msg);

  //      LOGGER.trace("call trace method...");
  //      LOGGER.debug("call debug method...");
  //      LOGGER.info("call info method...");
  //      LOGGER.warn("call warn method...");
  //      LOGGER.error("call error method...");
  //      LOGGER.fatal("call fatal method...");
    }

    public static long factorial(int num) {
        LOGGER.debug("Input number is " + num);

        long result = 1;

        LOGGER.debug("Start: result = " + result);

        for (int i = 2; i <= num; i++) {
            result *= i;
            LOGGER.trace(String.format("i = %d, result = %d", i, result));
        }

        LOGGER.debug("Return result number is " + result);

        return result;
    }
}