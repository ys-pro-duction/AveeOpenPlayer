package com.daaw;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.daaw.InterfaceC1358Kd1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.DummySurface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.ji0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5747ji0 extends AbstractC4630fi0 {
    public static final int[] g1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final boolean A0;
    public final long[] B0;
    public final long[] C0;
    public b D0;
    public boolean E0;
    public Surface F0;
    public Surface G0;
    public int H0;
    public boolean I0;
    public long J0;
    public long K0;
    public long L0;
    public int M0;
    public int N0;
    public int O0;
    public long P0;
    public int Q0;
    public float R0;
    public int S0;
    public int T0;
    public int U0;
    public float V0;
    public int W0;
    public int X0;
    public int Y0;
    public float Z0;
    public boolean a1;
    public int b1;
    public c c1;
    public long d1;
    public long e1;
    public int f1;
    public final Context v0;
    public final C1150Id1 w0;
    public final InterfaceC1358Kd1.a x0;
    public final long y0;
    public final int z0;

    /* JADX INFO: renamed from: com.daaw.ji0$b */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ji0$c */
    public final class c implements MediaCodec.OnFrameRenderedListener {
        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            C5747ji0 c5747ji0 = C5747ji0.this;
            if (this != c5747ji0.c1) {
                return;
            }
            c5747ji0.N0();
        }

        public c(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    public C5747ji0(Context context, InterfaceC4909gi0 interfaceC4909gi0, long j, InterfaceC7580qE interfaceC7580qE, boolean z, Handler handler, InterfaceC1358Kd1 interfaceC1358Kd1, int i) {
        super(2, interfaceC4909gi0, interfaceC7580qE, z);
        this.y0 = j;
        this.z0 = i;
        Context applicationContext = context.getApplicationContext();
        this.v0 = applicationContext;
        this.w0 = new C1150Id1(applicationContext);
        this.x0 = new InterfaceC1358Kd1.a(handler, interfaceC1358Kd1);
        this.A0 = C0();
        this.B0 = new long[10];
        this.C0 = new long[10];
        this.e1 = -9223372036854775807L;
        this.d1 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.S0 = -1;
        this.T0 = -1;
        this.V0 = -1.0f;
        this.R0 = -1.0f;
        this.H0 = 1;
        z0();
    }

    public static boolean A0(String str) {
        String str2 = AbstractC6280lb1.b;
        if (("deb".equals(str2) || "flo".equals(str2) || "mido".equals(str2) || "santoni".equals(str2)) && "OMX.qcom.video.decoder.avc".equals(str)) {
            return true;
        }
        if (("tcl_eu".equals(str2) || "SVP-DTV15".equals(str2) || "BRAVIA_ATV2".equals(str2) || str2.startsWith("panell_") || "F3311".equals(str2) || "M5c".equals(str2) || "QM16XE_U".equals(str2) || "A7010a48".equals(str2) || "woods_f".equals(AbstractC6280lb1.d) || "watson".equals(str2)) && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
            return true;
        }
        String str3 = AbstractC6280lb1.d;
        if (("ALE-L21".equals(str3) || "CAM-L21".equals(str3)) && "OMX.k3.video.decoder.avc".equals(str)) {
            return true;
        }
        return "HUAWEI VNS-L21".equals(str3) && "OMX.IMG.MSVDX.Decoder.AVC".equals(str);
    }

    public static void B0(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    public static boolean C0() {
        return AbstractC6280lb1.a <= 22 && "foster".equals(AbstractC6280lb1.b) && "NVIDIA".equals(AbstractC6280lb1.c);
    }

    public static Point E0(C4341ei0 c4341ei0, Format format) {
        int i = format.L;
        int i2 = format.K;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : g1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (AbstractC6280lb1.a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointB = c4341ei0.b(i6, i4);
                if (c4341ei0.n(pointB.x, pointB.y, format.M)) {
                    return pointB;
                }
            } else {
                int iF = AbstractC6280lb1.f(i4, 16) * 16;
                int iF2 = AbstractC6280lb1.f(i5, 16) * 16;
                if (iF * iF2 <= AbstractC5188hi0.l()) {
                    int i7 = z ? iF2 : iF;
                    if (!z) {
                        iF = iF2;
                    }
                    return new Point(i7, iF);
                }
            }
        }
        return null;
    }

    public static int G0(Format format) {
        if (format.H == -1) {
            return H0(format.G, format.K, format.L);
        }
        int size = format.I.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) format.I.get(i)).length;
        }
        return format.H + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int H0(java.lang.String r5, int r6, int r7) {
        /*
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = -1
            if (r6 == r3) goto L81
            if (r7 != r3) goto La
            goto L81
        La:
            r5.getClass()
            int r4 = r5.hashCode()
            switch(r4) {
                case -1664118616: goto L4d;
                case -1662541442: goto L42;
                case 1187890754: goto L37;
                case 1331836730: goto L2c;
                case 1599127256: goto L21;
                case 1599127257: goto L16;
                default: goto L14;
            }
        L14:
            r5 = -1
            goto L57
        L16:
            java.lang.String r4 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L1f
            goto L14
        L1f:
            r5 = 5
            goto L57
        L21:
            java.lang.String r4 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L2a
            goto L14
        L2a:
            r5 = 4
            goto L57
        L2c:
            java.lang.String r4 = "video/avc"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L35
            goto L14
        L35:
            r5 = 3
            goto L57
        L37:
            java.lang.String r4 = "video/mp4v-es"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L40
            goto L14
        L40:
            r5 = 2
            goto L57
        L42:
            java.lang.String r4 = "video/hevc"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L4b
            goto L14
        L4b:
            r5 = 1
            goto L57
        L4d:
            java.lang.String r4 = "video/3gpp"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L56
            goto L14
        L56:
            r5 = 0
        L57:
            switch(r5) {
                case 0: goto L5b;
                case 1: goto L79;
                case 2: goto L5b;
                case 3: goto L5f;
                case 4: goto L5b;
                case 5: goto L79;
                default: goto L5a;
            }
        L5a:
            return r3
        L5b:
            int r6 = r6 * r7
        L5d:
            r0 = 2
            goto L7b
        L5f:
            java.lang.String r5 = "BRAVIA 4K 2015"
            java.lang.String r0 = com.daaw.AbstractC6280lb1.d
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L6a
            return r3
        L6a:
            r5 = 16
            int r6 = com.daaw.AbstractC6280lb1.f(r6, r5)
            int r5 = com.daaw.AbstractC6280lb1.f(r7, r5)
            int r6 = r6 * r5
            int r6 = r6 * 256
            goto L5d
        L79:
            int r6 = r6 * r7
        L7b:
            int r6 = r6 * 3
            int r0 = r0 * 2
            int r6 = r6 / r0
            return r6
        L81:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5747ji0.H0(java.lang.String, int, int):int");
    }

    public static boolean J0(long j) {
        return j < -30000;
    }

    public static boolean K0(long j) {
        return j < -500000;
    }

    public static void U0(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public static boolean x0(boolean z, Format format, Format format2) {
        if (format.G.equals(format2.G) && format.N == format2.N) {
            return (z || (format.K == format2.K && format.L == format2.L)) && AbstractC6280lb1.b(format.R, format2.R);
        }
        return false;
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void A(boolean z) {
        super.A(z);
        int i = v().a;
        this.b1 = i;
        this.a1 = i != 0;
        this.x0.e(this.t0);
        this.w0.e();
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void B(long j, boolean z) {
        super.B(j, z);
        y0();
        this.J0 = -9223372036854775807L;
        this.N0 = 0;
        this.d1 = -9223372036854775807L;
        int i = this.f1;
        if (i != 0) {
            this.e1 = this.B0[i - 1];
            this.f1 = 0;
        }
        if (z) {
            T0();
        } else {
            this.K0 = -9223372036854775807L;
        }
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void C() {
        super.C();
        this.M0 = 0;
        this.L0 = SystemClock.elapsedRealtime();
        this.P0 = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void D() {
        this.K0 = -9223372036854775807L;
        M0();
        super.D();
    }

    public void D0(MediaCodec mediaCodec, int i, long j) {
        T41.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        T41.c();
        b1(1);
    }

    @Override // com.daaw.AbstractC1048He
    public void E(Format[] formatArr, long j) {
        if (this.e1 == -9223372036854775807L) {
            this.e1 = j;
        } else {
            int i = this.f1;
            if (i == this.B0.length) {
                long j2 = this.B0[this.f1 - 1];
            } else {
                this.f1 = i + 1;
            }
            long[] jArr = this.B0;
            int i2 = this.f1;
            jArr[i2 - 1] = j;
            this.C0[i2 - 1] = this.d1;
        }
        super.E(formatArr, j);
    }

    public b F0(C4341ei0 c4341ei0, Format format, Format[] formatArr) {
        Point pointE0;
        int iMax = format.K;
        int iMax2 = format.L;
        int iG0 = G0(format);
        if (formatArr.length == 1) {
            return new b(iMax, iMax2, iG0);
        }
        boolean z = false;
        for (Format format2 : formatArr) {
            if (x0(c4341ei0.d, format, format2)) {
                int i = format2.K;
                z |= i == -1 || format2.L == -1;
                iMax = Math.max(iMax, i);
                iMax2 = Math.max(iMax2, format2.L);
                iG0 = Math.max(iG0, G0(format2));
            }
        }
        if (z && (pointE0 = E0(c4341ei0, format)) != null) {
            iMax = Math.max(iMax, pointE0.x);
            iMax2 = Math.max(iMax2, pointE0.y);
            iG0 = Math.max(iG0, H0(format.G, iMax, iMax2));
        }
        return new b(iMax, iMax2, iG0);
    }

    @Override // com.daaw.AbstractC4630fi0
    public int I(MediaCodec mediaCodec, C4341ei0 c4341ei0, Format format, Format format2) {
        if (!x0(c4341ei0.d, format, format2)) {
            return 0;
        }
        int i = format2.K;
        b bVar = this.D0;
        if (i > bVar.a || format2.L > bVar.b || G0(format2) > this.D0.c) {
            return 0;
        }
        return format.E(format2) ? 1 : 3;
    }

    public MediaFormat I0(Format format, b bVar, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.G);
        mediaFormat.setInteger("width", format.K);
        mediaFormat.setInteger("height", format.L);
        AbstractC8545ti0.e(mediaFormat, format.I);
        AbstractC8545ti0.c(mediaFormat, "frame-rate", format.M);
        AbstractC8545ti0.d(mediaFormat, "rotation-degrees", format.N);
        AbstractC8545ti0.b(mediaFormat, format.R);
        mediaFormat.setInteger("max-width", bVar.a);
        mediaFormat.setInteger("max-height", bVar.b);
        AbstractC8545ti0.d(mediaFormat, "max-input-size", bVar.c);
        if (AbstractC6280lb1.a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            B0(mediaFormat, i);
        }
        return mediaFormat;
    }

    public boolean L0(MediaCodec mediaCodec, int i, long j, long j2) {
        int iG = G(j2);
        if (iG == 0) {
            return false;
        }
        this.t0.i++;
        b1(this.O0 + iG);
        T();
        return true;
    }

    public final void M0() {
        if (this.M0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.x0.d(this.M0, jElapsedRealtime - this.L0);
            this.M0 = 0;
            this.L0 = jElapsedRealtime;
        }
    }

    public void N0() {
        if (this.I0) {
            return;
        }
        this.I0 = true;
        this.x0.g(this.F0);
    }

    public final void O0() {
        int i = this.S0;
        if (i == -1 && this.T0 == -1) {
            return;
        }
        if (this.W0 == i && this.X0 == this.T0 && this.Y0 == this.U0 && this.Z0 == this.V0) {
            return;
        }
        this.x0.h(i, this.T0, this.U0, this.V0);
        this.W0 = this.S0;
        this.X0 = this.T0;
        this.Y0 = this.U0;
        this.Z0 = this.V0;
    }

    public final void P0() {
        if (this.I0) {
            this.x0.g(this.F0);
        }
    }

    @Override // com.daaw.AbstractC4630fi0
    public void Q(C4341ei0 c4341ei0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        b bVarF0 = F0(c4341ei0, format, x());
        this.D0 = bVarF0;
        MediaFormat mediaFormatI0 = I0(format, bVarF0, this.A0, this.b1);
        if (this.F0 == null) {
            AbstractC7115ob.f(Z0(c4341ei0));
            if (this.G0 == null) {
                this.G0 = DummySurface.d(this.v0, c4341ei0.f);
            }
            this.F0 = this.G0;
        }
        mediaCodec.configure(mediaFormatI0, this.F0, mediaCrypto, 0);
        if (AbstractC6280lb1.a < 23 || !this.a1) {
            return;
        }
        this.c1 = new c(mediaCodec);
    }

    public final void Q0() {
        int i = this.W0;
        if (i == -1 && this.X0 == -1) {
            return;
        }
        this.x0.h(i, this.X0, this.Y0, this.Z0);
    }

    public void R0(MediaCodec mediaCodec, int i, long j) {
        O0();
        T41.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        T41.c();
        this.P0 = SystemClock.elapsedRealtime() * 1000;
        this.t0.e++;
        this.N0 = 0;
        N0();
    }

    public void S0(MediaCodec mediaCodec, int i, long j, long j2) {
        O0();
        T41.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        T41.c();
        this.P0 = SystemClock.elapsedRealtime() * 1000;
        this.t0.e++;
        this.N0 = 0;
        N0();
    }

    @Override // com.daaw.AbstractC4630fi0
    public void T() {
        super.T();
        this.O0 = 0;
    }

    public final void T0() {
        this.K0 = this.y0 > 0 ? SystemClock.elapsedRealtime() + this.y0 : -9223372036854775807L;
    }

    public final void V0(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.G0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                C4341ei0 c4341ei0W = W();
                if (c4341ei0W != null && Z0(c4341ei0W)) {
                    surface = DummySurface.d(this.v0, c4341ei0W.f);
                    this.G0 = surface;
                }
            }
        }
        if (this.F0 == surface) {
            if (surface == null || surface == this.G0) {
                return;
            }
            Q0();
            P0();
            return;
        }
        this.F0 = surface;
        int state = getState();
        if (state == 1 || state == 2) {
            MediaCodec mediaCodecU = U();
            if (AbstractC6280lb1.a < 23 || mediaCodecU == null || surface == null || this.E0) {
                n0();
                d0();
            } else {
                U0(mediaCodecU, surface);
            }
        }
        if (surface == null || surface == this.G0) {
            z0();
            y0();
            return;
        }
        Q0();
        y0();
        if (state == 2) {
            T0();
        }
    }

    public boolean W0(long j, long j2) {
        return K0(j);
    }

    public boolean X0(long j, long j2) {
        return J0(j);
    }

    public boolean Y0(long j, long j2) {
        return J0(j) && j2 > 100000;
    }

    public final boolean Z0(C4341ei0 c4341ei0) {
        if (AbstractC6280lb1.a < 23 || this.a1 || A0(c4341ei0.a)) {
            return false;
        }
        return !c4341ei0.f || DummySurface.c(this.v0);
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.VH0
    public boolean a() {
        Surface surface;
        if (super.a() && (this.I0 || (((surface = this.G0) != null && this.F0 == surface) || U() == null || this.a1))) {
            this.K0 = -9223372036854775807L;
            return true;
        }
        if (this.K0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.K0) {
            return true;
        }
        this.K0 = -9223372036854775807L;
        return false;
    }

    public void a1(MediaCodec mediaCodec, int i, long j) {
        T41.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        T41.c();
        this.t0.f++;
    }

    public void b1(int i) {
        C0912Fw c0912Fw = this.t0;
        c0912Fw.g += i;
        this.M0 += i;
        int i2 = this.N0 + i;
        this.N0 = i2;
        c0912Fw.h = Math.max(i2, c0912Fw.h);
        if (this.M0 >= this.z0) {
            M0();
        }
    }

    @Override // com.daaw.AbstractC4630fi0
    public void e0(String str, long j, long j2) {
        this.x0.b(str, j, j2);
        this.E0 = A0(str);
    }

    @Override // com.daaw.AbstractC4630fi0
    public void f0(Format format) {
        super.f0(format);
        this.x0.f(format);
        this.R0 = format.O;
        this.Q0 = format.N;
    }

    @Override // com.daaw.AbstractC4630fi0
    public void g0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.S0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.T0 = integer;
        float f = this.R0;
        this.V0 = f;
        if (AbstractC6280lb1.a >= 21) {
            int i = this.Q0;
            if (i == 90 || i == 270) {
                int i2 = this.S0;
                this.S0 = integer;
                this.T0 = i2;
                this.V0 = 1.0f / f;
            }
        } else {
            this.U0 = this.Q0;
        }
        mediaCodec.setVideoScalingMode(this.H0);
    }

    @Override // com.daaw.AbstractC4630fi0
    public void h0(long j) {
        this.O0--;
        while (true) {
            int i = this.f1;
            if (i == 0 || j < this.C0[0]) {
                return;
            }
            long[] jArr = this.B0;
            this.e1 = jArr[0];
            int i2 = i - 1;
            this.f1 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.C0;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f1);
        }
    }

    @Override // com.daaw.AbstractC4630fi0
    public void i0(C1016Gw c1016Gw) {
        this.O0++;
        this.d1 = Math.max(c1016Gw.E, this.d1);
        if (AbstractC6280lb1.a >= 23 || !this.a1) {
            return;
        }
        N0();
    }

    @Override // com.daaw.AbstractC4630fi0
    public boolean k0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2;
        long j4;
        if (this.J0 == -9223372036854775807L) {
            this.J0 = j;
        }
        long j5 = j3 - this.e1;
        if (z) {
            a1(mediaCodec, i, j5);
            return true;
        }
        long j6 = j3 - j;
        if (this.F0 == this.G0) {
            if (!J0(j6)) {
                return false;
            }
            a1(mediaCodec, i, j5);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z2 = getState() == 2;
        if (!this.I0 || (z2 && Y0(j6, jElapsedRealtime - this.P0))) {
            if (AbstractC6280lb1.a >= 21) {
                S0(mediaCodec, i, j5, System.nanoTime());
            } else {
                R0(mediaCodec, i, j5);
            }
            return true;
        }
        if (z2 && j != this.J0) {
            long jNanoTime = System.nanoTime();
            long jB = this.w0.b(j3, ((j6 - (jElapsedRealtime - j2)) * 1000) + jNanoTime);
            long j7 = (jB - jNanoTime) / 1000;
            if (W0(j7, j2)) {
                mediaCodec2 = mediaCodec;
                j4 = j5;
                if (L0(mediaCodec2, i, j4, j)) {
                    return false;
                }
            } else {
                mediaCodec2 = mediaCodec;
                j4 = j5;
            }
            if (X0(j7, j2)) {
                D0(mediaCodec2, i, j4);
                return true;
            }
            if (AbstractC6280lb1.a >= 21) {
                if (j7 < 50000) {
                    S0(mediaCodec2, i, j4, jB);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                R0(mediaCodec2, i, j4);
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC4630fi0
    public void n0() {
        try {
            super.n0();
            this.O0 = 0;
            Surface surface = this.G0;
            if (surface != null) {
                if (this.F0 == surface) {
                    this.F0 = null;
                }
                surface.release();
                this.G0 = null;
            }
        } catch (Throwable th) {
            this.O0 = 0;
            if (this.G0 != null) {
                Surface surface2 = this.F0;
                Surface surface3 = this.G0;
                if (surface2 == surface3) {
                    this.F0 = null;
                }
                surface3.release();
                this.G0 = null;
            }
            throw th;
        }
    }

    @Override // com.daaw.AbstractC1048He, com.daaw.C0488Bw0.b
    public void q(int i, Object obj) {
        if (i == 1) {
            V0((Surface) obj);
            return;
        }
        if (i != 4) {
            super.q(i, obj);
            return;
        }
        this.H0 = ((Integer) obj).intValue();
        MediaCodec mediaCodecU = U();
        if (mediaCodecU != null) {
            mediaCodecU.setVideoScalingMode(this.H0);
        }
    }

    @Override // com.daaw.AbstractC4630fi0
    public boolean s0(C4341ei0 c4341ei0) {
        return this.F0 != null || Z0(c4341ei0);
    }

    @Override // com.daaw.AbstractC4630fi0
    public int v0(InterfaceC4909gi0 interfaceC4909gi0, InterfaceC7580qE interfaceC7580qE, Format format) {
        boolean z;
        int i;
        int i2;
        String str = format.G;
        if (!AbstractC8834uk0.m(str)) {
            return 0;
        }
        DrmInitData drmInitData = format.J;
        if (drmInitData != null) {
            z = false;
            for (int i3 = 0; i3 < drmInitData.E; i3++) {
                z |= drmInitData.e(i3).F;
            }
        } else {
            z = false;
        }
        C4341ei0 c4341ei0B = interfaceC4909gi0.b(str, z);
        if (c4341ei0B == null) {
            return (!z || interfaceC4909gi0.b(str, false) == null) ? 1 : 2;
        }
        if (!AbstractC1048He.H(interfaceC7580qE, drmInitData)) {
            return 2;
        }
        boolean zI = c4341ei0B.i(format.D);
        if (zI && (i = format.K) > 0 && (i2 = format.L) > 0) {
            if (AbstractC6280lb1.a >= 21) {
                zI = c4341ei0B.n(i, i2, format.M);
            } else {
                boolean z2 = i * i2 <= AbstractC5188hi0.l();
                if (!z2) {
                    int i4 = AbstractC6280lb1.a;
                }
                zI = z2;
            }
        }
        return (zI ? 4 : 3) | (c4341ei0B.d ? 16 : 8) | (c4341ei0B.e ? 32 : 0);
    }

    public final void y0() {
        MediaCodec mediaCodecU;
        this.I0 = false;
        if (AbstractC6280lb1.a < 23 || !this.a1 || (mediaCodecU = U()) == null) {
            return;
        }
        this.c1 = new c(mediaCodecU);
    }

    @Override // com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void z() {
        this.S0 = -1;
        this.T0 = -1;
        this.V0 = -1.0f;
        this.R0 = -1.0f;
        this.e1 = -9223372036854775807L;
        this.d1 = -9223372036854775807L;
        this.f1 = 0;
        z0();
        y0();
        this.w0.d();
        this.c1 = null;
        this.a1 = false;
        try {
            super.z();
        } finally {
            this.t0.a();
            this.x0.c(this.t0);
        }
    }

    public final void z0() {
        this.W0 = -1;
        this.X0 = -1;
        this.Z0 = -1.0f;
        this.Y0 = -1;
    }
}
