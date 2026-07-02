package com.daaw;

/* JADX INFO: renamed from: com.daaw.j01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5551j01 implements InterfaceC6045km {
    public static C5551j01 a;

    public static C5551j01 b() {
        if (a == null) {
            a = new C5551j01();
        }
        return a;
    }

    @Override // com.daaw.InterfaceC6045km
    public long a() {
        return System.currentTimeMillis();
    }
}
