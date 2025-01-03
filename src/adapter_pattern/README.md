### 어댑터 패턴

- 왜 사용하는 것일까?
  - 호환되지 않는 인터페이스를 가진 두 객체를 연결하기 위해
  - 이를 통해 코드의 재사용성을 높일 수 있다
    - 변경 때문에 테스트 깨질 일 없고, 프로그램 검사가 편리
  - 버전업시 용이하게 사용 가능
    - 구버전을 Target 역으로 하고, 신버전을 Adaptee로 하면 신버전만 유지보수가 가능
- 패턴 구현의 핵심요소
  - Target - 필요한 메서드 결정
  - Client - Target의 메서드로 일하는 역할
  - Adaptee - 적응 대상자
  - Adapter - 적응자
- 어댑터 패턴 구현의 종류
  - 상속을 활용한 구현
    - 어댑터가 타겟을 구현하고, 어댑티를 상속받음
  - 위임을 활용한 구현
    - 어댑터가 타겟을 구현하고, 어댑티를 필드로 가짐
  - 어떤 것이 적절한가?
    - 일반적으로 상속보다는 위임이 문제가 적음
      - 상위클래스의 내부 동작을 자세히 모르면 상속 효과적으로 사용 어려워서