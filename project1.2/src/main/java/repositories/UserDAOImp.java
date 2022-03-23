package repositories;

import models.User;
import utility.ConnectionUtil;

import java.sql.*;

public class UserDAOImp implements UserDAO{

    @Override
    public User getUserByUsername(String username) {
        User user = null;

        try (Connection conn = ConnectionUtil.getConnection()){

            String sql = "select * from users WHERE user_username = ?;";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                user = new User(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)
                );
            }

        } catch (SQLException sqle){
            sqle.printStackTrace();
        }
        return user;
    }
}