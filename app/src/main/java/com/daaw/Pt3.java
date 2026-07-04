package com.daaw;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzzi;
import java.nio.ByteBuffer;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class Pt3 extends So3 implements InterfaceC2457Um1 {
    public static final int[] g1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean h1;
    public static boolean i1;
    public final Context B0;
    public final bu3 C0;
    public final C8882ut3 D0;
    public final C2143Rm1 E0;
    public final boolean F0;
    public Lt3 G0;
    public boolean H0;
    public boolean I0;
    public Surface J0;
    public zzzi K0;
    public boolean L0;
    public int M0;
    public int N0;
    public long O0;
    public long P0;
    public long Q0;
    public int R0;
    public int S0;
    public int T0;
    public long U0;
    public long V0;
    public long W0;
    public int X0;
    public long Y0;
    public C2326Tf2 Z0;
    public C2326Tf2 a1;
    public boolean b1;
    public boolean c1;
    public int d1;
    public St3 e1;
    public InterfaceC2665Wm1 f1;

    public Pt3(Context context, InterfaceC9701xo3 interfaceC9701xo3, Uo3 uo3, long j, boolean z, Handler handler, InterfaceC2249Sm1 interfaceC2249Sm1, int i, float f) {
        Ot3 ot3 = new Ot3(null);
        super(2, interfaceC9701xo3, uo3, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.B0 = applicationContext;
        this.C0 = new bu3(applicationContext);
        this.E0 = new C2143Rm1(handler, interfaceC2249Sm1);
        this.D0 = new C8882ut3(context, ot3, this);
        this.F0 = "NVIDIA".equals(AbstractC9004vJ2.c);
        this.P0 = -9223372036854775807L;
        this.M0 = 1;
        this.Z0 = C2326Tf2.e;
        this.d1 = 0;
        this.N0 = 0;
        this.a1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean M0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 2926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Pt3.M0(java.lang.String):boolean");
    }

    public static List N0(Context context, Uo3 uo3, C2485Ut1 c2485Ut1, boolean z, boolean z2) {
        String str = c2485Ut1.l;
        if (str == null) {
            return OP2.J();
        }
        if (AbstractC9004vJ2.a >= 26 && "video/dolby-vision".equals(str) && !Kt3.a(context)) {
            List listF = AbstractC6352lp3.f(uo3, c2485Ut1, z, z2);
            if (!listF.isEmpty()) {
                return listF;
            }
        }
        return AbstractC6352lp3.h(uo3, c2485Ut1, z, z2);
    }

    public static boolean T0(long j) {
        return j < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int V0(com.daaw.Fo3 r10, com.daaw.C2485Ut1 r11) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Pt3.V0(com.daaw.Fo3, com.daaw.Ut1):int");
    }

    public static int W0(Fo3 fo3, C2485Ut1 c2485Ut1) {
        if (c2485Ut1.m == -1) {
            return V0(fo3, c2485Ut1);
        }
        int size = c2485Ut1.n.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) c2485Ut1.n.get(i)).length;
        }
        return c2485Ut1.m + length;
    }

    @Override // com.daaw.So3
    public final C10259zo3 A0(Throwable th, Fo3 fo3) {
        return new C9726xt3(th, fo3, this.J0);
    }

    @Override // com.daaw.So3
    public final void D0(long j) {
        super.D0(j);
        this.T0--;
    }

    @Override // com.daaw.So3
    public final void E0(H93 h93) {
        this.T0++;
        int i = AbstractC9004vJ2.a;
    }

    @Override // com.daaw.So3
    public final void F0(C2485Ut1 c2485Ut1) {
        if (this.b1 && !this.c1 && !this.D0.i()) {
            this.D0.c(c2485Ut1);
            this.D0.f(x0());
            St3 st3 = this.e1;
            if (st3 != null) {
                this.D0.h(st3);
            }
        }
        if (this.f1 == null && this.D0.i()) {
            InterfaceC2665Wm1 interfaceC2665Wm1A = this.D0.a();
            this.f1 = interfaceC2665Wm1A;
            interfaceC2665Wm1A.b(new C10005yt3(this), VS2.b());
        }
        this.c1 = true;
    }

    @Override // com.daaw.So3, com.daaw.AbstractC7950ra3
    public final void H() {
        this.a1 = null;
        O0(0);
        this.L0 = false;
        try {
            super.H();
        } finally {
            this.E0.c(this.u0);
            this.E0.t(C2326Tf2.e);
        }
    }

    @Override // com.daaw.So3
    public final void H0() {
        super.H0();
        this.T0 = 0;
    }

    @Override // com.daaw.So3, com.daaw.AbstractC7950ra3
    public final void I(boolean z, boolean z2) {
        super.I(z, z2);
        F();
        this.E0.e(this.u0);
        this.N0 = z2 ? 1 : 0;
    }

    public final void I0(InterfaceC9980yo3 interfaceC9980yo3, int i, long j, long j2) {
        int i2 = AbstractC9004vJ2.a;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC9980yo3.a(i, j2);
        Trace.endSection();
        this.u0.e++;
        this.S0 = 0;
        if (this.f1 == null) {
            C();
            this.V0 = AbstractC9004vJ2.C(SystemClock.elapsedRealtime());
            Q0(this.Z0);
            P0();
        }
    }

    @Override // com.daaw.So3, com.daaw.AbstractC7950ra3
    public final void J(long j, boolean z) {
        super.J(j, z);
        if (this.f1 != null) {
            throw null;
        }
        if (this.D0.i()) {
            this.D0.f(x0());
        }
        O0(1);
        this.C0.f();
        this.U0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.S0 = 0;
        this.P0 = -9223372036854775807L;
    }

    public final void J0(InterfaceC9980yo3 interfaceC9980yo3, int i, long j) {
        int i2 = AbstractC9004vJ2.a;
        Trace.beginSection("skipVideoBuffer");
        interfaceC9980yo3.h(i, false);
        Trace.endSection();
        this.u0.f++;
    }

    @Override // com.daaw.AbstractC7950ra3
    public final void K() {
        if (this.D0.i()) {
            this.D0.d();
        }
    }

    public final void K0(int i, int i2) {
        C8787ua3 c8787ua3 = this.u0;
        c8787ua3.h += i;
        int i3 = i + i2;
        c8787ua3.g += i3;
        this.R0 += i3;
        int i4 = this.S0 + i3;
        this.S0 = i4;
        c8787ua3.i = Math.max(i4, c8787ua3.i);
    }

    @Override // com.daaw.So3
    public final float L(float f, C2485Ut1 c2485Ut1, C2485Ut1[] c2485Ut1Arr) {
        float fMax = -1.0f;
        for (C2485Ut1 c2485Ut12 : c2485Ut1Arr) {
            float f2 = c2485Ut12.s;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    public final void L0(long j) {
        C8787ua3 c8787ua3 = this.u0;
        c8787ua3.k += j;
        c8787ua3.l++;
        this.W0 += j;
        this.X0++;
    }

    @Override // com.daaw.So3
    public final int M(Uo3 uo3, C2485Ut1 c2485Ut1) {
        boolean z;
        if (!AbstractC5959kT1.g(c2485Ut1.l)) {
            return 128;
        }
        int i = 0;
        boolean z2 = c2485Ut1.o != null;
        List listN0 = N0(this.B0, uo3, c2485Ut1, z2, false);
        if (z2 && listN0.isEmpty()) {
            listN0 = N0(this.B0, uo3, c2485Ut1, false, false);
        }
        if (listN0.isEmpty()) {
            return 129;
        }
        if (!So3.V(c2485Ut1)) {
            return 130;
        }
        Fo3 fo3 = (Fo3) listN0.get(0);
        boolean zE = fo3.e(c2485Ut1);
        if (zE) {
            z = true;
        } else {
            for (int i2 = 1; i2 < listN0.size(); i2++) {
                Fo3 fo32 = (Fo3) listN0.get(i2);
                if (fo32.e(c2485Ut1)) {
                    fo3 = fo32;
                    z = false;
                    zE = true;
                    break;
                }
            }
            z = true;
        }
        int i3 = true != zE ? 3 : 4;
        int i4 = true != fo3.f(c2485Ut1) ? 8 : 16;
        int i5 = true != fo3.g ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (AbstractC9004vJ2.a >= 26 && "video/dolby-vision".equals(c2485Ut1.l) && !Kt3.a(this.B0)) {
            i6 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (zE) {
            List listN02 = N0(this.B0, uo3, c2485Ut1, z2, true);
            if (!listN02.isEmpty()) {
                Fo3 fo33 = (Fo3) AbstractC6352lp3.i(listN02, c2485Ut1).get(0);
                if (fo33.e(c2485Ut1) && fo33.f(c2485Ut1)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.daaw.So3
    public final C9631xa3 N(Fo3 fo3, C2485Ut1 c2485Ut1, C2485Ut1 c2485Ut12) {
        int i;
        int i2;
        C9631xa3 c9631xa3B = fo3.b(c2485Ut1, c2485Ut12);
        int i3 = c9631xa3B.e;
        Lt3 lt3 = this.G0;
        lt3.getClass();
        if (c2485Ut12.q > lt3.a || c2485Ut12.r > lt3.b) {
            i3 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (W0(fo3, c2485Ut12) > lt3.c) {
            i3 |= 64;
        }
        String str = fo3.a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = c9631xa3B.d;
            i2 = 0;
        }
        return new C9631xa3(str, c2485Ut1, c2485Ut12, i, i2);
    }

    @Override // com.daaw.So3
    public final C9631xa3 O(C5730je3 c5730je3) {
        C9631xa3 c9631xa3O = super.O(c5730je3);
        C2485Ut1 c2485Ut1 = c5730je3.a;
        c2485Ut1.getClass();
        this.E0.f(c2485Ut1, c9631xa3O);
        return c9631xa3O;
    }

    public final void O0(int i) {
        this.N0 = Math.min(this.N0, i);
        int i2 = AbstractC9004vJ2.a;
    }

    public final void P0() {
        Surface surface = this.J0;
        if (surface == null || this.N0 == 3) {
            return;
        }
        this.N0 = 3;
        this.E0.q(surface);
        this.L0 = true;
    }

    public final void Q0(C2326Tf2 c2326Tf2) {
        if (c2326Tf2.equals(C2326Tf2.e) || c2326Tf2.equals(this.a1)) {
            return;
        }
        this.a1 = c2326Tf2;
        this.E0.t(c2326Tf2);
    }

    public final void R0() {
        C2326Tf2 c2326Tf2 = this.a1;
        if (c2326Tf2 != null) {
            this.E0.t(c2326Tf2);
        }
    }

    public final void S0() {
        Surface surface = this.J0;
        zzzi zzziVar = this.K0;
        if (surface == zzziVar) {
            this.J0 = null;
        }
        if (zzziVar != null) {
            zzziVar.release();
            this.K0 = null;
        }
    }

    @Override // com.daaw.So3
    public final boolean U(Fo3 fo3) {
        return this.J0 != null || U0(fo3);
    }

    public final boolean U0(Fo3 fo3) {
        if (AbstractC9004vJ2.a < 23 || M0(fo3.a)) {
            return false;
        }
        return !fo3.f || zzzi.b(this.B0);
    }

    public final void X0(InterfaceC9980yo3 interfaceC9980yo3, int i, long j) {
        int i2 = AbstractC9004vJ2.a;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC9980yo3.h(i, true);
        Trace.endSection();
        this.u0.e++;
        this.S0 = 0;
        if (this.f1 == null) {
            C();
            this.V0 = AbstractC9004vJ2.C(SystemClock.elapsedRealtime());
            Q0(this.Z0);
            P0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.daaw.yo3] */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.daaw.ut3] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.daaw.bu3] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.google.android.gms.internal.ads.zzzi] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.daaw.Jf3
    public final void b(int i, Object obj) throws Sa3 {
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                obj.getClass();
                St3 st3 = (St3) obj;
                this.e1 = st3;
                this.D0.h(st3);
                return;
            }
            if (i == 10) {
                obj.getClass();
                int iIntValue = ((Integer) obj).intValue();
                if (this.d1 != iIntValue) {
                    this.d1 = iIntValue;
                    return;
                }
                return;
            }
            if (i == 4) {
                obj.getClass();
                int iIntValue2 = ((Integer) obj).intValue();
                this.M0 = iIntValue2;
                InterfaceC9980yo3 interfaceC9980yo3Z0 = z0();
                if (interfaceC9980yo3Z0 != null) {
                    interfaceC9980yo3Z0.g(iIntValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                bu3 bu3Var = this.C0;
                obj.getClass();
                bu3Var.j(((Integer) obj).intValue());
                return;
            }
            if (i == 13) {
                obj.getClass();
                this.D0.g((List) obj);
                this.b1 = true;
                return;
            } else {
                if (i != 14) {
                    return;
                }
                obj.getClass();
                NE2 ne2 = (NE2) obj;
                if (!this.D0.i() || ne2.b() == 0 || ne2.a() == 0 || (surface = this.J0) == null) {
                    return;
                }
                this.D0.e(surface, ne2);
                return;
            }
        }
        ?? A = obj instanceof Surface ? (Surface) obj : 0;
        if (A == 0) {
            zzzi zzziVar = this.K0;
            if (zzziVar != null) {
                A = zzziVar;
            } else {
                Fo3 fo3B0 = B0();
                if (fo3B0 != null && U0(fo3B0)) {
                    A = zzzi.a(this.B0, fo3B0.f);
                    this.K0 = A;
                }
            }
        }
        if (this.J0 == A) {
            if (A == 0 || A == this.K0) {
                return;
            }
            R0();
            Surface surface2 = this.J0;
            if (surface2 == null || !this.L0) {
                return;
            }
            this.E0.q(surface2);
            return;
        }
        this.J0 = A;
        this.C0.i(A);
        this.L0 = false;
        int iG = g();
        ?? Z0 = z0();
        ?? r7 = A;
        if (Z0 != 0) {
            r7 = A;
            if (!this.D0.i()) {
                ?? r72 = A;
                if (AbstractC9004vJ2.a < 23) {
                    G0();
                    C0();
                    r7 = r72;
                } else {
                    if (A != 0) {
                        r72 = A;
                        if (!this.H0) {
                            Z0.f(A);
                            r7 = A;
                        }
                    } else {
                        r72 = 0;
                    }
                    G0();
                    C0();
                    r7 = r72;
                }
            }
        }
        if (r7 == 0 || r7 == this.K0) {
            this.a1 = null;
            O0(1);
            if (this.D0.i()) {
                this.D0.b();
                return;
            }
            return;
        }
        R0();
        O0(1);
        if (iG == 2) {
            this.P0 = -9223372036854775807L;
        }
        if (this.D0.i()) {
            this.D0.e(r7, NE2.c);
        }
    }

    @Override // com.daaw.So3, com.daaw.Uf3
    public final void e(float f, float f2) throws Sa3 {
        super.e(f, f2);
        this.C0.e(f);
        if (this.f1 != null) {
            AbstractC6048km2.d(((double) f) >= 0.0d);
        }
    }

    @Override // com.daaw.So3, com.daaw.Uf3
    public final boolean i() {
        return super.i() && this.f1 == null;
    }

    @Override // com.daaw.So3
    public final C9422wo3 k0(Fo3 fo3, C2485Ut1 c2485Ut1, MediaCrypto mediaCrypto, float f) {
        Lt3 lt3;
        Point point;
        int i;
        int i2;
        Pair pairB;
        int iV0;
        zzzi zzziVar = this.K0;
        if (zzziVar != null) {
            if (zzziVar.B != fo3.f) {
                S0();
            }
        }
        String str = fo3.c;
        C2485Ut1[] c2485Ut1ArrX = x();
        int iMax = c2485Ut1.q;
        int iMax2 = c2485Ut1.r;
        int iW0 = W0(fo3, c2485Ut1);
        int length = c2485Ut1ArrX.length;
        if (length == 1) {
            if (iW0 != -1 && (iV0 = V0(fo3, c2485Ut1)) != -1) {
                iW0 = Math.min((int) (iW0 * 1.5f), iV0);
            }
            lt3 = new Lt3(iMax, iMax2, iW0);
        } else {
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                C2485Ut1 c2485Ut1D = c2485Ut1ArrX[i3];
                if (c2485Ut1.x != null && c2485Ut1D.x == null) {
                    C1106Hs1 c1106Hs1B = c2485Ut1D.b();
                    c1106Hs1B.a(c2485Ut1.x);
                    c2485Ut1D = c1106Hs1B.D();
                }
                if (fo3.b(c2485Ut1, c2485Ut1D).d != 0) {
                    int i4 = c2485Ut1D.q;
                    z |= i4 == -1 || c2485Ut1D.r == -1;
                    iMax = Math.max(iMax, i4);
                    iMax2 = Math.max(iMax2, c2485Ut1D.r);
                    iW0 = Math.max(iW0, W0(fo3, c2485Ut1D));
                }
            }
            if (z) {
                AbstractC3305ay2.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i5 = c2485Ut1.r;
                int i6 = c2485Ut1.q;
                boolean z2 = i5 > i6;
                int i7 = z2 ? i5 : i6;
                if (true == z2) {
                    i5 = i6;
                }
                int[] iArr = g1;
                int i8 = 0;
                while (i8 < 9) {
                    float f2 = i5;
                    int[] iArr2 = iArr;
                    float f3 = i7;
                    int i9 = iArr2[i8];
                    int i10 = i8;
                    float f4 = i9;
                    if (i9 <= i7 || (i = (int) (f4 * (f2 / f3))) <= i5) {
                        break;
                    }
                    int i11 = i5;
                    if (AbstractC9004vJ2.a >= 21) {
                        int i12 = true != z2 ? i9 : i;
                        if (true != z2) {
                            i9 = i;
                        }
                        point = fo3.a(i12, i9);
                        float f5 = c2485Ut1.s;
                        if (point != null) {
                            i2 = i7;
                            if (fo3.g(point.x, point.y, f5)) {
                                break;
                            }
                        } else {
                            i2 = i7;
                        }
                        i8 = i10 + 1;
                        iArr = iArr2;
                        i5 = i11;
                        i7 = i2;
                    } else {
                        i2 = i7;
                        try {
                            int i13 = ((i9 + 15) / 16) * 16;
                            int i14 = ((i + 15) / 16) * 16;
                            if (i13 * i14 <= AbstractC6352lp3.a()) {
                                int i15 = true != z2 ? i13 : i14;
                                if (true != z2) {
                                    i13 = i14;
                                }
                                point = new Point(i15, i13);
                            } else {
                                i8 = i10 + 1;
                                iArr = iArr2;
                                i5 = i11;
                                i7 = i2;
                            }
                        } catch (C3544bp3 unused) {
                            point = null;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C1106Hs1 c1106Hs1B2 = c2485Ut1.b();
                    c1106Hs1B2.C(iMax);
                    c1106Hs1B2.h(iMax2);
                    iW0 = Math.max(iW0, V0(fo3, c1106Hs1B2.D()));
                    AbstractC3305ay2.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            lt3 = new Lt3(iMax, iMax2, iW0);
        }
        this.G0 = lt3;
        boolean z3 = this.F0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c2485Ut1.q);
        mediaFormat.setInteger("height", c2485Ut1.r);
        AbstractC2196Rz2.b(mediaFormat, c2485Ut1.n);
        float f6 = c2485Ut1.s;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        AbstractC2196Rz2.a(mediaFormat, "rotation-degrees", c2485Ut1.t);
        Ho3 ho3 = c2485Ut1.x;
        if (ho3 != null) {
            AbstractC2196Rz2.a(mediaFormat, "color-transfer", ho3.c);
            AbstractC2196Rz2.a(mediaFormat, "color-standard", ho3.a);
            AbstractC2196Rz2.a(mediaFormat, "color-range", ho3.b);
            byte[] bArr = ho3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c2485Ut1.l) && (pairB = AbstractC6352lp3.b(c2485Ut1)) != null) {
            AbstractC2196Rz2.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", lt3.a);
        mediaFormat.setInteger("max-height", lt3.b);
        AbstractC2196Rz2.a(mediaFormat, "max-input-size", lt3.c);
        if (AbstractC9004vJ2.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.J0 == null) {
            if (!U0(fo3)) {
                throw new IllegalStateException();
            }
            if (this.K0 == null) {
                this.K0 = zzzi.a(this.B0, fo3.f);
            }
            this.J0 = this.K0;
        }
        InterfaceC2665Wm1 interfaceC2665Wm1 = this.f1;
        if (interfaceC2665Wm1 != null && !interfaceC2665Wm1.zzf()) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.f1 == null) {
            return C9422wo3.b(fo3, mediaFormat, c2485Ut1, this.J0, null);
        }
        throw null;
    }

    @Override // com.daaw.So3
    public final List l0(Uo3 uo3, C2485Ut1 c2485Ut1, boolean z) {
        return AbstractC6352lp3.i(N0(this.B0, uo3, c2485Ut1, false, false), c2485Ut1);
    }

    @Override // com.daaw.So3
    public final void m0(H93 h93) {
        if (this.I0) {
            ByteBuffer byteBuffer = h93.g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC9980yo3 interfaceC9980yo3Z0 = z0();
                        interfaceC9980yo3Z0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC9980yo3Z0.q(bundle);
                    }
                }
            }
        }
    }

    @Override // com.daaw.So3
    public final void n0(Exception exc) {
        AbstractC3305ay2.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.E0.s(exc);
    }

    @Override // com.daaw.So3
    public final void o0(String str, C9422wo3 c9422wo3, long j, long j2) {
        this.E0.a(str, j, j2);
        this.H0 = M0(str);
        Fo3 fo3B0 = B0();
        fo3B0.getClass();
        boolean z = false;
        if (AbstractC9004vJ2.a >= 29 && "video/x-vnd.on2.vp9".equals(fo3B0.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = fo3B0.h();
            int length = codecProfileLevelArrH.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArrH[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.I0 = z;
    }

    @Override // com.daaw.So3
    public final void p0(String str) {
        this.E0.b(str);
    }

    @Override // com.daaw.So3
    public final void q0(C2485Ut1 c2485Ut1, MediaFormat mediaFormat) {
        InterfaceC9980yo3 interfaceC9980yo3Z0 = z0();
        if (interfaceC9980yo3Z0 != null) {
            interfaceC9980yo3Z0.g(this.M0);
        }
        mediaFormat.getClass();
        int i = 0;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = c2485Ut1.u;
        if (AbstractC9004vJ2.a >= 21) {
            int i2 = c2485Ut1.t;
            if (i2 == 90 || i2 == 270) {
                f = 1.0f / f;
                int i3 = integer2;
                integer2 = integer;
                integer = i3;
            }
        } else if (this.f1 == null) {
            i = c2485Ut1.t;
        }
        this.Z0 = new C2326Tf2(integer, integer2, i, f);
        this.C0.c(c2485Ut1.s);
        InterfaceC2665Wm1 interfaceC2665Wm1 = this.f1;
        if (interfaceC2665Wm1 != null) {
            C1106Hs1 c1106Hs1B = c2485Ut1.b();
            c1106Hs1B.C(integer);
            c1106Hs1B.h(integer2);
            c1106Hs1B.t(i);
            c1106Hs1B.r(f);
            interfaceC2665Wm1.a(1, c1106Hs1B.D());
        }
    }

    @Override // com.daaw.So3, com.daaw.AbstractC7950ra3
    public final void r() {
        try {
            super.r();
            this.c1 = false;
            if (this.K0 != null) {
                S0();
            }
        } catch (Throwable th) {
            this.c1 = false;
            if (this.K0 != null) {
                S0();
            }
            throw th;
        }
    }

    @Override // com.daaw.AbstractC7950ra3
    public final void s() {
        this.R0 = 0;
        C();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.Q0 = jElapsedRealtime;
        this.V0 = AbstractC9004vJ2.C(jElapsedRealtime);
        this.W0 = 0L;
        this.X0 = 0;
        this.C0.g();
    }

    @Override // com.daaw.So3
    public final void s0() {
        O0(2);
        if (this.D0.i()) {
            this.D0.f(x0());
        }
    }

    @Override // com.daaw.AbstractC7950ra3
    public final void t() {
        this.P0 = -9223372036854775807L;
        if (this.R0 > 0) {
            C();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.E0.d(this.R0, jElapsedRealtime - this.Q0);
            this.R0 = 0;
            this.Q0 = jElapsedRealtime;
        }
        int i = this.X0;
        if (i != 0) {
            this.E0.r(this.W0, i);
            this.W0 = 0L;
            this.X0 = 0;
        }
        this.C0.h();
    }

    @Override // com.daaw.So3, com.daaw.Uf3
    public final boolean u() {
        InterfaceC2665Wm1 interfaceC2665Wm1;
        zzzi zzziVar;
        if (super.u() && (((interfaceC2665Wm1 = this.f1) == null || interfaceC2665Wm1.zzg()) && (this.N0 == 3 || (((zzziVar = this.K0) != null && this.J0 == zzziVar) || z0() == null)))) {
            this.P0 = -9223372036854775807L;
            return true;
        }
        if (this.P0 == -9223372036854775807L) {
            return false;
        }
        C();
        if (SystemClock.elapsedRealtime() < this.P0) {
            return true;
        }
        this.P0 = -9223372036854775807L;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
    
        if (r15 > 100000) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        if (r19 >= y0()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (r14 == 2) goto L53;
     */
    @Override // com.daaw.So3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u0(long r19, long r21, com.daaw.InterfaceC9980yo3 r23, java.nio.ByteBuffer r24, int r25, int r26, int r27, long r28, boolean r30, boolean r31, com.daaw.C2485Ut1 r32) throws com.daaw.Sa3 {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Pt3.u0(long, long, com.daaw.yo3, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.daaw.Ut1):boolean");
    }

    @Override // com.daaw.Uf3, com.daaw.Yf3
    public final String zzR() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.daaw.AbstractC7950ra3, com.daaw.Uf3
    public final void zzs() {
        if (this.N0 == 0) {
            this.N0 = 1;
        }
    }
}
