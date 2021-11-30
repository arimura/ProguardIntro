package com.example.proguardintro.foo;

public class Hoge {
    public void hogeMethod(){
        InnerHoge hoge = new InnerHoge();
        hoge.innnerHogeMethod();
    }

    public static class InnerHoge {
        public void innnerHogeMethod(){
        }
    }
}
