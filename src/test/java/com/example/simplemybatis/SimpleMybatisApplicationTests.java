package com.example.simplemybatis;

import com.example.simplemybatis.Class.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

@SpringBootTest
class SimpleMybatisApplicationTests {

    private User user = new User();


    @Test
    public Class<?> forName() {
        System.out.println("_______________________________________");
        System.out.println(user.getClass().getName());
        Class<?> forNameClass = null;
        try {
            forNameClass = Class.forName(user.getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return forNameClass;
    }

    /*公共方法*/
    @Test
    public Method[] getMethod() {
        Class<?> forNameClass = this.forName();

        Method[] methods = forNameClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        return methods;
    }

    /*所有方法*/
    @Test
    public Method[] DeclaredMethods() {
        Class<?> forNameClass = this.forName();
        Method[] declaredMethods = forNameClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        return declaredMethods;
    }

    /*接口*/
    @Test
    public void getInterfaces() {
        Class<?> forNameClass = this.forName();
        Class<?>[] clazzs = forNameClass.getInterfaces();
        for (Class<?> clazz : clazzs) {
            System.out.println(clazz);
        }
    }

    /*父类*/
    @Test
    public void getSuperclass() {
        Class<?> forNameClass = this.forName();
        Class<?> superclass = forNameClass.getSuperclass();
        System.out.println(superclass);
    }

    /*公共构造方法*/
    @Test
    public void getConstructors() {
        Class<?> forNameClass = this.forName();
        Constructor[] constructors = forNameClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }

    /*所有构造方法*/
    @Test
    public void setConstructors() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> forNameClass = this.forName();
        Constructor[] constructors = forNameClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

    }

    /*公共属性*/
    @Test
    public void getFinle() {
        Class<?> forNameClass = this.forName();
        Field[] fields = forNameClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

    }

    /*所有属性*/
    @Test
    public void getDeclaredFields() {
        Class<?> forNameClass = this.forName();
        Field[] declaredFields = forNameClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }

    /*获取当前对象反射的属性对象*/
    @Test
    public void getNewInstance() throws IllegalAccessException, InstantiationException {
        Class<?> forNameClass = this.forName();
        Object instance = forNameClass.newInstance();
        User user = (User) instance;
        System.out.println(user);
    }

    /*获取当前对象实例，并操作*/
    @Test
    public void setNewInstanceOperation() throws IllegalAccessException, InstantiationException {
        Class<?> forNameClass = this.forName();
        Object instance = forNameClass.newInstance();
        User user = (User) instance;
        user.setName("dfvfdv");
        user.setAge(15);
        System.out.println(user.toString());


    }

    /*获取当前对象实例，并操作属性和方法*/
    @Test
    public void setAttribute() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> forNameClass = this.forName();
        User user = (User) forNameClass.newInstance();
        Field userId = forNameClass.getDeclaredField("id");
        userId.setAccessible(true);
        userId.set(user, 154L);
        System.out.println(user.toString());

        /*无参数*/
        Method userdd = forNameClass.getDeclaredMethod("dd", null);
        userdd.setAccessible(true);
        String aa = (String) userdd.invoke(user, null);
        System.out.println(aa);
        /*单参*/
        Method userPyString = forNameClass.getDeclaredMethod("pyString", String.class);
        System.out.println(userPyString.invoke(user, "一个参数"));

        /*多参数*/
        Method userAddInteger = forNameClass.getDeclaredMethod("addInteger", Integer.class, double.class);
        System.out.println(userAddInteger);

        /*构造方法*/
        Constructor constructor = forNameClass.getDeclaredConstructor(Long.class);
        System.out.println(constructor);

        User userConstructor = (User) constructor.newInstance(15L);
        System.out.println(userConstructor);
    }

    /*动态加载类名和方法*/
    @Test
    public void dynamicLoading() throws IOException {
        /*读取文件*/
        Properties properties = new Properties();

        String className = properties.getProperty("classname");
        String methodname = properties.getProperty("methodname");
        System.out.println(properties);
        Class<?> forNameClass = this.forName();
    }

    /*反射越过泛型检查*/
    @Test
    public void getAcross() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14245);
        Class<?> listClass = list.getClass();
        Method listAdd = listClass.getMethod("add", Object.class);
        listAdd.invoke(list, "cscs");
        System.out.println(list);
    }

    /*修改方法*/
    @Test
    public void setElement() {
        Class<?> forNameClass = this.forName();
        Method[] declaredMethods = forNameClass.getDeclaredMethods();
        for(Method declaredMethod :declaredMethods) {
            System.out.println(declaredMethod.getName());

        }
    }

}
