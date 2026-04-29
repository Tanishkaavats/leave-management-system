package com.tanishka.leavemanagement.model;

public class Leave {

    private int id;
    private String employeeName;
    private String reason;
    private String status;

    public Leave() {}

    public Leave(int id, String employeeName, String reason, String status) {
        this.id = id;
        this.employeeName = employeeName;
        this.reason = reason;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}