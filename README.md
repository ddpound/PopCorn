POPCORN API 백엔드 프로젝트입니다.


자바 버전 : 11

관리 : 그래들

Jar 패키지

----------------------------------
기본 그래들 의존성
1. Lombok
2. SpringBootDevTools
3. SpringWeb
4. MysqlDriver
5. Thymeleaf
6. SpringSecurity

--------------------------------
추가 의존성

// json (오브젝트 클래스와 관련해서 필수)
    implementation group: 'commons-io', name: 'commons-io', version: '2.6'
    implementation group: 'com.google.code.gson', name: 'gson', version: '2.8.6'
// 대역폭 조절, IP주소 찾아내는것(IP밴할때 필요), log찍어낼때필요
implementation 'com.giffing.bucket4j.spring.boot.starter:bucket4j-spring-boot-starter:0.2.0'