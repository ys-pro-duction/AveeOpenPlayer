package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BK1 implements InterfaceC8442tK1, InterfaceC7884rK1 {
    public final InterfaceC9334wW1 B;

    /* JADX WARN: Multi-variable type inference failed */
    public BK1(Context context, zzcaz zzcazVar, C7782qx1 c7782qx1, zza zzaVar) throws JW1 {
        zzt.zzz();
        InterfaceC9334wW1 interfaceC9334wW1A = KW1.a(context, C8494tX1.a(), "", false, false, null, null, zzcazVar, null, null, null, C6454mB1.a(), null, null, null);
        this.B = interfaceC9334wW1A;
        ((View) interfaceC9334wW1A).setWillNotDraw(true);
    }

    public static final void O(Runnable runnable) {
        zzay.zzb();
        if (XS1.y()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(runnable);
        }
    }

    public final /* synthetic */ void I(String str) {
        this.B.loadUrl(str);
    }

    public final /* synthetic */ void K(String str) {
        this.B.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.daaw.InterfaceC7327pK1
    public final /* synthetic */ void U(String str, Map map) {
        AbstractC7606qK1.a(this, str, map);
    }

    @Override // com.daaw.InterfaceC8442tK1
    public final void V(final HK1 hk1) {
        this.B.zzN().K(new InterfaceC7658qX1() { // from class: com.daaw.wK1
            @Override // com.daaw.InterfaceC7658qX1
            public final void zza() {
                long jA = zzt.zzB().a();
                HK1 hk12 = hk1;
                final long j = hk12.c;
                final ArrayList arrayList = hk12.b;
                arrayList.add(Long.valueOf(jA - j));
                zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                HandlerC8451tM2 handlerC8451tM2 = com.google.android.gms.ads.internal.util.zzt.zza;
                final C3685cL1 c3685cL1 = hk12.a;
                final C3407bL1 c3407bL1 = hk12.d;
                final InterfaceC8442tK1 interfaceC8442tK1 = hk12.e;
                handlerC8451tM2.postDelayed(new Runnable() { // from class: com.daaw.DK1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c3685cL1.i(c3407bL1, interfaceC8442tK1, arrayList, j);
                    }
                }, ((Integer) zzba.zzc().b(AbstractC9820yE1.c)).intValue());
            }
        });
    }

    @Override // com.daaw.CK1, com.daaw.InterfaceC7884rK1
    public final /* synthetic */ void a(String str, String str2) {
        AbstractC7606qK1.c(this, str, str2);
    }

    @Override // com.daaw.InterfaceC8442tK1
    public final void e(final String str) {
        O(new Runnable() { // from class: com.daaw.yK1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.y(str);
            }
        });
    }

    @Override // com.daaw.InterfaceC3964dL1
    public final void g0(String str, HI1 hi1) {
        this.B.C(str, new AK1(this, hi1));
    }

    @Override // com.daaw.InterfaceC7327pK1, com.daaw.InterfaceC7884rK1
    public final /* synthetic */ void l(String str, JSONObject jSONObject) {
        AbstractC7606qK1.b(this, str, jSONObject);
    }

    public final /* synthetic */ void o(String str) {
        this.B.zza(str);
    }

    @Override // com.daaw.InterfaceC3964dL1
    public final void r(String str, final HI1 hi1) {
        this.B.u0(str, new InterfaceC2920Yy0() { // from class: com.daaw.uK1
            @Override // com.daaw.InterfaceC2920Yy0
            public final boolean apply(Object obj) {
                HI1 hi12 = (HI1) obj;
                if (hi12 instanceof AK1) {
                    return ((AK1) hi12).a.equals(hi1);
                }
                return false;
            }
        });
    }

    @Override // com.daaw.InterfaceC8442tK1
    public final void t(final String str) {
        O(new Runnable() { // from class: com.daaw.vK1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.I(str);
            }
        });
    }

    public final /* synthetic */ void y(String str) {
        this.B.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.daaw.CK1
    public final /* synthetic */ void y0(String str, JSONObject jSONObject) {
        AbstractC7606qK1.d(this, str, jSONObject);
    }

    @Override // com.daaw.CK1, com.daaw.InterfaceC7884rK1
    public final void zza(final String str) {
        O(new Runnable() { // from class: com.daaw.xK1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.o(str);
            }
        });
    }

    @Override // com.daaw.InterfaceC8442tK1
    public final void zzc() {
        this.B.destroy();
    }

    @Override // com.daaw.InterfaceC8442tK1
    public final void zzh(String str) {
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        O(new Runnable() { // from class: com.daaw.zK1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.K(str2);
            }
        });
    }

    @Override // com.daaw.InterfaceC8442tK1
    public final boolean zzi() {
        return this.B.q();
    }

    @Override // com.daaw.InterfaceC8442tK1
    public final C4242eL1 zzj() {
        return new C4242eL1(this);
    }
}
