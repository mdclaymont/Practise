package TestCase;


public class PrintWithOutMainMethod  {

    private static final int STATUS = getStatus();

    private static int getStatus() {
        System.out.println("Hello World!!");
        System.exit(0);
        return 0;
    }

}


