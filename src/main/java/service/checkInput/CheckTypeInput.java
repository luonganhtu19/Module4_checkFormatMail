package service.checkInput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckTypeInput {
    //    Java email validation permitted by RFC 5322
    private final String EMAIL_REGEX= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    // float in java
    private final String INPUT_NUMBER_FLOAT="^[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)$";

    // number Inter
    private final String INPUT_NUMBER="[0-9]+";

    //    YYYY-MM-DD (within the range 1600-2999 year)
    private final String INPUT_DATE="^((?:(?:1[6-9]|2[0-9])\\d{2})(-)(?:(?:(?:0[13578]|1[02])(-)31)|((0[1,3-9]|1[0-2])(-)(29|30))))$|^(?:(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00)))(-)02(-)29)$|^(?:(?:1[6-9]|2[0-9])\\d{2})(-)(?:(?:0[1-9])|(?:1[0-2]))(-)(?:0[1-9]|1\\d|2[0-8])$";

    private Pattern pattern;
    private Matcher matcher;
    public  CheckTypeInput(){};
    public  boolean validate(String typeInput, String regex){
        switch (typeInput){
            case "email":
                pattern=Pattern.compile(EMAIL_REGEX);
                break;
            case "number":
                pattern=Pattern.compile(INPUT_NUMBER);
                break;
            case "float":
                pattern=Pattern.compile(INPUT_NUMBER_FLOAT);
                break;
            case "date":
                pattern=Pattern.compile(INPUT_DATE);
                break;
        }
        matcher= pattern.matcher(regex);
        boolean result= matcher.matches();
        return result;
    };
}
