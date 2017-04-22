package cn.edu.student.profile.interfaces.facade.dto;

import cn.edu.student.profile.domain.Gender;
import cn.edu.student.profile.domain.PoliticalStatus;
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
@Builder
@ToString(of = {"id", "gender"})
public class StudentDetailDto {
    private Long id;

    private Gender gender;
    private long birthDate;

    private String universityClass;
    private String grade;


    private PoliticalStatus status;

    private MajorDto major;
    private NationDto nation;

    private long entranceDate;
    private String identityID;
    private String address;
    private String collegeName;
}
