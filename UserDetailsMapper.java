package com.UserDetailsSpring;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDetailsMapper implements RowMapper<UserDetails> {
    public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserDetails userDetails = new UserDetails();
        userDetails.setUser_id(rs.getInt("user_id"));
        userDetails.setUsername(rs.getString("username"));
        userDetails.setFirst_name(rs.getString("first_name"));
        userDetails.setLast_name(rs.getString("last_name"));
        userDetails.setGender(rs.getString("gender"));
        userDetails.setPassword(rs.getString("password"));
        userDetails.setStatus(rs.getInt("status"));
        return userDetails;
    }
}