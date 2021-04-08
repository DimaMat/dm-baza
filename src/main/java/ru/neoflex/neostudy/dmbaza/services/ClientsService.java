package ru.neoflex.neostudy.dmbaza.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.neoflex.neostudy.dmbaza.entities.NameEntity;
import ru.neoflex.neostudy.dmbaza.reposotories.Repositors;

import java.util.List;



@Service//помечаем что этот бин - сервис
public class ClientsService {

    private final Repositors fruitRepository;  //final переменная репозитория

    public ClientsService(Repositors fruitRepository) {//внедрили зависимость через конструктор
        this.fruitRepository = fruitRepository;
    }
    public void save(NameEntity fruitEntity){
        fruitRepository.save(fruitEntity); //реализовали метод внедренного бина
    }

    //возвращает лист всех сущностей из базы
    public List<NameEntity> getAll(){
        return fruitRepository.findAll(); //реализовали метод внедренного бина
    }
}
