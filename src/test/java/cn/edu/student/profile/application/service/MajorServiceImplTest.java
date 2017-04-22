package cn.edu.student.profile.application.service;

import cn.edu.student.profile.domain.Major;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-20
 * @sine 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MajorServiceImplTest {

    @Autowired
    private MajorService majorService;

    @Test
    public void save() throws Exception {
        Major major = new Major(null, "风景园林", "风景园林");
        System.out.println(majorService.save(major));
    }

    @Test
    public void saveBatch() throws Exception {

    }

    @Test
    public void findAll() throws Exception {

    }

}