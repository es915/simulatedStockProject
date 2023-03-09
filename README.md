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

# 기능
### main 화면
- menu 화면으로 이동
### menu 화면  
- 방 생성하기 버튼 -> 닉네임 입력 후 플레이어 생성, 방 생성
- 방 참여하기 버튼 -> 닉네임 입력과 방 코드 입력 후 플레이어 생성, 방 참여
### gameRoom 화면
- 공통기능 게임 설정 조회, 게임 참여자 리스트 조회(playerDto 로 목록 변환)
- 게임 시작 버튼 클릭시 각 유저별 PlayerInfo, PlayerStock 엔티티 생성
- HOST 일때 게임 설정 버튼 투명화 해제, 게임 시작 버튼 투명화 해제
- 게임 설정 (라운드, 제한시간, 시드머니) 수정 가능
- HOST 일떄, 게임을 나가면 게임방이 폭파됨
- PARTICIPATE 일때, 게임을 나가면 정상적으로 나가짐
