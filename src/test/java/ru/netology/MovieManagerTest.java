package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void addMovieManager() {
        manager.add("Бландшот");
        manager.add("Вперед");
        manager.add("Отель_Белград");
        String[] actual = manager.getfindAll();
        String[] expected = {"Бландшот", "Вперед", "Отель_Белград"};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void getfindLastMovieManager() {
        manager.add("Бландшот");
        manager.add("Вперед");
        manager.add("Отель_Белград");
        String[] actual = manager.getfindLast();
        String[] expected = {"Отель_Белград", "Вперед", "Бландшот"};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void getfindLastMovieManager4() {
        MovieManager manager = new MovieManager(4);

        manager.add("Бландшот");
        manager.add("Вперед");
        manager.add("Отель_Белград");
        manager.add("Джентльмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        String[] actual = manager.getfindLast();
        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентльмены"};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void getfindLastMovieManager1() {
        MovieManager manager = new MovieManager(1);

        manager.add("Бландшот");
        manager.add("Вперед");
        manager.add("Отель_Белград");
        manager.add("Джентльмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        String[] actual = manager.getfindLast();
        String[] expected = {"Номер один"};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void getfindLastMovieManager10() {
        manager.add("Бландшот");
        manager.add("Вперед");
        manager.add("Отель_Белград");
        manager.add("Джентльмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        manager.add("Джентл");
        manager.add("Человек");
        manager.add("Тролли");
        manager.add("Номер");
        String[] actual = manager.getfindLast();
        String[] expected = {"Номер", "Тролли", "Человек", "Джентл", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентльмены", "Отель_Белград", "Вперед"};
        assertArrayEquals(actual, expected);
    }
}
