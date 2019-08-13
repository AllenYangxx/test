package com.test.exception;

import com.test.domain.ExcepitonCode;
import lombok.Data;

@Data
public class DescribeException extends RuntimeException {

    private Integer code;

    public DescribeException(ExcepitonCode excepitonCode){
        super(excepitonCode.getOOTHER_EOOR());
        this.code = excepitonCode.Code;
    }

}
