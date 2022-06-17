package ru.netology;

public class MovieManager {
    private String[] movie = new String[0];
    private int guantity;

    public MovieManager() {
        guantity = 10;
    }

    public MovieManager(int guantity) {
        if (guantity <= 0) {
            System.out.print("Ошибка");
            return;
        }
        if (guantity > 10) {
            this.guantity = 10;
            return;
        }
        this.guantity = guantity;
    }

    public void add(String newMovie) {
        int length = movie.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < movie.length; i++) {
            tmp[i] = movie[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movie = tmp;
    }

    public String[] getfindAll() {
        return movie;
    }

    public String[] getfindLast() {
        int resultLength;
        if (guantity > movie.length) {
            resultLength = movie.length;
        } else {
            resultLength = guantity;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            int j = movie.length - i - 1;
            result[i] = movie[j];
        }
        return result;

    }
}
