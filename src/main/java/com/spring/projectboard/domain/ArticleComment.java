package com.spring.projectboard.domain;

import java.time.LocalDateTime;

// 댓글
public class ArticleComment {
    private Long id;
    private String title;
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
