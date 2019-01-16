package com.cheng.springmvc;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:34 2018/6/8
 * @Reference:
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        HttpSession session = request.getSession();
        String _csrfByForm = request.getParameter("_csrf");
        String _csrfBySession = String.valueOf(session.getAttribute("_csrf"));
        if (_csrfByForm.equals(_csrfBySession)) {
            return true;
        }else {
            response.setContentType("text/html;charset=utf-8");
            response.setStatus(403);
            OutputStream outputStream = response.getOutputStream();
            outputStream.write("请不要重复提交".getBytes("utf-8"));

            return false;
        }

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
