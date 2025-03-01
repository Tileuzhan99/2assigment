package org.example;

import org.example.beans.LazyBean;
import org.example.config.AppConfig;
import org.example.service.ShowService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{
    public static void main(String[] args) {
        // создаём спринг контекст
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // получаем основной сервис (по умолчанию @праймари)
        ShowService showService = context.getBean(ShowService.class);
        showService.addShow("The Boys");
        showService.showAllShows();

        // получаем уже популярный сервис через @куалифер
        ShowService popularShowService = context.getBean("popularShowService", ShowService.class);
        popularShowService.addShow("Game of Thrones");
        popularShowService.showAllShows();

        // Ззапрашиваем ленивый бин (LazyBean)
        LazyBean lazyBean = context.getBean(LazyBean.class);


        context.close();
    }
}
