package com.daaw;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.q22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7527q22 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C7527q22(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        C6690n22 c6690n22 = (C6690n22) this.a.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        Set setSingleton = ((JSONObject) this.c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new C0623Db2(c6690n22, ps2));
        AbstractC7000o83.b(setSingleton);
        return setSingleton;
    }
}
