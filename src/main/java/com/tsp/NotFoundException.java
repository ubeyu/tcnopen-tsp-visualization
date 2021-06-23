package com.tsp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*---------------------------------------------------------------
              NotFoundException Release 1.0
;  Copyright (c) 2020-2020 by why Co.
;  Written by why on 2020/8/19.
;
;  Function:
;          NotFoundExceptionHandle
----------------------------------------------------------------*/

/*将资源未找到的状态返回给SpringBoot*/
@ResponseStatus(HttpStatus.NOT_FOUND)
/*博客首页不存在的异常处理*/
public class NotFoundException extends RuntimeException{

    /*通过generate生成*/
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
