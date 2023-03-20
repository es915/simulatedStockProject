package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.EconomyInfo;
import com.start_up.simulatedStock.domain.Room;
import com.start_up.simulatedStock.domain.Stock;
import com.start_up.simulatedStock.repository.EconomyInfoRepository;
import com.start_up.simulatedStock.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class EconomyInfoService {

    private final EconomyInfoRepository economyInfoRepository;
    private final StockRepository stockRepository;

    // 종목별 정보 리스트 뽑아오기
    public List<EconomyInfo> findStockInfo(String stockName) {
        List<EconomyInfo> economyInfos = economyInfoRepository.findAllByStock(stockName); // A엔터 정보들을 가져옴
        Stock stock = findStock(stockName); // A엔터 종목을 가져옴

        // 정보 랜덤으로 섞기
        Collections.shuffle(economyInfos);

        for (EconomyInfo info : economyInfos) {
            stock.setInfos(info); // 정보를 객체에 하나하나씩 넣음
        }
        return stock.getEconomyInfo();
    }

    // 거짓 정보 구현
//    public List<EconomyInfo> makefalseInfo(List<EconomyInfo> infos) {
//        int size = infos.size();
//        Random rand = new Random();
//        for(int i = 0 ; i < 10 ; i++) {
//            System.out.println("RAND 결과값 : " + rand.nextInt(30)); // 0~29
//        }
//
//    }


    // 정보를 토대로 해당 주가의 변동


    private Stock findStock(String stockName) {
        Optional<Stock> stock = stockRepository.findByStockName(stockName);
        if(stock.isPresent()) {
            return stock.get();
        } else {
            throw new IllegalStateException("종목이 존재하지 않음.");
        }
    }
}
