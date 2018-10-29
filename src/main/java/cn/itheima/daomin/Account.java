package cn.itheima.daomin;

import org.apache.commons.dbutils.ResultSetHandler;

public class Account {
    private Integer id ;
    private float money;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                ", uid=" + name +
                '}';
    }
}
