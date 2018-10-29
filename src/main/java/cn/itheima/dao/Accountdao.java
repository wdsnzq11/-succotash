package cn.itheima.dao;

import cn.itheima.daomin.Account;

import java.util.List;

public interface Accountdao {
    public List<Account>findall();
    public Account findbyid(Integer id);
    public void update(Account account);
    public void  insert(Account account);
    public void delect(Account account);
}
