package ru.neoflex.neostudy.dmbaza.reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.neostudy.dmbaza.entities.NameEntity;

@Repository//помечаем что этот бин - репозиторий
public interface Repositors extends JpaRepository<NameEntity,Integer> {
//репозиторий является интерфейсом, который наследуется от другого интерфейса JpaRepository<>
//для него необходимо указать с какой сущность он должен работать, у нас это NameEntity
//и тип данных у поля id данной сущности, у нас это Integer
}