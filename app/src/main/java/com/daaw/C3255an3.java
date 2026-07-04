package com.daaw;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.an3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3255an3 extends So3 implements Ae3 {
    public final Context B0;
    public final Xk3 C0;
    public final InterfaceC6332ll3 D0;
    public int E0;
    public boolean F0;
    public C2485Ut1 G0;
    public C2485Ut1 H0;
    public long I0;
    public boolean J0;
    public boolean K0;
    public Sf3 L0;

    public C3255an3(Context context, InterfaceC9701xo3 interfaceC9701xo3, Uo3 uo3, boolean z, Handler handler, Zk3 zk3, InterfaceC6332ll3 interfaceC6332ll3) {
        super(1, interfaceC9701xo3, uo3, false, 44100.0f);
        this.B0 = context.getApplicationContext();
        this.D0 = interfaceC6332ll3;
        this.C0 = new Xk3(handler, zk3);
        interfaceC6332ll3.m(new Ym3(this, null));
    }

    public static List J0(Uo3 uo3, C2485Ut1 c2485Ut1, boolean z, InterfaceC6332ll3 interfaceC6332ll3) {
        Fo3 fo3D;
        return c2485Ut1.l == null ? OP2.J() : (!interfaceC6332ll3.n(c2485Ut1) || (fo3D = AbstractC6352lp3.d()) == null) ? AbstractC6352lp3.h(uo3, c2485Ut1, false, false) : OP2.K(fo3D);
    }

    @Override // com.daaw.So3, com.daaw.AbstractC7950ra3
    public final void H() {
        this.K0 = true;
        this.G0 = null;
        try {
            this.D0.zzf();
            try {
                super.H();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.H();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.daaw.So3, com.daaw.AbstractC7950ra3
    public final void I(boolean z, boolean z2) {
        super.I(z, z2);
        this.C0.f(this.u0);
        F();
        this.D0.g(G());
        this.D0.h(C());
    }

    public final int I0(Fo3 fo3, C2485Ut1 c2485Ut1) {
        int i;
        if (!"OMX.google.raw.decoder".equals(fo3.a) || (i = AbstractC9004vJ2.a) >= 24 || (i == 23 && AbstractC9004vJ2.h(this.B0))) {
            return c2485Ut1.m;
        }
        return -1;
    }

    @Override // com.daaw.So3, com.daaw.AbstractC7950ra3
    public final void J(long j, boolean z) {
        super.J(j, z);
        this.D0.zzf();
        this.I0 = j;
        this.J0 = true;
    }

    @Override // com.daaw.So3
    public final float L(float f, C2485Ut1 c2485Ut1, C2485Ut1[] c2485Ut1Arr) {
        int iMax = -1;
        for (C2485Ut1 c2485Ut12 : c2485Ut1Arr) {
            int i = c2485Ut12.z;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    @Override // com.daaw.So3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(com.daaw.Uo3 r12, com.daaw.C2485Ut1 r13) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3255an3.M(com.daaw.Uo3, com.daaw.Ut1):int");
    }

    @Override // com.daaw.So3
    public final C9631xa3 N(Fo3 fo3, C2485Ut1 c2485Ut1, C2485Ut1 c2485Ut12) {
        int i;
        int i2;
        C9631xa3 c9631xa3B = fo3.b(c2485Ut1, c2485Ut12);
        int i3 = c9631xa3B.e;
        if (T(c2485Ut12)) {
            i3 |= 32768;
        }
        if (I0(fo3, c2485Ut12) > this.E0) {
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
        C2485Ut1 c2485Ut1 = c5730je3.a;
        c2485Ut1.getClass();
        this.G0 = c2485Ut1;
        C9631xa3 c9631xa3O = super.O(c5730je3);
        this.C0.g(c2485Ut1, c9631xa3O);
        return c9631xa3O;
    }

    public final void Y() {
        long jA = this.D0.a(i());
        if (jA != Long.MIN_VALUE) {
            if (!this.J0) {
                jA = Math.max(this.I0, jA);
            }
            this.I0 = jA;
            this.J0 = false;
        }
    }

    @Override // com.daaw.Jf3
    public final void b(int i, Object obj) {
        if (i == 2) {
            InterfaceC6332ll3 interfaceC6332ll3 = this.D0;
            obj.getClass();
            interfaceC6332ll3.f(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            C7965rd3 c7965rd3 = (C7965rd3) obj;
            InterfaceC6332ll3 interfaceC6332ll32 = this.D0;
            c7965rd3.getClass();
            interfaceC6332ll32.q(c7965rd3);
            return;
        }
        if (i == 6) {
            Te3 te3 = (Te3) obj;
            InterfaceC6332ll3 interfaceC6332ll33 = this.D0;
            te3.getClass();
            interfaceC6332ll33.r(te3);
            return;
        }
        switch (i) {
            case 9:
                InterfaceC6332ll3 interfaceC6332ll34 = this.D0;
                obj.getClass();
                interfaceC6332ll34.e(((Boolean) obj).booleanValue());
                break;
            case 10:
                InterfaceC6332ll3 interfaceC6332ll35 = this.D0;
                obj.getClass();
                interfaceC6332ll35.b(((Integer) obj).intValue());
                break;
            case 11:
                this.L0 = (Sf3) obj;
                break;
            case 12:
                if (AbstractC9004vJ2.a >= 23) {
                    Um3.a(this.D0, obj);
                }
                break;
        }
    }

    @Override // com.daaw.Ae3
    public final void d(C7375pW1 c7375pW1) {
        this.D0.d(c7375pW1);
    }

    @Override // com.daaw.So3, com.daaw.Uf3
    public final boolean i() {
        return super.i() && this.D0.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    @Override // com.daaw.So3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C9422wo3 k0(com.daaw.Fo3 r8, com.daaw.C2485Ut1 r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3255an3.k0(com.daaw.Fo3, com.daaw.Ut1, android.media.MediaCrypto, float):com.daaw.wo3");
    }

    @Override // com.daaw.So3
    public final List l0(Uo3 uo3, C2485Ut1 c2485Ut1, boolean z) {
        return AbstractC6352lp3.i(J0(uo3, c2485Ut1, false, this.D0), c2485Ut1);
    }

    @Override // com.daaw.So3
    public final void m0(H93 h93) {
        C2485Ut1 c2485Ut1;
        if (AbstractC9004vJ2.a < 29 || (c2485Ut1 = h93.b) == null) {
            return;
        }
        String str = c2485Ut1.l;
        if ((str == "audio/opus" || (str != null && str.equals("audio/opus"))) && S()) {
            ByteBuffer byteBuffer = h93.g;
            byteBuffer.getClass();
            C2485Ut1 c2485Ut12 = h93.b;
            c2485Ut12.getClass();
            if (byteBuffer.remaining() == 8) {
                this.D0.j(c2485Ut12.B, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    @Override // com.daaw.So3
    public final void n0(Exception exc) {
        AbstractC3305ay2.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.C0.a(exc);
    }

    @Override // com.daaw.So3
    public final void o0(String str, C9422wo3 c9422wo3, long j, long j2) {
        this.C0.c(str, j, j2);
    }

    @Override // com.daaw.So3
    public final void p0(String str) {
        this.C0.d(str);
    }

    @Override // com.daaw.So3
    public final void q0(C2485Ut1 c2485Ut1, MediaFormat mediaFormat) throws Sa3 {
        int i;
        C2485Ut1 c2485Ut12 = this.H0;
        int[] iArr = null;
        if (c2485Ut12 != null) {
            c2485Ut1 = c2485Ut12;
        } else if (z0() != null) {
            mediaFormat.getClass();
            int iW = "audio/raw".equals(c2485Ut1.l) ? c2485Ut1.A : (AbstractC9004vJ2.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? AbstractC9004vJ2.w(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            C1106Hs1 c1106Hs1 = new C1106Hs1();
            c1106Hs1.u("audio/raw");
            c1106Hs1.p(iW);
            c1106Hs1.e(c2485Ut1.B);
            c1106Hs1.f(c2485Ut1.C);
            c1106Hs1.o(c2485Ut1.j);
            c1106Hs1.j(c2485Ut1.a);
            c1106Hs1.l(c2485Ut1.b);
            c1106Hs1.m(c2485Ut1.c);
            c1106Hs1.w(c2485Ut1.d);
            c1106Hs1.k0(mediaFormat.getInteger("channel-count"));
            c1106Hs1.v(mediaFormat.getInteger("sample-rate"));
            C2485Ut1 c2485Ut1D = c1106Hs1.D();
            if (this.F0 && c2485Ut1D.y == 6 && (i = c2485Ut1.y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < c2485Ut1.y; i2++) {
                    iArr[i2] = i2;
                }
            }
            c2485Ut1 = c2485Ut1D;
        }
        try {
            int i3 = AbstractC9004vJ2.a;
            if (i3 >= 29) {
                if (S()) {
                    F();
                }
                AbstractC6048km2.f(i3 >= 29);
            }
            this.D0.o(c2485Ut1, 0, iArr);
        } catch (C3524bl3 e) {
            throw D(e, e.B, false, 5001);
        }
    }

    @Override // com.daaw.So3, com.daaw.AbstractC7950ra3
    public final void r() {
        try {
            super.r();
            if (this.K0) {
                this.K0 = false;
                this.D0.zzk();
            }
        } catch (Throwable th) {
            if (this.K0) {
                this.K0 = false;
                this.D0.zzk();
            }
            throw th;
        }
    }

    public final void r0() {
        this.J0 = true;
    }

    @Override // com.daaw.AbstractC7950ra3
    public final void s() {
        this.D0.zzi();
    }

    @Override // com.daaw.So3
    public final void s0() {
        this.D0.zzg();
    }

    @Override // com.daaw.AbstractC7950ra3
    public final void t() {
        Y();
        this.D0.zzh();
    }

    @Override // com.daaw.So3
    public final void t0() throws Sa3 {
        try {
            this.D0.zzj();
        } catch (C5765jl3 e) {
            throw D(e, e.D, e.C, 5002);
        }
    }

    @Override // com.daaw.So3, com.daaw.Uf3
    public final boolean u() {
        return this.D0.zzx() || super.u();
    }

    @Override // com.daaw.So3
    public final boolean u0(long j, long j2, InterfaceC9980yo3 interfaceC9980yo3, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2485Ut1 c2485Ut1) throws Sa3 {
        byteBuffer.getClass();
        if (this.H0 != null && (i2 & 2) != 0) {
            interfaceC9980yo3.getClass();
            interfaceC9980yo3.h(i, false);
            return true;
        }
        if (z) {
            if (interfaceC9980yo3 != null) {
                interfaceC9980yo3.h(i, false);
            }
            this.u0.f += i3;
            this.D0.zzg();
            return true;
        }
        try {
            if (!this.D0.p(byteBuffer, j3, i3)) {
                return false;
            }
            if (interfaceC9980yo3 != null) {
                interfaceC9980yo3.h(i, false);
            }
            this.u0.e += i3;
            return true;
        } catch (C4081dl3 e) {
            throw D(e, this.G0, e.C, 5001);
        } catch (C5765jl3 e2) {
            throw D(e2, c2485Ut1, e2.C, 5002);
        }
    }

    @Override // com.daaw.So3
    public final boolean v0(C2485Ut1 c2485Ut1) {
        F();
        return this.D0.n(c2485Ut1);
    }

    @Override // com.daaw.Uf3, com.daaw.Yf3
    public final String zzR() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.daaw.Ae3
    public final long zza() {
        if (g() == 2) {
            Y();
        }
        return this.I0;
    }

    @Override // com.daaw.Ae3
    public final C7375pW1 zzc() {
        return this.D0.zzc();
    }

    @Override // com.daaw.AbstractC7950ra3
    public final void K() {
    }

    @Override // com.daaw.AbstractC7950ra3, com.daaw.Uf3
    public final Ae3 zzk() {
        return this;
    }
}
