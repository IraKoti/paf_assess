package com.example.paf_assess.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Transfer {
    @NotNull(message="From Account cannot be null")
    @Size(min=10, max=10, message="From Account must be 10 Characters")
    private String faccount;

    @NotNull(message="To Account cannot be null")
    @Size(min=10, max=10, message="To Account must be 10 Characters")
    private String taccount;

    @NegativeOrZero(message="Amount can't be 0 or negative")
    @Min(value=10, message="Minimal amount transfer is $10")
    private Float amount;


    private String comments;
    public String getFaccount() {
        return faccount;
    }
    public void setFaccount(String faccount) {
        this.faccount = faccount;
    }
    public String getTaccount() {
        return taccount;
    }
    public void setTaccount(String taccount) {
        this.taccount = taccount;
    }
    public Float getAmount() {
        return amount;
    }
    public void setAmount(Float amount) {
        this.amount = amount;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

}
