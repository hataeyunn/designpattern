# Jsoup 설계 개선 및 기능 확장

---

2019 Design Pattern Class Team 4

- Java Html Parser Jsoup의 설계를 개선하고 새로운 기능을 확장합니다.
- Junit을 이용하여 테스트하여 설계 개선 후, Html 파싱 기능이 잘 작동하는지 테스트합니다.

---

## 설계 개선 내용

1. Visitor 패턴 적용
   * Node 클래스에 Visitor 패턴을 적용하여 공통된 기능을 응집하고 확장이 용이하게 변경.
2. Factory 패턴 적용
   * MakeFactory 클래스를 정의하여, Factory 클래스를 통해 Node 생성.
3. Builder 패턴 적용
   * Builder Abstract 클래스를 정의하여, builder와 director을 통해 객체를 생성.

---

## 확장 기능

1) html 으로 파싱한 문서를 md 파일로 자동 변환 ( Visitor 패턴 확장 기능 )

2) html 파일에 포함된 이미지 문서를 로컬 스토리지에 파싱시 자동으로 저장 ( Factory 패턴 확장 기능 )
