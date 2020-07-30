package cn.mr8god.refactorfirst;

/**
 * @author Mr8god
 * @date 2020年7月29日
 * @time 2020年7月29日23:56:52
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }
    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
}
