package com.back.domain.post.post.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.sql.ast.tree.expression.JsonTableColumnDefinition;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter // 자동으로 만들어줌
@Setter // 자동으로 만들어줌
//@AllArgsConstructor 이건 모든 생성자를 받는 어노테이션
//title과 content 만 골라서 받는 생성자가 필요하다 .
//@RequiredArgsConstructor // 얘는 final 붙은것만 골라서 해준다.
@NoArgsConstructor
public class Post {
    @Id //이 컬럼이 PK(기본키)입니다”라고 JPA한테 알려주는 표시
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final int id = 0; // id는 값이 변하지 말아야 한다. 그치만 RequiredArgsConstructor 붙일 수 없어서 =0을 넣어줌으로써 사용 가능하다.
    private LocalDateTime createDate;
    private LocalDateTime modifyteDate;
    private String title; // 제목과 내용은 수정이 가능하니깐 final 붙이지 않는게 좋다.
    @Column(columnDefinition = "TEXT")
    private String content;

    public Post(String title, String content) {
        this.createDate = LocalDateTime.now();
        this.modifyteDate = this.createDate;
        this.title = title;
        this.content = content;
    }//1️⃣ title, content 👉 외부에서 받아야 하는 값 ⭕
//👉 사용자가 입력하는 값 그래서 매개변수로 받는 게 맞음
// createDate 👉 자동 생성 ⭕
}



//@Id → “이게 주민번호야” (기준 지정)
//@GeneratedValue → “주민번호는 자동 발급할게”