package com.test.domain;

import lombok.Data;

@Data
public class ExcepitonCode {


    static enum ERROR_CODE{
        ERROR101, ERROR102, ERROE103, ERRR104;
    }

    public final String OOTHER_EOOR= "OOTHER_EOOR";

    public final Integer Code = 101;

}