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

    // empty contructor
    public Book() {
    }
    // constructor
    public Book(String status, String bookId, String author, String title, Integer yearOfPublication, String publisher, Long barcode, String storagePlace, Integer price, Timestamp dateOfShopSale, Integer shopId, Float weight, Integer numberOfPages, String cover, String condition, String moreInfo, String uploader, String category, String isbn) {
        this.status = status;
        this.bookId = bookId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Timestamp getDateOfShopSale() {
        return dateOfShopSale;
    }

    public void setDateOfShopSale(Timestamp dateOfShopSale) {
        this.dateOfShopSale = dateOfShopSale;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

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