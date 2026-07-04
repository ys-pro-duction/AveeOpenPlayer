package com.daaw;

/* JADX INFO: renamed from: com.daaw.hx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5259hx {
    public static final boolean a = I01.f("kotlinx.coroutines.main.delay", false);
    public static final InterfaceC10301zy b = b();

    public static final InterfaceC10301zy a() {
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC10301zy b() {
        if (!a) {
            return RunnableC4980gx.J;
        }
        AbstractC2948Zf0 abstractC2948Zf0C = C7850rC.c();
        return (AbstractC3774cg0.c(abstractC2948Zf0C) || !(abstractC2948Zf0C instanceof InterfaceC10301zy)) ? RunnableC4980gx.J : (InterfaceC10301zy) abstractC2948Zf0C;
    }
}
