package cn.tt.bean;

import lombok.*;

@Getter@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Games {
    private int gid;
    private float gmoney;
    private String gimg;
    private String gcontext;
    private String sort;
}
