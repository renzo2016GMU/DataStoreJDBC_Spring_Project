package com.UserDetailsSpring;//Following is the content of the Data Access Object interface file

import javax.sql.DataSource;
import java.util.List;

public interface UserDetailsDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the UserDetails table.
     */
    public void create(int user_id, String username, String first_name, String last_name, String gender, String password, int status);

    /**
     * This is the method to be used to list down
     * a record from the UserDetails table corresponding
     * to a passed UserDetails id.
     */
    public UserDetails getUserDetails(Integer id);

    /**
     * This is the method to be used to list down
     * all the records from the UserDetails table.
     */
    public List<UserDetails> listUserDetailss();

    /**
     * This is the method to be used to delete
     * a record from the UserDetails table corresponding
     * to a passed UserDetails id.
     */
    public void delete(Integer id);

    /**
     * This is the method to be used to update
     * a record into the UserDetails table.
     */
    public void update(int user_id, String username, String first_name, String last_name, String gender, String password, int status);
}