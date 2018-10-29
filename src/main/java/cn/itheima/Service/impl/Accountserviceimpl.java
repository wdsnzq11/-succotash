package cn.itheima.Service.impl;

import cn.itheima.Service.Accountservice;
import cn.itheima.dao.Accountdao;
import cn.itheima.dao.impl.Accountimpl;
import cn.itheima.daomin.Account;

import java.util.List;

public class Accountserviceimpl implements Accountservice {
    private Accountimpl accountimpl;

    public Accountimpl getAccountimpl() {
        return accountimpl;
    }

    public void setAccountimpl(Accountimpl accountimpl) {
        this.accountimpl = accountimpl;
    }

    public List<Account> findall() {
        return  accountimpl.findall() ;
    }

    public Account findbyid(Integer id) {
        return accountimpl.findbyid(id);
    }

    public void update(Account account) {
       accountimpl.update(account);
    }

    public void insert(Account account) {
    accountimpl.insert(account);
    }

    public void delect(Account account) {

    }
}
