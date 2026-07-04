package com.daaw;

/* JADX INFO: renamed from: com.daaw.h83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5037h83 implements InterfaceC4758g83, V73 {
    public static final C5037h83 b = new C5037h83(null);
    public final Object a;

    public C5037h83(Object obj) {
        this.a = obj;
    }

    public static InterfaceC4758g83 a(Object obj) {
        AbstractC7000o83.a(obj, "instance cannot be null");
        return new C5037h83(obj);
    }

    public static InterfaceC4758g83 b(Object obj) {
        return obj == null ? b : new C5037h83(obj);
    }

    @Override // com.daaw.InterfaceC8394t83
    public final Object zzb() {
        return this.a;
    }
}
