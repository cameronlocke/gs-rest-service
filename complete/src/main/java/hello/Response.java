package hello;

/**
 * Created by clocke on 7/09/2016.
 */
public class Response {

    protected String status = "OK";
    protected String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
