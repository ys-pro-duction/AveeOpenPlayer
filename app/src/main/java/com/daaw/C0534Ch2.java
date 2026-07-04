package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ch2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0534Ch2 implements InterfaceC2850Yg2 {
    public static final C0534Ch2 b = new C0534Ch2(null);
    public final Object a;

    public C0534Ch2(Object obj) {
        this.a = obj;
    }

    public static InterfaceC2850Yg2 a(Object obj) {
        if (obj != null) {
            return new C0534Ch2(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.daaw.InterfaceC1483Li2
    public final Object zzb() {
        return this.a;
    }
}
