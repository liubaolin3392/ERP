package com.chinasoft.model.dao;

import com.chinasoft.model.entity.Candidate;

public interface CandidateMapper {
    int deleteByPrimaryKey(Integer candidateid);

    int insert(Candidate record);

    int insertSelective(Candidate record);

    Candidate selectByPrimaryKey(Integer candidateid);

    int updateByPrimaryKeySelective(Candidate record);

    int updateByPrimaryKey(Candidate record);
}