package org.example.service;


import org.example.ListSerial;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Primary
@Service
public class BasicShowService implements ShowService {
    private List<ListSerial> shows = new ArrayList<>();

    @Override
    public void addShow(String name, int rating) {
        ListSerial show = new ListSerial(name, rating);
        shows.add(show);
        System.out.println("Добавлен сериал (Basic): " + show);
    }

    @Override
    public void showAllShows() {
        System.out.println("Список сериалов (Basic): " + shows);
    }
}
