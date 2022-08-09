package hometasks.task3;


public class Main {

    public static void main(String[] args) {


        //не особо понял задание
        //как то так

        Books book = new Book("Mark", "About...", 15) {
            @Override
            public void aboutBook(Object book) {
                System.out.println("book");
            }
        };

        Books books1 = (d) -> {
            new Book("Mark", "About...", 15);
        };


    }

}

