package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.r22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7805r22 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C7805r22(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcaz zzcazVarA = ((XX1) this.a).a();
        JSONObject jSONObject = (JSONObject) this.b.zzb();
        String str = (String) this.c.zzb();
        boolean zEquals = "native".equals(str);
        zzt.zzp();
        return new C8068rz1(UUID.randomUUID().toString(), zzcazVarA, str, jSONObject, false, zEquals);
    }
}
