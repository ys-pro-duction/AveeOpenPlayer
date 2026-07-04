package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class F80 extends Error {
    public F80() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public F80(String str) {
        super(str);
    }
}
