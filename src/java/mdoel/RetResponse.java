package java.mdoel;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/16 13:35
 * @description
 **/
public class RetResponse {


    private int code;

    private String content;

    public RetResponse() {
    }

    public RetResponse(String content) {
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
