package com.daaw;

/* JADX INFO: renamed from: com.daaw.Nd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1668Nd0 {
    public static boolean a(InterfaceC2420Ud0 interfaceC2420Ud0, EnumC9633xb0 enumC9633xb0) {
        int iC = enumC9633xb0.c();
        if (iC == 0) {
            return interfaceC2420Ud0.b();
        }
        if (iC == 10) {
            return interfaceC2420Ud0.a();
        }
        if (iC == 20) {
            return interfaceC2420Ud0.e();
        }
        if (iC == 30) {
            return interfaceC2420Ud0.c();
        }
        if (iC == 40) {
            return interfaceC2420Ud0.d();
        }
        throw new IllegalArgumentException("Level [" + enumC9633xb0 + "] not recognized.");
    }
}
