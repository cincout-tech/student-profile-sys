package cn.edu.student.profile.interfaces.facade;

import cn.edu.student.profile.application.service.MajorService;
import cn.edu.student.profile.domain.Major;
import cn.edu.student.profile.interfaces.facade.dto.MajorDto;
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
public class MajorServiceFacadeImpl implements MajorServiceFacade {

    @Autowired
    private MajorService majorService;

    @Override
    public MajorDto save(MajorDto majorDto) {
        Major major = DtoAdapter.toDomain(majorDto);
        return DtoAdapter.toDto(majorService.save(major));
    }

    @Override
    public List<MajorDto> save(List<MajorDto> majorDtos) {
        List<Major> majorList = DtoAdapter.toMajorList(majorDtos);
        return DtoAdapter.toMajorDtoList(majorService.save(majorList));
    }

    @Override
    public List<MajorDto> findAll() {
        return DtoAdapter.toMajorDtoList(majorService.findAll());
    }

}
