package org.example;

import org.example.beans.LazyBean;
import org.example.config.AppConfig;
import org.example.service.ShowService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // основной сервис (Basic)
        ShowService showService = context.getBean(ShowService.class);
        showService.addShow("The Boys", 10);
        showService.addShow("Snowfall", 9);
        showService.addShow("The Witcher", 8);
        showService.addShow("Squid Game" , 9);
        showService.showAllShows();

        // популярные сериалы (Popular)
        ShowService popularShowService = context.getBean("popularShowService", ShowService.class);
        popularShowService.addShow("Game of Thrones", 10);
        popularShowService.addShow("Breaking Bad", 9);
        popularShowService.addShow("The Walking Dead", 10);
        popularShowService.showAllShows();

        // запрашиваем ленивый бин
        LazyBean lazyBean = context.getBean(LazyBean.class);

        context.close();
    }
}
