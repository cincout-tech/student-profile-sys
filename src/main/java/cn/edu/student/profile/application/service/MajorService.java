package cn.edu.student.profile.application.service;

import cn.edu.student.profile.domain.Major;

import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-18
 * @sine 1.8
 */
public interface MajorService {
    Major save(Major major);
    List<Major> save(Iterable<Major> majors);

    List<Major> findAll();
}
