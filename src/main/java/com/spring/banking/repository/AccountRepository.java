//មុខងារ៖ សម្រាប់ទំនាក់ទំនងជាមួយ Database។
package com.spring.banking.repository;

//Use can change to use like this too
//public class AccountRepository{}

import com.spring.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository
        extends JpaRepository<Account, Integer> {


}
