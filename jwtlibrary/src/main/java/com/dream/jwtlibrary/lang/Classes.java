package com.dream.jwtlibrary.lang;

import java.io.InputStream;

public class Classes {

    private Classes(){} // prevent instantiation

    /**
     * @since 1.0.1
     */

//    private static final ClassLoaderAccesor THREAD_CL_ACCESSOR = new ExceptionIgno

    private static final ClassLoaderAccessor THREAD_CL_ACCESSOR = new ExceptionIgnoringAccessor(){

        @Override
        protected ClassLoader doGetClassLoader() throws Throwable {
            return Thread.currentThread().getContextClassLoader();
        }
    };

    private static final ClassLoaderAccessor CLASS_CL_ACCESSOR = new ExceptionIgnoringAccessor() {
        @Override
        protected ClassLoader doGetClassLoader() throws Throwable {
            return Classes.class.getClassLoader();
        }
    };

    private static final ClassLoaderAccessor SYSTEM_CL_ACCESSOR = new ExceptionIgnoringAccessor() {
        @Override
        protected ClassLoader doGetClassLoader() throws Throwable {
            return ClassLoader.getSystemClassLoader();
        }
    };


    /**
     * @since 0.10.0
     */
    @SuppressWarnings("uncheck")



    /**
     * @since 1.0.1
     */

    private static interface ClassLoaderAccessor{
        Class loadClass(String fqcn);

        InputStream getResourceStream(String name);
    }

    private static abstract class ExceptionIgnoringAccessor implements ClassLoaderAccessor{

        @Override
        public Class loadClass(String fqcn) {

            Class clazz = null;
            ClassLoader cl =getClassLoader();

            if( cl != null ){
                try{
                    clazz = cl.loadClass( fqcn );
                } catch ( ClassNotFoundException e ){
                     // class could not be found by loader
                }

            }
            return null;
        }

        @Override
        public InputStream getResourceStream(String name) {

            InputStream is = null;
            ClassLoader cl = getClassLoader();
            if (cl != null ) {
                is = cl.getResourceAsStream( name );

            }

            return is;
        }

        protected final ClassLoader getClassLoader(){

            try{
                return doGetClassLoader();
            } catch (Throwable t ){
                // Unable to get ClassLoader
            }
            return null;
        }

        protected abstract ClassLoader doGetClassLoader() throws Throwable;
    }
}




