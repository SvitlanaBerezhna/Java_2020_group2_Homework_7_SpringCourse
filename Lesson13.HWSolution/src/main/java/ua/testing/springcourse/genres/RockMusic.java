package ua.testing.springcourse.genres;

import ua.testing.springcourse.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
