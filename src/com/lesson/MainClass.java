package com.lesson;

import com.lesson.controller.AppController;
import com.lesson.view.MainForm;

public class MainClass {

    public static void main(String[] args) {

        new MainForm("Expert System", new AppController());

    }

}
