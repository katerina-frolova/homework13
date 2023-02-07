public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author gogol = new Author("Николай", "Гоголь");
        Book dubrovskiy = new Book("Дубровский", pushkin, 1841);
        Book tarasBulba = new Book("Тарас Бульба", gogol, 1835);

        System.out.println(dubrovskiy.getTitle() + ", " + dubrovskiy.getAuthor().getName() + " " + dubrovskiy.getAuthor().getLastname() + ", " + dubrovskiy.getPublishingYear() + " год");
        System.out.println(tarasBulba.getTitle() + ", " + tarasBulba.getAuthor().getName() + " " + tarasBulba.getAuthor().getLastname() + ", " + tarasBulba.getPublishingYear() + " год");

        dubrovskiy.setPublishingYear(1833);
        System.out.println(dubrovskiy.getTitle() + ", " + dubrovskiy.getAuthor().getName() + " " + dubrovskiy.getAuthor().getLastname() + ", " + dubrovskiy.getPublishingYear() + " год");


        System.out.println(pushkin);
        System.out.println(tarasBulba);

        System.out.println(pushkin.equals(gogol));
        System.out.println(tarasBulba.equals(dubrovskiy));

    }



}