public class MovieMain {
   public static void main(String[] args){
//       Movie movie = new Adventure("Interstellar");
//       movie.watchMovie();

       Movie movie = Movie.getMovie("Adventure", "Interstellar");

       movie.watchMovie();

   }
}
