package cn.edu.student.profile.inf.repository;

import cn.edu.student.profile.domain.Nation;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-19
 * @sine 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NationRepositoryTest {
    @Autowired
    private NationRepository nationRepository;

    private ObjectMapper objectMapper = new ObjectMapper();

    public NationRepositoryTest() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
    }

    //@Before
    public void initData() {
        List<Nation> nationList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            nationList.add(new Nation(null, "nation", "han", i));
        }
        nationRepository.save(nationList);
    }

    @Test
    public void testPageQuery() throws JsonProcessingException {
        System.out.println(objectMapper.writeValueAsString(nationRepository.findAll(new PageRequest(1, 10))));
    }

    @Test
    public void testPageQueryWithSearch() throws JsonProcessingException {
        Page<Nation> page = nationRepository.findByName("nation", new PageRequest(0, 10));
        System.out.println(objectMapper.writeValueAsString(page.getContent()));
    }
}