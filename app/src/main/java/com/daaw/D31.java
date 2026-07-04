package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class D31 implements GJ {

    public static final class a {
        public static final D31 a = new D31();
    }

    public static D31 a() {
        return a.a;
    }

    public static InterfaceC6333lm b() {
        return (InterfaceC6333lm) AbstractC7227oy0.c(C31.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6333lm get() {
        return b();
    }
}
