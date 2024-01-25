package org.example;

public class JdbcTemplate {
    public int[] batchUpdate(String[] strings){
        int[] array = new int[strings.length];
        for(int i=0;i<strings.length;i++){
            array[i]=i;
        }
        return array;
    }
}
