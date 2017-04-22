package cn.edu.student.profile.interfaces.facade.dto;

import lombok.*;

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
@ToString
@Builder
public class MajorDto {
    private Integer id;

    private String name;
    private String description;
}
