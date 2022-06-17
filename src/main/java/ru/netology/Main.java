package ru.netology;

import ru.netology.MovieManager;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        MovieManager manager = new MovieManager();
        manager.add("Бландшот");
        manager.add("Вперед");
        manager.add("Отель_Белград");
        manager.add("Джентльмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");

        String[] all = manager.getfindAll();
        //System.out.println("Привет");
        String[] allLast = manager.getfindLast();

        //System.out.println(all); Не выводит на экран, почему то длинный массив, подскажите, как правильно вывести
    }
}
