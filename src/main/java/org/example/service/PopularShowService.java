package org.example.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.LinkedList;
import java.util.List;

@Qualifier("popularShowService")
@Service
public class PopularShowService implements ShowService {
    private List<String> shows = new LinkedList<>();

    @Override
    public void addShow(String showName) {
        shows.add(showName);
    }

    @Override
    public void showAllShows() {
        System.out.println(shows);
    }
}
