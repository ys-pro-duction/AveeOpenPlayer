package com.daaw;

/* JADX INFO: renamed from: com.daaw.vT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9042vT0 {
    public final Object a;
    public final Thread b = Thread.currentThread();

    public C9042vT0(Object obj) {
        this.a = obj;
    }

    public Object a() {
        if (b()) {
            return this.a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.b == Thread.currentThread();
    }
}
