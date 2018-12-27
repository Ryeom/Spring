package com.javalec.Member.Service;
import com.javalec.Member.DAO.MemberDAO;

import com.javalec.Member.DTO.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService_Impl implements MemberService {

    @Autowired
    MemberDAO dao;


    public MemberDTO test() {
        return dao.test();
    }

}
