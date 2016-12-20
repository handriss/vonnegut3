import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

    @Id
    @Column(name="id")
    private int id;

    // Book model parameters
    @Column(name="status")
    private String status;

    @Column(name="book_id")
    private String bookId;

//    @Id
    @Column(name="product_id")
    private String productId;

    @Column(name="author")
    private String author;

    @Column(name="title")
    private String title;

    @Column(name="year_of_publication")
    private String yearOfPublication;

    @Column(name="publisher")
    private String publisher;

    @Column(name="barcode")
    private String barcode;

    @Column(name="storage_place")
    private String storagePlace;

    @Column(name="price")
    private String price;

    @Column(name="date_of_shop_sale")
    private String dateOfShopSale;

    @Column(name="shop_id")
    private String shopId;

    @Column(name="weight")
    private String weight;

    @Column(name="number_of_pages")
    private String numberOfPages;

    @Column(name="cover")
    private String cover;

    @Column(name="book_condition")
    private String condition;

    @Column(name="more_info")
    private String moreInfo;

    @Column(name="uploader")
    private String uploader;

    @Column(name="category")
    private String category;

    @Column(name="isbn")
    private String isbn;

    // constructor

    public Book(String status){
        this.status = status;
    }


    public Book(String status, String bookId, String productId, String author, String title, String yearOfPublication, String publisher, String barcode, String storagePlace, String price, String dateOfShopSale, String shopId, String weight, String numberOfPages, String cover, String condition, String moreInfo, String uploader, String category, String isbn) {
        this.status = status;
        this.bookId = bookId;
        this.productId = productId;
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
        this.barcode = barcode;
        this.storagePlace = storagePlace;
        this.price = price;
        this.dateOfShopSale = dateOfShopSale;
        this.shopId = shopId;
        this.weight = weight;
        this.numberOfPages = numberOfPages;
        this.cover = cover;
        this.condition = condition;
        this.moreInfo = moreInfo;
        this.uploader = uploader;
        this.category = category;
        this.isbn = isbn;
    }


    //getters & setters

    @Override
    public String toString() {
        return "Book{" +
                "status='" + status + '\'' +
                ", bookId='" + bookId + '\'' +
                ", productId='" + productId + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", publisher='" + publisher + '\'' +
                ", barcode=" + barcode +
                ", storagePlace='" + storagePlace + '\'' +
                ", price=" + price +
                ", dateOfShopSale=" + dateOfShopSale +
                ", shopId=" + shopId +
                ", weight=" + weight +
                ", numberOfPages=" + numberOfPages +
                ", cover='" + cover + '\'' +
                ", condition='" + condition + '\'' +
                ", moreInfo='" + moreInfo + '\'' +
                ", uploader='" + uploader + '\'' +
                ", category='" + category + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}