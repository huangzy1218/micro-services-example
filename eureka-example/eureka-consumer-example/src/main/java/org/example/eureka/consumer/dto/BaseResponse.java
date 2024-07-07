package org.example.eureka.consumer.dto;

/**
 * @author Huang Z.Y.
 */
public class BaseResponse {

    private String status;
    private String message;
    private UserInfo data;

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

    public UserInfo getData() {
        return data;
    }

    public void setData(UserInfo data) {
        this.data = data;
    }

}
    