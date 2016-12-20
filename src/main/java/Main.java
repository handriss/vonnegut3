import au.com.bytecode.opencsv.CSVReader;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by handris on 12/9/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Running");
        // try mySQL connection on simple way
//        ConnectionHandler connectionHandler = new ConnectionHandler();


        SessionFactory factory = new Configuration().configure("config/hibernate.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            // use the session object
            CSVReader reader = new CSVReader(new FileReader("src/test/java/book_attribute.csv"));
            String [] nextLine;
            ArrayList<Book> books = new ArrayList<>();
            while ((nextLine = reader.readNext()) != null) {
//                Book tempBook = new Book(nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], nextLine[6], nextLine[7], nextLine[8], nextLine[9], nextLine[10], nextLine[11], nextLine[12], nextLine[13], nextLine[14], nextLine[15], nextLine[16], nextLine[17], nextLine[18], nextLine[19]);
                Book tempBook = new Book(nextLine[0]);
                books.add(tempBook);
            }

            // start transaction
            session.beginTransaction();

            // save the book
            session.save(books.get(1));

            // commit the transaction
            session.getTransaction().commit();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            factory.close();
        }
    }
}
