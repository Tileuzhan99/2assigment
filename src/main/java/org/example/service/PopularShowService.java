package org.example.service;

import org.example.ListSerial;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.LinkedList;
import java.util.List;

@Service
@Qualifier("popularShowService")
public class PopularShowService implements ShowService {
    private List<ListSerial> shows = new LinkedList<>();

    @Override
    public void addShow(String name, int rating) {
        ListSerial show = new ListSerial(name, rating);
        shows.add(show);
        System.out.println("Добавлен сериал (Popular): " + show);
    }

    @Override
    public void showAllShows() {
        System.out.println("Список популярных сериалов: " + shows);
    }
}
