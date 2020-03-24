package com.yeqifu;

import com.yeqifu.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: 落亦-
 * @Date: 2020/3/22 10:33
 */
public class JdbcTemplateTest02 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);

        //插入一条数据
        //jdbcTemplate.update("insert into account (name,money) values (?,?)","巴伦","100000");

        //更新一条数据
        //jdbcTemplate.update("update account set name=?,money=? where id = ?","梅拉尼娅","500000",8);

        //删除一条记录
        //jdbcTemplate.update("delete from account where id = ?",9);

        //查询所有记录
        /*List<Account> accountList = jdbcTemplate.query("select * from account where money > ?", new AccountRowMapper(), 10000);
        for (Account account : accountList) {
            System.out.println(account);
        }*/

        //查询一条记录
        /*List<Account> account = jdbcTemplate.query("select * from account where id = ?", new AccountRowMapper(), 8);
        System.out.println(account.isEmpty()?"没有记录":account.get(0));*/

        //查询返回一行一列(使用聚合函数，但不加group by字句)
        Long count = jdbcTemplate.queryForObject("select count(*) from account where money > ?",Long.class,5000f);
        System.out.println(count);
    }

}
class AccountRowMapper implements RowMapper<Account>{

    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setMoney(resultSet.getInt("money"));
        return account;
    }
}




















