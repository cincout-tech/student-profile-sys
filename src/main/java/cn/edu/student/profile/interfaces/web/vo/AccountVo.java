package cn.edu.student.profile.interfaces.web.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
public class AccountVo implements Serializable {
    private String name;
    private String studentNum;
    private String phoneNumber;
    private String password;

    private AccountDetailVo detailVo;
}
