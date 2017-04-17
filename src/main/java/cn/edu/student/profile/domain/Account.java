package cn.edu.student.profile.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-17
 * @sine 1.8
 */
@Entity
@Table(name = "t_account")

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "name", "phoneNumber"})
@EqualsAndHashCode(of = {"id", "name", "phoneNumber"})
@Builder
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String studentNum;
    private String phoneNumber;
    private String password;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "detailId", referencedColumnName = "id")
    private StudentDetail detail;

}
