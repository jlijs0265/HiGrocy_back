package com.example.springreact.mapper;

import com.example.springreact.domain.PMDetails;
import com.example.springreact.dto.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PMDetailMapper {
    boolean save(PMDetails pmDetails);

    List<PMDetails> findAll(Criteria criteria);

    boolean update(PMDetails pmDetails);

    boolean delete(int machine_code);

    int getTotalRaw();
}
