package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.q02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC7517q02 extends zzcn {
    public final Context B;
    public final zzcaz C;
    public final C8826ui2 D;
    public final InterfaceC2890Yq2 E;
    public final C1530Lu2 F;
    public final C2242Sk2 G;
    public final JR1 H;
    public final C10228zi2 I;
    public final C7447pl2 J;
    public final VF1 K;
    public final WI2 L;
    public final C3945dG2 M;
    public final C10099zE1 N;
    public boolean O = false;

    public BinderC7517q02(Context context, zzcaz zzcazVar, C8826ui2 c8826ui2, InterfaceC2890Yq2 interfaceC2890Yq2, C1530Lu2 c1530Lu2, C2242Sk2 c2242Sk2, JR1 jr1, C10228zi2 c10228zi2, C7447pl2 c7447pl2, VF1 vf1, WI2 wi2, C3945dG2 c3945dG2, C10099zE1 c10099zE1) {
        this.B = context;
        this.C = zzcazVar;
        this.D = c8826ui2;
        this.E = interfaceC2890Yq2;
        this.F = c1530Lu2;
        this.G = c2242Sk2;
        this.H = jr1;
        this.I = c10228zi2;
        this.J = c7447pl2;
        this.K = vf1;
        this.L = wi2;
        this.M = c3945dG2;
        this.N = c10099zE1;
    }

    public final void Z2(Runnable runnable) {
        AbstractC7506py0.e("Adapters must be initialized on the main thread.");
        Map mapE = zzt.zzo().h().zzh().e();
        if (mapE.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                AbstractC4274eT1.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.D.d()) {
            HashMap map = new HashMap();
            Iterator it = mapE.values().iterator();
            while (it.hasNext()) {
                for (ML1 ml1 : ((NL1) it.next()).a) {
                    String str = ml1.k;
                    for (String str2 : ml1.c) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    C2994Zq2 c2994Zq2A = this.E.a(str3, jSONObject);
                    if (c2994Zq2A != null) {
                        C4502fG2 c4502fG2 = (C4502fG2) c2994Zq2A.b;
                        if (!c4502fG2.c() && c4502fG2.b()) {
                            c4502fG2.o(this.B, (BinderC3836cs2) c2994Zq2A.c, (List) entry.getValue());
                            AbstractC4274eT1.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (KF2 e) {
                    AbstractC4274eT1.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    public final /* synthetic */ void d() {
        this.K.a(new BinderC3701cP1());
    }

    public final void zzb() {
        if (zzt.zzo().h().zzP()) {
            String strZzl = zzt.zzo().h().zzl();
            if (zzt.zzs().zzj(this.B, strZzl, this.C.B)) {
                return;
            }
            zzt.zzo().h().zzB(false);
            zzt.zzo().h().zzA("");
        }
    }

    public final /* synthetic */ void zzd() {
        AbstractC6754nG2.b(this.B, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.C.B;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return this.G.g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.F.g(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.G.l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
        try {
            C9853yM2.j(this.B).o(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.O) {
            AbstractC4274eT1.zzj("Mobile ads is initialized already.");
            return;
        }
        AbstractC9820yE1.a(this.B);
        this.N.a();
        zzt.zzo().s(this.B, this.C);
        zzt.zzc().i(this.B);
        this.O = true;
        this.G.r();
        this.F.e();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.P3)).booleanValue()) {
            this.I.c();
        }
        this.J.g();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue()) {
            AbstractC9322wT1.a.execute(new Runnable() { // from class: com.daaw.l02
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.zzb();
                }
            });
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Z9)).booleanValue()) {
            AbstractC9322wT1.a.execute(new Runnable() { // from class: com.daaw.n02
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.d();
                }
            });
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.D2)).booleanValue()) {
            AbstractC9322wT1.a.execute(new Runnable() { // from class: com.daaw.m02
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, InterfaceC7934rX interfaceC7934rX) {
        String strZzp;
        Runnable runnable;
        AbstractC9820yE1.a(this.B);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.T3)).booleanValue()) {
            zzt.zzp();
            strZzp = com.google.android.gms.ads.internal.util.zzt.zzp(this.B);
        } else {
            strZzp = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strZzp) ? str : strZzp;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) zzba.zzc().b(AbstractC9820yE1.N3)).booleanValue();
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.P0;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue();
        if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
            final Runnable runnable2 = (Runnable) BinderC7744qp0.I(interfaceC7934rX);
            runnable = new Runnable() { // from class: com.daaw.o02
                @Override // java.lang.Runnable
                public final void run() {
                    PS2 ps2 = AbstractC9322wT1.e;
                    final BinderC7517q02 binderC7517q02 = this.B;
                    final Runnable runnable3 = runnable2;
                    ps2.execute(new Runnable() { // from class: com.daaw.p02
                        @Override // java.lang.Runnable
                        public final void run() {
                            binderC7517q02.Z2(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            zzt.zza().zza(this.B, this.C, str2, runnable3, this.L);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
        this.J.h(zzdaVar, EnumC7168ol2.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(InterfaceC7934rX interfaceC7934rX, String str) {
        if (interfaceC7934rX == null) {
            AbstractC4274eT1.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        if (context == null) {
            AbstractC4274eT1.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzau zzauVar = new zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.C.B);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(SL1 sl1) {
        this.M.f(sl1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z) {
        zzt.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f) {
        zzt.zzr().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        AbstractC9820yE1.a(this.B);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.N3)).booleanValue()) {
                zzt.zza().zza(this.B, this.C, str, null, this.L);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(YJ1 yj1) {
        this.G.s(yj1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f9)).booleanValue()) {
            zzt.zzo().w(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
        this.H.v(this.B, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return zzt.zzr().zze();
    }
}
