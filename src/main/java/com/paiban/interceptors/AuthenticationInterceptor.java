package com.paiban.interceptors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paiban.annotations.Authority;
import com.paiban.entity.ErrorEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Destiny_hao on 2017/10/13.
 */
public class AuthenticationInterceptor extends HandlerInterceptorAdapter {

    // 在调用方法之前执行拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 将handler强转为HandlerMethod
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        // 从方法处理器中获取出要调用的方法
        Method method = handlerMethod.getMethod();
        // 获取出方法上的Access注解
        Authority authority = method.getAnnotation(Authority.class);
        if (authority == null) {
            // 如果注解为null, 说明不需要拦截, 直接放过
            return true;
        }
        if (authority.authorities().length > 0) {
            // 如果权限配置不为空, 则取出配置值
            String[] authorities = authority.authorities();
            Set<String> authSet = new HashSet<>();
            for (String auth : authorities) {
                // 将权限加入一个set集合中
                authSet.add(auth);
            }
            // 从参数中获取相关信息（用户Id）
            // 到数据库权限表中查询用户拥有的权限集合, 与set集合中的权限进行对比完成权限校验
            String role = request.getParameter("role");
            if (StringUtils.isNotBlank(role)) {
                if (authSet.contains(role)) {
                    // 校验通过返回true, 否则拦截请求
                    System.out.println("自定义权限注解类-------");
                    return true;
                }
            }
        }
        // 拦截之后应该返回公共结果
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

        ErrorEntity errorEntity = new ErrorEntity();
        errorEntity.setMessage("NOT_WORKS_AUTH");
        errorEntity.setRet("FAIL");
        errorEntity.setStatus("ERROR");
        errorEntity.setTime(System.currentTimeMillis());
        //System.out.println(new ObjectMapper().writeValueAsString(errorEntity));
        response.getWriter().write(new ObjectMapper().writeValueAsString(errorEntity));
        return false;
    }
}
