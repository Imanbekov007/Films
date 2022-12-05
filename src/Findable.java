import java.util.List;

public interface Findable {
    List<Movie>getAllMovies(List<Movie>movies);
    void findMovieByName(List<Movie>movies,String scanner);
    void findMovieByActorName(List<Movie>movies,String scanner);
    void findMovieByYear(List<Movie>movies,int year);
    void findMovieByDirector(List<Movie>movies,String scanner);
    void findMovieByDescription(List<Movie>movies,String description);
    void findMovieByRole(List<Movie> movies,String scanner);
}
