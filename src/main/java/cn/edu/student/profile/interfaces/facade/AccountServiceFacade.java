package cn.edu.student.profile.interfaces.facade;

import cn.edu.student.profile.interfaces.facade.dto.AccountDto;
import cn.edu.student.profile.interfaces.facade.dto.MajorDto;
import cn.edu.student.profile.interfaces.facade.dto.NationDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-19
 * @sine 1.8
 */
public interface AccountServiceFacade {
    AccountDto save(AccountDto AccountDto);

    AccountDto delete(long id);
    AccountDto delete(String studentNumber);

    AccountDto findById(long id);
    AccountDto findByStudentNumber(String studentNumber);
    AccountDto findByPhoneNumber(String phoneNumber);
    Page<AccountDto> findByCollegeName(String collegeName, Pageable pageable);
    Page<AccountDto> findByNation(NationDto nation, Pageable pageable);

    Page<AccountDto> findAll(Pageable page);
    Page<AccountDto> findAllByUniversityClass(String universityClass, Pageable page);
    Page<AccountDto> findAllByMajor(MajorDto major, Pageable pageable);
}
