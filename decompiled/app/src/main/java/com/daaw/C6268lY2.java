package com.daaw;

/* JADX INFO: renamed from: com.daaw.lY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6268lY2 extends RuntimeException {
    public C6268lY2(String str) {
        super(str);
    }

    public static Object a(InterfaceC5980kY2 interfaceC5980kY2) {
        try {
            return interfaceC5980kY2.zza();
        } catch (Exception e) {
            throw new C6268lY2(e);
        }
    }

    public C6268lY2(String str, Throwable th) {
        super("Creating a protokey serialization failed", th);
    }

    public C6268lY2(Throwable th) {
        super(th);
    }
}
