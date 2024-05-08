package cn.guruguru.template.common.exception;


import cn.guruguru.template.common.model.response.code.ICode;
import lombok.Getter;

/**
 * General response exception. Inspired by {@code BizException} and {@code BusinessException}
 */
@Getter
public class Ex extends RuntimeException {

    private static final long serialVersionUID = 7840341868603278283L;

    private final int code;
    private final String message;

    // ~ constructors --------------------

    public Ex(ICode iCode) {
        super(iCode.getMessage());
        this.code = iCode.getCode();
        this.message = iCode.getMessage();
    }

    public Ex(ICode iCode, String overrideMessage) {
        super(overrideMessage);
        this.code = iCode.getCode();
        this.message = overrideMessage;
    }
}
