package kotisoft;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.kotisoft.model.Ticket;
import java.sql.*;
import javax.ejb.Stateless;

/**
 *
 * @author TG
 */
@Stateless
public class entrybean implements entrybeanLocal {

   ResultSet rs;
   Connection con;
    
    Statement stt;    
    @Override
    public void addTicket(Ticket ticket) {

        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/kotisoft","root","");
   stt=con.createStatement();
String query="insert into tickets values('"+ticket.getName()+"','"+ticket.getEmailid()+"','"+ticket.getModel()+"','"+ticket.getProblem()+"','500','incomplete')";
            stt.executeUpdate(query);
      con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Ticket getTicket(String email) {
       
        Ticket ticket=null;
        try{
   Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/kotisoft","root","");
           stt=con.createStatement();
            rs = stt.executeQuery("select * from tickets where email='"+email+"'");
   
            if(rs.next()) 
   {
       ticket=new Ticket();
   
    
    ticket.setName(rs.getString("name"));
    ticket.setEmailid(rs.getString("email"));
    ticket.setModel(rs.getString("model"));
    ticket.setProblem(rs.getString("problem"));
      ticket.setCost(rs.getString("cost"));
        ticket.setStatus(rs.getString("status"));
   }
   }catch(Exception e)
        {
            e.printStackTrace();
        }
        
            return ticket;
    }

}
