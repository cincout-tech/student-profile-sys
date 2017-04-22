package cn.edu.student.profile.inf.repository;

import cn.edu.student.profile.domain.Nation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-17
 * @sine 1.8
 */
public interface NationRepository extends JpaRepository<Nation, Integer> {
    @Query("select nation from Nation nation where nation.name = ?1")
    Page<Nation> findByName(String name, Pageable pageable);
}
