package org.example.repository;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ShowRepository {
    private Map<Integer, String> shows = new HashMap<>();

    public void saveShow(int id, String showName) {
        shows.put(id, showName);
    }

    public String getShow(int id) {
        return shows.get(id);
    }

    public void showAllShows() {
        System.out.println(shows);
    }
}
