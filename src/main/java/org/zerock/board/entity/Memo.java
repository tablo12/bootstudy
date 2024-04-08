package org.zerock.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_memo")   // db 테이블 명을 지정
@ToString   // 객체가 아닌 문자로
@Getter
@Builder    // 메서드.필드(값).builder; (빌더 패턴)
// @AllArgsConstructor, @NoArgsConstructor 두가지 필수
//@AllArgsConstructor   (new 클래스(모든필드 값 파라미터로 만듬)
//@NoArgsConstructor    (new 클랙스(); )
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
    // 엔티티는 데이터베이스에 테이블과 필드를 생성시켜 관리하는 객체
    // 엔티티를 이용해서 jpa를 활성화 하려면 application.properties 에 필수 항목 추가
    @Id // 기본키를 명시
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 스트래터지(방법, 계략)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
