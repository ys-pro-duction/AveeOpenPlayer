package com.daaw;

/* JADX INFO: renamed from: com.daaw.t00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8351t00 implements GJ {
    public static final C8351t00 b = new C8351t00(null);
    public final Object a;

    public C8351t00(Object obj) {
        this.a = obj;
    }

    public static GJ a(Object obj) {
        return new C8351t00(AbstractC7227oy0.c(obj, "instance cannot be null"));
    }

    @Override // com.daaw.InterfaceC7290pB0
    public Object get() {
        return this.a;
    }
}
