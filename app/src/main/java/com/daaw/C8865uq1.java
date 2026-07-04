package com.daaw;

import android.net.Uri;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.uq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8865uq1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 c0 = new InterfaceC1813On1() { // from class: com.daaw.qq1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C8865uq1(0)};
        }
    };
    public static final byte[] d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] e0;
    public static final byte[] f0;
    public static final byte[] g0;
    public static final UUID h0;
    public static final Map i0;
    public long A;
    public long B;
    public C1235Iy2 C;
    public C1235Iy2 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final InterfaceC7471pq1 a;
    public boolean a0;
    public final C9430wq1 b;
    public InterfaceC1398Kn1 b0;
    public final SparseArray c;
    public final boolean d;
    public final C5900kE2 e;
    public final C5900kE2 f;
    public final C5900kE2 g;
    public final C5900kE2 h;
    public final C5900kE2 i;
    public final C5900kE2 j;
    public final C5900kE2 k;
    public final C5900kE2 l;
    public final C5900kE2 m;
    public final C5900kE2 n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public C8586tq1 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i = AbstractC9004vJ2.a;
        e0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(UN2.c);
        f0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        g0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        h0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        i0 = DesugarCollections.unmodifiableMap(map);
    }

    public C8865uq1(int i) {
        C6913nq1 c6913nq1 = new C6913nq1();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = c6913nq1;
        c6913nq1.b(new C8307sq1(this, null));
        this.d = true;
        this.b = new C9430wq1();
        this.c = new SparseArray();
        this.g = new C5900kE2(4);
        this.h = new C5900kE2(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new C5900kE2(4);
        this.e = new C5900kE2(AbstractC4556fR2.a);
        this.f = new C5900kE2(4);
        this.j = new C5900kE2();
        this.k = new C5900kE2();
        this.l = new C5900kE2(8);
        this.m = new C5900kE2();
        this.n = new C5900kE2();
        this.L = new int[1];
    }

    public static byte[] w(long j, String str, long j2) {
        AbstractC6048km2.d(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        int i4 = AbstractC9004vJ2.a;
        return str2.getBytes(UN2.c);
    }

    public static int[] x(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    public final void c(int i, int i2, InterfaceC1190In1 interfaceC1190In1) {
        char c;
        char c2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = 0;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (this.G != 2) {
                    return;
                }
                C8586tq1 c8586tq1 = (C8586tq1) this.c.get(this.M);
                if (this.P != 4 || !"V_VP9".equals(c8586tq1.b)) {
                    ((C9694xn1) interfaceC1190In1).m(i2, false);
                    return;
                }
                this.n.d(i2);
                ((C9694xn1) interfaceC1190In1).f(this.n.i(), 0, i2, false);
                return;
            }
            if (i7 == 16877) {
                r(i);
                C8586tq1 c8586tq12 = this.u;
                if (c8586tq12.g != 1685485123 && c8586tq12.g != 1685480259) {
                    ((C9694xn1) interfaceC1190In1).m(i2, false);
                    return;
                }
                byte[] bArr = new byte[i2];
                c8586tq12.N = bArr;
                ((C9694xn1) interfaceC1190In1).f(bArr, 0, i2, false);
                return;
            }
            if (i7 == 16981) {
                r(i);
                byte[] bArr2 = new byte[i2];
                this.u.i = bArr2;
                ((C9694xn1) interfaceC1190In1).f(bArr2, 0, i2, false);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr3 = new byte[i2];
                ((C9694xn1) interfaceC1190In1).f(bArr3, 0, i2, false);
                r(i);
                this.u.j = new C8297so1(1, bArr3, 0, 0);
                return;
            }
            if (i7 == 21419) {
                Arrays.fill(this.i.i(), (byte) 0);
                ((C9694xn1) interfaceC1190In1).f(this.i.i(), 4 - i2, i2, false);
                this.i.g(0);
                this.w = (int) this.i.C();
                return;
            }
            if (i7 == 25506) {
                r(i);
                byte[] bArr4 = new byte[i2];
                this.u.k = bArr4;
                ((C9694xn1) interfaceC1190In1).f(bArr4, 0, i2, false);
                return;
            }
            if (i7 != 30322) {
                throw QT1.a("Unexpected id: " + i7, null);
            }
            r(i);
            byte[] bArr5 = new byte[i2];
            this.u.v = bArr5;
            ((C9694xn1) interfaceC1190In1).f(bArr5, 0, i2, false);
            return;
        }
        int i9 = 8;
        if (this.G == 0) {
            this.M = (int) this.b.d(interfaceC1190In1, false, true, 8);
            this.N = this.b.a();
            this.I = -9223372036854775807L;
            this.G = 1;
            this.g.d(0);
        }
        C8586tq1 c8586tq13 = (C8586tq1) this.c.get(this.M);
        if (c8586tq13 == null) {
            ((C9694xn1) interfaceC1190In1).m(i2 - this.N, false);
            this.G = 0;
            return;
        }
        c8586tq13.X.getClass();
        if (this.G == 1) {
            t(interfaceC1190In1, 3);
            int i10 = (this.g.i()[2] & 6) >> 1;
            if (i10 == 0) {
                this.K = 1;
                int[] iArrX = x(this.L, 1);
                this.L = iArrX;
                iArrX[0] = (i2 - this.N) - 3;
            } else {
                t(interfaceC1190In1, 4);
                int i11 = (this.g.i()[3] & 255) + 1;
                this.K = i11;
                int[] iArrX2 = x(this.L, i11);
                this.L = iArrX2;
                if (i10 == 2) {
                    int i12 = (i2 - this.N) - 4;
                    int i13 = this.K;
                    Arrays.fill(iArrX2, 0, i13, i12 / i13);
                } else {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            throw QT1.a("Unexpected lacing value: 2", null);
                        }
                        int i14 = 4;
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            int i17 = this.K - 1;
                            if (i15 >= i17) {
                                c = 1;
                                c2 = 0;
                                this.L[i17] = ((i2 - this.N) - i14) - i16;
                                break;
                            }
                            this.L[i15] = i8;
                            int i18 = i14 + 1;
                            t(interfaceC1190In1, i18);
                            if (this.g.i()[i14] == 0) {
                                throw QT1.a("No valid varint length mask found", null);
                            }
                            int i19 = 0;
                            while (true) {
                                if (i19 >= i9) {
                                    j = 0;
                                    break;
                                }
                                int i20 = 1 << (7 - i19);
                                if ((this.g.i()[i14] & i20) != 0) {
                                    i18 += i19;
                                    t(interfaceC1190In1, i18);
                                    j = this.g.i()[i14] & 255 & (~i20);
                                    for (int i21 = i14 + 1; i21 < i18; i21++) {
                                        j = (j << 8) | ((long) (this.g.i()[i21] & 255));
                                    }
                                    if (i15 > 0) {
                                        j -= (1 << ((i19 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i19++;
                                    i9 = 8;
                                }
                            }
                            i14 = i18;
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.L;
                            int i22 = (int) j;
                            if (i15 != 0) {
                                i22 += iArr[i15 - 1];
                            }
                            iArr[i15] = i22;
                            i16 += i22;
                            i15++;
                            i8 = 0;
                            i9 = 8;
                        }
                        throw QT1.a("EBML lacing sample size out of range.", null);
                    }
                    int i23 = 0;
                    int i24 = 4;
                    int i25 = 0;
                    while (true) {
                        i3 = this.K - 1;
                        if (i23 >= i3) {
                            break;
                        }
                        this.L[i23] = 0;
                        while (true) {
                            i4 = i24 + 1;
                            t(interfaceC1190In1, i4);
                            int i26 = this.g.i()[i24] & 255;
                            int[] iArr2 = this.L;
                            i5 = iArr2[i23] + i26;
                            iArr2[i23] = i5;
                            if (i26 != 255) {
                                break;
                            } else {
                                i24 = i4;
                            }
                        }
                        i25 += i5;
                        i23++;
                        i24 = i4;
                    }
                    this.L[i3] = ((i2 - this.N) - i24) - i25;
                }
            }
            c = 1;
            c2 = 0;
            this.H = this.B + p((this.g.i()[c2] << 8) | (this.g.i()[c] & 255));
            if (c8586tq13.d == 2) {
                i6 = 1;
                this.O = i6;
                this.G = 2;
                this.J = 0;
            } else {
                if (i7 == 163) {
                    if ((this.g.i()[2] & 128) == 128) {
                        i7 = 163;
                        i6 = 1;
                        this.O = i6;
                        this.G = 2;
                        this.J = 0;
                    } else {
                        i7 = 163;
                    }
                }
                i6 = 0;
                this.O = i6;
                this.G = 2;
                this.J = 0;
            }
        }
        if (i7 == 163) {
            while (true) {
                int i27 = this.J;
                if (i27 >= this.K) {
                    this.G = 0;
                    return;
                }
                int iJ = j(interfaceC1190In1, c8586tq13, this.L[i27], false);
                C8586tq1 c8586tq14 = c8586tq13;
                s(c8586tq14, this.H + ((long) ((this.J * c8586tq13.e) / 1000)), this.O, iJ, 0);
                this.J++;
                c8586tq13 = c8586tq14;
            }
        } else {
            while (true) {
                int i28 = this.J;
                if (i28 >= this.K) {
                    return;
                }
                int[] iArr3 = this.L;
                iArr3[i28] = j(interfaceC1190In1, c8586tq13, iArr3[i28], true);
                this.J++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:187:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r22) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8865uq1.d(int):void");
    }

    public final void e(int i, double d) {
        if (i == 181) {
            r(i);
            this.u.Q = (int) d;
            return;
        }
        if (i == 17545) {
            this.s = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                r(i);
                this.u.D = (float) d;
                break;
            case 21970:
                r(i);
                this.u.E = (float) d;
                break;
            case 21971:
                r(i);
                this.u.F = (float) d;
                break;
            case 21972:
                r(i);
                this.u.G = (float) d;
                break;
            case 21973:
                r(i);
                this.u.H = (float) d;
                break;
            case 21974:
                r(i);
                this.u.I = (float) d;
                break;
            case 21975:
                r(i);
                this.u.J = (float) d;
                break;
            case 21976:
                r(i);
                this.u.K = (float) d;
                break;
            case 21977:
                r(i);
                this.u.L = (float) d;
                break;
            case 21978:
                r(i);
                this.u.M = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        r(i);
                        this.u.s = (float) d;
                        break;
                    case 30324:
                        r(i);
                        this.u.t = (float) d;
                        break;
                    case 30325:
                        r(i);
                        this.u.u = (float) d;
                        break;
                }
                break;
        }
    }

    public final void f(int i, long j) {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw QT1.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw QT1.a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                r(i);
                this.u.d = (int) j;
                return;
            case 136:
                z = j == 1;
                r(i);
                this.u.V = z;
                return;
            case 155:
                this.I = p(j);
                return;
            case 159:
                r(i);
                this.u.O = (int) j;
                return;
            case 176:
                r(i);
                this.u.m = (int) j;
                return;
            case 179:
                q(i);
                this.C.c(p(j));
                return;
            case 186:
                r(i);
                this.u.n = (int) j;
                return;
            case 215:
                r(i);
                this.u.c = (int) j;
                return;
            case 231:
                this.B = p(j);
                return;
            case 238:
                this.P = (int) j;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                q(i);
                this.D.c(j);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                r(i);
                this.u.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw QT1.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw QT1.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw QT1.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw QT1.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw QT1.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.x = j + this.q;
                return;
            case 21432:
                int i2 = (int) j;
                r(i);
                if (i2 == 0) {
                    this.u.w = 0;
                    return;
                }
                if (i2 == 1) {
                    this.u.w = 2;
                    return;
                } else if (i2 == 3) {
                    this.u.w = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.u.w = 3;
                    return;
                }
            case 21680:
                r(i);
                this.u.o = (int) j;
                return;
            case 21682:
                r(i);
                this.u.q = (int) j;
                return;
            case 21690:
                r(i);
                this.u.p = (int) j;
                return;
            case 21930:
                z = j == 1;
                r(i);
                this.u.U = z;
                return;
            case 21998:
                r(i);
                this.u.f = (int) j;
                return;
            case 22186:
                r(i);
                this.u.R = j;
                return;
            case 22203:
                r(i);
                this.u.S = j;
                return;
            case 25188:
                r(i);
                this.u.P = (int) j;
                return;
            case 30114:
                this.R = j;
                return;
            case 30321:
                int i3 = (int) j;
                r(i);
                if (i3 == 0) {
                    this.u.r = 0;
                    return;
                }
                if (i3 == 1) {
                    this.u.r = 1;
                    return;
                } else if (i3 == 2) {
                    this.u.r = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.u.r = 3;
                    return;
                }
            case 2352003:
                r(i);
                this.u.e = (int) j;
                return;
            case 2807729:
                this.r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        r(i);
                        if (i4 == 1) {
                            this.u.A = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.u.A = 1;
                            return;
                        }
                    case 21946:
                        r(i);
                        int iB = Ho3.b((int) j);
                        if (iB != -1) {
                            this.u.z = iB;
                            return;
                        }
                        return;
                    case 21947:
                        r(i);
                        this.u.x = true;
                        int iA = Ho3.a((int) j);
                        if (iA != -1) {
                            this.u.y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        r(i);
                        this.u.B = (int) j;
                        return;
                    case 21949:
                        r(i);
                        this.u.C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void g(int i, long j, long j2) {
        AbstractC6048km2.b(this.b0);
        if (i == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i == 174) {
            this.u = new C8586tq1();
            return;
        }
        if (i == 187) {
            this.E = false;
            return;
        }
        if (i == 19899) {
            this.w = -1;
            this.x = -1L;
            return;
        }
        if (i == 20533) {
            r(i);
            this.u.h = true;
            return;
        }
        if (i == 21968) {
            r(i);
            this.u.x = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.q;
            if (j3 != -1 && j3 != j) {
                throw QT1.a("Multiple Segment elements not supported", null);
            }
            this.q = j;
            this.p = j2;
            return;
        }
        if (i == 475249515) {
            this.C = new C1235Iy2(32);
            this.D = new C1235Iy2(32);
        } else if (i == 524531317 && !this.v) {
            if (this.d && this.z != -1) {
                this.y = true;
            } else {
                this.b0.p(new C6624mo1(this.t, 0L));
                this.v = true;
            }
        }
    }

    public final void h(int i, String str) {
        if (i == 134) {
            r(i);
            this.u.b = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw QT1.a("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            r(i);
            this.u.a = str;
        } else {
            if (i != 2274716) {
                return;
            }
            r(i);
            this.u.W = str;
        }
    }

    public final int j(InterfaceC1190In1 interfaceC1190In1, C8586tq1 c8586tq1, int i, boolean z) throws QT1, EOFException, InterruptedIOException {
        int i2;
        if ("S_TEXT/UTF8".equals(c8586tq1.b)) {
            v(interfaceC1190In1, d0, i);
            int i3 = this.T;
            u();
            return i3;
        }
        if ("S_TEXT/ASS".equals(c8586tq1.b)) {
            v(interfaceC1190In1, f0, i);
            int i4 = this.T;
            u();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(c8586tq1.b)) {
            v(interfaceC1190In1, g0, i);
            int i5 = this.T;
            u();
            return i5;
        }
        InterfaceC8576to1 interfaceC8576to1 = c8586tq1.X;
        if (!this.V) {
            if (c8586tq1.h) {
                this.O &= -1073741825;
                if (!this.W) {
                    ((C9694xn1) interfaceC1190In1).f(this.g.i(), 0, 1, false);
                    this.S++;
                    if ((this.g.i()[0] & 128) == 128) {
                        throw QT1.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = this.g.i()[0];
                    this.W = true;
                }
                byte b = this.Z;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        ((C9694xn1) interfaceC1190In1).f(this.l.i(), 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        this.g.i()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.g.g(0);
                        interfaceC8576to1.a(this.g, 1, 1);
                        this.T++;
                        this.l.g(0);
                        interfaceC8576to1.a(this.l, 8, 1);
                        this.T += 8;
                    }
                    if (i6 == 2) {
                        if (!this.X) {
                            ((C9694xn1) interfaceC1190In1).f(this.g.i(), 0, 1, false);
                            this.S++;
                            this.g.g(0);
                            this.Y = this.g.u();
                            this.X = true;
                        }
                        int i7 = this.Y * 4;
                        this.g.d(i7);
                        ((C9694xn1) interfaceC1190In1).f(this.g.i(), 0, i7, false);
                        this.S += i7;
                        int i8 = (this.Y >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.o = ByteBuffer.allocate(i9);
                        }
                        this.o.position(0);
                        this.o.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i10 >= i2) {
                                break;
                            }
                            int iX = this.g.x();
                            int i12 = iX - i11;
                            if (i10 % 2 == 0) {
                                this.o.putShort((short) i12);
                            } else {
                                this.o.putInt(i12);
                            }
                            i10++;
                            i11 = iX;
                        }
                        int i13 = (i - this.S) - i11;
                        if ((i2 & 1) == 1) {
                            this.o.putInt(i13);
                        } else {
                            this.o.putShort((short) i13);
                            this.o.putInt(0);
                        }
                        this.m.e(this.o.array(), i9);
                        interfaceC8576to1.a(this.m, i9, 1);
                        this.T += i9;
                    }
                }
            } else {
                byte[] bArr = c8586tq1.i;
                if (bArr != null) {
                    this.j.e(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(c8586tq1.b) ? c8586tq1.f > 0 : z) {
                this.O |= 268435456;
                this.n.d(0);
                int iM = (this.j.m() + i) - this.S;
                this.g.d(4);
                this.g.i()[0] = (byte) ((iM >> 24) & 255);
                this.g.i()[1] = (byte) ((iM >> 16) & 255);
                this.g.i()[2] = (byte) ((iM >> 8) & 255);
                this.g.i()[3] = (byte) (iM & 255);
                interfaceC8576to1.a(this.g, 4, 2);
                this.T += 4;
            }
            this.V = true;
        }
        int iM2 = i + this.j.m();
        if (!"V_MPEG4/ISO/AVC".equals(c8586tq1.b) && !"V_MPEGH/ISO/HEVC".equals(c8586tq1.b)) {
            if (c8586tq1.T != null) {
                AbstractC6048km2.f(this.j.m() == 0);
                c8586tq1.T.d(interfaceC1190In1);
            }
            while (true) {
                int i14 = this.S;
                if (i14 >= iM2) {
                    break;
                }
                int iO = o(interfaceC1190In1, interfaceC8576to1, iM2 - i14);
                this.S += iO;
                this.T += iO;
            }
        } else {
            byte[] bArrI = this.f.i();
            bArrI[0] = 0;
            bArrI[1] = 0;
            bArrI[2] = 0;
            int i15 = c8586tq1.Y;
            int i16 = 4 - i15;
            while (this.S < iM2) {
                int i17 = this.U;
                if (i17 == 0) {
                    int iMin = Math.min(i15, this.j.j());
                    ((C9694xn1) interfaceC1190In1).f(bArrI, i16 + iMin, i15 - iMin, false);
                    if (iMin > 0) {
                        this.j.c(bArrI, i16, iMin);
                    }
                    this.S += i15;
                    this.f.g(0);
                    this.U = this.f.x();
                    this.e.g(0);
                    AbstractC8018ro1.b(interfaceC8576to1, this.e, 4);
                    this.T += 4;
                } else {
                    int iO2 = o(interfaceC1190In1, interfaceC8576to1, i17);
                    this.S += iO2;
                    this.T += iO2;
                    this.U -= iO2;
                }
            }
        }
        if ("A_VORBIS".equals(c8586tq1.b)) {
            this.h.g(0);
            AbstractC8018ro1.b(interfaceC8576to1, this.h, 4);
            this.T += 4;
        }
        int i18 = this.T;
        u();
        return i18;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.a.zzb();
        this.b.e();
        u();
        for (int i = 0; i < this.c.size(); i++) {
            C8855uo1 c8855uo1 = ((C8586tq1) this.c.valueAt(i)).T;
            if (c8855uo1 != null) {
                c8855uo1.b();
            }
        }
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) {
        return new C9151vq1().a(interfaceC1190In1);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.b0 = interfaceC1398Kn1;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final int n(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) {
        this.F = false;
        while (!this.F) {
            if (!this.a.a(interfaceC1190In1)) {
                for (int i = 0; i < this.c.size(); i++) {
                    C8586tq1 c8586tq1 = (C8586tq1) this.c.valueAt(i);
                    c8586tq1.X.getClass();
                    C8855uo1 c8855uo1 = c8586tq1.T;
                    if (c8855uo1 != null) {
                        c8855uo1.a(c8586tq1.X, c8586tq1.j);
                    }
                }
                return -1;
            }
            long jZzf = interfaceC1190In1.zzf();
            if (this.y) {
                this.A = jZzf;
                c6057ko1.a = this.z;
                this.y = false;
                return 1;
            }
            if (this.v) {
                long j = this.A;
                if (j != -1) {
                    c6057ko1.a = j;
                    this.A = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    public final int o(InterfaceC1190In1 interfaceC1190In1, InterfaceC8576to1 interfaceC8576to1, int i) {
        int iJ = this.j.j();
        if (iJ <= 0) {
            return AbstractC8018ro1.a(interfaceC8576to1, interfaceC1190In1, i, false);
        }
        int iMin = Math.min(i, iJ);
        AbstractC8018ro1.b(interfaceC8576to1, this.j, iMin);
        return iMin;
    }

    public final long p(long j) throws QT1 {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return AbstractC9004vJ2.D(j, j2, 1000L);
        }
        throw QT1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final void q(int i) throws QT1 {
        if (this.C == null || this.D == null) {
            throw QT1.a("Element " + i + " must be in a Cues", null);
        }
    }

    public final void r(int i) throws QT1 {
        if (this.u != null) {
            return;
        }
        throw QT1.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 BREAK  A[LOOP:0: B:45:0x00c5->B:50:0x00dd], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(com.daaw.C8586tq1 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8865uq1.s(com.daaw.tq1, long, int, int, int):void");
    }

    public final void t(InterfaceC1190In1 interfaceC1190In1, int i) throws EOFException, InterruptedIOException {
        if (this.g.m() >= i) {
            return;
        }
        if (this.g.k() < i) {
            C5900kE2 c5900kE2 = this.g;
            int iK = c5900kE2.k();
            c5900kE2.a(Math.max(iK + iK, i));
        }
        C5900kE2 c5900kE22 = this.g;
        ((C9694xn1) interfaceC1190In1).f(c5900kE22.i(), c5900kE22.m(), i - c5900kE22.m(), false);
        this.g.f(i);
    }

    public final void u() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.d(0);
    }

    public final void v(InterfaceC1190In1 interfaceC1190In1, byte[] bArr, int i) throws EOFException, InterruptedIOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.k.k() < i2) {
            C5900kE2 c5900kE2 = this.k;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            c5900kE2.e(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.k.i(), 0, length);
        }
        ((C9694xn1) interfaceC1190In1).f(this.k.i(), length, i, false);
        this.k.g(0);
        this.k.f(i2);
    }
}
