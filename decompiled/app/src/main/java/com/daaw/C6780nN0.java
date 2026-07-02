package com.daaw;

/* JADX INFO: renamed from: com.daaw.nN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6780nN0 {
    public float a;
    public float b;

    public C6780nN0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public boolean a(float f, float f2) {
        return this.a == f && this.b == f2;
    }

    public float b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public void d(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public C6780nN0() {
        this(1.0f, 1.0f);
    }
}
