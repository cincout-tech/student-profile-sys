package cn.edu.student.profile.interfaces.web;

import cn.edu.student.profile.interfaces.facade.NationServiceFacade;
import cn.edu.student.profile.interfaces.facade.dto.NationDto;
import cn.edu.student.profile.interfaces.web.vo.NationVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-19
 * @sine 1.8
 */
@RestController
public class NationController {

    @Autowired
    private NationServiceFacade nationServiceFacade;

    @RequestMapping(value = "/nations", method = RequestMethod.GET)
    List<NationDto> nations() {
        return nationServiceFacade.findAll();
    }

    //@ApiOperation(value = "save nation")
    //@ApiImplicitParam(name = "nationVo", dataType = "cn.edu.student.profile.interfaces.web.vo.NationVo")

    @RequestMapping(value = "/nations", method = RequestMethod.POST)
    public NationDto save(@RequestBody NationVo nationVo) {
        return nationServiceFacade.save(
                NationVo.nationDto(nationVo)
        );
    }

    @RequestMapping(value = "/nation/batch", method = RequestMethod.POST)
    public List<NationDto> batchSave(@RequestBody List<NationVo> nationVos) {
        return nationServiceFacade.save(
                NationVo.nationDtoList(nationVos)
        );
    }

}
