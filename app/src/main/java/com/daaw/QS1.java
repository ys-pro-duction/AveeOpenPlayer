package com.daaw;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class QS1 {
    public BigInteger a = BigInteger.ONE;
    public String b = "0";

    public final synchronized String a() {
        String string;
        string = this.a.toString();
        this.a = this.a.add(BigInteger.ONE);
        this.b = string;
        return string;
    }

    public final synchronized String b() {
        return this.b;
    }
}
