package com.sena.Tareass.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tareass")
public class tareass {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "Title", nullable = false, length = 100)
    private String Title;

    @Column(name = "dueDate", nullable = false, length = 36)
    private Date dueDate;

    @Column(name = "assigned_to", nullable = false, length = 100)
    private String assigned_to;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    public tareass() {
    }

    public tareass(String id, String title, Date dueDate, String assigned_to, String status) {
        this.id = id;
        Title = title;
        this.dueDate = dueDate;
        this.assigned_to = assigned_to;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
}
