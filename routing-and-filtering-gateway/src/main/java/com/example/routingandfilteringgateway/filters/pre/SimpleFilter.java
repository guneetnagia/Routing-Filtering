/*
 * Filter : 
 * pre : run before the request is routed
 * post : run after thr request is routed
 * route : can handle actual routing of request
 * error : filter runs if error in course of handling the request
 */

package com.example.routingandfilteringgateway.filters.pre;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


public class SimpleFilter extends ZuulFilter{
	
	private static Logger log = LoggerFactory.getLogger(SimpleFilter.class);

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
