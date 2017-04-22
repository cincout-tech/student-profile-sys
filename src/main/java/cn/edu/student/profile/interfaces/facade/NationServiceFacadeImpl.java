package cn.edu.student.profile.interfaces.facade;

import cn.edu.student.profile.application.service.NationService;
import cn.edu.student.profile.domain.Nation;
import cn.edu.student.profile.interfaces.facade.dto.NationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-20
 * @sine 1.8
 */
@Component
public class NationServiceFacadeImpl implements NationServiceFacade {

    @Autowired
    private NationService nationService;

    @Override
    public NationDto save(NationDto nationDto) {
        Nation nation = DtoAdapter.toDomain(nationDto);
        return DtoAdapter.toDto(nationService.save(nation));
    }

    @Override
    public List<NationDto> save(List<NationDto> nationDtos) {
        List<Nation> nationList = DtoAdapter.toNationList(nationDtos);
        return DtoAdapter.toNationDtoList(nationService.save(nationList));
    }

    @Override
    public List<NationDto> findAll() {
        return DtoAdapter.toNationDtoList(nationService.findAll());
    }

}
