import java.util.Date;

public class Sms {
    protected String msisdn = "";
    protected String recipient = "";
    protected String sender = "";
    protected Integer short_code = 0;
    protected String transaction_id = "";
    protected Date timestamp;

    public static void main(String[] args) {

    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Integer getShort_code() {
        return short_code;
    }

    public void setShort_code(Integer short_code) {
        this.short_code = short_code;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
