package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 메인 클래스.
 * SpringBootApplication 으로 인해 스프링부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정된다.
 * SpringBootApplication 이 있는 위치부터 설정을 읽어가기 때문에 항상 프로젝트의 최상단에 위치 해야 한다.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 내장 WAS를 실행한다.
        SpringApplication.run(Application.class, args);
    }
}
