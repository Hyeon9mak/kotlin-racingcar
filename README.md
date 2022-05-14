# kotlin-racingcar

## 🚀 2단계 - 문자열 계산기

- [x] 사용자가 입력한 문자열 값에 따라 사칙 연산을 수행할 수 있는 계산기를 구현해야 한다.
- [x] 문자열 계산기는 사칙 연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 
  - [x] 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
  - [x] 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
- [x] 덧셈
- [x] 뺄셈
- [x] 곱셈
- [x] 나눗셈
- [x] 입력값이 null이거나 빈 공백 문자일 경우 IllegalArgumentException throw
- [x] 사칙연산 기호가 아닌 경우 IllegalArgumentException throw
- [x] 사칙 연산을 모두 포함하는 기능 구현
- [x] 공백 문자열을 빈 공백 문자로 분리하려면 String 클래스의 split(" ") 메소드를 활용한다. 
- [x] 반복적인 패턴을 찾아 반복문으로 구현한다.
- [x] Parameterized Tests 활용
- [x] 연산자 먼저 시작되는 엣지 케이스
- [x] 연산자와 숫자의 개수가 올바르지 않은 케이스

### 고민

- data class 에 부생성자로 `value: String`을 받은 후 `value: Int`로 변경해서 사용하고 싶었는데 포기
  - data class 에 주생성자 이외 추가 생성자를 만드는건 data class의 의미가 희석되는거 같다..
  - 주생성자를 private하게 가려도 copyOf() 메서드를 통해 노출된다고 IDE가 경고함

<br>

## 3단계 - 자동차 경주
- 초간단 자동차 경주 게임을 구현한다.

- [ ] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- [ ] 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- [x] 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- [ ] 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
- [ ] 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- [ ] 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- [x] UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.

### 고민
- `GasStation#getRandomGas()`는 Random 라이브러리만 사용하므로 테스트 하지 않는다.
  - Random 라이브러리를 직접 테스트하는 것과 같은 상황이므로.

