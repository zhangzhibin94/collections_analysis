package com.xiniunet.springframework.servlet;/**
 * Created by zzb on 2019/1/16.
 */

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author zzb
 * @create 2019-01-16 13:53
 * @desc 核心控制器
 **/
public class ZDispatcherServlet extends HttpServlet {
    private static final Properties properties = new Properties();//用于存放从application.properties中读取到的配置信息
    private List<String> classNames = new ArrayList<String>();//需要加载到ioc容器中的类文件的路径 集合
    private Map<String,Object> ioc = new HashMap<String,Object>();//ioc容器，其实就是一个全局变量map，key为类文件路径
    private Map<String,Method> handlerMapping = new HashMap<String,Method>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        //从web.xml中读取contextConfigLocation属性中配置的application.properties 所在的文件路径即classpath:application.properties
        String application = config.getInitParameter("contextConfigLocation");
        System.out.println("application = " + application);


        //1.加载配置文件application.properties
        doLoadConfig(application);

        //2.扫描配置文件application.properties中描述的相关的所有类
        doScanner(properties.getProperty("scanPackage"));
        //3.实例化所有扫描到的类，并放到ioc容器中（自己实现ioc容器）
        doInstance();
        //4.依赖注入，di从ioc容器中找到加@autowired这个注解的属性，并找到其在ioc容器中的实例，动态赋值
        doAutowired();
        //5.把在@controller中加了@requestMapping这个注解的方法和url构造成一个对应关系，一个map结构，key是URL；value是method
        initHandlerMapping();
        //6.等待用户请求，根据用户请求的url去map中找对应的method
        //   调用doPost/doGet方法，通过反射机制动态调用该方法并执行

    }
    private void doLoadConfig(String application) {

    }
    private void doScanner(String scanPackage) {
    }

    private void doInstance() {
    }
    private void doAutowired() {
    }
    private void initHandlerMapping() {
    }
}
