package com.company;

public class Main {

    public static String crypt(String text, int shift){
        String crypted = "";
        for (int i = 0; i < text.length(); i++) {
            int index=(int) text.charAt(i); //code ASCII
            int newIndex = index + shift;
            if(index == ' ')newIndex = index;
            if(index == '\n')newIndex = index;
            char cryptedChar = (char) newIndex; //transfor, index to char
            crypted += cryptedChar;
        }
        return crypted;
    }

    public static void main(String[] args) {

	int shift = 250;
	String text = "Сьогодні відбулося позачергове засідання Державної " + "\n"+
            "комісії з питань техногенно-екологічної безпеки та " + "\n"+
            "надзвичайних ситуацій. Комісія вирішила встановити " + "\n"+
            "з 00 години 00 хвилин 01 березня 2020 року \"червоний” " + "\n"+
            "рівень епідемічної небезпеки поширення COVID-19 на " + "\n"+
            "території Чернівецької області та застосувати на " + "\n"+
            "території Чернівецької області обмежувальні " + "\n"+
            "протиепідемічні заходи передбачені для «червоного» " + "\n"+
            "рівня епідемічної небезпеки. Про це у своєму " + "\n"+
            "Телеграм-каналі повідомив Олег Немчінов, Міністр " + "\n"+
            "Кабінету міністрів України.\n" + "\n"+
            "Відтак, на території Буковини діятимуть найжорстікіші " + "\n"+
            "обмеження, рівносильні тим, які запроваджували під " + "\n"+
            "час січневого локдауну.";
        System.out.println(crypt(text, shift));
    }
}
