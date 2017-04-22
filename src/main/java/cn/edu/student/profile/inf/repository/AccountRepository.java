package cn.edu.student.profile.inf.repository;

import cn.edu.student.profile.domain.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-17
 * @sine 1.8
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query(value = "select account from Account account where account.studentNum = ?1")
    Account findByStudentNum(String studentNum);

    @Modifying(clearAutomatically = true)
    @Query("delete from Account account where account.studentNum = :studentNum")
    void deleteByStudentNum(String studentNum);

    @Query("select account from Account account where account.phoneNumber = ?1")
    Account findByPhoneNumber(String phoneNumber);

    @Query("select account from Account account where account.detail.collegeName = ?1")
    Page<Account> findByAccountCollege(String collegeName, Pageable pageable);

    @Query("select account from Account account where account.detail.nation.name = :nationName")
    Page<Account> findByAccountNation(@Param("nationName") String nationName, Pageable pageable);

    @Query("select account from Account account where account.detail.universityClass = :universityClass")
    Page<Account> findByUniversityClass(@Param("universityClass") String universityClass, Pageable pageable);
}
