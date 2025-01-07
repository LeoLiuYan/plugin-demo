package com.github.leoliuyan.plugindemo;

import javax.swing.*;

public class UIDemo {
    private JTextField username;
    private JTextField password;
    private JPanel liuyanPanel;

    public JPanel getLiuyanPanel() {
        return liuyanPanel;
    }

    public JTextField getUsername() {
        return username;
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public void setPassword(JTextField password) {
        this.password = password;
    }
    

    public JTextField getPassword() {
        return password;
    }
}
