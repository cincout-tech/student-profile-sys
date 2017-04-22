package cn.edu.student.profile.application.service;

import cn.edu.student.profile.domain.Account;
import cn.edu.student.profile.domain.Major;
import cn.edu.student.profile.domain.Nation;
import cn.edu.student.profile.inf.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Collection;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-18
 * @sine 1.8
 */
@Service
public class AccountServiceImpl implements AccountService {
    private final Logger LOG = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account save(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("account is null.");
        }
        account.setPassword(
                encode(account.getPassword())
        );
        LOG.debug("encode account {} password.", account.getName());
        return accountRepository.save(account);
    }

    @Override
    @Transactional
    public Account delete(long id) {
        Account account = findById(id);
        accountRepository.delete(id);
        return account;
    }

    @Override
    @Transactional
    public Account delete(String studentNumber) {
        Account account = findByStudentNumber(studentNumber);
        accountRepository.deleteByStudentNum(studentNumber);
        return account;
    }

    @Override
    public Account findById(long id) {
        return accountRepository.findOne(id);
    }

    @Override
    public Account findByStudentNumber(String studentNumber) {
        return accountRepository.findByStudentNum(studentNumber);
    }

    @Override
    public Account findByPhoneNumber(String phoneNumber) {
        return accountRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public Page<Account> findByCollegeName(String collegeName, Pageable pageable) {
        if (StringUtils.isEmpty(collegeName)) {
            LOG.debug("college name is empty.");
            return accountRepository.findAll(pageable);
        }
        return accountRepository.findByAccountCollege(collegeName, pageable);
    }

    @Override
    public Page<Account> findByNation(Nation nation, Pageable pageable) {
        if (nation == null) {
            return accountRepository.findAll(pageable);
        }
        return accountRepository.findByAccountNation(nation.getName(), pageable);
    }

    @Override
    public Page<Account> findAll(Pageable page) {
        return accountRepository.findAll(page);
    }

    @Override
    public Page<Account> findAllByUniversityClass(String universityClass, Pageable page) {
        if (StringUtils.isEmpty(universityClass)) {
            return accountRepository.findAll(page);
        }
        return accountRepository.findByUniversityClass(universityClass, page);
    }

    @Override
    public Page<Account> findAllByMajor(Major major, Pageable pageable) {
        return null;
    }

    @Override
    public String encode(CharSequence rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
