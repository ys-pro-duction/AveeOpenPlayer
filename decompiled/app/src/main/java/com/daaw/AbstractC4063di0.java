package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.daaw.InterfaceC2931Zb;
import com.daaw.InterfaceC3196ac;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.di0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4063di0 extends AbstractC4630fi0 implements InterfaceC3784ci0 {
    public boolean A0;
    public MediaFormat B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public long G0;
    public boolean H0;
    public boolean I0;
    public final Context v0;
    public final InterfaceC2931Zb.a w0;
    public final InterfaceC3196ac x0;
    public int y0;
    public boolean z0;

    /* JADX INFO: renamed from: com.daaw.di0$b */
    public final class b implements InterfaceC3196ac.c {
        public b() {
        }

        @Override // com.daaw.InterfaceC3196ac.c
        public void a(int i) {
            AbstractC4063di0.this.w0.b(i);
            AbstractC4063di0.this.E0(i);
        }

        @Override // com.daaw.InterfaceC3196ac.c
        public void b(int i, long j, long j2) {
            AbstractC4063di0.this.w0.c(i, j, j2);
            AbstractC4063di0.this.G0(i, j, j2);
        }

        @Override // com.daaw.InterfaceC3196ac.c
        public void c() {
            AbstractC4063di0.this.F0();
            AbstractC4063di0.this.I0 = true;
        }
    }

    public AbstractC4063di0(Context context, InterfaceC4909gi0 interfaceC4909gi0, InterfaceC7580qE interfaceC7580qE, boolean z, Handler handler, InterfaceC2931Zb interfaceC2931Zb, C2201Sb c2201Sb, InterfaceC2827Yb... interfaceC2827YbArr) {
        this(context, interfaceC4909gi0, interfaceC7580qE, z, handler, interfaceC2931Zb, new C1847Ow(c2201Sb, interfaceC2827YbArr));
    }

    public static boolean A0(String str) {
        if (AbstractC6280lb1.a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(AbstractC6280lb1.c)) {
            return false;
        }
        String str2 = AbstractC6280lb1.b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void A(boolean z) {
        super.A(z);
        this.w0.f(this.t0);
        int i = v().a;
        if (i != 0) {
            this.x0.q(i);
        } else {
            this.x0.l();
        }
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void B(long j, boolean z) {
        super.B(j, z);
        this.x0.reset();
        this.G0 = j;
        this.H0 = true;
        this.I0 = true;
    }

    public final int B0(C4341ei0 c4341ei0, Format format) {
        PackageManager packageManager;
        int i = AbstractC6280lb1.a;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(c4341ei0.a) || (i == 23 && (packageManager = this.v0.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return format.H;
        }
        return -1;
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void C() {
        super.C();
        this.x0.r();
    }

    public int C0(C4341ei0 c4341ei0, Format format, Format[] formatArr) {
        return B0(c4341ei0, format);
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void D() {
        H0();
        this.x0.b();
        super.D();
    }

    public MediaFormat D0(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.S);
        mediaFormat.setInteger("sample-rate", format.T);
        AbstractC8545ti0.e(mediaFormat, format.I);
        AbstractC8545ti0.d(mediaFormat, "max-input-size", i);
        if (AbstractC6280lb1.a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
    }

    public final void H0() {
        long jK = this.x0.k(c());
        if (jK != Long.MIN_VALUE) {
            if (!this.I0) {
                jK = Math.max(this.G0, jK);
            }
            this.G0 = jK;
            this.I0 = false;
        }
    }

    @Override // com.daaw.AbstractC4630fi0
    public int I(MediaCodec mediaCodec, C4341ei0 c4341ei0, Format format, Format format2) {
        return 0;
    }

    @Override // com.daaw.AbstractC4630fi0
    public void Q(C4341ei0 c4341ei0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.y0 = C0(c4341ei0, format, x());
        this.A0 = A0(c4341ei0.a);
        this.z0 = c4341ei0.g;
        String str = c4341ei0.b;
        if (str == null) {
            str = "audio/raw";
        }
        MediaFormat mediaFormatD0 = D0(format, str, this.y0);
        mediaCodec.configure(mediaFormatD0, (Surface) null, mediaCrypto, 0);
        if (!this.z0) {
            this.B0 = null;
        } else {
            this.B0 = mediaFormatD0;
            mediaFormatD0.setString("mime", format.G);
        }
    }

    @Override // com.daaw.AbstractC4630fi0
    public C4341ei0 X(InterfaceC4909gi0 interfaceC4909gi0, Format format, boolean z) {
        C4341ei0 c4341ei0A;
        return (!z0(format.G) || (c4341ei0A = interfaceC4909gi0.a()) == null) ? super.X(interfaceC4909gi0, format, z) : c4341ei0A;
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.VH0
    public boolean a() {
        return this.x0.j() || super.a();
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.VH0
    public boolean c() {
        return super.c() && this.x0.c();
    }

    @Override // com.daaw.InterfaceC3784ci0
    public C9457ww0 d(C9457ww0 c9457ww0) {
        return this.x0.d(c9457ww0);
    }

    @Override // com.daaw.AbstractC4630fi0
    public void e0(String str, long j, long j2) {
        this.w0.d(str, j, j2);
    }

    @Override // com.daaw.AbstractC4630fi0
    public void f0(Format format) {
        super.f0(format);
        this.w0.g(format);
        this.C0 = "audio/raw".equals(format.G) ? format.U : 2;
        this.D0 = format.S;
        this.E0 = format.V;
        this.F0 = format.W;
    }

    @Override // com.daaw.InterfaceC3784ci0
    public C9457ww0 g() {
        return this.x0.g();
    }

    @Override // com.daaw.AbstractC4630fi0
    public void g0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws VI {
        int iC;
        int[] iArr;
        int i;
        MediaFormat mediaFormat2 = this.B0;
        if (mediaFormat2 != null) {
            iC = AbstractC8834uk0.c(mediaFormat2.getString("mime"));
            mediaFormat = this.B0;
        } else {
            iC = this.C0;
        }
        int i2 = iC;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.A0 && integer == 6 && (i = this.D0) < 6) {
            iArr = new int[i];
            for (int i3 = 0; i3 < this.D0; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            this.x0.h(i2, integer, integer2, 0, iArr, this.E0, this.F0);
        } catch (InterfaceC3196ac.a e) {
            throw VI.a(e, w());
        }
    }

    @Override // com.daaw.AbstractC4630fi0
    public void i0(C1016Gw c1016Gw) {
        if (!this.H0 || c1016Gw.o()) {
            return;
        }
        if (Math.abs(c1016Gw.E - this.G0) > 500000) {
            this.G0 = c1016Gw.E;
        }
        this.H0 = false;
    }

    @Override // com.daaw.AbstractC4630fi0
    public boolean k0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws VI {
        if (this.z0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.t0.f++;
            this.x0.n();
            return true;
        }
        try {
            if (!this.x0.p(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.t0.e++;
            return true;
        } catch (InterfaceC3196ac.b | InterfaceC3196ac.d e) {
            throw VI.a(e, w());
        }
    }

    @Override // com.daaw.InterfaceC3784ci0
    public long n() {
        if (getState() == 2) {
            H0();
        }
        return this.G0;
    }

    @Override // com.daaw.AbstractC4630fi0
    public void o0() throws VI {
        try {
            this.x0.i();
        } catch (InterfaceC3196ac.d e) {
            throw VI.a(e, w());
        }
    }

    @Override // com.daaw.AbstractC1048He, com.daaw.C0488Bw0.b
    public void q(int i, Object obj) {
        if (i == 2) {
            this.x0.o(((Float) obj).floatValue());
        } else if (i != 3) {
            super.q(i, obj);
        } else {
            this.x0.m((C2097Rb) obj);
        }
    }

    @Override // com.daaw.AbstractC4630fi0
    public int v0(InterfaceC4909gi0 interfaceC4909gi0, InterfaceC7580qE interfaceC7580qE, Format format) {
        boolean z;
        int i;
        int i2;
        String str = format.G;
        if (!AbstractC8834uk0.k(str)) {
            return 0;
        }
        int i3 = AbstractC6280lb1.a >= 21 ? 32 : 0;
        boolean zH = AbstractC1048He.H(interfaceC7580qE, format.J);
        if (zH && z0(str) && interfaceC4909gi0.a() != null) {
            return i3 | 12;
        }
        if (("audio/raw".equals(str) && !this.x0.s(format.U)) || !this.x0.s(2)) {
            return 1;
        }
        DrmInitData drmInitData = format.J;
        if (drmInitData != null) {
            z = false;
            for (int i4 = 0; i4 < drmInitData.E; i4++) {
                z |= drmInitData.e(i4).F;
            }
        } else {
            z = false;
        }
        C4341ei0 c4341ei0B = interfaceC4909gi0.b(str, z);
        if (c4341ei0B == null) {
            return (!z || interfaceC4909gi0.b(str, false) == null) ? 1 : 2;
        }
        if (zH) {
            return ((AbstractC6280lb1.a < 21 || (((i = format.T) == -1 || c4341ei0B.h(i)) && ((i2 = format.S) == -1 || c4341ei0B.g(i2)))) ? 4 : 3) | i3 | 8;
        }
        return 2;
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void z() {
        try {
            this.x0.a();
            try {
                super.z();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.z();
                throw th;
            } finally {
            }
        }
    }

    public boolean z0(String str) {
        int iC = AbstractC8834uk0.c(str);
        return iC != 0 && this.x0.s(iC);
    }

    public AbstractC4063di0(Context context, InterfaceC4909gi0 interfaceC4909gi0, InterfaceC7580qE interfaceC7580qE, boolean z, Handler handler, InterfaceC2931Zb interfaceC2931Zb, InterfaceC3196ac interfaceC3196ac) {
        super(1, interfaceC4909gi0, interfaceC7580qE, z);
        this.v0 = context.getApplicationContext();
        this.x0 = interfaceC3196ac;
        this.w0 = new InterfaceC2931Zb.a(handler, interfaceC2931Zb);
        interfaceC3196ac.t(new b());
    }

    public void F0() {
    }

    @Override // com.daaw.AbstractC1048He, com.daaw.VH0
    public InterfaceC3784ci0 u() {
        return this;
    }

    public void E0(int i) {
    }

    public void G0(int i, long j, long j2) {
    }
}
