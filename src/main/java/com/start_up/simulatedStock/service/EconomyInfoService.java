package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.repository.EconomyInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class EconomyInfoService {

    private final EconomyInfoRepository economyInfoRepository;

    // 정보 랜덤 배치 -> 라운드마다 하나씩 뽑아짐


    // 거짓 정보 구현

    // 정보를 토대로 해당 주가의 변동



}
