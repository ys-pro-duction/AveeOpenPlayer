package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class AN0 implements GJ {
    public final InterfaceC7290pB0 a;

    public AN0(InterfaceC7290pB0 interfaceC7290pB0) {
        this.a = interfaceC7290pB0;
    }

    public static AbstractC9018vN0 a(InterfaceC6333lm interfaceC6333lm) {
        return (AbstractC9018vN0) AbstractC7227oy0.c(AbstractC10134zN0.a(interfaceC6333lm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AN0 b(InterfaceC7290pB0 interfaceC7290pB0) {
        return new AN0(interfaceC7290pB0);
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC9018vN0 get() {
        return a((InterfaceC6333lm) this.a.get());
    }
}
