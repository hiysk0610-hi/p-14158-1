package com.back.domain.post.post.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.sql.ast.tree.expression.JsonTableColumnDefinition;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter // 자동으로 만들어줌
@Setter // 자동으로 만들어줌
//@AllArgsConstructor 이건 모든 생성자를 받는 어노테이션
//title과 content 만 골라서 받는 생성자가 필요하다 .
@RequiredArgsConstructor // 얘는 final 붙은것만 골라서 해준다.
public class Post {
    @Id //이 컬럼이 PK(기본키)입니다”라고 JPA한테 알려주는 표시
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String title;
    @Column(columnDefinition = "TEXT")
    private  String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}


//@Id → “이게 주민번호야” (기준 지정)
//@GeneratedValue → “주민번호는 자동 발급할게”