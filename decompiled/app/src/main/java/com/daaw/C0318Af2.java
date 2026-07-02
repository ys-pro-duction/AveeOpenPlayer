package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Af2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0318Af2 implements InterfaceC10208ze2 {
    public final InterfaceC6219lM1 a;
    public final C6715n72 b;
    public final P62 c;
    public final C1766Ob2 d;
    public final Context e;
    public final C4498fF2 f;
    public final zzcaz g;
    public final FF2 h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    public final C5093hM1 l;
    public final C5372iM1 m;

    public C0318Af2(C5093hM1 c5093hM1, C5372iM1 c5372iM1, InterfaceC6219lM1 interfaceC6219lM1, C6715n72 c6715n72, P62 p62, C1766Ob2 c1766Ob2, Context context, C4498fF2 c4498fF2, zzcaz zzcazVar, FF2 ff2) {
        this.l = c5093hM1;
        this.m = c5372iM1;
        this.a = interfaceC6219lM1;
        this.b = c6715n72;
        this.c = p62;
        this.d = c1766Ob2;
        this.e = context;
        this.f = c4498fF2;
        this.g = zzcazVar;
        this.h = ff2;
    }

    public static final HashMap r(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.i) {
                this.i = zzt.zzs().zzn(this.e, this.g.B, this.f.E.toString(), this.h.f);
            }
            if (this.k) {
                InterfaceC6219lM1 interfaceC6219lM1 = this.a;
                if (interfaceC6219lM1 != null && !interfaceC6219lM1.zzB()) {
                    this.a.zzx();
                    this.b.zza();
                    return;
                }
                C5093hM1 c5093hM1 = this.l;
                if (c5093hM1 != null && !c5093hM1.k3()) {
                    this.l.zzt();
                    this.b.zza();
                    return;
                }
                C5372iM1 c5372iM1 = this.m;
                if (c5372iM1 == null || c5372iM1.k3()) {
                    return;
                }
                this.m.zzr();
                this.b.zza();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void c(View view, Map map) {
        try {
            InterfaceC7934rX interfaceC7934rXZ2 = BinderC7744qp0.Z2(view);
            InterfaceC6219lM1 interfaceC6219lM1 = this.a;
            if (interfaceC6219lM1 != null) {
                interfaceC6219lM1.j0(interfaceC7934rXZ2);
                return;
            }
            C5093hM1 c5093hM1 = this.l;
            if (c5093hM1 != null) {
                c5093hM1.k2(interfaceC7934rXZ2);
                return;
            }
            C5372iM1 c5372iM1 = this.m;
            if (c5372iM1 != null) {
                c5372iM1.j3(interfaceC7934rXZ2);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Failed to call untrackView", e);
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final boolean d(Bundle bundle) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1 A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0047, blocks: (B:50:0x00b6, B:51:0x00cb, B:53:0x00d1), top: B:73:0x00b6 }] */
    @Override // com.daaw.InterfaceC10208ze2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0318Af2.f(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.j && this.f.N) {
            return;
        }
        q(view);
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void k(zzcs zzcsVar) {
        AbstractC4274eT1.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void l(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.j) {
            AbstractC4274eT1.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f.N) {
            q(view2);
        } else {
            AbstractC4274eT1.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void m(zzcw zzcwVar) {
        AbstractC4274eT1.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final JSONObject n(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final void q(View view) {
        try {
            InterfaceC6219lM1 interfaceC6219lM1 = this.a;
            if (interfaceC6219lM1 != null && !interfaceC6219lM1.zzA()) {
                this.a.k2(BinderC7744qp0.Z2(view));
                this.c.onAdClicked();
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U9)).booleanValue()) {
                    this.d.i0();
                    return;
                }
                return;
            }
            C5093hM1 c5093hM1 = this.l;
            if (c5093hM1 != null && !c5093hM1.j3()) {
                this.l.g3(BinderC7744qp0.Z2(view));
                this.c.onAdClicked();
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U9)).booleanValue()) {
                    this.d.i0();
                    return;
                }
                return;
            }
            C5372iM1 c5372iM1 = this.m;
            if (c5372iM1 == null || c5372iM1.zzv()) {
                return;
            }
            this.m.g3(BinderC7744qp0.Z2(view));
            this.c.onAdClicked();
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U9)).booleanValue()) {
                this.d.i0();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Failed to call handleClick", e);
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final boolean zzA() {
        return true;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final boolean zzB() {
        return this.f.N;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final int zza() {
        return 0;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzg() {
        throw null;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzv() {
        this.j = true;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzh() {
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzi() {
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzp() {
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzr() {
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void e(View view) {
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void h(Bundle bundle) {
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void i(Bundle bundle) {
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void o(InterfaceC8709uH1 interfaceC8709uH1) {
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void p(String str) {
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void a(View view, MotionEvent motionEvent, View view2) {
    }
}
