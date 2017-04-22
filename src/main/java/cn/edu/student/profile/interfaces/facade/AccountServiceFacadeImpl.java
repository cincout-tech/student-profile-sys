package cn.edu.student.profile.interfaces.facade;

import cn.edu.student.profile.interfaces.facade.dto.AccountDto;
import cn.edu.student.profile.interfaces.facade.dto.MajorDto;
import cn.edu.student.profile.interfaces.facade.dto.NationDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-20
 * @sine 1.8
 */
@Component
public class AccountServiceFacadeImpl implements AccountServiceFacade {
    @Override
    public AccountDto save(AccountDto AccountDto) {
        return null;
    }

    @Override
    public AccountDto delete(long id) {
        return null;
    }

    @Override
    public AccountDto delete(String studentNumber) {
        return null;
    }

    @Override
    public AccountDto findById(long id) {
        return null;
    }

    @Override
    public AccountDto findByStudentNumber(String studentNumber) {
        return null;
    }

    @Override
    public AccountDto findByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public Page<AccountDto> findByCollegeName(String collegeName, Pageable pageable) {
        return null;
    }

    @Override
    public Page<AccountDto> findByNation(NationDto nation, Pageable pageable) {
        return null;
    }

    @Override
    public Page<AccountDto> findAll(Pageable page) {
        return null;
    }

    @Override
    public Page<AccountDto> findAllByUniversityClass(String universityClass, Pageable page) {
        return null;
    }

    @Override
    public Page<AccountDto> findAllByMajor(MajorDto major, Pageable pageable) {
        return null;
    }
}
