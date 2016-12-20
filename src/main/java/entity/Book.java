package entity;

import entity.enums.BookCondition;
import entity.enums.Cover;
import entity.enums.Status;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book")
public class Book {

    //Book entity parameters
    @Id
    @Column(name="id")
    private int id;

    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name="book_id")
    private String bookId;

    @Id
    @Column(name="product_id")
    private long productId;

    @Column(name="author")
    private String author;

    @Column(name="title")
    private String title;

    @Column(name="year_of_publication")
    private int yearOfPublication;

    @Column(name="publisher")
    private String publisher;

    @Column(name="barcode")
    private String barcode;

    @Column(name="storage_place")
    private String storagePlace;

    @Column(name="price")
    private int price;

    @Column(name="date_of_shop_sale")
    @Type(type="timestamp")
    private Date dateOfShopSale;

    @Column(name="shop_id")
    private String shopId;

    @Column(name="weight")
    private float weight;

    @Column(name="number_of_pages")
    private int numberOfPages;

    @Column(name="cover")
    @Enumerated(EnumType.STRING)
    private Cover cover;

    @Column(name="book_condition")
    @Enumerated(EnumType.STRING)
    private BookCondition book_condition;

    @Column(name="more_info")
    private String moreInfo;

    @Column(name="uploader")
    private String uploader;

    @Column(name="category")
    private String category;

    @Column(name="isbn")
    private String isbn;

    // constructor
    public Book(int id, Status status, String bookId, String author, String title, int yearOfPublication, String publisher, String barcode, String storagePlace, int price, Date dateOfShopSale, String shopId, float weight, int numberOfPages, Cover cover, BookCondition book_condition, String moreInfo, String uploader, String category, String isbn) {
        this.id = id;
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
        this.book_condition = book_condition;
        this.moreInfo = moreInfo;
        this.uploader = uploader;
        this.category = category;
        this.isbn = isbn;
    }


    //getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
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

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateOfShopSale() {
        return dateOfShopSale;
    }

    public void setDateOfShopSale(Date dateOfShopSale) {
        this.dateOfShopSale = dateOfShopSale;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public BookCondition getBook_condition() {
        return book_condition;
    }

    public void setBook_condition(BookCondition book_condition) {
        this.book_condition = book_condition;
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

    //toString method

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", status=" + status +
                ", bookId='" + bookId + '\'' +
                ", productId=" + productId +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", publisher='" + publisher + '\'' +
                ", barcode='" + barcode + '\'' +
                ", storagePlace='" + storagePlace + '\'' +
                ", price=" + price +
                ", dateOfShopSale=" + dateOfShopSale +
                ", shopId='" + shopId + '\'' +
                ", weight=" + weight +
                ", numberOfPages=" + numberOfPages +
                ", cover=" + cover +
                ", book_condition=" + book_condition +
                ", moreInfo='" + moreInfo + '\'' +
                ", uploader='" + uploader + '\'' +
                ", category='" + category + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}