package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException,
                                                  InvocationTargetException {
        //testSingleton();
        testEnumSingleton();
    }
    
    public static void testEnumSingleton() throws InstantiationException, IllegalAccessException,
                                                  InvocationTargetException, NoSuchFieldException {
        Class<?> clase = EnumSingleton.class;
        Field numeroPatas = clase.getDeclaredField("numeroPatas");
        numeroPatas.setAccessible(true);
        numeroPatas.setInt(EnumSingleton.INSTANCE, 20);
        System.out.println(EnumSingleton.INSTANCE.getNumeroPatas());
        Constructor constructor = clase.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        //Singleton singletonReflection = (Singleton)constructor.newInstance();
        //System.out.println(singletonReflection);
    }
    
    public static void testSingleton() throws InstantiationException, IllegalAccessException,
                                              InvocationTargetException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Class<?> clase = singleton.getClass();
        Constructor constructor = clase.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Singleton singletonReflection = (Singleton)constructor.newInstance();
        System.out.println(singletonReflection);
    }
    
    public static void probarPerro() throws NoSuchFieldException, IllegalAccessException {
        Perro perro = new Perro();
        Class<?> clase = perro.getClass();
        Constructor[] constructores = clase.getConstructors();
        for(Constructor constructor : constructores){
            System.out.println(constructor.toString());
        }
        Field nombre = clase.getDeclaredField("edad");
        nombre.setInt(perro, 500);
        System.out.println(perro.edad);
        Field campo = clase.getDeclaredField("numeroPatas");
        campo.setAccessible(true);
        campo.setInt(perro, 20);
        System.out.println(perro.getNumeroPatas());
    }
}
