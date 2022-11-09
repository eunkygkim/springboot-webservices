package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController
 * - JSON을 반환하는 컨트롤러로 만들어준다.
 * - @ ResponseBody 를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 한다.
 */
@RestController
public class HelloController {
    /**
     * Http Method 중 Get 의 요청을 받아들인다.
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
