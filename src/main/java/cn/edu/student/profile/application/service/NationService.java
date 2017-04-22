package cn.edu.student.profile.application.service;

import cn.edu.student.profile.domain.Nation;

import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-18
 * @sine 1.8
 */
public interface NationService {
    Nation save(Nation nation);
    List<Nation> save(Iterable<Nation> nations);

    List<Nation> findAll();
}
