package com.daaw;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzcaz;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.on2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7178on2 {
    public final PS2 a;
    public final C2458Um2 b;
    public final V73 c;
    public final WI2 d;
    public final Context e;
    public final zzcaz f;

    public C7178on2(PS2 ps2, C2458Um2 c2458Um2, V73 v73, WI2 wi2, Context context, zzcaz zzcazVar) {
        this.a = ps2;
        this.b = c2458Um2;
        this.c = v73;
        this.d = wi2;
        this.e = context;
        this.f = zzcazVar;
    }

    public final InterfaceFutureC8236sc0 a(final zzbvg zzbvgVar) {
        WR2 wr2 = new WR2() { // from class: com.daaw.in2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                String str = new String(XQ2.a((InputStream) obj), UN2.c);
                zzbvg zzbvgVar2 = zzbvgVar;
                zzbvgVar2.K = str;
                return AbstractC7360pS2.h(zzbvgVar2);
            }
        };
        final C2458Um2 c2458Um2 = this.b;
        return h(zzbvgVar, new InterfaceC6899nn2() { // from class: com.daaw.jn2
            @Override // com.daaw.InterfaceC6899nn2
            public final InterfaceFutureC8236sc0 a(zzbvg zzbvgVar2) {
                return c2458Um2.b(zzbvgVar2);
            }
        }, new InterfaceC6899nn2() { // from class: com.daaw.kn2
            @Override // com.daaw.InterfaceC6899nn2
            public final InterfaceFutureC8236sc0 a(zzbvg zzbvgVar2) {
                return this.a.d(zzbvgVar2);
            }
        }, wr2);
    }

    public final InterfaceFutureC8236sc0 b(JSONObject jSONObject) {
        return AbstractC7360pS2.n(AbstractC4839gS2.C(AbstractC7360pS2.h(jSONObject)), zzt.zzf().a(this.e, this.f, this.d).a("AFMA_getAdDictionary", AbstractC6773nL1.b, new InterfaceC5368iL1() { // from class: com.daaw.en2
            @Override // com.daaw.InterfaceC5368iL1
            public final Object b(JSONObject jSONObject2) {
                return new IP1(jSONObject2);
            }
        }), this.a);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(InterfaceC6899nn2 interfaceC6899nn2, zzbvg zzbvgVar, WR2 wr2, C4090dn2 c4090dn2) {
        return AbstractC7360pS2.n(interfaceC6899nn2.a(zzbvgVar), wr2, this.a);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 d(zzbvg zzbvgVar) {
        return ((BinderC0883Fo2) this.c.zzb()).Z2(zzbvgVar, Binder.getCallingUid());
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 e(zzbvg zzbvgVar) {
        return this.b.c(zzbvgVar.I);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 f(zzbvg zzbvgVar) {
        return ((BinderC0883Fo2) this.c.zzb()).c3(zzbvgVar.I);
    }

    public final InterfaceFutureC8236sc0 g(zzbvg zzbvgVar) {
        return h(zzbvgVar, new InterfaceC6899nn2() { // from class: com.daaw.gn2
            @Override // com.daaw.InterfaceC6899nn2
            public final InterfaceFutureC8236sc0 a(zzbvg zzbvgVar2) {
                return this.a.e(zzbvgVar2);
            }
        }, new InterfaceC6899nn2() { // from class: com.daaw.hn2
            @Override // com.daaw.InterfaceC6899nn2
            public final InterfaceFutureC8236sc0 a(zzbvg zzbvgVar2) {
                return this.a.f(zzbvgVar2);
            }
        }, new WR2() { // from class: com.daaw.fn2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.h(null);
            }
        });
    }

    public final InterfaceFutureC8236sc0 h(final zzbvg zzbvgVar, InterfaceC6899nn2 interfaceC6899nn2, final InterfaceC6899nn2 interfaceC6899nn22, final WR2 wr2) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0F;
        String str = zzbvgVar.E;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            interfaceFutureC8236sc0F = AbstractC7360pS2.g(new C4090dn2(1));
        } else {
            interfaceFutureC8236sc0F = AbstractC7360pS2.f(interfaceC6899nn2.a(zzbvgVar), ExecutionException.class, new WR2() { // from class: com.daaw.mn2
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return AbstractC7360pS2.g(cause);
                }
            }, this.a);
        }
        return AbstractC7360pS2.f(AbstractC7360pS2.n(AbstractC4839gS2.C(interfaceFutureC8236sc0F), wr2, this.a), C4090dn2.class, new WR2() { // from class: com.daaw.ln2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.c(interfaceC6899nn22, zzbvgVar, wr2, (C4090dn2) obj);
            }
        }, this.a);
    }
}
