package cn.edu.student.profile.interfaces.facade;

import cn.edu.student.profile.interfaces.facade.dto.MajorDto;

import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-19
 * @sine 1.8
 */
public interface MajorServiceFacade {
    MajorDto save(MajorDto MajorDto);
    List<MajorDto> save(List<MajorDto> MajorDtos);

    List<MajorDto> findAll();
}
