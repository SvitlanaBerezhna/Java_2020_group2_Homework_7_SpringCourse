package ua.testing.springcourse.genres;

import ua.testing.springcourse.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Take five";
    }
}
