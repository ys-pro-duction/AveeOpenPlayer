package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class JL extends Exception {
    public JL() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JL(String str) {
        super(str);
        AbstractC7506py0.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JL(String str, Throwable th) {
        super(str, th);
        AbstractC7506py0.g(str, "Detail message must not be empty");
    }
}
