# 기능
- 유저 생성
  - 호스트 유저는 닉네임만 받아 생성됨
  - 참가자 유저는 닉네임과 들어갈 게임방의 코드를 받아 생성됨
- 게임방 생성
  - 게임방 생성은 호스트 유저가 생성될때 같이 생성됨
  - 게임 설정은 디폴트 값으로 생성이 있음
  - 비밀 코드는 자동으로 생성됨
- 게임방 세부 기능
  - 되며, + - 버튼으로 조정할수 있음
  - 게임 시작 버튼은 호스트만 누를수 있으며, 게임설정 또한 호스트만 설정 가능
  - 호스트가 게임을 나가면 게임 방 자체가 폭파되며, 참가자는 그냥 삭제됨
- 게임 시작 기능
  - 호스트가 게임 시작 버튼을 누르면, 참여한 유저들의 각각 유저 인포가 생성되고,
각 유저들의 주식판이 생성됨
  - 게임방에서 공통으로 사용되는 주식판이 생성되고
  - 각 주식마다 상세정보고 생성된다


# Entity
- BaseTime : 생성일자, 수정일자 자동 기입 
- Player : 플레이어
- PlayerInfo : 플레이어의 총 손익률, 자본금, 보유 종목
- PlayerStock : 보유 종목 각각의 토탈 금액, 손익률
- Room : 게임 참여 인원 리스트, 게임 설정 값
- Stock : 주식 종목들
- StockDetail : 주식 종목 세부 사항
- EconomyInfo : 종목별 정보

## Entity 연관관계


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

# 로컬DB 연결 방법
- https://gyuwon95.tistory.com/167 링크 접속
- 스키마 추가에서  이름을 simulated_stock 로 하고, Charset을 UTF-8로 맞춘다 Collation은 default로 남김
- Users and Privileges 옵션에서 user add account 버튼 클릭
- user name 을 investor 이라고 설정하고 비밀번호는 공백으로 남긴다
- Mysql Connection 이름도 simulated_stock 으로 설정한다
