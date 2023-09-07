package person.chy.domain.vo;

import lombok.Data;

/**
 * 返回前端信息
 */
@Data
public class ModelMessage {
    private Integer code = 1;
    private String msg = "登录成功~~";
    private Object object;
}
