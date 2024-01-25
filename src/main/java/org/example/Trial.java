package org.example;

public class Trial {
    JdbcTemplate jdbcTemplate;
    public int[] execute(Peerson peerson){
        String[] strings = peerson.getMarks().toArray(String[]::new);
        return  jdbcTemplate.batchUpdate(strings);
    }
}
