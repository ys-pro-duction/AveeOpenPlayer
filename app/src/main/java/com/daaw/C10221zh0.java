package com.daaw;

import android.util.Pair;
import android.util.SparseArray;
import com.daaw.CO0;
import com.daaw.Z41;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.zh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10221zh0 implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ Z = new a();
    public static final byte[] a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final byte[] c0 = AbstractC6280lb1.D("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] e0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID f0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public C4043de0 B;
    public C4043de0 C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public InterfaceC9838yJ Y;
    public final InterfaceC4784gF a;
    public final C1250Jc1 b;
    public final SparseArray c;
    public final boolean d;
    public final C2584Vs0 e;
    public final C2584Vs0 f;
    public final C2584Vs0 g;
    public final C2584Vs0 h;
    public final C2584Vs0 i;
    public final C2584Vs0 j;
    public final C2584Vs0 k;
    public final C2584Vs0 l;
    public final C2584Vs0 m;
    public ByteBuffer n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public c t;
    public boolean u;
    public int v;
    public long w;
    public boolean x;
    public long y;
    public long z;

    /* JADX INFO: renamed from: com.daaw.zh0$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C10221zh0()};
        }
    }

    /* JADX INFO: renamed from: com.daaw.zh0$b */
    public final class b implements InterfaceC5063hF {
        public b() {
        }

        @Override // com.daaw.InterfaceC5063hF
        public void a(int i) throws C3000Zs0 {
            C10221zh0.this.l(i);
        }

        @Override // com.daaw.InterfaceC5063hF
        public int b(int i) {
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 241:
                case 251:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 22186:
                case 22203:
                case 25188:
                case 2352003:
                case 2807729:
                    return 2;
                case 134:
                case 17026:
                case 2274716:
                    return 3;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    return 1;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    return 4;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                    return 5;
                default:
                    return 0;
            }
        }

        @Override // com.daaw.InterfaceC5063hF
        public boolean c(int i) {
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }

        @Override // com.daaw.InterfaceC5063hF
        public void d(int i, String str) throws C3000Zs0 {
            C10221zh0.this.y(i, str);
        }

        @Override // com.daaw.InterfaceC5063hF
        public void e(int i, double d) {
            C10221zh0.this.n(i, d);
        }

        @Override // com.daaw.InterfaceC5063hF
        public void f(int i, long j, long j2) throws C3000Zs0 {
            C10221zh0.this.x(i, j, j2);
        }

        @Override // com.daaw.InterfaceC5063hF
        public void g(int i, int i2, InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
            C10221zh0.this.g(i, i2, interfaceC9001vJ);
        }

        @Override // com.daaw.InterfaceC5063hF
        public void h(int i, long j) throws C3000Zs0 {
            C10221zh0.this.o(i, j);
        }

        public /* synthetic */ b(C10221zh0 c10221zh0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.zh0$d */
    public static final class d {
        public final byte[] a = new byte[10];
        public boolean b;
        public int c;
        public int d;
        public long e;
        public int f;

        public void a(c cVar) {
            if (!this.b || this.c <= 0) {
                return;
            }
            cVar.P.a(this.e, this.f, this.d, 0, cVar.g);
            this.c = 0;
        }

        public void b() {
            this.b = false;
        }

        public void c(c cVar, long j) {
            if (this.b) {
                int i = this.c;
                int i2 = i + 1;
                this.c = i2;
                if (i == 0) {
                    this.e = j;
                }
                if (i2 < 16) {
                    return;
                }
                cVar.P.a(this.e, this.f, this.d, 0, cVar.g);
                this.c = 0;
            }
        }

        public void d(InterfaceC9001vJ interfaceC9001vJ, int i, int i2) {
            if (!this.b) {
                interfaceC9001vJ.k(this.a, 0, 10);
                interfaceC9001vJ.i();
                if (AbstractC4719g1.j(this.a) == -1) {
                    return;
                }
                this.b = true;
                this.c = 0;
            }
            if (this.c == 0) {
                this.f = i;
                this.d = 0;
            }
            this.d += i2;
        }
    }

    public C10221zh0() {
        this(0);
    }

    public static int[] m(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    public static boolean p(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    public static void w(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] bArrD;
        byte[] bArr3;
        if (j == -9223372036854775807L) {
            bArrD = bArr2;
            bArr3 = bArrD;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - (((long) (i2 * 3600)) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - (((long) (i3 * 60)) * 1000000);
            int i4 = (int) (j4 / 1000000);
            bArrD = AbstractC6280lb1.D(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j4 - (((long) i4) * 1000000)) / j2))));
            bArr3 = bArr2;
        }
        System.arraycopy(bArrD, 0, bArr, i, bArr3.length);
    }

    public final void A(InterfaceC9001vJ interfaceC9001vJ, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.k.b() < length) {
            this.k.a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.k.a, 0, bArr.length);
        }
        interfaceC9001vJ.g(this.k.a, bArr.length, i);
        this.k.G(length);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        return new EU0().b(interfaceC9001vJ);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        this.W = false;
        boolean zA = true;
        while (zA && !this.W) {
            zA = this.a.a(interfaceC9001vJ);
            if (zA && q(c2082Qx0, interfaceC9001vJ.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i = 0; i < this.c.size(); i++) {
            ((c) this.c.valueAt(i)).d();
        }
        return -1;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        this.A = -9223372036854775807L;
        this.E = 0;
        this.a.reset();
        this.b.e();
        u();
        for (int i = 0; i < this.c.size(); i++) {
            ((c) this.c.valueAt(i)).h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0203, code lost:
    
        throw new com.daaw.C3000Zs0("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(int r25, int r26, com.daaw.InterfaceC9001vJ r27) throws com.daaw.C3000Zs0 {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10221zh0.g(int, int, com.daaw.vJ):void");
    }

    public final CO0 h() {
        C4043de0 c4043de0;
        C4043de0 c4043de02;
        if (this.p == -1 || this.s == -9223372036854775807L || (c4043de0 = this.B) == null || c4043de0.c() == 0 || (c4043de02 = this.C) == null || c4043de02.c() != this.B.c()) {
            this.B = null;
            this.C = null;
            return new CO0.b(this.s);
        }
        int iC = this.B.c();
        int[] iArr = new int[iC];
        long[] jArr = new long[iC];
        long[] jArr2 = new long[iC];
        long[] jArr3 = new long[iC];
        int i = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            jArr3[i2] = this.B.b(i2);
            jArr[i2] = this.p + this.C.b(i2);
        }
        while (true) {
            int i3 = iC - 1;
            if (i >= i3) {
                iArr[i3] = (int) ((this.p + this.o) - jArr[i3]);
                jArr2[i3] = this.s - jArr3[i3];
                this.B = null;
                this.C = null;
                return new C2133Rk(iArr, jArr, jArr2, jArr3);
            }
            int i4 = i + 1;
            iArr[i] = (int) (jArr[i4] - jArr[i]);
            jArr2[i] = jArr3[i4] - jArr3[i];
            i = i4;
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.Y = interfaceC9838yJ;
    }

    public final void j(c cVar, long j) {
        d dVar = cVar.L;
        if (dVar != null) {
            dVar.c(cVar, j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.a)) {
                k(cVar, "%02d:%02d:%02d,%03d", 19, 1000L, b0);
            } else if ("S_TEXT/ASS".equals(cVar.a)) {
                k(cVar, "%01d:%02d:%02d:%02d", 21, 10000L, e0);
            }
            cVar.P.a(j, this.M, this.V, 0, cVar.g);
        }
        this.W = true;
        u();
    }

    public final void k(c cVar, String str, int i, long j, byte[] bArr) {
        w(this.k.a, this.G, str, i, j, bArr);
        Z41 z41 = cVar.P;
        C2584Vs0 c2584Vs0 = this.k;
        z41.c(c2584Vs0, c2584Vs0.d());
        this.V += this.k.d();
    }

    public void l(int i) throws C3000Zs0 {
        if (i == 160) {
            if (this.E != 2) {
                return;
            }
            if (!this.X) {
                this.M |= 1;
            }
            j((c) this.c.get(this.K), this.F);
            this.E = 0;
            return;
        }
        if (i == 174) {
            if (p(this.t.a)) {
                c cVar = this.t;
                cVar.c(this.Y, cVar.b);
                SparseArray sparseArray = this.c;
                c cVar2 = this.t;
                sparseArray.put(cVar2.b, cVar2);
            }
            this.t = null;
            return;
        }
        if (i == 19899) {
            int i2 = this.v;
            if (i2 != -1) {
                long j = this.w;
                if (j != -1) {
                    if (i2 == 475249515) {
                        this.y = j;
                        return;
                    }
                    return;
                }
            }
            throw new C3000Zs0("Mandatory element SeekID or SeekPosition not found");
        }
        if (i == 25152) {
            c cVar3 = this.t;
            if (cVar3.e) {
                if (cVar3.g == null) {
                    throw new C3000Zs0("Encrypted Track found but ContentEncKeyID was not found");
                }
                cVar3.i = new DrmInitData(new DrmInitData.SchemeData(AbstractC6025ki.b, "video/webm", this.t.g.b));
                return;
            }
            return;
        }
        if (i == 28032) {
            c cVar4 = this.t;
            if (cVar4.e && cVar4.f != null) {
                throw new C3000Zs0("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i == 357149030) {
            if (this.q == -9223372036854775807L) {
                this.q = 1000000L;
            }
            long j2 = this.r;
            if (j2 != -9223372036854775807L) {
                this.s = v(j2);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.c.size() == 0) {
                throw new C3000Zs0("No valid tracks were found");
            }
            this.Y.n();
        } else if (i == 475249515 && !this.u) {
            this.Y.b(h());
            this.u = true;
        }
    }

    public void n(int i, double d2) {
        if (i == 181) {
            this.t.I = (int) d2;
            return;
        }
        if (i == 17545) {
            this.r = (long) d2;
            return;
        }
        switch (i) {
            case 21969:
                this.t.w = (float) d2;
                break;
            case 21970:
                this.t.x = (float) d2;
                break;
            case 21971:
                this.t.y = (float) d2;
                break;
            case 21972:
                this.t.z = (float) d2;
                break;
            case 21973:
                this.t.A = (float) d2;
                break;
            case 21974:
                this.t.B = (float) d2;
                break;
            case 21975:
                this.t.C = (float) d2;
                break;
            case 21976:
                this.t.D = (float) d2;
                break;
            case 21977:
                this.t.E = (float) d2;
                break;
            case 21978:
                this.t.F = (float) d2;
                break;
        }
    }

    public void o(int i, long j) throws C3000Zs0 {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new C3000Zs0("ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw new C3000Zs0("ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                this.t.c = (int) j;
                return;
            case 136:
                this.t.M = j == 1;
                return;
            case 155:
                this.G = v(j);
                return;
            case 159:
                this.t.G = (int) j;
                return;
            case 176:
                this.t.j = (int) j;
                return;
            case 179:
                this.B.a(v(j));
                return;
            case 186:
                this.t.k = (int) j;
                return;
            case 215:
                this.t.b = (int) j;
                return;
            case 231:
                this.A = v(j);
                return;
            case 241:
                if (this.D) {
                    return;
                }
                this.C.a(j);
                this.D = true;
                return;
            case 251:
                this.X = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw new C3000Zs0("ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw new C3000Zs0("DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw new C3000Zs0("EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw new C3000Zs0("ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw new C3000Zs0("AESSettingsCipherMode " + j + " not supported");
            case 21420:
                this.w = j + this.p;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 0) {
                    this.t.p = 0;
                    return;
                }
                if (i2 == 1) {
                    this.t.p = 2;
                    return;
                } else if (i2 == 3) {
                    this.t.p = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.t.p = 3;
                    return;
                }
            case 21680:
                this.t.l = (int) j;
                return;
            case 21682:
                this.t.n = (int) j;
                return;
            case 21690:
                this.t.m = (int) j;
                return;
            case 21930:
                this.t.N = j == 1;
                return;
            case 22186:
                this.t.J = j;
                return;
            case 22203:
                this.t.K = j;
                return;
            case 25188:
                this.t.H = (int) j;
                return;
            case 2352003:
                this.t.d = (int) j;
                return;
            case 2807729:
                this.q = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i3 = (int) j;
                        if (i3 == 1) {
                            this.t.t = 2;
                            return;
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            this.t.t = 1;
                            return;
                        }
                    case 21946:
                        int i4 = (int) j;
                        if (i4 != 1) {
                            if (i4 == 16) {
                                this.t.s = 6;
                                return;
                            } else if (i4 == 18) {
                                this.t.s = 7;
                                return;
                            } else if (i4 != 6 && i4 != 7) {
                                return;
                            }
                        }
                        this.t.s = 3;
                        return;
                    case 21947:
                        c cVar = this.t;
                        cVar.q = true;
                        int i5 = (int) j;
                        if (i5 == 1) {
                            cVar.r = 1;
                            return;
                        }
                        if (i5 == 9) {
                            cVar.r = 6;
                            return;
                        } else {
                            if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                cVar.r = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.t.u = (int) j;
                        return;
                    case 21949:
                        this.t.v = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final boolean q(C2082Qx0 c2082Qx0, long j) {
        if (this.x) {
            this.z = j;
            c2082Qx0.a = this.y;
            this.x = false;
            return true;
        }
        if (this.u) {
            long j2 = this.z;
            if (j2 != -1) {
                c2082Qx0.a = j2;
                this.z = -1L;
                return true;
            }
        }
        return false;
    }

    public final void r(InterfaceC9001vJ interfaceC9001vJ, int i) {
        if (this.g.d() >= i) {
            return;
        }
        if (this.g.b() < i) {
            C2584Vs0 c2584Vs0 = this.g;
            byte[] bArr = c2584Vs0.a;
            c2584Vs0.H(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.g.d());
        }
        C2584Vs0 c2584Vs02 = this.g;
        interfaceC9001vJ.g(c2584Vs02.a, c2584Vs02.d(), i - this.g.d());
        this.g.I(i);
    }

    public final int s(InterfaceC9001vJ interfaceC9001vJ, Z41 z41, int i) {
        int iB;
        int iA = this.j.a();
        if (iA > 0) {
            iB = Math.min(i, iA);
            z41.c(this.j, iB);
        } else {
            iB = z41.b(interfaceC9001vJ, i, false);
        }
        this.N += iB;
        this.V += iB;
        return iB;
    }

    public final void t(InterfaceC9001vJ interfaceC9001vJ, byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, this.j.a());
        interfaceC9001vJ.g(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.j.g(bArr, i, iMin);
        }
        this.N += i2;
    }

    public final void u() {
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        this.j.F();
    }

    public final long v(long j) throws C3000Zs0 {
        long j2 = this.q;
        if (j2 != -9223372036854775807L) {
            return AbstractC6280lb1.T(j, j2, 1000L);
        }
        throw new C3000Zs0("Can't scale timecode prior to timecodeScale being set.");
    }

    public void x(int i, long j, long j2) throws C3000Zs0 {
        if (i == 160) {
            this.X = false;
            return;
        }
        if (i == 174) {
            this.t = new c(null);
            return;
        }
        if (i == 187) {
            this.D = false;
            return;
        }
        if (i == 19899) {
            this.v = -1;
            this.w = -1L;
            return;
        }
        if (i == 20533) {
            this.t.e = true;
            return;
        }
        if (i == 21968) {
            this.t.q = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.p;
            if (j3 != -1 && j3 != j) {
                throw new C3000Zs0("Multiple Segment elements not supported");
            }
            this.p = j;
            this.o = j2;
            return;
        }
        if (i == 475249515) {
            this.B = new C4043de0();
            this.C = new C4043de0();
        } else if (i == 524531317 && !this.u) {
            if (this.d && this.y != -1) {
                this.x = true;
            } else {
                this.Y.b(new CO0.b(this.s));
                this.u = true;
            }
        }
    }

    public void y(int i, String str) throws C3000Zs0 {
        if (i == 134) {
            this.t.a = str;
            return;
        }
        if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            this.t.O = str;
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw new C3000Zs0("DocType " + str + " not supported");
        }
    }

    public final void z(InterfaceC9001vJ interfaceC9001vJ, c cVar, int i) throws C3000Zs0 {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.a)) {
            A(interfaceC9001vJ, a0, i);
            return;
        }
        if ("S_TEXT/ASS".equals(cVar.a)) {
            A(interfaceC9001vJ, d0, i);
            return;
        }
        Z41 z41 = cVar.P;
        if (!this.O) {
            if (cVar.e) {
                this.M &= -1073741825;
                if (!this.P) {
                    interfaceC9001vJ.g(this.g.a, 0, 1);
                    this.N++;
                    byte b2 = this.g.a[0];
                    if ((b2 & 128) == 128) {
                        throw new C3000Zs0("Extension bit is set in signal byte");
                    }
                    this.S = b2;
                    this.P = true;
                }
                byte b3 = this.S;
                if ((b3 & 1) == 1) {
                    boolean z = (b3 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        interfaceC9001vJ.g(this.l.a, 0, 8);
                        this.N += 8;
                        this.Q = true;
                        C2584Vs0 c2584Vs0 = this.g;
                        c2584Vs0.a[0] = (byte) ((z ? 128 : 0) | 8);
                        c2584Vs0.J(0);
                        z41.c(this.g, 1);
                        this.V++;
                        this.l.J(0);
                        z41.c(this.l, 8);
                        this.V += 8;
                    }
                    if (z) {
                        if (!this.R) {
                            interfaceC9001vJ.g(this.g.a, 0, 1);
                            this.N++;
                            this.g.J(0);
                            this.T = this.g.x();
                            this.R = true;
                        }
                        int i3 = this.T * 4;
                        this.g.G(i3);
                        interfaceC9001vJ.g(this.g.a, 0, i3);
                        this.N += i3;
                        short s = (short) ((this.T / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.n;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.n = ByteBuffer.allocate(i4);
                        }
                        this.n.position(0);
                        this.n.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.T;
                            if (i5 >= i2) {
                                break;
                            }
                            int iB = this.g.B();
                            if (i5 % 2 == 0) {
                                this.n.putShort((short) (iB - i6));
                            } else {
                                this.n.putInt(iB - i6);
                            }
                            i5++;
                            i6 = iB;
                        }
                        int i7 = (i - this.N) - i6;
                        if (i2 % 2 == 1) {
                            this.n.putInt(i7);
                        } else {
                            this.n.putShort((short) i7);
                            this.n.putInt(0);
                        }
                        this.m.H(this.n.array(), i4);
                        z41.c(this.m, i4);
                        this.V += i4;
                    }
                }
            } else {
                byte[] bArr = cVar.f;
                if (bArr != null) {
                    this.j.H(bArr, bArr.length);
                }
            }
            this.O = true;
        }
        int iD = i + this.j.d();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.a) && !"V_MPEGH/ISO/HEVC".equals(cVar.a)) {
            if (cVar.L != null) {
                AbstractC7115ob.f(this.j.d() == 0);
                cVar.L.d(interfaceC9001vJ, this.M, iD);
            }
            while (true) {
                int i8 = this.N;
                if (i8 >= iD) {
                    break;
                } else {
                    s(interfaceC9001vJ, z41, iD - i8);
                }
            }
        } else {
            byte[] bArr2 = this.f.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i9 = cVar.Q;
            int i10 = 4 - i9;
            while (this.N < iD) {
                int i11 = this.U;
                if (i11 == 0) {
                    t(interfaceC9001vJ, bArr2, i10, i9);
                    this.f.J(0);
                    this.U = this.f.B();
                    this.e.J(0);
                    z41.c(this.e, 4);
                    this.V += 4;
                } else {
                    this.U = i11 - s(interfaceC9001vJ, z41, i11);
                }
            }
        }
        if ("A_VORBIS".equals(cVar.a)) {
            this.h.J(0);
            z41.c(this.h, 4);
            this.V += 4;
        }
    }

    public C10221zh0(int i) {
        this(new C4412ex(), i);
    }

    public C10221zh0(InterfaceC4784gF interfaceC4784gF, int i) {
        this.p = -1L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1L;
        this.z = -1L;
        this.A = -9223372036854775807L;
        this.a = interfaceC4784gF;
        interfaceC4784gF.b(new b(this, null));
        this.d = (i & 1) == 0;
        this.b = new C1250Jc1();
        this.c = new SparseArray();
        this.g = new C2584Vs0(4);
        this.h = new C2584Vs0(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new C2584Vs0(4);
        this.e = new C2584Vs0(AbstractC2248Sm0.a);
        this.f = new C2584Vs0(4);
        this.j = new C2584Vs0();
        this.k = new C2584Vs0();
        this.l = new C2584Vs0(8);
        this.m = new C2584Vs0();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }

    /* JADX INFO: renamed from: com.daaw.zh0$c */
    public static final class c {
        public float A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public long J;
        public long K;
        public d L;
        public boolean M;
        public boolean N;
        public String O;
        public Z41 P;
        public int Q;
        public String a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public byte[] f;
        public Z41.a g;
        public byte[] h;
        public DrmInitData i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public byte[] o;
        public int p;
        public boolean q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public float y;
        public float z;

        public c() {
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = null;
            this.p = -1;
            this.q = false;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 1000;
            this.v = RCHTTPStatusCodes.SUCCESS;
            this.w = -1.0f;
            this.x = -1.0f;
            this.y = -1.0f;
            this.z = -1.0f;
            this.A = -1.0f;
            this.B = -1.0f;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 1;
            this.H = -1;
            this.I = 8000;
            this.J = 0L;
            this.K = 0L;
            this.N = true;
            this.O = "eng";
        }

        public static Pair e(C2584Vs0 c2584Vs0) throws C3000Zs0 {
            try {
                c2584Vs0.K(16);
                long jN = c2584Vs0.n();
                if (jN == 1482049860) {
                    return new Pair("video/3gpp", null);
                }
                if (jN != 826496599) {
                    return new Pair("video/x-unknown", null);
                }
                byte[] bArr = c2584Vs0.a;
                for (int iC = c2584Vs0.c() + 20; iC < bArr.length - 4; iC++) {
                    if (bArr[iC] == 0 && bArr[iC + 1] == 0 && bArr[iC + 2] == 1 && bArr[iC + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, iC, bArr.length)));
                    }
                }
                throw new C3000Zs0("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C3000Zs0("Error parsing FourCC private data");
            }
        }

        public static boolean f(C2584Vs0 c2584Vs0) throws C3000Zs0 {
            try {
                int iP = c2584Vs0.p();
                if (iP == 1) {
                    return true;
                }
                if (iP == 65534) {
                    c2584Vs0.J(24);
                    if (c2584Vs0.q() == C10221zh0.f0.getMostSignificantBits()) {
                        if (c2584Vs0.q() == C10221zh0.f0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C3000Zs0("Error parsing MS/ACM codec private");
            }
        }

        public static List g(byte[] bArr) throws C3000Zs0 {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw new C3000Zs0("Error parsing vorbis codec private");
                }
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3];
                    if (i != -1) {
                        break;
                    }
                    i4 += 255;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if (i2 != -1) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] != 1) {
                    throw new C3000Zs0("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw new C3000Zs0("Error parsing vorbis codec private");
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw new C3000Zs0("Error parsing vorbis codec private");
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C3000Zs0("Error parsing vorbis codec private");
            }
        }

        public final byte[] b() {
            if (this.w == -1.0f || this.x == -1.0f || this.y == -1.0f || this.z == -1.0f || this.A == -1.0f || this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.put((byte) 0);
            byteBufferWrap.putShort((short) ((this.w * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.x * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.y * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.z * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.A * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.B * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.C * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) (this.E + 0.5f));
            byteBufferWrap.putShort((short) (this.F + 0.5f));
            byteBufferWrap.putShort((short) this.u);
            byteBufferWrap.putShort((short) this.v);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x024e, code lost:
        
            if (r2 == 0) goto L140;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x0253, code lost:
        
            r27 = r2;
            r29 = "audio/raw";
            r33 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:162:0x033f, code lost:
        
            if (r2 != 0) goto L141;
         */
        /* JADX WARN: Removed duplicated region for block: B:171:0x035b  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x035d  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0366  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x038b  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void c(com.daaw.InterfaceC9838yJ r46, int r47) throws com.daaw.C3000Zs0 {
            /*
                Method dump skipped, instruction units count: 1354
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10221zh0.c.c(com.daaw.yJ, int):void");
        }

        public void d() {
            d dVar = this.L;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void h() {
            d dVar = this.L;
            if (dVar != null) {
                dVar.b();
            }
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }
}
