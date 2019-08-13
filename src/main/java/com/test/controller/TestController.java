package com.test.controller;

import com.test.domain.Result;
import com.test.handler.ExceptionHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ExceptionHandle exceptionHandle;

    @RequestMapping(value="test")
    public String test(){
        return "success";
    }

    @RequestMapping("/")
    public String index() {
        return "login";
    }


    @RequestMapping(value = "aop/exception")
    public Result AopException(){
        return Result.success();
    }

    /**
     * 返回体测试
     * @param name
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/getResult",method = RequestMethod.POST)
    public Result getResult(@RequestParam("name") String name, @RequestParam("pwd") String pwd){
        Result result = null;
        try {
            if (name.equals("zzp")){
                result =  Result.success();
            }else if (name.equals("pzz")){
                result =  new Result("2" , "pzz", null);
            }else{
                int i = 1/0;
            }
        }catch (Exception e){
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }
}
