package kotisoft;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.ejb.Local;
import com.kotisoft.model.Ticket;
/**
 *
 * @author TG
 */
@Local
public interface entrybeanLocal {
    void addTicket(Ticket ticket);
    Ticket getTicket(String email);
}
