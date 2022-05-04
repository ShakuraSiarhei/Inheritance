package by.academy.inheritance.bean;

import by.academy.inheritance.view.View;

public class FilmForRecord extends Film {
    private String mediaType;
    private boolean directorsCut;

    public FilmForRecord() {
    }

    public FilmForRecord(String title, int durationInSecond, String filmGenre, String mediaType, boolean directorsCut) {
        super(title, durationInSecond, filmGenre);
        this.mediaType = mediaType;
        this.directorsCut = directorsCut;
    }

    @Override
    public void playFilm() {
        View.playFilm();
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public boolean isDirectorsCut() {
        return directorsCut;
    }

    public void setDirectorsCut(boolean directorsCut) {
        this.directorsCut = directorsCut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FilmForRecord)) return false;
        if (!super.equals(o)) return false;

        FilmForRecord that = (FilmForRecord) o;

        if (directorsCut != that.directorsCut) return false;
        return mediaType != null ? mediaType.equals(that.mediaType) : that.mediaType == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (mediaType != null ? mediaType.hashCode() : 0);
        result = 31 * result + (directorsCut ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FilmForRecord{" +
                "mediaType='" + mediaType + '\'' +
                ", directorsCut=" + directorsCut +
                '}';
    }
}
