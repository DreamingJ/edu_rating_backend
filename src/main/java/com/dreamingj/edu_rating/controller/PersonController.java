package com.dreamingj.edu_rating.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dreamingj.edu_rating.common.RequestBodyApi;
import com.dreamingj.edu_rating.common.ResponseBodyApi;
import com.dreamingj.edu_rating.entity.User;
import com.dreamingj.edu_rating.service.IPersonService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Resource(name = "personService")
    IPersonService personService;

//    @Operation()
    @PostMapping("/list")
    public ResponseBodyApi<List<User>> list(@RequestBody RequestBodyApi<User> requestBodyApi) {
        return new ResponseBodyApi<>(personService.list(getQueryWrapper(requestBodyApi)));
    }

    private LambdaQueryWrapper<User> getQueryWrapper(RequestBodyApi<User> requestBodyApi) {
        User person = requestBodyApi.getParams();
        LambdaQueryWrapper<User> queryWrapper = new QueryWrapper<User>().lambda();
        if (person != null) {
            queryWrapper = queryWrapper.like(!StringUtils.isEmpty(person.getUserName()), User::getUserName, person.getUserName())
                    .eq(!StringUtils.isEmpty(person.getDeptName()), User::getDeptName, person.getDeptName());
        }
        return queryWrapper;
    }

    @PostMapping("/page")
    public ResponseBodyApi<Page<User>> page(@RequestBody RequestBodyApi<User> requestBodyApi) {
        Page<User> page = personService.page(requestBodyApi.getPage(), getQueryWrapper(requestBodyApi));
        return new ResponseBodyApi<>(page);
    }

    @PostMapping("/getById")
    public ResponseBodyApi getById(@RequestBody User person) {
        return new ResponseBodyApi<>(personService.getById(person.getUserID()));
    }

    @PostMapping("/saveOrUpdate")
    public ResponseBodyApi saveOrUpdate(@RequestBody User person) {
        personService.saveOrUpdate(person);
        return new ResponseBodyApi();
    }
    @PostMapping("/removeByIds")
    public ResponseBodyApi removeByIds(@RequestBody List<String> idList) {
        personService.removeByIds(idList);
        return new ResponseBodyApi();
    }


}
