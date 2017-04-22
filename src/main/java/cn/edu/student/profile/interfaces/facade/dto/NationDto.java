package cn.edu.student.profile.interfaces.facade.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Builder
public class NationDto {
    private Integer id;
    private String name;
    private String enName;
    private int code;
}
