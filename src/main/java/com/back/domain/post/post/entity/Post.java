package com.back.domain.post.post.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter // 자동으로 만들어줌
@Setter // 자동으로 만들어줌
public class Post {
    @Id //이 컬럼이 PK(기본키)입니다”라고 JPA한테 알려주는 표시
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;

}


//@Id → “이게 주민번호야” (기준 지정)
//@GeneratedValue → “주민번호는 자동 발급할게”