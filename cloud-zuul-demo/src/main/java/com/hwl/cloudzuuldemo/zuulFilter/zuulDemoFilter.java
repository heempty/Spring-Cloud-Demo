package com.hwl.cloudzuuldemo.zuulFilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


/**
 * ZuulFilter Zuul路由过滤器
 */
@Component
public class zuulDemoFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(zuulDemoFilter.class);

    /**
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
    */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filterOrder：过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * run：过滤器的具体逻辑，这里只是将请求的URL简单些到日志中
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext rctx = RequestContext.getCurrentContext();
        HttpServletRequest request =  rctx.getRequest();
        String str = String.format("Method: %s -->> RequestURL: %s", request.getMethod(), request.getRequestURI().toString());
        log.info(str);
        return null;
    }
}
