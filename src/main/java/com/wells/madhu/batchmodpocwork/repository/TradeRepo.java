package com.wells.madhu.batchmodpocwork.repository;

import com.wells.madhu.batchmodpocwork.entity.Trades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepo extends JpaRepository<Trades,Integer> {
}
