package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ef1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0742Ef1 {
    public final String a;
    public final boolean b;

    public AbstractC0742Ef1(String str, boolean z) {
        G10.g(str, "name");
        this.a = str;
        this.b = z;
    }

    public Integer a(AbstractC0742Ef1 abstractC0742Ef1) {
        G10.g(abstractC0742Ef1, "visibility");
        return C0525Cf1.a.a(this, abstractC0742Ef1);
    }

    public String b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final String toString() {
        return b();
    }

    public AbstractC0742Ef1 d() {
        return this;
    }
}
