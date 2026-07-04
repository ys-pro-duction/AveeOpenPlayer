package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.n22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6690n22 implements InterfaceC9191vz1, InterfaceC7552q72, zzo, InterfaceC7273p72 {
    public final C5285i22 B;
    public final C5562j22 C;
    public final HL1 E;
    public final Executor F;
    public final InterfaceC5485im G;
    public final Set D = new HashSet();
    public final AtomicBoolean H = new AtomicBoolean(false);
    public final C6411m22 I = new C6411m22();
    public boolean J = false;
    public WeakReference K = new WeakReference(this);

    public C6690n22(EL1 el1, C5562j22 c5562j22, Executor executor, C5285i22 c5285i22, InterfaceC5485im interfaceC5485im) {
        this.B = c5285i22;
        InterfaceC5927kL1 interfaceC5927kL1 = AbstractC6773nL1.b;
        this.E = el1.a("google.afma.activeView.handleUpdate", interfaceC5927kL1, interfaceC5927kL1);
        this.C = c5562j22;
        this.F = executor;
        this.G = interfaceC5485im;
    }

    private final void t() {
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            this.B.f((InterfaceC9334wW1) it.next());
        }
        this.B.e();
    }

    @Override // com.daaw.InterfaceC7552q72
    public final synchronized void a(Context context) {
        this.I.b = false;
        d();
    }

    @Override // com.daaw.InterfaceC9191vz1
    public final synchronized void b0(C8912uz1 c8912uz1) {
        C6411m22 c6411m22 = this.I;
        c6411m22.a = c8912uz1.j;
        c6411m22.f = c8912uz1;
        d();
    }

    public final synchronized void d() {
        try {
            if (this.K.get() == null) {
                r();
                return;
            }
            if (this.J || !this.H.get()) {
                return;
            }
            try {
                this.I.d = this.G.b();
                final JSONObject jSONObjectB = this.C.a(this.I);
                for (final InterfaceC9334wW1 interfaceC9334wW1 : this.D) {
                    this.F.execute(new Runnable() { // from class: com.daaw.l22
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC9334wW1.y0("AFMA_updateActiveView", jSONObjectB);
                        }
                    });
                }
                AbstractC10159zT1.b(this.E.a(jSONObjectB), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                zze.zzb("Failed to call ActiveViewJS", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC7552q72
    public final synchronized void e(Context context) {
        this.I.e = "u";
        d();
        t();
        this.J = true;
    }

    public final synchronized void l(InterfaceC9334wW1 interfaceC9334wW1) {
        this.D.add(interfaceC9334wW1);
        this.B.d(interfaceC9334wW1);
    }

    public final void m(Object obj) {
        this.K = new WeakReference(obj);
    }

    @Override // com.daaw.InterfaceC7552q72
    public final synchronized void o(Context context) {
        this.I.b = true;
        d();
    }

    public final synchronized void r() {
        t();
        this.J = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbL() {
        this.I.b = false;
        d();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbo() {
        this.I.b = true;
        d();
    }

    @Override // com.daaw.InterfaceC7273p72
    public final synchronized void zzq() {
        if (this.H.compareAndSet(false, true)) {
            this.B.c(this);
            d();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
    }
}
