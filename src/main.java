import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("A1", "OOP", 200000, "Hiếu", "Java", "spring");
        books[1] = new ProgrammingBook("A2", "Java", 150000, "Hiếu", "Java", "ADC");
        books[2] = new ProgrammingBook("A3", "C++", 170000, "Hiếu", "Germany", "ADS");
        books[3] = new ProgrammingBook("A4", ".NET", 100000, "Hiếu", "India", "ABS");
        books[4] = new ProgrammingBook("A5", "Python", 90000, "Hiếu", "Korea", "FAS");
        books[5] = new FictinonBook("B1", "HarryPotter", 200000, "J.K.Rowling", "Magic");
        books[6] = new FictinonBook("B2", "Ironman", 100000, "StanLee", "Science");
        books[7] = new FictinonBook("B3", "Onepiece", 20000, "ODA", "Action");
        books[8] = new FictinonBook("B4", "Chạng vạng", 2000000, " Catherine Hardwicke", "Love");
        books[9] = new FictinonBook("B5", "Tây du ký", 500000, "Ngô Thừa Ân", "Action");
        totalPrice(books);
        countOfBooksJava(books);
        countOfCategoryBooks(books);
        countOfPriceFictionsmaller100000(books);
        System.out.println("Nhập cuốn sách bạn muốn tìm : ");
        String name = scanner.nextLine();
        findPriceOfBook(books,name);
    }

    public static void totalPrice(Book[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        System.out.println("Tổng tiền của 10 cuốn sách là : " + sum);
    }

    public static void countOfBooksJava(Book[] arr) {
        int count = 0;
        for (Book a : arr
        ) {
            if (a instanceof ProgrammingBook) {
                String language = ((ProgrammingBook) a).getLanguage();
                if (language.equals("Java")) {
                    count++;
                }
            }
        }
        System.out.println("Số sách có language Java là : " + count);
    }

    public static void countOfCategoryBooks(Book[] arr) {
        int count = 0;
        for (Book b : arr
        ) {
            if (b instanceof FictinonBook) {
                String language = ((FictinonBook) b).getCategory();
                if (language.equals("Action")) {
                    count++;
                }
            }
        }
        System.out.println("Số sách Fiction có category Action là : " + count);
    }

    public static void countOfPriceFictionsmaller100000(Book[] arr) {
        int count = 0;
        for (Book c : arr
        ) {
            if (c instanceof FictinonBook) {
                double price = ((FictinonBook) c).getPrice();
                if (price < 100000) {
                    count++;
                }
            }
        }
        System.out.println("Số sách Fiction có giá nhỏ hơn 100000 là : " + count);
    }

    public static void findPriceOfBook(Book[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())){
                System.out.println("Giá của cuốn sách bạn tìm có giá : " + arr[i].getPrice());
            }
        }
    }
}
