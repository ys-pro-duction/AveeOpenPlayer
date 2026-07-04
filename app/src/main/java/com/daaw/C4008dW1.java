package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.dW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4008dW1 extends AbstractC7646qU1 implements InterfaceC3917d93, Dg3 {
    public static final /* synthetic */ int X = 0;
    public final Context D;
    public final IV1 E;
    public final C8877us3 F;
    public final EU1 G;
    public final WeakReference H;
    public final Sq3 I;
    public InterfaceC10194zb3 J;
    public ByteBuffer K;
    public boolean L;
    public InterfaceC7367pU1 M;
    public int N;
    public int O;
    public long P;
    public final String Q;
    public final int R;
    public Integer T;
    public final ArrayList U;
    public volatile QV1 V;
    public final Object S = new Object();
    public final Set W = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4008dW1(android.content.Context r4, com.daaw.EU1 r5, com.daaw.FU1 r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4008dW1.<init>(android.content.Context, com.daaw.EU1, com.daaw.FU1, java.lang.Integer):void");
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void A(int i) {
        this.E.e(i);
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void B(int i) {
        this.E.f(i);
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void C(InterfaceC7367pU1 interfaceC7367pU1) {
        this.M = interfaceC7367pU1;
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void D(int i) {
        this.E.g(i);
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void E(int i) {
        this.E.h(i);
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void F(boolean z) {
        this.J.f(z);
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void G(Integer num) {
        this.T = num;
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void H(boolean z) {
        if (this.J == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.J.i();
            if (i >= 2) {
                return;
            }
            C8877us3 c8877us3 = this.F;
            Tr3 tr3C = c8877us3.l().c();
            tr3C.o(i, !z);
            c8877us3.q(tr3C);
            i++;
        }
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void I(int i) {
        Iterator it = this.W.iterator();
        while (it.hasNext()) {
            HV1 hv1 = (HV1) ((WeakReference) it.next()).get();
            if (hv1 != null) {
                hv1.q(i);
            }
        }
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void J(Surface surface, boolean z) {
        InterfaceC10194zb3 interfaceC10194zb3 = this.J;
        if (interfaceC10194zb3 != null) {
            interfaceC10194zb3.e(surface);
        }
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void K(float f, boolean z) {
        InterfaceC10194zb3 interfaceC10194zb3 = this.J;
        if (interfaceC10194zb3 != null) {
            interfaceC10194zb3.c(f);
        }
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void L() {
        this.J.zzu();
    }

    @Override // com.daaw.AbstractC7646qU1
    public final boolean M() {
        return this.J != null;
    }

    @Override // com.daaw.AbstractC7646qU1
    public final int N() {
        return this.O;
    }

    @Override // com.daaw.AbstractC7646qU1
    public final int P() {
        return this.J.zzf();
    }

    @Override // com.daaw.AbstractC7646qU1
    public final long R() {
        return this.J.zzi();
    }

    @Override // com.daaw.AbstractC7646qU1
    public final long S() {
        return this.N;
    }

    @Override // com.daaw.AbstractC7646qU1
    public final long T() {
        if (d0() && this.V.t()) {
            return Math.min(this.N, this.V.o());
        }
        return 0L;
    }

    @Override // com.daaw.AbstractC7646qU1
    public final long U() {
        return this.J.zzk();
    }

    @Override // com.daaw.AbstractC7646qU1
    public final long V() {
        return this.J.zzl();
    }

    public final /* synthetic */ InterfaceC7659qX2 W(String str, boolean z) {
        C4008dW1 c4008dW1 = true != z ? null : this;
        EU1 eu1 = this.G;
        return new C4854gW1(str, c4008dW1, eu1.d, eu1.f, eu1.n, eu1.o);
    }

    public final /* synthetic */ InterfaceC7659qX2 X(String str, boolean z) {
        C4008dW1 c4008dW1 = true != z ? null : this;
        EU1 eu1 = this.G;
        HV1 hv1 = new HV1(str, c4008dW1, eu1.d, eu1.f, eu1.i);
        this.W.add(new WeakReference(hv1));
        return hv1;
    }

    public final /* synthetic */ InterfaceC7659qX2 Y(String str, boolean z) {
        W13 w13 = new W13();
        w13.e(str);
        w13.d(true != z ? null : this);
        w13.b(this.G.d);
        w13.c(this.G.f);
        w13.a(true);
        return w13.zza();
    }

    public final /* synthetic */ InterfaceC7659qX2 Z(NW2 nw2) {
        InterfaceC7659qX2 interfaceC7659qX2Zza = nw2.zza();
        C3451bW1 c3451bW1 = new C3451bW1(this);
        return new QV1(this.D, interfaceC7659qX2Zza, this.Q, this.R, this, c3451bW1);
    }

    public final Xp3 a0(Uri uri) {
        C2705Ww1 c2705Ww1 = new C2705Ww1();
        c2705Ww1.b(uri);
        YL1 yl1C = c2705Ww1.c();
        Sq3 sq3 = this.I;
        sq3.a(this.G.g);
        return sq3.b(yl1C);
    }

    @Override // com.daaw.Dg3
    public final void b(C10219zg3 c10219zg3, AbstractC4004dV1 abstractC4004dV1) {
        InterfaceC7367pU1 interfaceC7367pU1 = this.M;
        if (interfaceC7367pU1 != null) {
            interfaceC7367pU1.e("onPlayerError", abstractC4004dV1);
        }
    }

    public final /* synthetic */ void b0(boolean z, long j) {
        InterfaceC7367pU1 interfaceC7367pU1 = this.M;
        if (interfaceC7367pU1 != null) {
            interfaceC7367pU1.d(z, j);
        }
    }

    @Override // com.daaw.Dg3
    public final void c(C10219zg3 c10219zg3, Mp3 mp3, Rp3 rp3, IOException iOException, boolean z) {
        InterfaceC7367pU1 interfaceC7367pU1 = this.M;
        if (interfaceC7367pU1 != null) {
            if (this.G.k) {
                interfaceC7367pU1.c("onLoadException", iOException);
            } else {
                interfaceC7367pU1.e("onLoadError", iOException);
            }
        }
    }

    public final /* synthetic */ Uf3[] c0(Handler handler, InterfaceC2249Sm1 interfaceC2249Sm1, Zk3 zk3, Ar3 ar3, InterfaceC7189op3 interfaceC7189op3) {
        Uo3 uo3 = Uo3.a;
        C4922gk3 c4922gk3 = C4922gk3.c;
        InterfaceC6028ki2[] interfaceC6028ki2Arr = new InterfaceC6028ki2[0];
        Sl3 sl3 = new Sl3();
        if (c4922gk3 == null && c4922gk3 == null) {
            throw new NullPointerException("Both parameters are null");
        }
        Context context = this.D;
        sl3.c(c4922gk3);
        sl3.d(interfaceC6028ki2Arr);
        Nm3 nm3E = sl3.e();
        InterfaceC9701xo3 interfaceC9701xo3 = InterfaceC9701xo3.a;
        return new Uf3[]{new C3255an3(context, interfaceC9701xo3, uo3, false, handler, zk3, nm3E), new Pt3(this.D, interfaceC9701xo3, uo3, 0L, false, handler, interfaceC2249Sm1, -1, 30.0f)};
    }

    @Override // com.daaw.Dg3
    public final void d(C10219zg3 c10219zg3, C2326Tf2 c2326Tf2) {
        InterfaceC7367pU1 interfaceC7367pU1 = this.M;
        if (interfaceC7367pU1 != null) {
            interfaceC7367pU1.h(c2326Tf2.a, c2326Tf2.b);
        }
    }

    public final boolean d0() {
        return this.V != null && this.V.u();
    }

    @Override // com.daaw.Dg3
    public final void e(C10219zg3 c10219zg3, int i) {
        InterfaceC7367pU1 interfaceC7367pU1 = this.M;
        if (interfaceC7367pU1 != null) {
            interfaceC7367pU1.b(i);
        }
    }

    @Override // com.daaw.InterfaceC3917d93
    public final void f(InterfaceC7659qX2 interfaceC7659qX2, C5835k03 c5835k03, boolean z, int i) {
        this.N += i;
    }

    public final void finalize() {
        AbstractC7646qU1.u().decrementAndGet();
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.daaw.Dg3
    public final void k(C10219zg3 c10219zg3, int i, long j) {
        this.O += i;
    }

    @Override // com.daaw.InterfaceC3917d93
    public final void l(InterfaceC7659qX2 interfaceC7659qX2, C5835k03 c5835k03, boolean z) {
        if (interfaceC7659qX2 instanceof K83) {
            synchronized (this.S) {
                this.U.add((K83) interfaceC7659qX2);
            }
        } else if (interfaceC7659qX2 instanceof QV1) {
            this.V = (QV1) interfaceC7659qX2;
            final FU1 fu1 = (FU1) this.H.get();
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue() && fu1 != null && this.V.r()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.V.t()));
                map.put("gcacheDownloaded", String.valueOf(this.V.s()));
                zzt.zza.post(new Runnable() { // from class: com.daaw.ZV1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = C4008dW1.X;
                        fu1.U("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.daaw.Dg3
    public final void m(C10219zg3 c10219zg3, C2485Ut1 c2485Ut1, C9631xa3 c9631xa3) {
        FU1 fu1 = (FU1) this.H.get();
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue() || fu1 == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = c2485Ut1.k;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = c2485Ut1.l;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = c2485Ut1.i;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        fu1.U("onMetadataEvent", map);
    }

    @Override // com.daaw.Dg3
    public final void o(C10219zg3 c10219zg3, Object obj, long j) {
        InterfaceC7367pU1 interfaceC7367pU1 = this.M;
        if (interfaceC7367pU1 != null) {
            interfaceC7367pU1.zzv();
        }
    }

    @Override // com.daaw.Dg3
    public final void p(C10219zg3 c10219zg3, C2485Ut1 c2485Ut1, C9631xa3 c9631xa3) {
        FU1 fu1 = (FU1) this.H.get();
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue() || fu1 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(c2485Ut1.s));
        map.put("bitRate", String.valueOf(c2485Ut1.h));
        map.put("resolution", c2485Ut1.q + "x" + c2485Ut1.r);
        String str = c2485Ut1.k;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = c2485Ut1.l;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = c2485Ut1.i;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        fu1.U("onMetadataEvent", map);
    }

    @Override // com.daaw.AbstractC7646qU1
    public final long r() {
        if (d0()) {
            return 0L;
        }
        return this.N;
    }

    @Override // com.daaw.AbstractC7646qU1
    public final long s() {
        if (d0()) {
            return this.V.p();
        }
        synchronized (this.S) {
            while (!this.U.isEmpty()) {
                long j = this.P;
                Map mapZze = ((K83) this.U.remove(0)).zze();
                long j2 = 0;
                if (mapZze != null) {
                    Iterator it = mapZze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && ON2.c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.P = j + j2;
            }
        }
        return this.P;
    }

    @Override // com.daaw.AbstractC7646qU1
    public final Integer t() {
        return this.T;
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void w(Uri[] uriArr, String str) {
        x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        Xp3 c8588tq3;
        if (this.J != null) {
            this.K = byteBuffer;
            this.L = z;
            int length = uriArr.length;
            if (length == 1) {
                c8588tq3 = a0(uriArr[0]);
            } else {
                Xp3[] xp3Arr = new Xp3[length];
                for (int i = 0; i < uriArr.length; i++) {
                    xp3Arr[i] = a0(uriArr[i]);
                }
                c8588tq3 = new C8588tq3(false, false, xp3Arr);
            }
            this.J.a(c8588tq3);
            this.J.zzp();
            AbstractC7646qU1.v().incrementAndGet();
        }
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void y() {
        InterfaceC10194zb3 interfaceC10194zb3 = this.J;
        if (interfaceC10194zb3 != null) {
            interfaceC10194zb3.b(this);
            this.J.zzq();
            this.J = null;
            AbstractC7646qU1.v().decrementAndGet();
        }
    }

    @Override // com.daaw.AbstractC7646qU1
    public final void z(long j) {
        AbstractC7144og3 abstractC7144og3 = (AbstractC7144og3) this.J;
        abstractC7144og3.h(abstractC7144og3.zzd(), j, 5, false);
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void h(InterfaceC6406m12 interfaceC6406m12, Bg3 bg3) {
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void i(C10219zg3 c10219zg3, Rp3 rp3) {
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void n(C10219zg3 c10219zg3, C8787ua3 c8787ua3) {
    }

    @Override // com.daaw.InterfaceC3917d93
    public final void a(InterfaceC7659qX2 interfaceC7659qX2, C5835k03 c5835k03, boolean z) {
    }

    @Override // com.daaw.InterfaceC3917d93
    public final void g(InterfaceC7659qX2 interfaceC7659qX2, C5835k03 c5835k03, boolean z) {
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void j(C10219zg3 c10219zg3, int i, long j, long j2) {
    }

    @Override // com.daaw.Dg3
    public final /* synthetic */ void q(C10219zg3 c10219zg3, G02 g02, G02 g022, int i) {
    }
}
