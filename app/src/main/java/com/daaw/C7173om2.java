package com.daaw;

/* JADX INFO: renamed from: com.daaw.om2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7173om2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;

    public C7173om2(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((LX1) this.a).a().getPackageName();
        AbstractC7000o83.b(packageName);
        return packageName;
    }
}
