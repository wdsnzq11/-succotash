package cn.itheima.dao.impl;

import cn.itheima.dao.Accountdao;
import cn.itheima.daomin.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
@Component
public class Accountimpl implements Accountdao {
   private QueryRunner queryRunner;

    public Accountimpl(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public List<Account> findall() {
        try {
            return  queryRunner.query("select * from account ",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
                ;return null;
    }

    public Account findbyid(Integer id) {
        try {
            return (Account) queryRunner.query("select * from account where id = ? ", new BeanHandler(Account.class), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Account account) {
        try {
            queryRunner.update("update account set money = ?,  name= ?  where id = ?  ",account.getMoney() ,account.getName(),account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(Account account) {
        try {
            queryRunner.update("Insert into account (name,money) values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delect(Account account) {
        try {
            queryRunner.update("delete from account where id =?",account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
