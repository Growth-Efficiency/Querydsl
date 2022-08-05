package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class MemberDto {
    private String username;
    private int age;

    public MemberDto() {
    }

    // @QueryProjection : QuertDsl의 라이브러리를 사용하기 때문에 나중에 다른 sql로 바꾸면 영향을 받음. (QueryDsl에서 다른거로 바꿀일 없으면 상관없긴함.)
    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
