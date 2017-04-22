package cn.edu.student.profile.interfaces.web;

import cn.edu.student.profile.interfaces.facade.MajorServiceFacade;
import cn.edu.student.profile.interfaces.facade.dto.MajorDto;
import cn.edu.student.profile.interfaces.web.vo.MajorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-19
 * @sine 1.8
 */
@RestController
public class MajorController {

    @Autowired
    private MajorServiceFacade majorServiceFacade;

    @RequestMapping(value = "/majors", method = RequestMethod.GET)
    public List<MajorDto> majors() {
        return majorServiceFacade.findAll();
    }

    @RequestMapping(value = "/majors", method = RequestMethod.POST)
    public MajorDto save(@RequestBody MajorVo majorVo) {
        return majorServiceFacade.save(
                MajorVo.majorDto(majorVo)
        );
    }

    @RequestMapping(value = "/majors/batch", method = RequestMethod.POST)
    public List<MajorDto> batchSave(@RequestBody List<MajorVo> majorVos) {
        return majorServiceFacade.save(
                MajorVo.majorDtoList(majorVos)
        );
    }

}
