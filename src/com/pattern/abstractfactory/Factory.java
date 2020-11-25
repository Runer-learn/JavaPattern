package com.pattern.abstractfactory;

public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory=null;
        try{
//            factory=(Factory)Class.forName(classname).newInstance();
            Class clazz=Class.forName(classname);

            factory=(Factory)clazz.getDeclaredConstructor().newInstance();
//            factory=(Factory)clazz.getDeclaredConstructor().newInstance();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);
}
