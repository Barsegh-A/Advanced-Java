package Homework1;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("phone")
public class Phone {
    private String phoneNumber;
    private String operator;


    public Phone(String phoneNumber, String operator) {
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
