
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Read the CVS output and resubmit transactions that can be verified after tweaking.
 *
 * Created by bclark on 9/5/2017.
 */
public class ResubmitNetverify {

    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";

    // Netverify attributes index
    private static final int NETVERIFY_STATUS = 0;
    private static final int NETVERIFY_SOURCE = 1;
    private static final int NETVERIFY_VER_STATUS = 2;
    private static final int NETVERIFY_TRANS_DATE = 3;
    private static final int NETVERIFY_SCAN_ID = 4;
    private static final int NETVERIFY_TYPE = 5;
    private static final int NETVERIFY_COUNTRY = 6;
    private static final int NETVERIFY_STATE = 7;
    private static final int NETVERIFY_FIRST_NAME = 8;
    private static final int NETVERIFY_LAST_NAME = 9;
    private static final int NETVERIFY_FACE_MATCH = 10;
    private static final int NETVERIFY_CUSTOMER = 11;
    private static final int NETVERIFY_MERCHANT = 12;
    private static final int NETVERIFY_DOB = 13;
    private static final int NETVERIFY_EXPIRY = 14;



    public static void main(String[] args) {

        if (args == null || args.length == 0) {
            System.out.println("No CSV file was supplied.");
            System.exit(0);
        }

        BufferedReader fileReader = null;

        try {
            ArrayList<Netverify> verifications = new ArrayList();

            String line = "";

            fileReader = new BufferedReader(new FileReader(args[0]));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length >0) {
                    Netverify netverify = new Netverify(tokens[NETVERIFY_STATUS],
                            tokens[NETVERIFY_SOURCE],
                            tokens[NETVERIFY_VER_STATUS],
                            tokens[NETVERIFY_TRANS_DATE],
                            tokens[NETVERIFY_SCAN_ID],
                            tokens[NETVERIFY_TYPE],
                            tokens[NETVERIFY_COUNTRY],
                            tokens[NETVERIFY_STATE],
                            tokens[NETVERIFY_FIRST_NAME],
                            tokens[NETVERIFY_LAST_NAME],
                            tokens[NETVERIFY_FACE_MATCH],
                            tokens[NETVERIFY_COUNTRY],
                            tokens[NETVERIFY_MERCHANT],
                            tokens[NETVERIFY_DOB],
                            tokens[NETVERIFY_EXPIRY]);

                    verifications.add(netverify);


                }
            }

            for (Netverify netverify : verifications) {
                System.out.println(netverify.toString());
            }

        } catch (Exception e) {
            System.out.println("Error!!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing filereader!!!");
                e.printStackTrace();
            }
        }



    }

}
