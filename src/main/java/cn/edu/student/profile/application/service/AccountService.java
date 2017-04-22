package cn.edu.student.profile.application.service;

import cn.edu.student.profile.domain.Account;
import cn.edu.student.profile.domain.Major;
import cn.edu.student.profile.domain.Nation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collection;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-18
 * @sine 1.8
 */
public interface AccountService extends PasswordEncoder {
    Account save(Account account);

    Account delete(long id);
    Account delete(String studentNumber);

    Account findById(long id);
    Account findByStudentNumber(String studentNumber);
    Account findByPhoneNumber(String phoneNumber);
    Page<Account> findByCollegeName(String collegeName, Pageable pageable);
    Page<Account> findByNation(Nation nation, Pageable pageable);

    Page<Account> findAll(Pageable page);
    Page<Account> findAllByUniversityClass(String universityClass, Pageable page);
    Page<Account> findAllByMajor(Major major, Pageable pageable);
}
