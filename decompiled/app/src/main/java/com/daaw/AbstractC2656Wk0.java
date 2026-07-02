package com.daaw;

/* JADX INFO: renamed from: com.daaw.Wk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2656Wk0 {
    public static final C2030Qk0 a(boolean z, NQ nq) {
        G10.g(nq, "moduleDeclaration");
        C2030Qk0 c2030Qk0 = new C2030Qk0(z);
        nq.invoke(c2030Qk0);
        return c2030Qk0;
    }

    public static /* synthetic */ C2030Qk0 b(boolean z, NQ nq, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(z, nq);
    }
}
