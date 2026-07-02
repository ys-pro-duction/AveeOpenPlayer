package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class RS0 implements KI0 {
    public final Object a;

    public RS0(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.a = obj;
    }

    @Override // com.daaw.KI0
    public final int a() {
        return 1;
    }

    @Override // com.daaw.KI0
    public final Object get() {
        return this.a;
    }

    @Override // com.daaw.KI0
    public void c() {
    }
}
