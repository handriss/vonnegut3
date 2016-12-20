import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="book")
public class Book {

    // Book model parameters
    @Column(name="status")
    private String status;

    @Column(name="book_id")
    private String bookId;

    @Id
    @Column(name="product_id")
    private String productId;

    @Column(name="author")
    private String author;

    @Column(name="title")
    private String title;

    @Column(name="year_of_publication")
    private Integer yearOfPublication;

    @Column(name="publisher")
    private String publisher;

    @Column(name="barcode")
    private Long barcode;

    @Column(name="storage_place")
    private String storagePlace;

    @Column(name="price")
    private Integer price;

    @Column(name="date_of_shop_sale")
    private Timestamp dateOfShopSale;

    @Column(name="shop_id")
    private Integer shopId;

    @Column(name="weight")
    private Float weight;

    @Column(name="number_of_pages")
    private Integer numberOfPages;

    @Column(name="cover")
    private String cover;

    @Column(name="condition")
    private String condition;

    @Column(name="more_info")
    private String moreInfo;

    @Column(name="uploader")
    private String uploader;

    @Column(name="category")
    private String category;

    @Column(name="isbn")
    private String isbn;
}