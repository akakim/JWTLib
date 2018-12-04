package com.dream.jwtlibrary.lang;

import java.util.Collection;
import java.util.Map;


public class Collections {

    private Collections(){}

    public static boolean isEmpty(Collections collections){
        return (collections == null || collections.isEmpty());
    }

    public static boolean isEmpty(Map map){
        return ( map == null || map.isEmpty() );

    }
    public static int size (Map map ){
        return map == null ? 0 : map.size();
    }

    public static int size(Collection collection){
        return collection == null ? 0 : collection.size();
    }

    public static void mergeArrayIntoCollection(Object array,Collection collection){
        if(collection == null){
            throw new IllegalArgumentException( "Collection must not be null");
        }

        Object [] arr = Objects
    }

}
