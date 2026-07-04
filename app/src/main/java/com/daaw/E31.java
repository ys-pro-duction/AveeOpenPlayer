package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class E31 implements GJ {

    public static final class a {
        public static final E31 a = new E31();
    }

    public static E31 a() {
        return a.a;
    }

    public static InterfaceC6333lm c() {
        return (InterfaceC6333lm) AbstractC7227oy0.c(C31.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6333lm get() {
        return c();
    }
}
