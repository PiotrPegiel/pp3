public class after27 {
    public static void main(String[] args) {
        Books book1 = new Books();
        Books book2 = new Books();

        book1.setName("somebooktitle");
        book1.setCost(3);
        book1.setAuthor("me");

        book2.setName("book_the_second");
        book2.setCost(1000);
        book2.setAuthor("some random dude");

        System.out.printf("Book %s, by %s, costs %d%n",book1.getName(),book1.getAuthor(),book1.getCost());
        System.out.printf("The other book %s made by %s is way overpriced at %d",book2.getName(),book2.getAuthor(),book2.getCost());
    }
}
