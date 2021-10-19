package ir.maktab.dao;

import ir.maktab.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDB extends AccessToDB {
    public UserDB() throws ClassNotFoundException, SQLException {
    }

    public void validUser(User user) throws SQLException {
        Connection connection = getConnection();
        if (connection != null) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (username, password) VALUES (?,?)");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.executeUpdate();
        }
    }

    public User getUserByUserName(String username) throws SQLException {
        Connection connection= getConnection();

        if (connection != null) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users where username=?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return createUser(resultSet);
            }
        }
        return null;
    }

    public User createUser(ResultSet resultSet) throws SQLException {
        return new User(resultSet.getString(2), resultSet.getString(3));
    }
}
