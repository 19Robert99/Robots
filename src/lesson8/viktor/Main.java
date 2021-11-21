package lesson8.viktor;

public class Main {
    public static void main(String[] args) {
        Booker booker=new Booker();
        Reader reader=new Reader();
        Book book=new Book();
        System.out.println("What you want?:book, reservation or give back book");
        String firstAnswer=reader.scanner.nextLine();
        if(firstAnswer.equals("book")){
            booker.question();
        }
        String secondAnswer=reader.scanner.nextLine();

    }
}
