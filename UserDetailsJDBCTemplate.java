package com.UserDetailsSpring;

/**
 * Created by rt on 6/20/17.
 */

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserDetailsJDBCTemplate implements UserDetailsDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(int user_id, String username, String first_name, String last_name, String gender, String password, int status){
        String SQL = "insert into Student (username, first_name, last_name. gender, password,status) values (?, ?, ?, ?, ?, ?,?)";
        jdbcTemplateObject.update(SQL, user_id, first_name, last_name, gender, password,status);
        System.out.println("Created Record Name = " + first_name + " User_id = " + user_id);
        return;
    }

    @Override
    public UserDetails getUserDetails(Integer id) {
        return null;
    }



    @Override
    public List<UserDetails> listUserDetailss() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(int user_id, String username, String first_name, String last_name, String gender, String password, int status) {

    }

//    public Student getStudent(Integer id) {
//        String SQL = "select * from Student where id = ?";
//        Student student = jdbcTemplateObject.queryForObject(SQL,
//                new Object[]{id}, new UserDetailsMapper());
//
//        return student;
//    }
//
//    public List<Student> listStudents() {
//        String SQL = "select * from Student";
//        List<Student> students = jdbcTemplateObject.query(SQL, new UserDetailsMapper());
//        return students;
//    }
//
//    public void delete(Integer id) {
//        String SQL = "delete from Student where id = ?";
//        jdbcTemplateObject.update(SQL, id);
//        System.out.println("Deleted Record with ID = " + id);
//        return;
//    }
//
//    public void update(Integer id, Integer age) {
//        String SQL = "update Student set age = ? where id = ?";
//        jdbcTemplateObject.update(SQL, age, id);
//        System.out.println("Updated Record with ID = " + id);
//        return;
//    }
}