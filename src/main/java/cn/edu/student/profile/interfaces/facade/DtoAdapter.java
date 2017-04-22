package cn.edu.student.profile.interfaces.facade;

import cn.edu.student.profile.domain.Major;
import cn.edu.student.profile.domain.Nation;
import cn.edu.student.profile.interfaces.facade.dto.MajorDto;
import cn.edu.student.profile.interfaces.facade.dto.NationDto;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-19
 * @sine 1.8
 */
public abstract class DtoAdapter {
    private DtoAdapter() {}

    public static NationDto toDto(Nation nation) {
        if (nation == null) {
            return null;
        }
        NationDto dto = new NationDto();
        BeanUtils.copyProperties(nation, dto);
        return dto;
    }

    public static Nation toDomain(NationDto dto) {
        if (dto == null) {
            return null;
        }
        Nation nation = new Nation();
        BeanUtils.copyProperties(dto, nation);
        return nation;
    }

    public static Major toDomain(MajorDto dto) {
        if (dto == null) {
            return null;
        }
        Major major = new Major();
        BeanUtils.copyProperties(dto, major);
        return major;
    }

    public static MajorDto toDto(Major major) {
        if (major == null) {
            return null;
        }
        MajorDto dto = new MajorDto();
        BeanUtils.copyProperties(major, dto);
        return dto;
    }

    public static List<Nation> toNationList(List<NationDto> dtoList) {
        if (dtoList == null || dtoList.size() == 0) {
            return null;
        }
        List<Nation> nationList = new ArrayList<>();
        dtoList.stream().forEach(dto -> nationList.add(toDomain(dto)));
        return nationList;
    }

    public static List<NationDto> toNationDtoList(List<Nation> nationList) {
        if (nationList == null || nationList.size() == 0) {
            return null;
        }
        List<NationDto> dtoList = new ArrayList<>();
        nationList.stream().forEach(nation -> dtoList.add(toDto(nation)));
        return dtoList;
    }

    public static List<Major> toMajorList(List<MajorDto> dtoList) {
        if (dtoList == null || dtoList.size() == 0) {
            return null;
        }
        List<Major> majorList = new ArrayList<>();
        dtoList.stream().forEach(dto -> majorList.add(toDomain(dto)));
        return majorList;
    }

    public static List<MajorDto> toMajorDtoList(List<Major> majorList) {
        if (majorList == null || majorList.size() == 0) {
            return null;
        }
        List<MajorDto> majorDtoList = new ArrayList<>();
        majorList.stream().forEach(major -> majorDtoList.add(toDto(major)));
        return majorDtoList;
    }

    public static <T, D> T toDto(Class<T> t, D d) throws IllegalAccessException, InstantiationException {
        if (d == null) {
            return null;
        }
        T obj = t.newInstance();
        BeanUtils.copyProperties(d, obj);
        return obj;
    }

    public static <T, D> T toDomain(Class<T> t, D d) throws IllegalAccessException, InstantiationException {
        if (d == null) {
            return null;
        }
        T obj = t.newInstance();
        BeanUtils.copyProperties(d, obj);
        return obj;
    }
}
