package com.example.paf_assess.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.paf_assess.models.Account;



@Repository
public class AccountRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    String selectSql = "Select * from accounts";
    String selectBasedOnAccountSql = "select * from accounts where account_id=?";
    String UpdateSenderSql = "update accounts set balance=balance-? where account_id=?";
    String UpdateReceiverSql = "update accounts set balance=balance+? where account_id=?";

    public List<Account> findAll()
    {
        List<Account> rsltList = new ArrayList<Account>();
        rsltList = jdbcTemplate.query(selectSql, BeanPropertyRowMapper.newInstance(Account.class));
        //System.out.println(rsltList.s);
        return rsltList;
    }
    

}
