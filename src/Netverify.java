/**
 * Created by bclark on 9/5/2017.
 */

public class Netverify {

    private String status;
    private String source;
    private String verificationStatus;
    private String transDate;
    private String scanId;
    private String type;
    private String country;
    private String state;
    private String firstName;
    private String lastName;
    private String faceMatch;
    private String customer;
    private String merchant;
    private String dob;
    private String expiry;

    public Netverify(
           String status,
           String source,
           String verificationStatus,
           String transDate,
           String scanId,
           String type,
           String country,
           String state,
           String firstName,
           String lastName,
           String faceMatch,
           String customer,
           String merchant,
           String dob,
           String expiry) {

                this.status = status;
                this.source = source;
                this.verificationStatus = verificationStatus;
                this.transDate = transDate;
                this.scanId = scanId;
                this.type = type;
                this.country = country;
                this.state = state;
                this.firstName = firstName;
                this.lastName = lastName;
                this.faceMatch = faceMatch;
                this.customer = customer;
                this.merchant = merchant;
                this.dob = dob;
                this.expiry = expiry;

    }


    @Override
    public String toString() {
        return "Netverify Line [status=" + status + ", source=" + source + " verStatus=" + verificationStatus + " transDate=" + transDate + " scan ID=" + scanId +
                " type=" + type + " country=" + country + " first Name=" + firstName + " lastname=" + lastName + " face Match=" + faceMatch;
    }
}
