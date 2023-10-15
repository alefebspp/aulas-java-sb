package br.com.alefebsp.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

//Lombok: utilizado para agilizar a utilização de getters e setters
//Data irá definir getters e setters para todos os atributos
//Getter ou Setter podem ser utilizados para gerar métodos específicos
//É possível utilizar a annotation diretamento nos atributos ao invés na classe toda

@Data
@Entity(name = "tb_users")
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  public String username;
  public String name;
  public String password;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
