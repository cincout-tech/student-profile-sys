package cn.edu.student.profile.interfaces.web.vo;

import cn.edu.student.profile.domain.Gender;
import cn.edu.student.profile.domain.PoliticalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-22
 * @sine 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetailVo {
    private Gender gender;
    private long birthDate;

    private String universityClass;
    private String grade;


    private PoliticalStatus status;

    private int major;
    private int nation;

    private long entranceDate;
    private String identityID;
    private String address;
    private String collegeName;
}
