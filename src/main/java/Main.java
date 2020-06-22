import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String[] roles = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!",
        "Артемий Филиппович: Вот не было заботы, так подай!",
        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        //Твой код здесь
        StringBuilder text = new StringBuilder();
        for (String names: roles) {
            text.append(names).append(":").append("\n");
            for (int i = 0; i < textLines.length; i++){
                if (textLines[i].startsWith(names+":")){
                    text.append(i+1).append(")")
                            .append(textLines[i].substring(textLines[i].indexOf(":")+1));
                    text.append("\n");
                }
            }
            text.append("\n");
        }
        return text.substring(0);
    }
}