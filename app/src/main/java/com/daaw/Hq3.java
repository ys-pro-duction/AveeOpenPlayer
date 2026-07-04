package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class Hq3 extends Yr3 {
    public final Callable f;

    public /* synthetic */ Hq3(Callable callable, Zp3 zp3) {
        super();
        this.f = callable;
    }

    @Override // com.daaw.Yr3
    public final String a() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
