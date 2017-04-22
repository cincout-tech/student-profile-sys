package cn.edu.student.profile.application.service;

import cn.edu.student.profile.domain.Nation;
import cn.edu.student.profile.inf.repository.NationRepository;
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
public class NationServiceImpl implements NationService {
    @Autowired
    private NationRepository nationRepository;

    @Override
    public Nation save(Nation nation) {
        return nationRepository.save(nation);
    }

    @Override
    public List<Nation> save(Iterable<Nation> nations) {
        return nationRepository.save(nations);
    }

    @Override
    public List<Nation> findAll() {
        return nationRepository.findAll();
    }
}
