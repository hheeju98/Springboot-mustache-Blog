package site.metacoding.dbproject2.domain.post;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import site.metacoding.dbproject2.domain.user.User;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 300, nullable = false)
    private String title;

    @Lob // CLOB 4GB λ¬Έμ νμ
    @Column(nullable = false)
    private String content;

    @JoinColumn(name = "userId")
    @ManyToOne
    private User user;

    private LocalDateTime createDate;
}