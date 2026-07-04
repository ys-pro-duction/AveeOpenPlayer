package com.daaw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class Cd3 extends AbstractC7144og3 implements InterfaceC10194zb3 {
    public static final /* synthetic */ int h0 = 0;
    public final long A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public C3777cg3 F;
    public PY1 G;
    public C9027vP1 H;
    public C9027vP1 I;
    public C2485Ut1 J;
    public C2485Ut1 K;
    public AudioTrack L;
    public Object M;
    public Surface N;
    public int O;
    public NE2 P;
    public C8787ua3 Q;
    public C8787ua3 R;
    public int S;
    public C7965rd3 T;
    public float U;
    public boolean V;
    public C0975Gl2 W;
    public boolean X;
    public boolean Y;
    public At3 Z;
    public C2326Tf2 a0;
    public final Ds3 b;
    public C9027vP1 b0;
    public final PY1 c;
    public Df3 c0;
    public final C5779jo2 d;
    public int d0;
    public final Context e;
    public long e0;
    public final InterfaceC6406m12 f;
    public final Cb3 f0;
    public final Uf3[] g;
    public C4957gr3 g0;
    public final Cs3 h;
    public final InterfaceC1834Os2 i;
    public final C4046de3 j;
    public final C8057rw2 k;
    public final CopyOnWriteArraySet l;
    public final H32 m;
    public final List n;
    public final boolean o;
    public final Up3 p;
    public final InterfaceC9661xg3 q;
    public final Looper r;
    public final Ks3 s;
    public final InterfaceC1810Om2 t;
    public final SurfaceHolderCallbackC5725jd3 u;
    public final C7408pd3 v;
    public final T93 w;
    public final C7114oa3 x;
    public final C6019kg3 y;
    public final C9382wg3 z;

    static {
        DM1.b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.daaw.Js3, com.daaw.xg3, java.lang.Object] */
    public Cd3(C9357wb3 c9357wb3, InterfaceC6406m12 interfaceC6406m12) {
        C5779jo2 c5779jo2 = new C5779jo2(InterfaceC1810Om2.a);
        this.d = c5779jo2;
        try {
            AbstractC3305ay2.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.0-alpha01] [" + AbstractC9004vJ2.e + "]");
            Context applicationContext = c9357wb3.a.getApplicationContext();
            this.e = applicationContext;
            ?? Apply = c9357wb3.h.apply(c9357wb3.b);
            this.q = Apply;
            this.T = c9357wb3.j;
            this.O = c9357wb3.k;
            this.V = false;
            this.A = c9357wb3.o;
            SurfaceHolderCallbackC5725jd3 surfaceHolderCallbackC5725jd3 = new SurfaceHolderCallbackC5725jd3(this, null);
            this.u = surfaceHolderCallbackC5725jd3;
            C7408pd3 c7408pd3 = new C7408pd3(null);
            this.v = c7408pd3;
            Handler handler = new Handler(c9357wb3.i);
            Uf3[] uf3ArrA = ((C3474bb3) c9357wb3.c).B.a(handler, surfaceHolderCallbackC5725jd3, surfaceHolderCallbackC5725jd3, surfaceHolderCallbackC5725jd3, surfaceHolderCallbackC5725jd3);
            this.g = uf3ArrA;
            int length = uf3ArrA.length;
            Cs3 cs3 = (Cs3) c9357wb3.e.zza();
            this.h = cs3;
            this.p = C9357wb3.a(((C4309eb3) c9357wb3.d).B);
            C3564bt3 c3564bt3D = C3564bt3.d(((C6840nb3) c9357wb3.g).B);
            this.s = c3564bt3D;
            this.o = c9357wb3.l;
            this.F = c9357wb3.m;
            Looper looper = c9357wb3.i;
            this.r = looper;
            InterfaceC1810Om2 interfaceC1810Om2 = c9357wb3.b;
            this.t = interfaceC1810Om2;
            this.f = interfaceC6406m12;
            C8057rw2 c8057rw2 = new C8057rw2(looper, interfaceC1810Om2, new InterfaceC5531iv2() { // from class: com.daaw.Qc3
                @Override // com.daaw.InterfaceC5531iv2
                public final void a(Object obj, C1617Mq1 c1617Mq1) {
                }
            });
            this.k = c8057rw2;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.l = copyOnWriteArraySet;
            this.n = new ArrayList();
            this.g0 = new C4957gr3(0);
            int length2 = uf3ArrA.length;
            Ds3 ds3 = new Ds3(new C3220ag3[2], new InterfaceC9442ws3[2], C6844nc2.b, null);
            this.b = ds3;
            this.m = new H32();
            DX1 dx1 = new DX1();
            dx1.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32);
            cs3.d();
            dx1.d(29, true);
            dx1.d(23, false);
            dx1.d(25, false);
            dx1.d(33, false);
            dx1.d(26, false);
            dx1.d(34, false);
            PY1 py1E = dx1.e();
            this.c = py1E;
            DX1 dx12 = new DX1();
            dx12.b(py1E);
            dx12.a(4);
            dx12.a(10);
            this.G = dx12.e();
            this.i = interfaceC1810Om2.a(looper, null);
            Cb3 cb3 = new Cb3(this);
            this.f0 = cb3;
            this.c0 = Df3.i(ds3);
            Apply.N(interfaceC6406m12, looper);
            int i = AbstractC9004vJ2.a;
            this.j = new C4046de3(uf3ArrA, cs3, ds3, (InterfaceC6576me3) c9357wb3.f.zza(), c3564bt3D, 0, false, Apply, this.F, c9357wb3.r, c9357wb3.n, false, looper, interfaceC1810Om2, cb3, i < 31 ? new C3519bk3() : Uc3.a(applicationContext, this, c9357wb3.p), null);
            this.U = 1.0f;
            C9027vP1 c9027vP1 = C9027vP1.y;
            this.H = c9027vP1;
            this.I = c9027vP1;
            this.b0 = c9027vP1;
            int iGenerateAudioSessionId = -1;
            this.d0 = -1;
            if (i >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.S = iGenerateAudioSessionId;
            } else {
                AudioTrack audioTrack = this.L;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.L.release();
                    this.L = null;
                }
                if (this.L == null) {
                    this.L = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.S = this.L.getAudioSessionId();
            }
            this.W = C0975Gl2.b;
            this.X = true;
            if (Apply == 0) {
                throw null;
            }
            c8057rw2.b(Apply);
            c3564bt3D.c(new Handler(looper), Apply);
            copyOnWriteArraySet.add(surfaceHolderCallbackC5725jd3);
            this.w = new T93(c9357wb3.a, handler, surfaceHolderCallbackC5725jd3);
            this.x = new C7114oa3(c9357wb3.a, handler, surfaceHolderCallbackC5725jd3);
            AbstractC9004vJ2.e(null, null);
            this.y = new C6019kg3(c9357wb3.a);
            this.z = new C9382wg3(c9357wb3.a);
            this.Z = new Zr3(0).a();
            this.a0 = C2326Tf2.e;
            this.P = NE2.c;
            cs3.c(this.T);
            O(1, 10, Integer.valueOf(this.S));
            O(2, 10, Integer.valueOf(this.S));
            O(1, 3, this.T);
            O(2, 4, Integer.valueOf(this.O));
            O(2, 5, 0);
            O(1, 9, Boolean.valueOf(this.V));
            O(2, 7, c7408pd3);
            O(6, 8, c7408pd3);
            c5779jo2.e();
        } catch (Throwable th) {
            this.d.e();
            throw th;
        }
    }

    public static int F(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    public static long I(Df3 df3) {
        Q42 q42 = new Q42();
        H32 h32 = new H32();
        df3.a.n(df3.b.a, h32);
        long j = df3.c;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = df3.a.e(h32.c, q42, 0L).l;
        return 0L;
    }

    public static /* bridge */ /* synthetic */ void w(Cd3 cd3, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        cd3.Q(surface);
        cd3.N = surface;
    }

    public final /* synthetic */ void A(Yd3 yd3) {
        int i = this.B - yd3.c;
        this.B = i;
        boolean z = true;
        if (yd3.d) {
            this.C = yd3.e;
            this.D = true;
        }
        if (yd3.f) {
            this.E = yd3.g;
        }
        if (i == 0) {
            AbstractC8657u52 abstractC8657u52 = yd3.b.a;
            if (!this.c0.a.o() && abstractC8657u52.o()) {
                this.d0 = -1;
                this.e0 = 0L;
            }
            if (!abstractC8657u52.o()) {
                List listY = ((Qf3) abstractC8657u52).y();
                AbstractC6048km2.f(listY.size() == this.n.size());
                for (int i2 = 0; i2 < listY.size(); i2++) {
                    ((C10204zd3) this.n.get(i2)).a((AbstractC8657u52) listY.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (this.D) {
                if (yd3.b.b.equals(this.c0.b) && yd3.b.d == this.c0.r) {
                    z = false;
                }
                if (z) {
                    if (abstractC8657u52.o() || yd3.b.b.b()) {
                        j = yd3.b.d;
                    } else {
                        Df3 df3 = yd3.b;
                        Vp3 vp3 = df3.b;
                        long j2 = df3.d;
                        J(abstractC8657u52, vp3, j2);
                        j = j2;
                    }
                }
            } else {
                z = false;
            }
            this.D = false;
            T(yd3.b, 1, this.E, z, this.C, j, -1, false);
        }
    }

    public final /* synthetic */ void B(final Yd3 yd3) {
        this.i.f(new Runnable() { // from class: com.daaw.Nc3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.A(yd3);
            }
        });
    }

    public final /* synthetic */ void C(InterfaceC9067vZ1 interfaceC9067vZ1) {
        interfaceC9067vZ1.z(this.G);
    }

    public final int E(Df3 df3) {
        return df3.a.o() ? this.d0 : df3.a.n(df3.b.a, this.m).c;
    }

    public final long G(Df3 df3) {
        if (!df3.b.b()) {
            return AbstractC9004vJ2.E(H(df3));
        }
        df3.a.n(df3.b.a, this.m);
        long j = df3.c;
        if (j == -9223372036854775807L) {
            long j2 = df3.a.e(E(df3), this.a, 0L).l;
            return AbstractC9004vJ2.E(0L);
        }
        return AbstractC9004vJ2.E(0L) + AbstractC9004vJ2.E(j);
    }

    public final long H(Df3 df3) {
        if (df3.a.o()) {
            return AbstractC9004vJ2.C(this.e0);
        }
        long jA = df3.o ? df3.a() : df3.r;
        if (df3.b.b()) {
            return jA;
        }
        J(df3.a, df3.b, jA);
        return jA;
    }

    public final long J(AbstractC8657u52 abstractC8657u52, Vp3 vp3, long j) {
        abstractC8657u52.n(vp3.a, this.m);
        return j;
    }

    public final Pair K(AbstractC8657u52 abstractC8657u52, int i, long j) {
        if (abstractC8657u52.o()) {
            this.d0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.e0 = j;
            return null;
        }
        if (i == -1 || i >= abstractC8657u52.c()) {
            i = abstractC8657u52.g(false);
            long j2 = abstractC8657u52.e(i, this.a, 0L).l;
            j = AbstractC9004vJ2.E(0L);
        }
        return abstractC8657u52.l(this.a, this.m, i, AbstractC9004vJ2.C(j));
    }

    public final Df3 L(Df3 df3, AbstractC8657u52 abstractC8657u52, Pair pair) {
        AbstractC6048km2.d(abstractC8657u52.o() || pair != null);
        AbstractC8657u52 abstractC8657u522 = df3.a;
        long jG = G(df3);
        Df3 df3H = df3.h(abstractC8657u52);
        if (abstractC8657u52.o()) {
            Vp3 vp3J = Df3.j();
            long jC = AbstractC9004vJ2.C(this.e0);
            Df3 df3C = df3H.d(vp3J, jC, jC, jC, 0L, C6362lr3.d, this.b, OP2.J()).c(vp3J);
            df3C.p = df3C.r;
            return df3C;
        }
        Object obj = df3H.b.a;
        int i = AbstractC9004vJ2.a;
        boolean zEquals = obj.equals(pair.first);
        Vp3 vp3 = !zEquals ? new Vp3(pair.first, -1L) : df3H.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jC2 = AbstractC9004vJ2.C(jG);
        if (!abstractC8657u522.o()) {
            abstractC8657u522.n(obj, this.m);
        }
        if (!zEquals || jLongValue < jC2) {
            Vp3 vp32 = vp3;
            AbstractC6048km2.f(!vp32.b());
            Df3 df3C2 = df3H.d(vp32, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? C6362lr3.d : df3H.h, !zEquals ? this.b : df3H.i, !zEquals ? OP2.J() : df3H.j).c(vp32);
            df3C2.p = jLongValue;
            return df3C2;
        }
        if (jLongValue != jC2) {
            Vp3 vp33 = vp3;
            AbstractC6048km2.f(!vp33.b());
            long jMax = Math.max(0L, df3H.q - (jLongValue - jC2));
            long j = df3H.p;
            if (df3H.k.equals(df3H.b)) {
                j = jLongValue + jMax;
            }
            Df3 df3D = df3H.d(vp33, jLongValue, jLongValue, jLongValue, jMax, df3H.h, df3H.i, df3H.j);
            df3D.p = j;
            return df3D;
        }
        int iA = abstractC8657u52.a(df3H.k.a);
        if (iA != -1 && abstractC8657u52.d(iA, this.m, false).c == abstractC8657u52.n(vp3.a, this.m).c) {
            return df3H;
        }
        abstractC8657u52.n(vp3.a, this.m);
        long jH = vp3.b() ? this.m.h(vp3.b, vp3.c) : this.m.d;
        Vp3 vp34 = vp3;
        Df3 df3C3 = df3H.d(vp34, df3H.r, df3H.r, df3H.d, jH - df3H.r, df3H.h, df3H.i, df3H.j).c(vp34);
        df3C3.p = jH;
        return df3C3;
    }

    public final Lf3 M(Jf3 jf3) {
        int iE = E(this.c0);
        AbstractC8657u52 abstractC8657u52 = this.c0.a;
        int i = iE == -1 ? 0 : iE;
        InterfaceC1810Om2 interfaceC1810Om2 = this.t;
        C4046de3 c4046de3 = this.j;
        return new Lf3(c4046de3, jf3, abstractC8657u52, i, interfaceC1810Om2, c4046de3.S());
    }

    public final void N(final int i, final int i2) {
        if (i == this.P.b() && i2 == this.P.a()) {
            return;
        }
        this.P = new NE2(i, i2);
        C8057rw2 c8057rw2 = this.k;
        c8057rw2.d(24, new InterfaceC0803Eu2() { // from class: com.daaw.Ic3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                int i3 = Cd3.h0;
                ((InterfaceC9067vZ1) obj).C(i, i2);
            }
        });
        c8057rw2.c();
        O(2, 14, new NE2(i, i2));
    }

    public final void O(int i, int i2, Object obj) {
        Uf3[] uf3Arr = this.g;
        int length = uf3Arr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            Uf3 uf3 = uf3Arr[i3];
            if (uf3.zzb() == i) {
                Lf3 lf3M = M(uf3);
                lf3M.f(i2);
                lf3M.e(obj);
                lf3M.d();
            }
        }
    }

    public final void P() {
        O(1, 2, Float.valueOf(this.U * this.x.a()));
    }

    public final void Q(Object obj) {
        ArrayList arrayList = new ArrayList();
        Uf3[] uf3Arr = this.g;
        int length = uf3Arr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            Uf3 uf3 = uf3Arr[i];
            if (uf3.zzb() == 2) {
                Lf3 lf3M = M(uf3);
                lf3M.f(1);
                lf3M.e(obj);
                lf3M.d();
                arrayList.add(lf3M);
            }
        }
        Object obj2 = this.M;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Lf3) it.next()).i(this.A);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.M;
            Surface surface = this.N;
            if (obj3 == surface) {
                surface.release();
                this.N = null;
            }
        }
        this.M = obj;
        if (z) {
            R(Sa3.d(new C4892ge3(3), 1003));
        }
    }

    public final void R(Sa3 sa3) {
        Df3 df3 = this.c0;
        Df3 df3C = df3.c(df3.b);
        df3C.p = df3C.r;
        df3C.q = 0L;
        Df3 df3G = df3C.g(1);
        if (sa3 != null) {
            df3G = df3G.f(sa3);
        }
        this.B++;
        this.j.a0();
        T(df3G, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void S(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        Df3 df3B = this.c0;
        if (df3B.l == z2 && df3B.m == i3) {
            return;
        }
        this.B++;
        if (df3B.o) {
            df3B = df3B.b();
        }
        Df3 df3E = df3B.e(z2, i3);
        this.j.Z(z2, i3);
        T(df3E, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0526 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ba  */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(final com.daaw.Df3 r35, final int r36, final int r37, boolean r38, int r39, long r40, int r42, boolean r43) {
        /*
            Method dump skipped, instruction units count: 1319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Cd3.T(com.daaw.Df3, int, int, boolean, int, long, int, boolean):void");
    }

    public final void U() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            V();
            boolean z = this.c0.o;
            zzv();
            zzv();
        }
    }

    public final void V() {
        this.d.b();
        if (Thread.currentThread() != this.r.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.r.getThread().getName());
            if (this.X) {
                throw new IllegalStateException(str);
            }
            AbstractC3305ay2.g("ExoPlayerImpl", str, this.Y ? null : new IllegalStateException());
            this.Y = true;
        }
    }

    @Override // com.daaw.InterfaceC10194zb3
    public final void a(Xp3 xp3) {
        V();
        List listSingletonList = Collections.singletonList(xp3);
        V();
        V();
        E(this.c0);
        zzk();
        this.B++;
        boolean z = false;
        if (!this.n.isEmpty()) {
            int size = this.n.size();
            for (int i = size - 1; i >= 0; i--) {
                this.n.remove(i);
            }
            this.g0 = this.g0.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            C9098vf3 c9098vf3 = new C9098vf3((Xp3) listSingletonList.get(i2), this.o);
            arrayList.add(c9098vf3);
            this.n.add(i2, new C10204zd3(c9098vf3.b, c9098vf3.a));
        }
        this.g0 = this.g0.g(0, arrayList.size());
        Qf3 qf3 = new Qf3(this.n, this.g0);
        if (!qf3.o() && qf3.c() < 0) {
            throw new C10008yu1(qf3, -1, -9223372036854775807L);
        }
        int iG = qf3.g(false);
        Df3 df3L = L(this.c0, qf3, K(qf3, iG, -9223372036854775807L));
        int i3 = df3L.e;
        if (iG != -1 && i3 != 1) {
            i3 = 4;
            if (!qf3.o() && iG < qf3.c()) {
                i3 = 2;
            }
        }
        Df3 df3G = df3L.g(i3);
        this.j.c0(arrayList, iG, AbstractC9004vJ2.C(-9223372036854775807L), this.g0);
        if (!this.c0.b.a.equals(df3G.b.a) && !this.c0.a.o()) {
            z = true;
        }
        T(df3G, 0, 1, z, 4, H(df3G), -1, false);
    }

    @Override // com.daaw.InterfaceC10194zb3
    public final void b(Dg3 dg3) {
        V();
        this.q.A(dg3);
    }

    @Override // com.daaw.InterfaceC6406m12
    public final void c(float f) {
        V();
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.U == fMax) {
            return;
        }
        this.U = fMax;
        P();
        C8057rw2 c8057rw2 = this.k;
        c8057rw2.d(22, new InterfaceC0803Eu2() { // from class: com.daaw.hc3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                int i = Cd3.h0;
                ((InterfaceC9067vZ1) obj).H(fMax);
            }
        });
        c8057rw2.c();
    }

    @Override // com.daaw.InterfaceC6406m12
    public final boolean d() {
        V();
        return false;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final void e(Surface surface) {
        V();
        Q(surface);
        int i = surface == null ? 0 : -1;
        N(i, i);
    }

    @Override // com.daaw.InterfaceC6406m12
    public final void f(boolean z) {
        V();
        int iB = this.x.b(z, zzf());
        S(z, iB, F(z, iB));
    }

    @Override // com.daaw.InterfaceC10194zb3
    public final void g(Dg3 dg3) {
        this.q.o(dg3);
    }

    @Override // com.daaw.AbstractC7144og3
    public final void h(int i, long j, int i2, boolean z) {
        V();
        AbstractC6048km2.d(i >= 0);
        this.q.zzu();
        AbstractC8657u52 abstractC8657u52 = this.c0.a;
        if (abstractC8657u52.o() || i < abstractC8657u52.c()) {
            this.B++;
            if (zzx()) {
                AbstractC3305ay2.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                Yd3 yd3 = new Yd3(this.c0);
                yd3.a(1);
                this.f0.a.B(yd3);
                return;
            }
            Df3 df3G = this.c0;
            int i3 = df3G.e;
            if (i3 == 3 || (i3 == 4 && !abstractC8657u52.o())) {
                df3G = this.c0.g(2);
            }
            int iZzd = zzd();
            Df3 df3L = L(df3G, abstractC8657u52, K(abstractC8657u52, i, j));
            this.j.Y(abstractC8657u52, i, AbstractC9004vJ2.C(j));
            T(df3L, 0, 1, true, 1, H(df3L), iZzd, false);
        }
    }

    @Override // com.daaw.InterfaceC10194zb3
    public final int i() {
        V();
        int length = this.g.length;
        return 2;
    }

    public final Sa3 l() {
        V();
        return this.c0.f;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final int zzb() {
        V();
        if (zzx()) {
            return this.c0.b.b;
        }
        return -1;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final int zzc() {
        V();
        if (zzx()) {
            return this.c0.b.c;
        }
        return -1;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final int zzd() {
        V();
        int iE = E(this.c0);
        if (iE == -1) {
            return 0;
        }
        return iE;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final int zze() {
        V();
        if (this.c0.a.o()) {
            return 0;
        }
        Df3 df3 = this.c0;
        return df3.a.a(df3.b.a);
    }

    @Override // com.daaw.InterfaceC6406m12
    public final int zzf() {
        V();
        return this.c0.e;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final int zzg() {
        V();
        return this.c0.m;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final int zzh() {
        V();
        return 0;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final long zzi() {
        V();
        if (zzx()) {
            Df3 df3 = this.c0;
            return df3.k.equals(df3.b) ? AbstractC9004vJ2.E(this.c0.p) : zzl();
        }
        V();
        if (this.c0.a.o()) {
            return this.e0;
        }
        Df3 df32 = this.c0;
        long j = 0;
        if (df32.k.d != df32.b.d) {
            return AbstractC9004vJ2.E(df32.a.e(zzd(), this.a, 0L).m);
        }
        long j2 = df32.p;
        if (this.c0.k.b()) {
            Df3 df33 = this.c0;
            df33.a.n(df33.k.a, this.m).i(this.c0.k.b);
        } else {
            j = j2;
        }
        Df3 df34 = this.c0;
        J(df34.a, df34.k, j);
        return AbstractC9004vJ2.E(j);
    }

    @Override // com.daaw.InterfaceC6406m12
    public final long zzj() {
        V();
        return G(this.c0);
    }

    @Override // com.daaw.InterfaceC6406m12
    public final long zzk() {
        V();
        return AbstractC9004vJ2.E(H(this.c0));
    }

    @Override // com.daaw.InterfaceC6406m12
    public final long zzl() {
        V();
        if (zzx()) {
            Df3 df3 = this.c0;
            Vp3 vp3 = df3.b;
            df3.a.n(vp3.a, this.m);
            return AbstractC9004vJ2.E(this.m.h(vp3.b, vp3.c));
        }
        AbstractC8657u52 abstractC8657u52Zzn = zzn();
        if (abstractC8657u52Zzn.o()) {
            return -9223372036854775807L;
        }
        return AbstractC9004vJ2.E(abstractC8657u52Zzn.e(zzd(), this.a, 0L).m);
    }

    @Override // com.daaw.InterfaceC6406m12
    public final long zzm() {
        V();
        return AbstractC9004vJ2.E(this.c0.q);
    }

    @Override // com.daaw.InterfaceC6406m12
    public final AbstractC8657u52 zzn() {
        V();
        return this.c0.a;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final C6844nc2 zzo() {
        V();
        return this.c0.i.d;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final void zzp() {
        V();
        C7114oa3 c7114oa3 = this.x;
        boolean zZzv = zzv();
        int iB = c7114oa3.b(zZzv, 2);
        S(zZzv, iB, F(zZzv, iB));
        Df3 df3 = this.c0;
        if (df3.e != 1) {
            return;
        }
        Df3 df3F = df3.f(null);
        Df3 df3G = df3F.g(true == df3F.a.o() ? 4 : 2);
        this.B++;
        this.j.X();
        T(df3G, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.daaw.InterfaceC6406m12
    public final void zzq() {
        AudioTrack audioTrack;
        AbstractC3305ay2.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.0-alpha01] [" + AbstractC9004vJ2.e + "] [" + DM1.a() + "]");
        V();
        if (AbstractC9004vJ2.a < 21 && (audioTrack = this.L) != null) {
            audioTrack.release();
            this.L = null;
        }
        this.x.d();
        if (!this.j.b0()) {
            C8057rw2 c8057rw2 = this.k;
            c8057rw2.d(10, new InterfaceC0803Eu2() { // from class: com.daaw.Kc3
                @Override // com.daaw.InterfaceC0803Eu2
                public final void zza(Object obj) {
                    ((InterfaceC9067vZ1) obj).p(Sa3.d(new C4892ge3(1), 1003));
                }
            });
            c8057rw2.c();
        }
        this.k.e();
        this.i.e(null);
        this.s.b(this.q);
        Df3 df3 = this.c0;
        if (df3.o) {
            this.c0 = df3.b();
        }
        Df3 df3G = this.c0.g(1);
        this.c0 = df3G;
        Df3 df3C = df3G.c(df3G.b);
        this.c0 = df3C;
        df3C.p = df3C.r;
        this.c0.q = 0L;
        this.q.zzN();
        this.h.b();
        Surface surface = this.N;
        if (surface != null) {
            surface.release();
            this.N = null;
        }
        this.W = C0975Gl2.b;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final void zzu() {
        V();
        this.x.b(zzv(), 1);
        R(null);
        this.W = new C0975Gl2(OP2.J(), this.c0.r);
    }

    @Override // com.daaw.InterfaceC6406m12
    public final boolean zzv() {
        V();
        return this.c0.l;
    }

    @Override // com.daaw.InterfaceC6406m12
    public final boolean zzx() {
        V();
        return this.c0.b.b();
    }
}
