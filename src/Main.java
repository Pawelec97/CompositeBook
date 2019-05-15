public class Main {

    public static void main(String[] args) {

        Book book = new Book("Książka");
        Chapter pierwszy = new Chapter("Rozdział pierwszy");
        Chapter drugi = new Chapter("Rozdział drugi");
        Chapter zakonczenie = new Chapter("Zakończenie");
        book.add(pierwszy);
        book.add(drugi);
        book.add(zakonczenie);

        Chapter pierwszyPod = new Chapter("Pierwszy podrozdział");
        Chapter drugiPod = new Chapter("Drugi podrozdział");
        drugi.add(pierwszyPod);
        drugi.add(drugiPod);

        Chapter trzeciPod = new Chapter("Kolejny podrodział");
        Chapter czwartyPod = new Chapter("Jeszcze jeden podrozdział");
        pierwszyPod.add(trzeciPod);
        pierwszyPod.add(czwartyPod);
        book.print(1);


    }
}
