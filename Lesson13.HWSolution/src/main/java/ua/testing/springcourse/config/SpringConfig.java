package ua.testing.springcourse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import ua.testing.springcourse.Computer;
import ua.testing.springcourse.Music;
import ua.testing.springcourse.MusicPlayer;
import ua.testing.springcourse.genres.ClassicalMusic;
import ua.testing.springcourse.genres.JazzMusic;
import ua.testing.springcourse.genres.RockMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}