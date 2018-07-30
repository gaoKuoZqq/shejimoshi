package entity;

import java.io.FileInputStream;

public class MyClassLoader extends ClassLoader{
	 private String classPath;

     public MyClassLoader(String classPath) {
         this.classPath = classPath;
     }

     private byte[] loadByte(String name) throws Exception {
         name = name.replaceAll("\\.", "/");
         FileInputStream fis = new FileInputStream(classPath + "/" + name
                 + ".class");
         int len = fis.available();
         byte[] data = new byte[len];
         fis.read(data);
         fis.close();
         return data;

     }

     protected Class<?> findClass(String name) throws ClassNotFoundException {
         try {
             byte[] data = loadByte(name);
             return defineClass(name, data, 0, data.length);
         } catch (Exception e) {
             e.printStackTrace();
             throw new ClassNotFoundException();
         }
     }

     
     
     protected Class<?> loadClass(String name, boolean resolve)
    	        throws ClassNotFoundException
    	    {
    	        synchronized (getClassLoadingLock(name)) {
    	            // First, check if the class has already been loaded
    	            Class<?> c = findLoadedClass(name);
    	            if (c == null) {
    	            	System.out.println("没有加载过");
    	            }else {
    	            	System.out.println("加载过了");
    	            	}
    	            return super.loadClass(name,  resolve);
    	        }
    	    }
}
