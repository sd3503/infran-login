package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {
    private Long id;
    @NotEmpty
    private String loginId; //loginId
    @NotEmpty
    private String name; //name
    @NotEmpty
    private String password;
}
