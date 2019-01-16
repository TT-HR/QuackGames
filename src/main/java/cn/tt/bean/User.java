package cn.tt.bean;


import lombok.*;

@Getter@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int uid;
    private String username;
    private String pwd;
    private String img;
}
