package cn.edu.student.profile.interfaces.web;

import cn.edu.student.profile.interfaces.web.vo.AccountVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-17
 * @sine 1.8
 */
@Controller
public class HomeController {
    private final static Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String index() {
        LOG.info("index page.");
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody AccountVo accountVo) {
        return "home";
    }
}
