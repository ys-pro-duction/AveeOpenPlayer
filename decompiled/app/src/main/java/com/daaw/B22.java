package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class B22 implements InterfaceC9191vz1 {
    public InterfaceC9334wW1 B;
    public final Executor C;
    public final C5562j22 D;
    public final InterfaceC5485im E;
    public boolean F = false;
    public boolean G = false;
    public final C6411m22 H = new C6411m22();

    public B22(Executor executor, C5562j22 c5562j22, InterfaceC5485im interfaceC5485im) {
        this.C = executor;
        this.D = c5562j22;
        this.E = interfaceC5485im;
    }

    private final void o() {
        try {
            final JSONObject jSONObjectA = this.D.a(this.H);
            if (this.B != null) {
                this.C.execute(new Runnable() { // from class: com.daaw.A22
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.e(jSONObjectA);
                    }
                });
            }
        } catch (JSONException e) {
            zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void a() {
        this.F = false;
    }

    @Override // com.daaw.InterfaceC9191vz1
    public final void b0(C8912uz1 c8912uz1) {
        boolean z = this.G ? false : c8912uz1.j;
        C6411m22 c6411m22 = this.H;
        c6411m22.a = z;
        c6411m22.d = this.E.b();
        this.H.f = c8912uz1;
        if (this.F) {
            o();
        }
    }

    public final void d() {
        this.F = true;
        o();
    }

    public final /* synthetic */ void e(JSONObject jSONObject) {
        this.B.y0("AFMA_updateActiveView", jSONObject);
    }

    public final void l(boolean z) {
        this.G = z;
    }

    public final void m(InterfaceC9334wW1 interfaceC9334wW1) {
        this.B = interfaceC9334wW1;
    }
}
