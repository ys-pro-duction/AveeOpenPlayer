package com.daaw;

/* JADX INFO: renamed from: com.daaw.dI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3950dI implements GJ {

    /* JADX INFO: renamed from: com.daaw.dI$a */
    public static final class a {
        public static final C3950dI a = new C3950dI();
    }

    public static C3950dI a() {
        return a.a;
    }

    public static YH c() {
        return (YH) AbstractC7227oy0.c(ZH.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public YH get() {
        return c();
    }
}
