//មុខងារ៖ កំណត់រចនាសម្ព័ន្ធទិន្នន័យគណនីធនាគារ។
package com.spring.banking.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    Integer id;
    String accountName;
    BigDecimal balance;

}
