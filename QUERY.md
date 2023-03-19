INSERT INTO	stock(stock_name)
VALUES ('A엔터');
INSERT INTO	stock(stock_name)
VALUES ('B엔터');
INSERT INTO	stock(stock_name)
VALUES ('C IT');
INSERT INTO	stock(stock_name)
VALUES ('D IT');
INSERT INTO	stock(stock_name)
VALUES ('E 바이오');
INSERT INTO	stock(stock_name)
VALUES ('F 바이오');
INSERT INTO	stock(stock_name)
VALUES ('G 식품');
INSERT INTO	stock(stock_name)
VALUES ('H 뷰티');
INSERT INTO	stock(stock_name)
VALUES ('I 화학');
INSERT INTO	stock(stock_name)
VALUES ('J 조선');

INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('A엔터 소속 연예인 갑질 논란', 1, economy_info, (SELECT stock_id FROM stock WHERE stock_name='A 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('A엔터 소속 연예인의 학교 폭력 논란', 0, (SELECT stock_id FROM stock WHERE stock_name='A 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('A엔터 대표 한OO 회사 자금 횡령으로 구속 기소', 0, (SELECT stock_id FROM stock WHERE stock_name='A 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('동남아시아에 신한류 바람', 1, (SELECT stock_id FROM stock WHERE stock_name='A 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('해외 유명 가수와 국내 활동 계약 체결', 1, (SELECT stock_id FROM stock WHERE stock_name='A 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('A엔터 소속 배우 이OO 부산 국제영화제에서 남우주연상 수상', 1, (SELECT stock_id FROM stock WHERE stock_name='A 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('소속 보이 그룹 BOO 빌보트 차트 연속 1위 달성', 1, (SELECT stock_id FROM stock WHERE stock_name='A 엔터'));

INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('소속 배우 이OO 마약 투약 혐의', 0, (SELECT stock_id FROM stock WHERE stock_name='B 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('B엔터 소속 연예인 갑질 논란', 0, (SELECT stock_id FROM stock WHERE stock_name='B 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('B엔터 소속 연예인의 학교 폭력 논란', 0, (SELECT stock_id FROM stock WHERE stock_name='B 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('B엔터 대표 한OO 회사 자금 횡령으로 구속 기소', 0, (SELECT stock_id FROM stock WHERE stock_name='B 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('올겨울 최고 기대작 <기생충> 개봉', 1, (SELECT stock_id FROM stock WHERE stock_name='B 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('국내 유명 유튜버 김OO과 계약 체결', 1, (SELECT stock_id FROM stock WHERE stock_name='B 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('브OOO 걸스 군 위문 공연 이슈화', 1, (SELECT stock_id FROM stock WHERE stock_name='B 엔터'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('B엔터에서 투자한 OTT 드라마 큰 흥행', 1, (SELECT stock_id FROM stock WHERE stock_name='B 엔터'));

INSERT INTO economy_info(`description`, economy_info_state, stock_id)
VALUES ('환율 하락으로 인한 수출 부진', 0, (SELECT stock_id FROM stock WHERE stock_name='C IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('새로 개발된 소프트웨어 저작권 논쟁 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='C IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('스마트폰 배터리 발열 및 폭발 사건 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='C IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('데이터센터 화재로 인한 앱 접속 지연 사태 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='C IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('데이터센터 재건축 확정 및 기술 개발 투자 3,000억원 유치', 1, (SELECT stock_id FROM stock WHERE stock_name='C IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('세계 최초로 접히는 스마트폰 출시', 1, (SELECT stock_id FROM stock WHERE stock_name='C IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('해외 기술 수출 계약 체결 공시', 1,(SELECT stock_id FROM stock WHERE stock_name='C IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('원격 수업용 가성비 태블릿PC 출시 및 MZ 세대들에게 이슈화', 1, (SELECT stock_id FROM stock WHERE stock_name='C IT'));

INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('환율 하락으로 인한 수출 부진', 0, (SELECT stock_id FROM stock WHERE stock_name='D IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('새로 개발된 소프트웨어 저작권 논쟁 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='D IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('스마트폰 배터리 발열 및 폭발 사건 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='D IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('데이터센터 화재로 인한 앱 접속 지연 사태 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='D IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('데이터센터 재건축 확정 및 기술 개발 투자 3,000억원 유치', 1, (SELECT stock_id FROM stock WHERE stock_name='D IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('세계 최초로 접히는 스마트폰 출시', 1, (SELECT stock_id FROM stock WHERE stock_name='D IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('해외 기술 수출 계약 체결 공시', 1, (SELECT stock_id FROM stock WHERE stock_name='D IT'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('원격 수업용 가성비 태블릿PC 출시 및 MZ 세대들에게 이슈화', 1, (SELECT stock_id FROM stock WHERE stock_name='D IT'));

INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('신제품에 대한 불법 수출 의혹 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='E 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('E바이오에서 개발한 코로나 19 백신 부작용으로 인한 사망자 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='E 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('항암 치료제 부작용 다수 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='E 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('E바이오 CEO 성OO 회사 자금 횡령으로 구속 기소', 0, (SELECT stock_id FROM stock WHERE stock_name='E 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('E바이오에서 개발한 탈모 치료제의 수요 급증', 1, (SELECT stock_id FROM stock WHERE stock_name='E 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('획기적인 전염병 백신 개발', 1, (SELECT stock_id FROM stock WHERE stock_name='E 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('유럽의약품청(EMA)의 E바이오 개발 백신 승인', 1, (SELECT stock_id FROM stock WHERE stock_name='E 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('자체 개발 코로나 검사 키트 미국 식품의약국(FDA) 승인', 1, (SELECT stock_id FROM stock WHERE stock_name='E 바이오'));

INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('신제품에 대한 불법 수출 의혹 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='F 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('F바이오에서 개발한 코로나 19 백신 부작용으로 인한 사망자 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='F 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('항암 치료제 부작용 다수 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='F 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('F바이오 CEO 성OO 회사 자금 횡령으로 구속 기소', 0, (SELECT stock_id FROM stock WHERE stock_name='F 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('F바이오에서 개발한 탈모 치료제의 수요 급증', 1, (SELECT stock_id FROM stock WHERE stock_name='F 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('획기적인 전염병 백신 개발', 1, (SELECT stock_id FROM stock WHERE stock_name='F 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('유럽의약품청(EMA)의 E바이오 개발 백신 승인', 1, (SELECT stock_id FROM stock WHERE stock_name='E 바이오'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('자체 개발 코로나 검사 키트 미국 식품의약국(FDA) 승인', 1, (SELECT stock_id FROM stock WHERE stock_name='F 바이오'));

INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('조류인플루엔자(AI) 발생으로 계란 수요 감소', 0, (SELECT stock_id FROM stock WHERE stock_name='G 식품'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('전염병 예방을 위한 사회적 거리두기 제도 실시', 0, (SELECT stock_id FROM stock WHERE stock_name='G 식품'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('구제역 발생으로 돼지고기 사용 제품 생산비 상승', 0, (SELECT stock_id FROM stock WHERE stock_name='G 식품'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('태풍으로 인한 곡물 가격 상승', 0, (SELECT stock_id FROM stock WHERE stock_name='G 식품'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('유명 언론사에서 조사한 설문 결과에서 양심적 기업 1위에 선정', 1, (SELECT stock_id FROM stock WHERE stock_name='G 식품'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('예능 프로그램 나 OO 산다의 유명 예능인 전OO과 전속 광고 모델 계약 체결', 1, (SELECT stock_id FROM stock WHERE stock_name='G 식품'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('신제품 컵라면 인기 상승', 1, (SELECT stock_id FROM stock WHERE stock_name='G 식품'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('G식품 MZ 세대를 겨냥하여 개발한 디저트 인기 몰이', 1, (SELECT stock_id FROM stock WHERE stock_name='G 식품'));

INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('광고 전속 모델 박OO 음주운전 후 구속', 0, (SELECT stock_id FROM stock WHERE stock_name='H 뷰티'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)  
VALUES ('H뷰티 화장품 피부 트러블 유발 부작용 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='H 뷰티'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('H뷰티 광고 모델 김OO 음주운전으로 사회적 물의...', 0, (SELECT stock_id FROM stock WHERE stock_name='H 뷰티'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('식약처, H뷰티 화장품 생산 공장 위생 상태 불량 지적', 0, (SELECT stock_id FROM stock WHERE stock_name='H 뷰티'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('유명 모델 광고 계약 성공', 1, (SELECT stock_id FROM stock WHERE stock_name='H 뷰티'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('코로나 종식으로 마스크 착용 의무 해제',1, (SELECT stock_id FROM stock WHERE stock_name='H 뷰티'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('새로운 수출 시장 확보', 1, (SELECT stock_id FROM stock WHERE stock_name='H 뷰티'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('K팝 해외 공연 확대로 국내 외국인 관광객 증가', 1, (SELECT stock_id FROM stock WHERE stock_name='H 뷰티'));

INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('중동 지역 전쟁과 원유 가격 상승으로 석유제품 생산 비용 부담 증가', 0, (SELECT stock_id FROM stock WHERE stock_name='I 화학'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('생산 공정에서 유독성 물질 검출, 노동자 건강 악화 논란 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='I 화학'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('I 화학 CEO 박OO 회사 자금 횡령으로 구속 기소', 0, (SELECT stock_id FROM stock WHERE stock_name='I 화학'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('I 화학 여성 직원 성차별 논란 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='I 화학'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('원자재 가격 하락으로 생산비용 절감', 1, (SELECT stock_id FROM stock WHERE stock_name='I 화학'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('미국 친환경 정책으로 국내 화학 업계 호황', 1, (SELECT stock_id FROM stock WHERE stock_name='I 화학'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('정부가 미세먼지 대책 사업으로 공기정화장치 구매 지원금 지급 정책 실시', 1, (SELECT stock_id FROM stock WHERE stock_name='I 화학'));
INSERT INTO economy_info(economy_info_id, `description`, economy_info_state, stock_id)   
VALUES ('태양광 기술 해외 수출 계약 확정', 1, (SELECT stock_id FROM stock WHERE stock_name='I 화학'));

INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('노사 교섭 결렬 및 노동조합 총파업 예고', 0, (SELECT stock_id FROM stock WHERE stock_name='J 조선'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('고용노동부, J조선 근로기준법 위반 사례 지적', 0, (SELECT stock_id FROM stock WHERE stock_name='J 조선'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('국가인권위, J조선 내 성차별 및 부당해고 사례 개선 권고', 0, (SELECT stock_id FROM stock WHERE stock_name='J 조선'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('J조선 용접 노동자 사망 사고 발생', 0, (SELECT stock_id FROM stock WHERE stock_name='J 조선'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('원자재 가격 하락으로 생산비용 절감', 1, (SELECT stock_id FROM stock WHERE stock_name='J 조선'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('해외 유명 관광 업체와 수출 계약 체결', 1, (SELECT stock_id FROM stock WHERE stock_name='J 조선'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('항공모함사업 개발 사업체로 선정', 1, (SELECT stock_id FROM stock WHERE stock_name='J 조선'));
INSERT INTO economy_info(`description`, economy_info_state, stock_id)   
VALUES ('유럽 5개국과 대량 수출 계약 확정', 1, (SELECT stock_id FROM stock WHERE stock_name='J 조선'));