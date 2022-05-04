package by.academy.inheritance.bean;

import by.academy.inheritance.view.View;

import java.util.Arrays;

public class FilmForOnlinePlatform extends Film {
    private int[] availableVideoQuality;
    private int timeFromStartInSeconds;

    public int[] getAvailableVideoQuality() {
        return availableVideoQuality;
    }

    public void setAvailableVideoQuality(int[] availableVideoQuality) {
        this.availableVideoQuality = availableVideoQuality;
    }

    public int getTimeFromStartInSeconds() {
        return timeFromStartInSeconds;
    }

    public void setTimeFromStartInSeconds(int timeFromStartInSeconds) {
        this.timeFromStartInSeconds = timeFromStartInSeconds;
    }

    public FilmForOnlinePlatform() {
    }

    public FilmForOnlinePlatform(String title, int durationInSecond, String filmGenre, int[] availableVideoQuality, int timeFromStartInSeconds) {
        super(title, durationInSecond, filmGenre);
        this.availableVideoQuality = availableVideoQuality;
        this.timeFromStartInSeconds = timeFromStartInSeconds;
    }

    @Override
    public void playFilm() {
        View.playFilm();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FilmForOnlinePlatform)) return false;

        FilmForOnlinePlatform that = (FilmForOnlinePlatform) o;

        if (timeFromStartInSeconds != that.timeFromStartInSeconds) return false;
        return Arrays.equals(availableVideoQuality, that.availableVideoQuality);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(availableVideoQuality);
        result = 31 * result + timeFromStartInSeconds;
        return result;
    }

    @Override
    public String toString() {
        return "FilmForOnlinePlatform{" +
                "availableVideoQuality=" + Arrays.toString(availableVideoQuality) +
                ", timeFromStartInSeconds=" + timeFromStartInSeconds +
                '}';
    }
}
