package ru.neoflex.neostudy.dmbaza.utils;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import ru.neoflex.neostudy.dmbaza.services.ClientsService;
import ru.neoflex.neostudy.dmbaza.entities.NameEntity;

import java.util.List;

@Service
public class InitiateUtils implements CommandLineRunner {

    private final ClientsService clientsService;

    public InitiateUtils (ClientsService clientsService) {//незабываем конструктор для внедрения
        this. clientsService = clientsService;

    }

    @Override
    public void run(String... args) throws Exception {

//создаем несколько сущностей фруктов, через сеттеры заполняем поля
        NameEntity clientEntity1 = new NameEntity();
        clientEntity1.setClientName("Alex");
        clientEntity1.setClientMail("IvanovII@gmail.com");

        NameEntity clientEntity2 = new NameEntity();
        clientEntity2.setClientName("Ivan");
        clientEntity2.setClientMail("diman150797@gmail.com");

        NameEntity clientEntity3 = new NameEntity();
        clientEntity3.setClientName("Gleb");
        clientEntity3.setClientMail("");

        NameEntity clientEntity4 = new NameEntity();
        clientEntity4.setClientName("Kirill");
        clientEntity4.setClientMail("");

        NameEntity clientEntity5 = new NameEntity();
        clientEntity5.setClientName("Max");
        clientEntity5.setClientMail("");

        NameEntity clientEntity6 = new NameEntity();
        clientEntity6.setClientName("Dima");
        clientEntity6.setClientMail("");

//с помощью переменной сервиса вызываем методы сохранения в базу, по разу для одного объекта
        clientsService.save(clientEntity1);
        clientsService.save(clientEntity2);
        clientsService.save(clientEntity3);
        clientsService.save(clientEntity4);
        clientsService.save(clientEntity5);
        clientsService.save(clientEntity6);

//здесь вытаскиваем базу обратно
        List<NameEntity> all = clientsService.getAll();

//и выводим что получилось
        for (NameEntity entity : all) {
            System.out.println(entity);
        }
    }
}