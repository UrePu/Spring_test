package WEBSITENAME;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트 실행하는데 필요한 설정을 세팅해주는 것.
public class Start {
    public static void main(String[] args){ //메인 스레드 메소드
        SpringApplication.run(Start.class);
        //SpringApplication : 스프링 어플리케이션 클래스
                //SpringApplication.run(현재 클래스명.class) ; // 스프링 어플리케이션 실행
    }
}
//Springboot 패키지 구성 규칙
    //* src -> main -> java
    //1. 최상단의 패키지[홈페이지 명]
    //2. SpringBoot 시작 클래스는 최상단(root) 패키지 내에 존재해야하함
    //3. 컨트롤, 서비스, dto,폴더 ,dao 폴더로 구성

//@ : 어노테이션
    //@ vs extends vs Implements
    // extends : 상속 하나의 클래스로부터 클래스 메모리상속 가능
    // Implements : 여러개의 인터페이스 구현
    //@ : 해당 클래스에 메타데이터 [프로그램]주입

//어노테이션
    //1. @SpringBootApplication : 스프링부트 실행 설정 어노테이션
        //1. 스프링부트 실행하는데 기본 설정값 세팅 [MVC 컴포넌트]
        //2. 내장서버(톰캣) 와 클래스 연결
            //내장 서버는 기본 포트번호 8080 [주의: jsp 프로젝트와의 충돌 ]
            //변경: src -> main -> resources -> application.properties 파일
            // server.port = 포트번호

//프론트엔드[ html, js, css 등] 패키지
    //src -> main-> resource
    // -> static : js, css ,img 등의 파일
    // -> templates : html