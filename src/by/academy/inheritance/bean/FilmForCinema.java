package by.academy.inheritance.bean;

import by.academy.inheritance.view.View;

import java.util.Date;

public class FilmForCinema extends Film {
    private boolean playTrailerBeforeFilm;
    private FilmTrailer filmTrailer;
    private Date releaseDate;
    private String DisplayFormat;

    public FilmForCinema() {
    }

    public FilmForCinema(String title, int durationInSecond, String filmGenre, boolean playTrailerBeforeFilm, FilmTrailer filmTrailer, Date releaseDate, String displayFormat) {
        super(title, durationInSecond, filmGenre);
        this.playTrailerBeforeFilm = playTrailerBeforeFilm;
        this.filmTrailer = filmTrailer;
        this.releaseDate = releaseDate;
        DisplayFormat = displayFormat;
    }

    @Override
    public void playFilm() {
        Date today = new Date();
        if (releaseDate.after(today)) {
            if (playTrailerBeforeFilm) {
                filmTrailer.playFilm();
            }
            View.playFilm();
        } else {
            return;
        }
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isPlayTrailerBeforeFilm() {
        return playTrailerBeforeFilm;
    }

    public void setPlayTrailerBeforeFilm(boolean playTrailerBeforeFilm) {
        this.playTrailerBeforeFilm = playTrailerBeforeFilm;
    }

    public FilmTrailer getFilmTrailer() {
        return filmTrailer;
    }

    public void setFilmTrailer(FilmTrailer filmTrailer) {
        this.filmTrailer = filmTrailer;
    }

    public String getDisplayFormat() {
        return DisplayFormat;
    }

    public void setDisplayFormat(String displayFormat) {
        DisplayFormat = displayFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FilmForCinema)) return false;
        if (!super.equals(o)) return false;

        FilmForCinema that = (FilmForCinema) o;

        if (playTrailerBeforeFilm != that.playTrailerBeforeFilm) return false;
        if (filmTrailer != null ? !filmTrailer.equals(that.filmTrailer) : that.filmTrailer != null) return false;
        if (releaseDate != null ? !releaseDate.equals(that.releaseDate) : that.releaseDate != null) return false;
        return DisplayFormat != null ? DisplayFormat.equals(that.DisplayFormat) : that.DisplayFormat == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (playTrailerBeforeFilm ? 1 : 0);
        result = 31 * result + (filmTrailer != null ? filmTrailer.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (DisplayFormat != null ? DisplayFormat.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FilmForCinema{" +
                "playTrailerBeforeFilm=" + playTrailerBeforeFilm +
                ", filmTrailer=" + filmTrailer +
                ", releaseDate=" + releaseDate +
                ", DisplayFormat='" + DisplayFormat + '\'' +
                '}';
    }
}
