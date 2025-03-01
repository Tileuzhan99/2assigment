package org.example.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class BasicShowService implements ShowService {
    private List<String> shows = new ArrayList<>();

    @Override
    public void addShow(String showName) {
        shows.add(showName);
        System.out.println("добавлен сериал: " + showName);
    }

    @Override
    public void showAllShows() {
        System.out.println("весь список сериалов: " + shows);
    }
}
