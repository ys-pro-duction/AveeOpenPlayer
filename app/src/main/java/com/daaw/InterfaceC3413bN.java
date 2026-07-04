package com.daaw;

/* JADX INFO: renamed from: com.daaw.bN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3413bN extends InterfaceC5866k7 {

    /* JADX INFO: renamed from: com.daaw.bN$a */
    public static final class a {
        public static float a(InterfaceC3413bN interfaceC3413bN, float f, float f2, float f3) {
            G10.g(interfaceC3413bN, "this");
            return interfaceC3413bN.a(interfaceC3413bN.b(f, f2, f3), f, f2, f3);
        }

        public static C6290ld1 b(InterfaceC3413bN interfaceC3413bN, InterfaceC3626c71 interfaceC3626c71) {
            G10.g(interfaceC3413bN, "this");
            G10.g(interfaceC3626c71, "converter");
            return new C6290ld1(interfaceC3413bN);
        }
    }

    float a(long j, float f, float f2, float f3);

    long b(float f, float f2, float f3);

    float c(float f, float f2, float f3);

    float d(long j, float f, float f2, float f3);
}
