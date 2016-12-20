import entity.Book;
import entity.enums.BookCondition;
import entity.enums.Cover;
import entity.enums.Status;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("config/hibernate.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            // use the session object
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
            Date dateOfUpload = sdf.parse("12/13/2016 08:39:29");
            Date dateOfSold = null;

            Book tempBook = new Book(Status.ÁRULHATÓ, "644909", 2103982191, "Herbie Brennan", "Az ókori Egyiptom titkos története - Hogyan tűnt el egy fejlett civilizáció?", 2000, "Alexandra Kiadó", "'0609001023751", "c19", 1490, dateOfUpload, dateOfSold, "60", 1.5f, 239, Cover.FÉLMŰBŐR, BookCondition.HIÁBTLAN, "tarara", "menyhard", "romantic", "9789789789788");

            // start transaction
            session.beginTransaction();

            // save the book
            session.save(tempBook);

            // commit the transaction
            session.getTransaction().commit();

        } catch (ParseException e) {
            e.printStackTrace();
        } finally{
            factory.close();
        }
    }
}
