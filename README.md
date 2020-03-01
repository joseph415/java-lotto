# java-lotto
로또 미션 진행을 위한 저장소

## 기능 목록

- [x] 구입 금액 입력받기
    - 로또 한장 당 가격은 1000원
    - 예외처리
        - [x] 1000원 미만 입력시 재입력        
        - [x] 정수외의 다른 값 입력할 경우 재입력
        - [x] 음수인 경우
    - [x] 총 몇장을 구매할수 있는지 로또 총 티켓의 개수 구하는 기능
    - [x] 천원 단위가 아닌 나머지 금액은 반환하는 기능
   
- [x] 수동으로 몇개의 티켓을 발권할지 입력 받는 기능
    - 예외처리
        - [x] 구매 가능 티켓보다 많은 수를 입력할 경우 재입력
        - [x] 정수외의 다른 값 입력할 경우 재입력
        - [x] 음수인 경우
- [x] 로또 티켓 수를 관리하는 객체 생성
    - 예외처리
        - [x] 정수외의 다른 값 입력할 경우 재입력
        - [x] 음수인 경우
    - [x] 카운트를 리턴하는 기능
    - [x] 전체에서 수동발권 개수를 빼는 기능
- [x] 수동으로 로또 티켓 입력 받는 기능
    - 예외처리
        - [x] 정수외의 다른 값 입력할 경우 재입력
        - [x] 음수인 경우
        - [x] 로또 번호(1~45)이외의 값 들어올 경우 재입력
        - [x] 중복된 번호 
- [x] 개수에 맞춰 로또 발급
    - 예외처리 
        - [x] 로또번호가 7개 이상일 경우 예외 발생
    - 로또 번호는 자동으로 생성
    
- [x] 당첨 번호 입력받기
    - 예외처리
        - [x] 정수외의 다른 값 입력할 경우 재입력
        - [x] 음수인 경우
        - [x] 로또 번호(1~45)이외의 값 들어올 경우 재입력
        - [x] 중복된 번호
- [x] 보너스 번호 입력받기
    - 예외처리
        - [x] 정수외의 다른 값 입력할 경우 재입력
        - [x] 음수인 경우
        - [x] 로또 번호(1~45)이외의 값 들어올 경우 재입력
        - [x] 중복된 번호
- [x] 당첨번호와 로또 티켓을 비교하는 기능 구현

- [x] 당첨 등수 구하는 기능 구현
- [x] 각 랭크에 대한 개수 구하는 기능 구현
- [ ] 자동으로 발급 받은과 수동으로 입력 받은 티켓 모두 출력
- [ ] 당첨 통계 출력
- [ ] 수익률 출력

## 프로그램 요구사항

- indent(인덴트, 들여쓰기) depth를 2단계에서 1단계로 줄여라.
    - depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. 
    if문 안에 while문을 사용한다면 depth가 2단계가 된다.
- else를 사용하지 마라.
- 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
- method가 한 가지 일만 하도록 최대한 작게 만들어라.
- 배열 대신 ArrayList를 사용한다.
- enum을 적용해 프로그래밍을 구현한다.
- 예외가 발생하는 부분에 대해 자바 Exception을 적용해 예외처리한다.
- 사용자가 입력한 값에 대한 예외 처리를 철저히 한다.