package com.javalec.Member.DAO;

import com.javalec.Member.DTO.MemberDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO_Impl implements MemberDAO {

    @Autowired
    SqlSession sql;


    public MemberDTO test() {
        return sql.selectOne("member.test");
    }
}
