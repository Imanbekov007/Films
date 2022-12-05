import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director1 = new Director("Justin", "Lin");
        Director director2 = new Director("Wolfgang", "Petersen");
        Director director3=new Director("Patrick","Wilson");
        Director director4=new Director("Richard","Donner");
        Director director5=new Director("Matt","Reeves");
        LinkedList<Cast> cast1 = new LinkedList<>();
        cast1.add(new Cast("Vin Diesel","Domenic"));
        LinkedList<Cast> cast2 = new LinkedList<>();
        cast2.add(new Cast("Brat Pitt","Achilles"));
        LinkedList<Cast>cast3= new LinkedList<>();
        cast3.add(new Cast("Patrick Wilson","Josh"));
        LinkedList<Cast>cast4= new LinkedList<>();
        cast4.add(new Cast("Henry Cavill","Superman"));
        LinkedList<Cast>cast5= new LinkedList<>();
        cast5.add(new Cast("Robert Pattinson","Batman"));


        Movie movie1 = new Movie("FAST AND FURIOUS", 2011, "family", director1, cast1);
        Movie movie2 = new Movie("TROY", 2004, "power", director2, cast2);
        Movie movie3 = new Movie("ASTRAL",2011,"horror",director3,cast3);
        Movie movie4 = new Movie("SUPERMAN",1938,"fantasy",director4,cast4);
        Movie movie5 = new Movie("BATMAN",2022,"fantasy",director5,cast5);



//        System.out.println(movie1);
//        System.out.println(movie2);

        List<Movie> movies = new ArrayList<>(Arrays.asList(movie1, movie2,movie3,movie4,movie5));



        while (true) {
            int q = scanner.nextInt();
            switch (q) {
                case 1 -> {
                    movie1.getAllMovies(movies);
                    for (Movie a : movies
                    ) {
                        System.out.println(a);

                    }
                }
                case 2 -> {
                    String r = scanner.nextLine();
                    movie1.findMovieByDescription(movies, scanner.nextLine());
                }
                case 3 -> {
                    int a = scanner.nextInt();
                    movie2.findMovieByYear(movies, a);
                }
                case 4 -> {
                    String w = scanner.nextLine();
                    movie1.findMovieByName(movies, scanner.nextLine());
                }
                case 5-> {
                    String p= scanner.nextLine();
                    movie1.findMovieByActorName(movies, scanner.nextLine());
                }
                case 6-> {
                    String o= scanner.nextLine();
                    movie1.findMovieByRole(movies, scanner.nextLine());
                }
                case 7-> {
                    String i= scanner.nextLine();
                    movie1.findMovieByDirector(movies, scanner.nextLine());
                }

            }
        }
    }
}
