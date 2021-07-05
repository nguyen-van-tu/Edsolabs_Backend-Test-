package com.example.demo.model;


import javax.persistence.*;
import java.sql.Date;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Department department;
    private Long numberPhone;
    private String customerReviews;
    private Date receptionTime;
    private String ticketProcessing;
    private boolean processingStatus;
    private Date processingTime;

    public Ticket() {
    }

    public Ticket(Long id, Department department, Long numberPhone, String customerReviews, Date receptionTime, String ticketProcessing, boolean processingStatus, Date processingTime) {
        this.id = id;
        this.department = department;
        this.numberPhone = numberPhone;
        this.customerReviews = customerReviews;
        this.receptionTime = receptionTime;
        this.ticketProcessing = ticketProcessing;
        this.processingStatus = processingStatus;
        this.processingTime = processingTime;
    }

        public Ticket(Department department, Long numberPhone, String ticketProcessing, Date receptionTime) {
        this.department = department;
        this.numberPhone = numberPhone;
        this.ticketProcessing = ticketProcessing;
        this.receptionTime = receptionTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getCustomerReviews() {
        return customerReviews;
    }

    public void setCustomerReviews(String customerReviews) {
        this.customerReviews = customerReviews;
    }

    public Date getReceptionTime() {
        return receptionTime;
    }

    public void setReceptionTime(Date receptionTime) {
        this.receptionTime = receptionTime;
    }

    public String getTicketProcessing() {
        return ticketProcessing;
    }

    public void setTicketProcessing(String ticketProcessing) {
        this.ticketProcessing = ticketProcessing;
    }

    public boolean isProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(boolean processingStatus) {
        this.processingStatus = processingStatus;
    }

    public Date getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(Date processingTime) {
        this.processingTime = processingTime;
    }
}