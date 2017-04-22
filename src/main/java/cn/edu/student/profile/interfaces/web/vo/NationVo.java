package cn.edu.student.profile.interfaces.web.vo;

import cn.edu.student.profile.interfaces.facade.dto.NationDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-19
 * @sine 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NationVo {
    private String name;
    private String enName;
    private int code;

    public static NationDto nationDto(NationVo nationVo) {
        if (nationVo == null) {
            return null;
        }
        return NationDto.builder()
                .code(nationVo.getCode())
                .enName(nationVo.getEnName())
                .name(nationVo.getName())
                .build();
    }

    public static List<NationDto> nationDtoList(List<NationVo> nationVoList) {
        if (nationVoList == null || nationVoList.size() == 0) {
            return null;
        }
        List<NationDto> dtoList = new ArrayList<>();
        nationVoList.stream().forEach(nationVo -> dtoList.add(nationDto(nationVo)));
        return dtoList;
    }
}
