package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.gz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4991gz2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final ScheduledExecutorService b;
    public final C1530Lu2 c;
    public final Context d;
    public final FF2 e;
    public final C1115Hu2 f;
    public final C8826ui2 g;
    public final C2450Uk2 h;
    public final String i;

    public C4991gz2(PS2 ps2, ScheduledExecutorService scheduledExecutorService, String str, C1530Lu2 c1530Lu2, Context context, FF2 ff2, C1115Hu2 c1115Hu2, C8826ui2 c8826ui2, C2450Uk2 c2450Uk2) {
        this.a = ps2;
        this.b = scheduledExecutorService;
        this.i = str;
        this.c = c1530Lu2;
        this.d = context;
        this.e = ff2;
        this.f = c1115Hu2;
        this.g = c8826ui2;
        this.h = c2450Uk2;
    }

    public static /* synthetic */ InterfaceFutureC8236sc0 a(C4991gz2 c4991gz2) {
        C4991gz2 c4991gz22;
        String lowerCase = ((Boolean) zzba.zzc().b(AbstractC9820yE1.X9)).booleanValue() ? c4991gz2.e.f.toLowerCase(Locale.ROOT) : c4991gz2.e.f;
        final Bundle bundleB = ((Boolean) zzba.zzc().b(AbstractC9820yE1.B1)).booleanValue() ? c4991gz2.h.b() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.K1)).booleanValue()) {
            c4991gz22 = c4991gz2;
            c4991gz22.g(arrayList, c4991gz22.c.a(c4991gz22.i, lowerCase));
        } else {
            for (Map.Entry entry : ((RP2) c4991gz2.c.b(c4991gz2.i, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                C4991gz2 c4991gz23 = c4991gz2;
                arrayList.add(c4991gz23.e(str, (List) entry.getValue(), c4991gz2.d(str), true, true));
                c4991gz2 = c4991gz23;
            }
            c4991gz22 = c4991gz2;
            c4991gz22.g(arrayList, c4991gz22.c.c());
        }
        return AbstractC7360pS2.b(arrayList).a(new Callable() { // from class: com.daaw.bz2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (InterfaceFutureC8236sc0 interfaceFutureC8236sc0 : arrayList) {
                    if (((JSONObject) interfaceFutureC8236sc0.get()) != null) {
                        jSONArray.put(interfaceFutureC8236sc0.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new C5270hz2(jSONArray.toString(), bundleB);
            }
        }, c4991gz22.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.daaw.InterfaceFutureC8236sc0 b(java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            com.daaw.BT1 r3 = new com.daaw.BT1
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L27
            com.daaw.qE1 r12 = com.daaw.AbstractC9820yE1.C1
            com.daaw.wE1 r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r12 = r0.b(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L27
            com.daaw.Hu2 r12 = r7.f
            r12.b(r8)
            com.daaw.Hu2 r12 = r7.f
            com.daaw.ZM1 r12 = r12.a(r8)
        L25:
            r2 = r12
            goto L36
        L27:
            com.daaw.ui2 r12 = r7.g     // Catch: android.os.RemoteException -> L2e
            com.daaw.ZM1 r12 = r12.b(r8)     // Catch: android.os.RemoteException -> L2e
            goto L25
        L2e:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            com.daaw.AbstractC4274eT1.zzh(r0, r12)
            r2 = r1
        L36:
            if (r2 != 0) goto L51
            com.daaw.qE1 r9 = com.daaw.AbstractC9820yE1.s1
            com.daaw.wE1 r10 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r10.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L50
            com.daaw.BinderC1842Ou2.Z2(r8, r3)
            r1 = r7
            goto Lbd
        L50:
            throw r1
        L51:
            com.daaw.Ou2 r0 = new com.daaw.Ou2
            com.daaw.im r12 = com.google.android.gms.ads.internal.zzt.zzB()
            long r4 = r12.b()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.daaw.qE1 r8 = com.daaw.AbstractC9820yE1.x1
            com.daaw.wE1 r12 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r8 = r12.b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r8 = r7.b
            com.daaw.fz2 r12 = new com.daaw.fz2
            r12.<init>()
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.q1
            com.daaw.wE1 r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r4.b(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r12, r4, r1)
        L8d:
            if (r11 == 0) goto Lb9
            com.daaw.qE1 r8 = com.daaw.AbstractC9820yE1.E1
            com.daaw.wE1 r11 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r8 = r11.b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb2
            com.daaw.PS2 r8 = r7.a
            r5 = r0
            com.daaw.cz2 r0 = new com.daaw.cz2
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.Z0(r0)
            goto Lbd
        Lb2:
            r1 = r7
            r4 = r9
            r8 = r10
            r7.f(r2, r8, r4, r0)
            goto Lbd
        Lb9:
            r1 = r7
            r0.zzd()
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4991gz2.b(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.daaw.sc0");
    }

    public final /* synthetic */ void c(ZM1 zm1, Bundle bundle, List list, BinderC1842Ou2 binderC1842Ou2, BT1 bt1) {
        try {
            f(zm1, bundle, list, binderC1842Ou2);
        } catch (RemoteException e) {
            bt1.c(e);
        }
    }

    public final Bundle d(String str) {
        Bundle bundle = this.e.d.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    public final AbstractC4839gS2 e(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        AbstractC4839gS2 abstractC4839gS2C = AbstractC4839gS2.C(AbstractC7360pS2.k(new RR2() { // from class: com.daaw.dz2
            @Override // com.daaw.RR2
            public final InterfaceFutureC8236sc0 zza() {
                return this.a.b(str, list, bundle, z, z2);
            }
        }, this.a));
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.x1)).booleanValue()) {
            abstractC4839gS2C = (AbstractC4839gS2) AbstractC7360pS2.o(abstractC4839gS2C, ((Long) zzba.zzc().b(AbstractC9820yE1.q1)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return (AbstractC4839gS2) AbstractC7360pS2.e(abstractC4839gS2C, Throwable.class, new WN2() { // from class: com.daaw.ez2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                AbstractC4274eT1.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.a);
    }

    public final void f(ZM1 zm1, Bundle bundle, List list, BinderC1842Ou2 binderC1842Ou2) {
        zm1.H2(BinderC7744qp0.Z2(this.d), this.i, bundle, (Bundle) list.get(0), this.e.e, binderC1842Ou2);
    }

    public final void g(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            C1946Pu2 c1946Pu2 = (C1946Pu2) ((Map.Entry) it.next()).getValue();
            String str = c1946Pu2.a;
            list.add(e(str, Collections.singletonList(c1946Pu2.e), d(str), c1946Pu2.b, c1946Pu2.c));
        }
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 32;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        FF2 ff2 = this.e;
        if (ff2.q) {
            if (!Arrays.asList(((String) zzba.zzc().b(AbstractC9820yE1.D1)).split(",")).contains(zzf.zza(zzf.zzb(ff2.d)))) {
                return AbstractC7360pS2.h(new C5270hz2(new JSONArray().toString(), new Bundle()));
            }
        }
        return AbstractC7360pS2.k(new RR2() { // from class: com.daaw.az2
            @Override // com.daaw.RR2
            public final InterfaceFutureC8236sc0 zza() {
                return C4991gz2.a(this.a);
            }
        }, this.a);
    }
}
