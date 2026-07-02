package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Ds3 {
    public final int a;
    public final C3220ag3[] b;
    public final InterfaceC9442ws3[] c;
    public final C6844nc2 d;
    public final Object e;

    public Ds3(C3220ag3[] c3220ag3Arr, InterfaceC9442ws3[] interfaceC9442ws3Arr, C6844nc2 c6844nc2, Object obj) {
        this.b = c3220ag3Arr;
        this.c = (InterfaceC9442ws3[]) interfaceC9442ws3Arr.clone();
        this.d = c6844nc2;
        this.e = obj;
        this.a = c3220ag3Arr.length;
    }

    public final boolean a(Ds3 ds3, int i) {
        return ds3 != null && AbstractC9004vJ2.e(this.b[i], ds3.b[i]) && AbstractC9004vJ2.e(this.c[i], ds3.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
