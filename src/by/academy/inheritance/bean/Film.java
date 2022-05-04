package by.academy.inheritance.bean;

public abstract class Film {
    private String title;
    private int durationInSecond;
    private String filmGenre;

    public Film() {
    }

    public Film(String title, int durationInSecond, String filmGenre) {
        this.title = title;
        this.durationInSecond = durationInSecond;
        this.filmGenre = filmGenre;
    }

    abstract void playFilm();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationInSecond() {
        return durationInSecond;
    }

    public void setDurationInSecond(int durationInSecond) {
        this.durationInSecond = durationInSecond;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (durationInSecond != film.durationInSecond) return false;
        if (title != null ? !title.equals(film.title) : film.title != null) return false;
        return filmGenre != null ? filmGenre.equals(film.filmGenre) : film.filmGenre == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + durationInSecond;
        result = 31 * result + (filmGenre != null ? filmGenre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", durationInSecond=" + durationInSecond +
                ", filmGenre='" + filmGenre + '\'' +
                '}';
    }
}
