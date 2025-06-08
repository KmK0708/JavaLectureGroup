# 🍵 JavaLectureGroup
2025 자바 예제 모음집입니다.<br>
기초 문법부터 실습 예제까지 포함되어 있습니다.

## 🧭 학습 목적

- 자바 문법과 구조를 확실히 이해하고,  
- 실전 프로젝트에 응용할 수 있도록 기초를 다지는 것이 목표입니다.

## ☕ 0507Ex
[자바개요](https://gold-century-3b0.notion.site/43-JAVA-05-07-9-1ec3bfade93280a9818ac99e6a65fb0e)</br>
자바의 문법에 대해 설명하는 몇가지 예제</br>
- [상수선언](Java_0507EX/Test/src/mypack/CircleArea.java)
- [형변환](Java_0507EX/Test/src/mypack/TypeConversion.java)
- [Scanner입출력](Java_0507EX/Test/src/mypack/ScannerEx.java)

자바의 데이터 타입 (int , float , double , boolean 등..)</br>
자바에서의 입력(Scanner), 출력(print)</br>

## ☕ 0513Ex
[자바의 연산자와 제어문 그리고 배열에 대해](https://gold-century-3b0.notion.site/46-JAVA-05-13-10-1f23bfade93280a4b51efd11189b8a05)</br>
자바에서의 연산자와 제어문 그리고 반복문에 대한 여러가지 예제들<br>
자바의 배열은 어떤건가에 대한 설명과 예제</br>
- [자바의 연산자 사용1](Java_0513EX/JV_0513/src/JV_0513Pack/Yeonsanja01.java)
- [자바의 연산자 사용2](Java_0513EX/JV_0513/src/JV_0513Pack/Yeonsanja02.java)
- [자바의 연산자 사용3](Java_0513EX/JV_0513/src/JV_0513Pack/Yeonsanja03.java)
- [반복-for문](Java_0513EX/JV_0513/src/JV_0513Pack/For문01.java)
- [반복-while문](Java_0513EX/JV_0513/src/JV_0513Pack/while문예제01.java)
- [제어-if문](Java_0513EX/JV_0513/src/JV_0513Pack/If_Ex01.java)
- [제어-switch문](Java_0513EX/JV_0513/src/JV_0513Pack/SwitchEx01.java)
- [배열-Array예제](Java_0513EX/JV_0513/src/JV_0513Pack/Array예제01.java)
- [배열-2차원배열](Java_0513EX/JV_0513/src/JV_0513Pack/Array_2차원배열예제.java)

## ☕ 0519Ex
[자바의 클래스와 상속](https://gold-century-3b0.notion.site/JAVA-05-19-11-1f83bfade93280ffb7c3d42a6188f456)</br>
<strong>자바의 클래스와 객체 예제</strong></br>
클래스(Class) : 객체를 만들기 위한 설계도</br>
객체(Object) : 클래스로부터 생성된 실체 (인스턴스)</br>
<strong>자바의 클래스 상속</strong></br>
상위 클래스(부모)의 속성과 메소드를 하위 클래스(자식)가 물려받음</br>
코드 재사용, 계층적 구조 가능</br>
- [자바의 상속](Java_0519Ex/JV_0519/src/JV_0519Pack/상속예제01.java)
- [자바의 스태틱](Java_0519Ex/JV_0519/src/JV_0519Pack/Static예제.java)
- [자바의 객체생성과사용](Java_0519Ex/JV_0519/src/JV_0519Pack/Circle.java)
- [자바의 객체의배열생성](Java_0519Ex/JV_0519/src/JV_0519Pack/Obj_array.java)
- [자바의 클래스생성과 생성자](Java_0519Ex/JV_0519/src/JV_0519Pack/Book.java)

## ☕ 0520Ex
[오버라이딩,추상클래스,모듈과 패키지](https://gold-century-3b0.notion.site/JAVA-05-20-11-1f83bfade93280a3a97aec04c1a501ef?pvs=74)</br>
### 자바의 오버라이딩
- **부모 클래스에서 정의한 메소드를 자식 클래스에서 재정의**하는 것
- 이름, **매개변수, 반환 타입 모두 동일하게** 작성해야 함
- 메소드 무시하기, 덮어쓰기로 번역되기도 함
- [오버라이딩](Java_0520Ex/src/JV_0520Pack/메소드오버라이딩예제01.java)
- [오버라이딩 활용](Java_0520Ex/src/JV_0520Pack/오버라이딩활용01.java)
### 추상 클래스란?
- **하나 이상의 추상 메소드**를 포함하는 클래스
- 직접 객체 생성 불가 (`new` 불가)
- 일부 메소드는 구현 없이 "틀만" 정의 (`abstract` 메소드)
- [추상클래스](Java_0520Ex/src/JV_0520Pack/추상클래스예제.java)

### 인터페이스 (interface)
- **모든 메소드는 추상 메소드** (구현 X)
- **`implements` 키워드로 구현**
- 자식 클래스(구현 클래스)는 **인터페이스의 모든 메소드를 반드시 구현해야 함**
- 다중 인터페이스 구현 가능 (자바에서 유일한 다중 상속 형태)
- [인터페이스예제1](Java_0520Ex/src/JV_0520Pack/인터페이스예제01.java)
- [인터페이스예제2](Java_0520Ex/src/JV_0520Pack/인터페이스예제02.java)
<strong>자바의 모듈과 패키지</strong></br>
