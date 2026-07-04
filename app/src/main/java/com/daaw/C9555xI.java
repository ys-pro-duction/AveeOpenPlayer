package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.xI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9555xI implements GJ {

    /* JADX INFO: renamed from: com.daaw.xI$a */
    public static final class a {
        public static final C9555xI a = new C9555xI();
    }

    public static C9555xI a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) AbstractC7227oy0.c(AbstractC9276wI.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
