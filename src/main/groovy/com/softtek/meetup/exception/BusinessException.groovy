package com.softtek.meetup.exception

import org.springframework.core.NestedRuntimeException

class BusinessException extends NestedRuntimeException {

  BusinessException(String msg){
    super(msg)
  }

  BusinessException(String msg, Throwable cause) {
    super(msg, cause)
  }

}