import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void test() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test2() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test3() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";
        String film10 = "Movie 10";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test4() {


        FilmManager manager = new FilmManager(10);

        int actual = 10;
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test5() {


        FilmManager manager = new FilmManager(11);

        int actual = 0;
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test6() {


        FilmManager manager = new FilmManager(0);

        int actual = 0;
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
}
