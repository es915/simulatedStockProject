package com.start_up.simulatedStock.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EconomyInfo extends BaseTime {

    // 종목별 인포메이션
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "economy_info_id")
    private Long id;

    @Column(nullable = false)
    private EconomyInfoState economyInfoState; // 호재, 악재

    @Column(nullable = false)
    private String description; // 정보의 내용

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stock_id")
    private Stock stock; // 연결된 종목

    public EconomyInfo createInfos(String description, EconomyInfoState economyInfoState, Stock stock) {
        return new EconomyInfo(description, economyInfoState, stock);
    }

    private EconomyInfo(String description, EconomyInfoState economyInfoState, Stock stock) {
        this.description = description;
        this.economyInfoState = economyInfoState;
        this.stock = stock;
    }
}
