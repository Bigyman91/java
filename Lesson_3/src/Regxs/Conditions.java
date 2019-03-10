package Regxs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Conditions {
    public static boolean fistCondition(String str) {
        Pattern p = Pattern.compile("^.{8,20}$");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static boolean secondCondition(String str) {
        Pattern p = Pattern.compile("^.*[0-9].*$");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static boolean thirdCondition(String str) {
        Pattern p = Pattern.compile("^.*[a-zA-Z].*");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static boolean fourthCondition(String str) {
        Pattern p = Pattern.compile("^.*[!@#$%^&*].*$");
        Matcher m = p.matcher(str);
        return m.matches();
    }
    public static void superCondition (String str){
        if (!fistCondition(str)) {
            System.out.println("пароль должен содержать от 8 до 20 символов");
        }else System.out.println("ok");
        if (!secondCondition(str)) {
            System.out.println("пароль должен содержать хотя бы 1 цифру");
        }else System.out.println("ok");
        if (!thirdCondition(str)) {
            System.out.println("пароль должен содержать нижние и верхние регистры ");
        } else System.out.println("ok");
        if (!fourthCondition(str)) {
            System.out.println("пароль должен содержать спец символ");
        } else System.out.println("ok");

    }


}
