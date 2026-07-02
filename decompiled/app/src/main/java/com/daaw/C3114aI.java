package com.daaw;

/* JADX INFO: renamed from: com.daaw.aI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3114aI implements GJ {

    /* JADX INFO: renamed from: com.daaw.aI$a */
    public static final class a {
        public static final C3114aI a = new C3114aI();
    }

    public static C3114aI a() {
        return a.a;
    }

    public static String b() {
        return (String) AbstractC7227oy0.c(ZH.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
