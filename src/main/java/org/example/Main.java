package org.example;

import org.example.beans.LazyBean;
import org.example.config.AppConfig;
import org.example.service.ShowService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{
    public static void main(String[] args) {
        // Создаём Spring-контекст
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем основной сервис (по умолчанию @Primary)
        ShowService showService = context.getBean(ShowService.class);
        showService.addShow("The Boys");
        showService.showAllShows();

        // Получаем популярный сервис через @Qualifier
        ShowService popularShowService = context.getBean("popularShowService", ShowService.class);
        popularShowService.addShow("Game of Thrones");
        popularShowService.showAllShows();

        // Запрашиваем ленивый бин (LazyBean)
        LazyBean lazyBean = context.getBean(LazyBean.class);


        context.close();
    }
}
