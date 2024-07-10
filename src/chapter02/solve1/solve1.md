## 옵저버 패턴
- 정의 : 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의
- 구조 : Subject - Observer
  - Subject 인터페이스
    - registerObserver() - 옵저버 등록
    - removeObserver() - 옵저버 제거
    - notifyObserver() - 모든 옵저버에게 변경 내용 호출
  - Observer 인터페이스
    - update() - observer 에게 상태를 전달할 때 호출