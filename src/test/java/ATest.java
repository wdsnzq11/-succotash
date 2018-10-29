import cn.itheima.Service.Accountservice;
import cn.itheima.daomin.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ATest {

    private   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
    private Accountservice accountservice = (Accountservice)applicationContext.getBean("accountservice");
    @Test
    public void  findall(){

        List<Account> findall = accountservice.findall();
        System.out.println(findall);
    }
    @Test
    public void findbyid(){
        Account findbyid = accountservice.findbyid(1);
        System.out.println(findbyid);
        System.out.println("aaaa");
        System.out.println("aaa");
    }
    @Test
  public void update(){
      Account account = new Account();
      account.setMoney(1111);
      account.setId(4);
      account.setName("goudan");
      accountservice.update(account); }
      @Test
  public void  insert(){
          Account account = new Account();
          account.setMoney(1111);
          account.setId(4);
          account.setName("狗蛋");
          accountservice.insert(account);
    }
    @Test
    public void delect(){
        Account account = new Account();
        account.setMoney(1111);
        account.setId(10);
        accountservice.delect(account);
    }
}
