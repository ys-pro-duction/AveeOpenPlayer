package com.daaw;

/* JADX INFO: renamed from: com.daaw.Mx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1644Mx0 extends C1437Kx0 {
    public final Object c;

    public C1644Mx0(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // com.daaw.C1437Kx0, com.daaw.InterfaceC1229Ix0
    public boolean a(Object obj) {
        boolean zA;
        G10.g(obj, "instance");
        synchronized (this.c) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // com.daaw.C1437Kx0, com.daaw.InterfaceC1229Ix0
    public Object b() {
        Object objB;
        synchronized (this.c) {
            objB = super.b();
        }
        return objB;
    }
}
