public class MovieService {

    public void listAllMovies() {
        System.out.println("Listando todos os filmes do catálogo...");
    }

    public void listAvailableMovies() {
        System.out.println("Listando apenas filmes disponíveis para locação...");
    }

    public void markAsAvailable(String title) {
        System.out.println("O filme \"" + title + "\" agora está disponível para locação.");
    }

    public void markAsUnavailable(String title) {
        System.out.println("O filme \"" + title + "\" foi marcado como indisponível.");
    }

    public static void main(String[] args) {
        MovieService service = new MovieService();

        service.listAvailableMovies();
        service.listAllMovies();

        service.markAsAvailable("Inception");
        service.markAsUnavailable("Matrix");
    }
}