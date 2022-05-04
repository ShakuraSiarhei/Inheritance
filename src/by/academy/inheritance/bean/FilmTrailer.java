package by.academy.inheritance.bean;

import by.academy.inheritance.view.View;

public class FilmTrailer extends Film{

    @Override
    public void playFilm() {
        View.playFilm();
    }
}
