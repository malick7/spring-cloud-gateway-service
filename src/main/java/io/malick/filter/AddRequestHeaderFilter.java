package io.malick.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class AddRequestHeaderFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		//current impl ignores returned object, so we can return null
		
		RequestContext ctx = RequestContext.getCurrentContext();
		ctx.addZuulRequestHeader("x-location", "India");
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
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
