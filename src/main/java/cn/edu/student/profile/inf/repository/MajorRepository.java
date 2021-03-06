package cn.edu.student.profile.inf.repository;

import cn.edu.student.profile.domain.Major;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-17
 * @sine 1.8
 */
public interface MajorRepository extends JpaRepository<Major, Integer> {
}
