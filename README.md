## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 좌표 계산기 


### 1. 연료주입

#### 프로젝트 설명
우리 회사는 렌터카를 운영하고 있다.  
현재 보유하고 있는 차량은 Sonata 2대, Avante 1대, K5 2대로 총 5대의 차량을 보유하고 있다.  
우리 회사는 고객이 인터넷으로부터 예약할 때 여행할 목적지의 대략적인 이동거리를 입력 받는다.  
이 이동거리를 활용해 차량 별로 필요한 연료를 주입한다.

차량 별로 주입해야 할 연료량을 확인할 수 있는 보고서를 생성해야 한다.

각 차량별 연비는 다음과 같다.

```
* Sonata : 10km/리터
* Avante : 15km/리터
* K5 : 13km/리터
```
<br>

#### To-do
- [ ] 자동차를 추상 클래스를 이용해 다형화
  - [ ] car 구현
  - [ ] Sonata, Avante, K5 구현
- [ ] 팩토리메소드를 활용하여 RentCompany 구현
- [ ] UI
  - [ ] 이동 거리 입력
  - [ ] 차량별 예상 연료 레포트 출력