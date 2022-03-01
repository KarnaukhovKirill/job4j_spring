package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ConsoleInput ci = context.getBean(ConsoleInput.class);
        ui.add(ci.askStr("Ваше имя?"));
        ui.add(ci.askStr("Ваша фамилия?"));
        StartUI anotherUi = context.getBean(StartUI.class);
        ConsoleInput anotherIn = context.getBean(ConsoleInput.class);
        anotherUi.add(anotherIn.askStr("Другое имя?"));
        ui.print();
    }
}
