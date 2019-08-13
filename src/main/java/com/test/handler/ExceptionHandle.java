package com.test.handler;

import com.test.domain.Result;
import com.test.exception.DescribeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionGet(Exception e){
        if(e instanceof DescribeException){
            DescribeException describeException = (DescribeException) e;
            return new Result("1","被捕获的异常",null);
        }else{
            LOGGER.error("系统异常 {} ", e);
            return new Result("0", "未知异常", null);
        }

    }

}
