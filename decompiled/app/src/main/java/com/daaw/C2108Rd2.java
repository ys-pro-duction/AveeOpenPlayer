package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Rd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2108Rd2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C2108Rd2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcaz zzcazVarA = ((XX1) this.a).a();
        zzt.zzp();
        return new C8068rz1(UUID.randomUUID().toString(), zzcazVarA, "native", new JSONObject(), false, true);
    }
}
