package cn.edu.student.profile.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-17
 * @sine 1.8
 */
@Entity
@Table(name = "t_student_detail")

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "gender"})
@EqualsAndHashCode(of = {"id"})
@Builder
public class StudentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private long birthDate;

    private String universityClass;
    private String grade;

    @Enumerated(EnumType.STRING)
    private PoliticalStatus status;

    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "majorId", referencedColumnName = "id")
    private Major major;

    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "nationId", referencedColumnName = "id")
    private Nation nation;

    private long entranceDate;
    private String identityID;

    private String address;
    private String collegeName;
}
