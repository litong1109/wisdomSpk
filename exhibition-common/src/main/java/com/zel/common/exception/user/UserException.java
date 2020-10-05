package com.zel.common.exception.user;

import com.zel.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author zel
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
