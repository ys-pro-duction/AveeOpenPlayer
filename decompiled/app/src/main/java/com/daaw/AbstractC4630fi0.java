package com.daaw;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.daaw.AbstractC5188hi0;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.fi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4630fi0 extends AbstractC1048He {
    public static final byte[] u0 = AbstractC6280lb1.r("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    public final InterfaceC4909gi0 K;
    public final boolean L;
    public final C1016Gw M;
    public final C1016Gw N;
    public final C5103hP O;
    public final List P;
    public final MediaCodec.BufferInfo Q;
    public Format R;
    public MediaCodec S;
    public C4341ei0 T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public ByteBuffer[] d0;
    public ByteBuffer[] e0;
    public long f0;
    public int g0;
    public int h0;
    public ByteBuffer i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public C0912Fw t0;

    public AbstractC4630fi0(int i, InterfaceC4909gi0 interfaceC4909gi0, InterfaceC7580qE interfaceC7580qE, boolean z) {
        super(i);
        AbstractC7115ob.f(AbstractC6280lb1.a >= 16);
        this.K = (InterfaceC4909gi0) AbstractC7115ob.e(interfaceC4909gi0);
        this.L = z;
        this.M = new C1016Gw(0);
        this.N = C1016Gw.x();
        this.O = new C5103hP();
        this.P = new ArrayList();
        this.Q = new MediaCodec.BufferInfo();
        this.l0 = 0;
        this.m0 = 0;
    }

    public static boolean K(String str, Format format) {
        return AbstractC6280lb1.a < 21 && format.I.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean L(String str) {
        int i = AbstractC6280lb1.a;
        if (i <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i > 19 || !"hb2000".equals(AbstractC6280lb1.b)) {
            return false;
        }
        return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
    }

    public static boolean M(String str) {
        return AbstractC6280lb1.a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean N(String str) {
        if (AbstractC6280lb1.a <= 17) {
            return "OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str);
        }
        return false;
    }

    public static boolean O(String str) {
        int i = AbstractC6280lb1.a;
        if (i < 18) {
            return true;
        }
        if (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i == 19 && AbstractC6280lb1.d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    public static boolean P(String str, Format format) {
        return AbstractC6280lb1.a <= 18 && format.S == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static MediaCodec.CryptoInfo Z(C1016Gw c1016Gw, int i) {
        MediaCodec.CryptoInfo cryptoInfoA = c1016Gw.C.a();
        if (i == 0) {
            return cryptoInfoA;
        }
        if (cryptoInfoA.numBytesOfClearData == null) {
            cryptoInfoA.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoA.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return cryptoInfoA;
    }

    @Override // com.daaw.AbstractC1048He
    public void A(boolean z) {
        this.t0 = new C0912Fw();
    }

    @Override // com.daaw.AbstractC1048He
    public void B(long j, boolean z) {
        this.p0 = false;
        this.q0 = false;
        if (this.S != null) {
            T();
        }
    }

    public abstract int I(MediaCodec mediaCodec, C4341ei0 c4341ei0, Format format, Format format2);

    public final int J(String str) {
        int i = AbstractC6280lb1.a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = AbstractC6280lb1.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = AbstractC6280lb1.b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public abstract void Q(C4341ei0 c4341ei0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto);

    public final boolean R(long j, long j2) {
        boolean zK0;
        int iDequeueOutputBuffer;
        if (!c0()) {
            if (this.Z && this.o0) {
                try {
                    iDequeueOutputBuffer = this.S.dequeueOutputBuffer(this.Q, Y());
                } catch (IllegalStateException unused) {
                    j0();
                    if (this.q0) {
                        n0();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.S.dequeueOutputBuffer(this.Q, Y());
            }
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    m0();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    l0();
                    return true;
                }
                if (this.X && (this.p0 || this.m0 == 2)) {
                    j0();
                }
                return false;
            }
            if (this.c0) {
                this.c0 = false;
                this.S.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.Q;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                j0();
                return false;
            }
            this.h0 = iDequeueOutputBuffer;
            ByteBuffer byteBufferB0 = b0(iDequeueOutputBuffer);
            this.i0 = byteBufferB0;
            if (byteBufferB0 != null) {
                byteBufferB0.position(this.Q.offset);
                ByteBuffer byteBuffer = this.i0;
                MediaCodec.BufferInfo bufferInfo2 = this.Q;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.j0 = t0(this.Q.presentationTimeUs);
        }
        if (this.Z && this.o0) {
            try {
                MediaCodec mediaCodec = this.S;
                ByteBuffer byteBuffer2 = this.i0;
                int i = this.h0;
                MediaCodec.BufferInfo bufferInfo3 = this.Q;
                zK0 = k0(j, j2, mediaCodec, byteBuffer2, i, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.j0);
            } catch (IllegalStateException unused2) {
                j0();
                if (this.q0) {
                    n0();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.S;
            ByteBuffer byteBuffer3 = this.i0;
            int i2 = this.h0;
            MediaCodec.BufferInfo bufferInfo4 = this.Q;
            zK0 = k0(j, j2, mediaCodec2, byteBuffer3, i2, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.j0);
        }
        if (zK0) {
            h0(this.Q.presentationTimeUs);
            boolean z = (this.Q.flags & 4) != 0;
            r0();
            if (!z) {
                return true;
            }
            j0();
        }
        return false;
    }

    public final boolean S() throws VI {
        int iPosition;
        int iF;
        MediaCodec mediaCodec = this.S;
        if (mediaCodec == null || this.m0 == 2 || this.p0) {
            return false;
        }
        if (this.g0 < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.g0 = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            this.M.D = a0(iDequeueInputBuffer);
            this.M.l();
        }
        if (this.m0 == 1) {
            if (!this.X) {
                this.o0 = true;
                this.S.queueInputBuffer(this.g0, 0, 0, 0L, 4);
                q0();
            }
            this.m0 = 2;
            return false;
        }
        if (this.b0) {
            this.b0 = false;
            ByteBuffer byteBuffer = this.M.D;
            byte[] bArr = u0;
            byteBuffer.put(bArr);
            this.S.queueInputBuffer(this.g0, 0, bArr.length, 0L, 0);
            q0();
            this.n0 = true;
            return true;
        }
        if (this.r0) {
            iF = -4;
            iPosition = 0;
        } else {
            if (this.l0 == 1) {
                for (int i = 0; i < this.R.I.size(); i++) {
                    this.M.D.put((byte[]) this.R.I.get(i));
                }
                this.l0 = 2;
            }
            iPosition = this.M.D.position();
            iF = F(this.O, this.M, false);
        }
        if (iF == -3) {
            return false;
        }
        if (iF == -5) {
            if (this.l0 == 2) {
                this.M.l();
                this.l0 = 1;
            }
            f0(this.O.a);
            return true;
        }
        if (this.M.p()) {
            if (this.l0 == 2) {
                this.M.l();
                this.l0 = 1;
            }
            this.p0 = true;
            if (!this.n0) {
                j0();
                return false;
            }
            try {
                if (!this.X) {
                    this.o0 = true;
                    this.S.queueInputBuffer(this.g0, 0, 0, 0L, 4);
                    q0();
                }
                return false;
            } catch (MediaCodec.CryptoException e) {
                throw VI.a(e, w());
            }
        }
        if (this.s0 && !this.M.q()) {
            this.M.l();
            if (this.l0 == 2) {
                this.l0 = 1;
            }
            return true;
        }
        this.s0 = false;
        boolean zV = this.M.v();
        boolean zU0 = u0(zV);
        this.r0 = zU0;
        if (zU0) {
            return false;
        }
        if (this.V && !zV) {
            AbstractC2248Sm0.b(this.M.D);
            if (this.M.D.position() == 0) {
                return true;
            }
            this.V = false;
        }
        try {
            C1016Gw c1016Gw = this.M;
            long j = c1016Gw.E;
            if (c1016Gw.o()) {
                this.P.add(Long.valueOf(j));
            }
            this.M.u();
            i0(this.M);
            if (zV) {
                this.S.queueSecureInputBuffer(this.g0, 0, Z(this.M, iPosition), j, 0);
            } else {
                this.S.queueInputBuffer(this.g0, 0, this.M.D.limit(), j, 0);
            }
            q0();
            this.n0 = true;
            this.l0 = 0;
            this.t0.c++;
            return true;
        } catch (MediaCodec.CryptoException e2) {
            throw VI.a(e2, w());
        }
    }

    public void T() {
        this.f0 = -9223372036854775807L;
        q0();
        r0();
        this.s0 = true;
        this.r0 = false;
        this.j0 = false;
        this.P.clear();
        this.b0 = false;
        this.c0 = false;
        if (this.W || ((this.Y && this.o0) || this.m0 != 0)) {
            n0();
            d0();
        } else {
            this.S.flush();
            this.n0 = false;
        }
        if (!this.k0 || this.R == null) {
            return;
        }
        this.l0 = 1;
    }

    public final MediaCodec U() {
        return this.S;
    }

    public final void V() {
        if (AbstractC6280lb1.a < 21) {
            this.d0 = this.S.getInputBuffers();
            this.e0 = this.S.getOutputBuffers();
        }
    }

    public final C4341ei0 W() {
        return this.T;
    }

    public C4341ei0 X(InterfaceC4909gi0 interfaceC4909gi0, Format format, boolean z) {
        return interfaceC4909gi0.b(format.G, z);
    }

    public long Y() {
        return 0L;
    }

    @Override // com.daaw.VH0
    public boolean a() {
        if (this.R == null || this.r0) {
            return false;
        }
        if (y() || c0()) {
            return true;
        }
        return this.f0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f0;
    }

    public final ByteBuffer a0(int i) {
        return AbstractC6280lb1.a >= 21 ? this.S.getInputBuffer(i) : this.d0[i];
    }

    @Override // com.daaw.WH0
    public final int b(Format format) throws VI {
        try {
            return v0(this.K, null, format);
        } catch (AbstractC5188hi0.c e) {
            throw VI.a(e, w());
        }
    }

    public final ByteBuffer b0(int i) {
        return AbstractC6280lb1.a >= 21 ? this.S.getOutputBuffer(i) : this.e0[i];
    }

    @Override // com.daaw.VH0
    public boolean c() {
        return this.q0;
    }

    public final boolean c0() {
        return this.h0 >= 0;
    }

    public final void d0() {
        Format format;
        AbstractC4630fi0 abstractC4630fi0;
        if (this.S == null && (format = this.R) != null) {
            String str = format.G;
            if (this.T == null) {
                try {
                    this.T = X(this.K, format, false);
                } catch (AbstractC5188hi0.c e) {
                    w0(new a(this.R, (Throwable) e, false, -49998));
                }
                if (this.T == null) {
                    w0(new a(this.R, (Throwable) null, false, -49999));
                }
            }
            if (s0(this.T)) {
                String str2 = this.T.a;
                this.U = J(str2);
                this.V = K(str2, this.R);
                this.W = O(str2);
                this.X = N(str2);
                this.Y = L(str2);
                this.Z = M(str2);
                this.a0 = P(str2, this.R);
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    T41.a("createCodec:" + str2);
                    this.S = MediaCodec.createByCodecName(str2);
                    T41.c();
                    T41.a("configureCodec");
                    Q(this.T, this.S, this.R, null);
                    T41.c();
                    T41.a("startCodec");
                    this.S.start();
                    T41.c();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    abstractC4630fi0 = this;
                    try {
                        abstractC4630fi0.e0(str2, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                        V();
                    } catch (Exception e2) {
                        e = e2;
                        w0(new a(abstractC4630fi0.R, (Throwable) e, false, str2));
                    }
                } catch (Exception e3) {
                    e = e3;
                    abstractC4630fi0 = this;
                }
                abstractC4630fi0.f0 = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                q0();
                r0();
                abstractC4630fi0.s0 = true;
                abstractC4630fi0.t0.a++;
            }
        }
    }

    public abstract void e0(String str, long j, long j2);

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f0(com.google.android.exoplayer2.Format r5) {
        /*
            r4 = this;
            com.google.android.exoplayer2.Format r0 = r4.R
            r4.R = r5
            com.google.android.exoplayer2.drm.DrmInitData r5 = r5.J
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.google.android.exoplayer2.drm.DrmInitData r1 = r0.J
        Lc:
            boolean r5 = com.daaw.AbstractC6280lb1.b(r5, r1)
            if (r5 != 0) goto L29
            com.google.android.exoplayer2.Format r5 = r4.R
            com.google.android.exoplayer2.drm.DrmInitData r5 = r5.J
            if (r5 != 0) goto L19
            goto L29
        L19:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.w()
            com.daaw.VI r5 = com.daaw.VI.a(r5, r0)
            throw r5
        L29:
            android.media.MediaCodec r5 = r4.S
            r1 = 1
            if (r5 == 0) goto L62
            com.daaw.ei0 r2 = r4.T
            com.google.android.exoplayer2.Format r3 = r4.R
            int r5 = r4.I(r5, r2, r0, r3)
            if (r5 == 0) goto L62
            if (r5 == r1) goto L61
            r2 = 3
            if (r5 != r2) goto L5b
            r4.k0 = r1
            r4.l0 = r1
            int r5 = r4.U
            r2 = 2
            if (r5 == r2) goto L58
            if (r5 != r1) goto L57
            com.google.android.exoplayer2.Format r5 = r4.R
            int r2 = r5.K
            int r3 = r0.K
            if (r2 != r3) goto L57
            int r5 = r5.L
            int r0 = r0.L
            if (r5 != r0) goto L57
            goto L58
        L57:
            r1 = 0
        L58:
            r4.b0 = r1
            return
        L5b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L61:
            return
        L62:
            boolean r5 = r4.n0
            if (r5 == 0) goto L69
            r4.m0 = r1
            return
        L69:
            r4.n0()
            r4.d0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC4630fi0.f0(com.google.android.exoplayer2.Format):void");
    }

    public abstract void g0(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract void i0(C1016Gw c1016Gw);

    public final void j0() {
        if (this.m0 == 2) {
            n0();
            d0();
        } else {
            this.q0 = true;
            o0();
        }
    }

    public abstract boolean k0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    public final void l0() {
        if (AbstractC6280lb1.a < 21) {
            this.e0 = this.S.getOutputBuffers();
        }
    }

    public final void m0() {
        MediaFormat outputFormat = this.S.getOutputFormat();
        if (this.U != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.c0 = true;
            return;
        }
        if (this.a0) {
            outputFormat.setInteger("channel-count", 1);
        }
        g0(this.S, outputFormat);
    }

    public void n0() {
        this.f0 = -9223372036854775807L;
        q0();
        r0();
        this.r0 = false;
        this.j0 = false;
        this.P.clear();
        p0();
        this.T = null;
        this.k0 = false;
        this.n0 = false;
        this.V = false;
        this.W = false;
        this.U = 0;
        this.X = false;
        this.Y = false;
        this.a0 = false;
        this.b0 = false;
        this.c0 = false;
        this.o0 = false;
        this.l0 = 0;
        this.m0 = 0;
        MediaCodec mediaCodec = this.S;
        if (mediaCodec != null) {
            this.t0.b++;
            try {
                mediaCodec.stop();
                try {
                    this.S.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.S.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    @Override // com.daaw.AbstractC1048He, com.daaw.WH0
    public final int o() {
        return 8;
    }

    @Override // com.daaw.VH0
    public void p(long j, long j2) {
        if (this.q0) {
            o0();
            return;
        }
        if (this.R == null) {
            this.N.l();
            int iF = F(this.O, this.N, true);
            if (iF != -5) {
                if (iF == -4) {
                    AbstractC7115ob.f(this.N.p());
                    this.p0 = true;
                    j0();
                    return;
                }
                return;
            }
            f0(this.O.a);
        }
        d0();
        if (this.S != null) {
            T41.a("drainAndFeed");
            while (R(j, j2)) {
            }
            while (S()) {
            }
            T41.c();
        } else {
            this.t0.d += G(j);
            this.N.l();
            int iF2 = F(this.O, this.N, false);
            if (iF2 == -5) {
                f0(this.O.a);
            } else if (iF2 == -4) {
                AbstractC7115ob.f(this.N.p());
                this.p0 = true;
                j0();
            }
        }
        this.t0.a();
    }

    public final void p0() {
        if (AbstractC6280lb1.a < 21) {
            this.d0 = null;
            this.e0 = null;
        }
    }

    public final void q0() {
        this.g0 = -1;
        this.M.D = null;
    }

    public final void r0() {
        this.h0 = -1;
        this.i0 = null;
    }

    public boolean s0(C4341ei0 c4341ei0) {
        return true;
    }

    public final boolean t0(long j) {
        int size = this.P.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.P.get(i)).longValue() == j) {
                this.P.remove(i);
                return true;
            }
        }
        return false;
    }

    public final boolean u0(boolean z) {
        return false;
    }

    public abstract int v0(InterfaceC4909gi0 interfaceC4909gi0, InterfaceC7580qE interfaceC7580qE, Format format);

    public final void w0(a aVar) throws VI {
        throw VI.a(aVar, w());
    }

    @Override // com.daaw.AbstractC1048He
    public void z() {
        this.R = null;
        n0();
    }

    /* JADX INFO: renamed from: com.daaw.fi0$a */
    public static class a extends Exception {
        public final String B;
        public final boolean C;
        public final String D;
        public final String E;

        public a(Format format, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + format, th);
            this.B = format.G;
            this.C = z;
            this.D = null;
            this.E = a(i);
        }

        public static String a(int i) {
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        public static String b(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public a(Format format, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + format, th);
            this.B = format.G;
            this.C = z;
            this.D = str;
            this.E = AbstractC6280lb1.a >= 21 ? b(th) : null;
        }
    }

    @Override // com.daaw.AbstractC1048He
    public void C() {
    }

    @Override // com.daaw.AbstractC1048He
    public void D() {
    }

    public void o0() {
    }

    public void h0(long j) {
    }
}
