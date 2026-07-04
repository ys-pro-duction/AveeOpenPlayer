package com.daaw;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class R72 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;

    public R72(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    public static Q72 b(Set set) {
        return new Q72(set);
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q72 zzb() {
        return new Q72(((C7836r83) this.a).zzb());
    }
}
