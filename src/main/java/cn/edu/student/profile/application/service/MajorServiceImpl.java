package cn.edu.student.profile.application.service;

import cn.edu.student.profile.domain.Major;
import cn.edu.student.profile.inf.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-18
 * @sine 1.8
 */
@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorRepository majorRepository;

    @Override
    public Major save(Major major) {
        if (major == null) {
            throw new IllegalArgumentException("major is null.");
        }
        return majorRepository.save(major);
    }

    @Override
    public List<Major> save(Iterable<Major> majors) {
        return majorRepository.save(majors);
    }

    @Override
    public List<Major> findAll() {
        return majorRepository.findAll();
    }
}
