# Entity
- BaseTime : 생성일자, 수정일자 자동 기입 
- Player : 플레이어
- PlayerInfo : 플레이어의 총 손익률, 자본금, 보유 종목
- PlayerStock : 보유 종목 각각의 토탈 금액, 손익률
- Room : 게임 참여 인원 리스트, 게임 설정 값
- Stock : 주식 종목들
- StockDetail : 주식 종목 세부 사항
- EconomyInfo : 종목별 정보
- StockAndPlayerStock : stock, playerStock M:N 관계 풀이 엔티티

# Enum
- PlayerState : Host or Participate
- EconomyInfoState : 호재 or 악재