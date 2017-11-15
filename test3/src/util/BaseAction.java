package util;

import java.lang.reflect.ParameterizedType;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements
		ServletRequestAware, ServletResponseAware, ServletContextAware,
		ModelDriven<T> {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected ServletContext servletContext;

	private Class<T> clazz;

	@SuppressWarnings("unchecked")
	private Class<T> getClazz() {
		if (clazz == null)
			clazz = (Class<T>) ((ParameterizedType) this.getClass()
					.getGenericSuperclass()).getActualTypeArguments()[0];
		return clazz;
	}

	private T model;

	public BaseAction() {
		try {
			model = this.getClazz().newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public T getModel() {
		return model;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;

	}

	public static void main(String[] args) throws Exception {
		// 反射
		Object userinfo = Class.forName("net.qingruanit.demo.vo.Userinfo")
				.newInstance();
		System.out.println(userinfo.getClass().getName());
		// userinfo.setName("qingsoft");
		// System.out.println(userinfo.getName());
	}
}
