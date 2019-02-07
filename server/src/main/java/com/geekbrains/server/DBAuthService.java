package com.geekbrains.server;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.geekbrains.server.SQLHandler.connection;
import static com.geekbrains.server.SQLHandler.stmt;

public class DBAuthService implements AuthService {
    @Override
    public String getNicknameByLoginAndPassword(String login, String password) {
        return SQLHandler.getNicknameByLoginAndPassword(login,password);
    }

    @Override
    public boolean changeNick(String oldNickname, String newNickname) {
        return SQLHandler.changeNick(oldNickname,newNickname);
    }
}
