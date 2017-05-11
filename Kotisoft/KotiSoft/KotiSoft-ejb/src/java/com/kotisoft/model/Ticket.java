/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kotisoft.model;

import java.io.Serializable;

/**
 *
 * @author TG
 */
public class Ticket implements Serializable {
    
  String name,emailid,model,problem,cost,status;
    
    
    public Ticket()
    {
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
    
    
  
}
