package cn.edu.student.profile.interfaces.facade;

import cn.edu.student.profile.interfaces.facade.dto.NationDto;

import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-19
 * @sine 1.8
 */
public interface NationServiceFacade {
    NationDto save(NationDto NationDto);
    List<NationDto> save(List<NationDto> NationDtos);

    List<NationDto> findAll();
}
