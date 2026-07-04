package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class N31 extends CancellationException {
    public final transient U30 B;

    public N31(String str, U30 u30) {
        super(str);
        this.B = u30;
    }

    public N31(String str) {
        this(str, null);
    }
}
