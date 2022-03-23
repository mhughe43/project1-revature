package models;

import java.util.Date;

public class Reimbursement {
    private Integer id;
    private Double amount;
    private Date dateSubmitted;
    private Date dateResolved;
    private String description;
    private Integer author;
    private Integer resolver;
    private Integer statusId;
    private Integer typeId;

    public Reimbursement() {
    }

    public Reimbursement(Date dateResolved, Integer resolver, Integer statusId) {
        this.dateResolved = dateResolved;
        this.resolver = resolver;
        this.statusId = statusId;
    }

    public Reimbursement(Double amount, Date dateSubmitted, String description, Integer author, Integer statusId, Integer typeId) {
        this.amount = amount;
        this.dateSubmitted = dateSubmitted;
        this.description = description;
        this.author = author;
        this.statusId = statusId;
        this.typeId = typeId;
    }

    public Reimbursement(Integer id, Double amount, Date dateSubmitted, Date dateResolved, String description, Integer author, Integer resolver, Integer statusId, Integer typeId) {
        this.id = id;
        this.amount = amount;
        this.dateSubmitted = dateSubmitted;
        this.dateResolved = dateResolved;
        this.description = description;
        this.author = author;
        this.resolver = resolver;
        this.statusId = statusId;
        this.typeId = typeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public Date getDateResolved() {
        return dateResolved;
    }

    public void setDateResolved(Date dateResolved) {
        this.dateResolved = dateResolved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getResolver() {
        return resolver;
    }

    public void setResolver(Integer resolver) {
        this.resolver = resolver;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "id=" + id +
                ", amount=" + amount +
                ", dateSubmitted=" + dateSubmitted +
                ", dateResolved=" + dateResolved +
                ", description='" + description + '\'' +
                ", author=" + author +
                ", resolver=" + resolver +
                ", statusId=" + statusId +
                ", typeId=" + typeId +
                '}';
    }
}
