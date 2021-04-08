package ru.neoflex.neostudy.dmbaza.entities;


import org.hibernate.annotations.GenericGenerator;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity//помечаем бин как сущность
@Table(name = "Clients_table")//в этой аннотации можно указать имя создаваемой таблицы
public class NameEntity {

    @Id//аннотация из пакета avax.persistence.*, помечает поле как id
    @Column(name = "id_client")//в этой аннотации можно указать имя поля
    @GenericGenerator(name = "generator", strategy = "increment")//незаметно добрались до hibernate,
// здесь указывается что id будет автоматически увеличиваться при новых записях
    @GeneratedValue(generator = "generator")//аннотация генерации id
    private Integer id;

    @Column(name = "client_name")
    private String ClientName;

    @Column(name = "client_mail")
    private String ClientMail;


    //что бы в с классом можно было совершать манипуляции создается
    //пустой конструктор, геттеры, сеттеры и переопределяется метод toString()

    public NameEntity(){ //пустой конструктор

    }

    public Integer getId() {
        return id;
    }

    //геттеры, сеттеры
    public String getClientName() {
        return ClientName;
    }

    public  String getClientMail() {
        return ClientMail;
    }

    public NameEntity setClientName(String ClientName) {
        this.ClientName = ClientName;
        return this;
    }
    public NameEntity  setClientMail(String ClientMail) {
        this.ClientMail = ClientMail;
        return this;
    }

    //переопределяем toString()
    @Override
    public String toString() {
        return
                id +" "+
                ClientName+" "+
                ClientMail+" "
        ;
    }
}