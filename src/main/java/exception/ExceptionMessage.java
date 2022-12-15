package exception;

public enum ExceptionMessage {
    LONG_NAME_ERROR("이름은 5자 이하만 가능합니다."),
    NON_ALP_ERROR("영어로 이름을 지어야 합니다."),
    NO_NUM_ERROR("숫자만 입력해야 합니다.");

    String error;
    ExceptionMessage(String error){
        this.error = "[ERROR] " +  error;
    }
}
