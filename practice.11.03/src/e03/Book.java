package e03;

/**
 * @author 崔英俊
 * @date 2019-11-03
 * @version 1.0
 */
public class Book implements Comparable{

    private String name;
    private double price;
    private String press;
    private String author;

    public Book(String name, double price, String press, String author) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        double number = this.price - ((Book)o).price;
        number = number == 0 ? this.name.compareTo(((Book)o).name) : number;
        number = number == 0 ? this.press.compareTo(((Book)o).press) : number;
        number = number == 0 ? this.author.compareTo(((Book)o).author) : number;
        return (int)(number * 100);
    }
}
