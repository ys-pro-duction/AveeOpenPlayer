package com.daaw;

/* JADX INFO: renamed from: com.daaw.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6124l1 implements InterfaceC7519q1 {
    public String a;
    public final int[] b = new int[2];

    public final int[] c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        G10.u("text");
        return null;
    }

    public void e(String str) {
        G10.g(str, "text");
        f(str);
    }

    public final void f(String str) {
        G10.g(str, "<set-?>");
        this.a = str;
    }
}
