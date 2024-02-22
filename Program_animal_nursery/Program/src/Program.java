public class Program {

    public static void main(String[] args) {

        Presenter presenter = new Presenter(new Model(), new View());

        presenter.perform();
    }
}
