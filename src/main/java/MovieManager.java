public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] temp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            temp[i] = movies[i];
        }
        temp[temp.length - 1] = movie;
        movies = temp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] temp = new String[resultLength];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = movies[movies.length - 1 - i];
        }
        return temp;
    }

}
