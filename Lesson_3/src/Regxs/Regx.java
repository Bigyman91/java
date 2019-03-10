package Regxs;

import java.util.Scanner;

import static Regxs.Conditions.fistCondition;
import static Regxs.Conditions.secondCondition;
import static Regxs.Conditions.thirdCondition;
import static Regxs.Conditions.fourthCondition;
import static Regxs.Conditions.superCondition;

public class Regx {
    public static void main(String[] args) {
        System.out.println(
                "Придумайте пароль (от 8 до 20 символов , " +
                        "должен содержать минимум 1 цифру, " +
                        "верхний и нижний регистры, " +
                        "минимум 1 спец символ)");
        Scanner scn = new Scanner(System.in);
        String password = scn.nextLine();
        if (!fistCondition(password)) {
            System.out.println("пароль должен содержать от 8 до 20 символов");
        } else System.out.println("ok");
        if (!secondCondition(password)) {
            System.out.println("пароль должен содержать хотя бы 1 цифру");
        } else System.out.println("ok");
        if (!thirdCondition(password)) {
            System.out.println("пароль должен содержать нижние и верхние регистры ");
        } else System.out.println("ok");
        if (!fourthCondition(password)) {
            System.out.println("пароль должен содержать спец символ");
        } else System.out.println("ok");
        superCondition(password);
    }


}


