package com.daaw;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzbuo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.To2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2362To2 extends AbstractBinderC7626qP1 {
    public final Context B;
    public final HA2 C;
    public final FA2 D;
    public final C3543bp2 E;
    public final PS2 F;
    public final C2882Yo2 G;
    public final RP1 H;

    public BinderC2362To2(Context context, HA2 ha2, FA2 fa2, C2882Yo2 c2882Yo2, C3543bp2 c3543bp2, PS2 ps2, RP1 rp1) {
        this.B = context;
        this.C = ha2;
        this.D = fa2;
        this.G = c2882Yo2;
        this.E = c3543bp2;
        this.F = ps2;
        this.H = rp1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.InterfaceFutureC8236sc0 Z2(com.google.android.gms.internal.ads.zzbuo r8, int r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC2362To2.Z2(com.google.android.gms.internal.ads.zzbuo, int):com.daaw.sc0");
    }

    public final void a3(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, InterfaceC8741uP1 interfaceC8741uP1) {
        AbstractC7360pS2.r(AbstractC7360pS2.n(AbstractC4839gS2.C(interfaceFutureC8236sc0), new WR2() { // from class: com.daaw.Qo2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.h(AbstractC5626jG2.a((InputStream) obj));
            }
        }, AbstractC9322wT1.a), new C2258So2(this, interfaceC8741uP1), AbstractC9322wT1.f);
    }

    @Override // com.daaw.InterfaceC7904rP1
    public final void c1(zzbuk zzbukVar, InterfaceC8741uP1 interfaceC8741uP1) {
        C7845rA2 c7845rA2 = new C7845rA2(zzbukVar, Binder.getCallingUid());
        HA2 ha2 = this.C;
        ha2.a(c7845rA2);
        final IA2 ia2Zzb = ha2.zzb();
        YH2 yh2B = ia2Zzb.b();
        C10112zH2 c10112zH2A = yh2B.b(SH2.GMS_SIGNALS, AbstractC7360pS2.i()).f(new WR2() { // from class: com.daaw.Po2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return ia2Zzb.a().a(new JSONObject());
            }
        }).e(new InterfaceC9554xH2() { // from class: com.daaw.Oo2
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                zze.zza("GMS AdRequest Signals: ");
                zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).f(new WR2() { // from class: com.daaw.Jo2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.h(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).a();
        a3(c10112zH2A, interfaceC8741uP1);
        if (((Boolean) BF1.d.e()).booleanValue()) {
            final C3543bp2 c3543bp2 = this.E;
            c3543bp2.getClass();
            c10112zH2A.g(new Runnable() { // from class: com.daaw.Ro2
                @Override // java.lang.Runnable
                public final void run() {
                    c3543bp2.b();
                }
            }, this.F);
        }
    }

    @Override // com.daaw.InterfaceC7904rP1
    public final void e2(zzbuo zzbuoVar, InterfaceC8741uP1 interfaceC8741uP1) {
        a3(Z2(zzbuoVar, Binder.getCallingUid()), interfaceC8741uP1);
    }
}
