package com.sopping.soppingmall.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Enabled
@Data
@Table(name = "commend_review")
public class Commend_Review {
    //리뷰 댓글
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commend_re_pk;
    @ManyToOne @JoinColumn(name = "commend_re_re_board_fk")
    private Review_Board re_fk;         //리뷰게시판
    @ManyToOne @JoinColumn(name = "commend_re_user_fk")
    private Users User_fk;              //유저
    private String content;             //내용
    private String ip;
    private LocalDateTime writing_date; //날짜
    @Lob
    private Blob file;
    @Column(length = 1) //내용길이
    private String delete;              //삭제

}
