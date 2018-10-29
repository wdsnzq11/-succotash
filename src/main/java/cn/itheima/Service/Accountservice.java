package cn.itheima.Service;

import cn.itheima.daomin.Account;

import java.util.List;

public interface Accountservice {
    public List<Account> findall();
    public Account findbyid(Integer id);
    public void update(Account account);
    public void  insert(Account account);
    public void delect(Account account);
}
