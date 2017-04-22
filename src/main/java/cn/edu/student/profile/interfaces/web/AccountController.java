package cn.edu.student.profile.interfaces.web;

import cn.edu.student.profile.interfaces.facade.dto.AccountDto;
import cn.edu.student.profile.interfaces.web.vo.AccountVo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhaoyu on 16-9-14.
 *
 * @author zhaoyu
 * @date 17-4-19
 * @sine 1.8
 */
@RestController
public class AccountController {

    @RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
    public AccountDto getAccountById(@PathVariable(name = "id") long id) {
        return null;
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public List<AccountDto> getAccountAll(
                    @RequestParam("page") int page,
                    @RequestParam("per_page") int perPage) {
        return null;
    }

    @RequestMapping(value = "/accounts")
    public AccountDto getAccountByStudentNum(@RequestParam(name = "studentNum") String studentNum) {
        return null;
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.POST)
    public AccountDto save(@RequestBody  AccountVo accountVo) {
        return null;
    }

}
