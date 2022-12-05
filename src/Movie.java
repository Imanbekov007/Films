import java.util.List;

public class Movie implements Findable{
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;



    @Override
    public String toString() {
        return "Movie " +
                "name : " + name + '\n' +
                "year : " + year + "\n" +
                "description : " + description + '\n' +
                "director : " + director + "\n"+
                "cast : " + cast + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public Movie(String name, int year,String description,Director director,List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast =  cast;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies, String scanner) {
        for (Movie a:movies
             ) {
            if(a.getName().equals(scanner.toUpperCase())){
                System.out.println(a);
            }

        }

    }

    @Override
    public void findMovieByActorName(List<Movie>movies,String scanner) {

            for (Movie a:movies) {
                if(a.getCast().get(0).getActorFullName().equals(scanner)){
                    System.out.println(a);

                }

            }

        }




    @Override
    public void findMovieByYear(List<Movie> movies,int year) {
        for (Movie a:movies) {
            if(a.getYear()==year){
                System.out.println(a);
            }

        }

    }

    @Override
    public void findMovieByDirector(List<Movie> movies,String scanner) {
        for (Movie t:movies) {
            if(t.getDirector().getName().equals(scanner) || t.getDirector().getLastName().equals(scanner)){
                System.out.println(t);
            }

        }

    }

    @Override
    public void findMovieByDescription(List<Movie> movies,String description) {
        for (Movie a:movies) {
            if(a.getDescription().equals(description)){
                System.out.println(a);
            }

        }


    }

    @Override
    public void findMovieByRole(List<Movie> movies,String scanner) {
        for (Movie a:movies) {
            if(a.getCast().get(0).getRole().equals(scanner)){
                System.out.println(a);

            }

        }

    }
}
