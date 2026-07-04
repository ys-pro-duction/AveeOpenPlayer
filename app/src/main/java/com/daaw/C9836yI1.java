package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.yI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9836yI1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        if (interfaceC9334wW1.g() != null) {
            interfaceC9334wW1.g().zza();
        }
        zzl zzlVarC = interfaceC9334wW1.c();
        if (zzlVarC != null) {
            zzlVarC.zzb();
            return;
        }
        zzl zzlVarK = interfaceC9334wW1.k();
        if (zzlVarK != null) {
            zzlVarK.zzb();
        } else {
            AbstractC4274eT1.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
