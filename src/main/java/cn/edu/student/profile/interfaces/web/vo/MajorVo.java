package cn.edu.student.profile.interfaces.web.vo;

import cn.edu.student.profile.interfaces.facade.dto.MajorDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-20
 * @sine 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MajorVo {
    private String name;
    private String description;

    public static MajorDto majorDto(MajorVo majorVo) {
        if (majorVo == null) {
            return null;
        }
        return MajorDto.builder()
                .name(majorVo.getName())
                .description(majorVo.getDescription())
                .build();
    }

    public static List<MajorDto> majorDtoList(List<MajorVo> majorVoList) {
        if (majorVoList == null || majorVoList.size() == 0) {
            return null;
        }
        List<MajorDto> dtoList = new ArrayList<>();
        majorVoList.stream().forEach(majorVo -> dtoList.add(majorDto(majorVo)));
        return dtoList;
    }
}
