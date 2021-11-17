package lab4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

    Test t = new Test();
    Class<?> cll = t.getClass();

    for (Method method : cll.getDeclaredMethods()) {
      if (method.isAnnotationPresent(Call.class)) {
        method.setAccessible(true);
        for (int i = 0; i < method.getAnnotation(Call.class).call(); i++) {
          method.invoke(t);
        }
      }
    }
  }
}