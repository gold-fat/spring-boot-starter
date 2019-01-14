package com.imooc.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: LiHanFei
 * Date_Time: 2019-01-1222:27
 * Package_Name:com.imooc.exception
 */
@ControllerAdvice
public class ErrorExceptionHandler {

    private final String ERROR_VIEW = "error";


    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception e){
        e.printStackTrace();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception",e.getMessage());
        modelAndView.addObject("url",request.getRequestURL());
        modelAndView.setViewName(ERROR_VIEW);
        return modelAndView;
    }
}
