package testFrontEnd;

import database.movieUtil.Movie;
import database.system.MovieSystemDB;
import frontEnd.HomePage;

import java.util.concurrent.LinkedBlockingQueue;

public class TestHomePage {
    public static void main(String[] args) {
        MovieSystemDB.DBinit();
        HomePage homePage = new HomePage();
        LinkedBlockingQueue<Movie> top10= homePage.getTop10();
        System.out.println("test top 10 ");
    }
}
