package com.daaw;

/* JADX INFO: renamed from: com.daaw.Qo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2047Qo1 implements InterfaceC1194Io1 {
    public final OP2 a;
    public final int b;

    public C2047Qo1(int i, OP2 op2) {
        this.b = i;
        this.a = op2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C2047Qo1 b(int i, C5900kE2 c5900kE2) {
        InterfaceC1194Io1 c2151Ro1;
        String str;
        LP2 lp2 = new LP2();
        int iM = c5900kE2.m();
        int i2 = -2;
        while (c5900kE2.j() > 8) {
            int iQ = c5900kE2.q();
            int iL = c5900kE2.l() + c5900kE2.q();
            c5900kE2.f(iL);
            if (iQ != 1414744396) {
                C2151Ro1 c2151Ro12 = null;
                switch (iQ) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 == 1) {
                                int iS = c5900kE2.s();
                                String str2 = iS != 1 ? iS != 85 ? iS != 255 ? iS != 8192 ? iS != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iS2 = c5900kE2.s();
                                    int iQ2 = c5900kE2.q();
                                    c5900kE2.h(6);
                                    int iW = AbstractC9004vJ2.w(c5900kE2.y());
                                    int iS3 = c5900kE2.s();
                                    byte[] bArr = new byte[iS3];
                                    c5900kE2.c(bArr, 0, iS3);
                                    C1106Hs1 c1106Hs1 = new C1106Hs1();
                                    c1106Hs1.u(str2);
                                    c1106Hs1.k0(iS2);
                                    c1106Hs1.v(iQ2);
                                    if ("audio/raw".equals(str2) && iW != 0) {
                                        c1106Hs1.p(iW);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && iS3 > 0) {
                                        c1106Hs1.k(OP2.K(bArr));
                                    }
                                    c2151Ro1 = new C2151Ro1(c1106Hs1.D());
                                } else {
                                    AbstractC3305ay2.f("StreamFormatChunk", "Ignoring track with unsupported format tag " + iS);
                                }
                            } else {
                                AbstractC3305ay2.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(AbstractC9004vJ2.a(i2)));
                            }
                            break;
                        } else {
                            c5900kE2.h(4);
                            int iQ3 = c5900kE2.q();
                            int iQ4 = c5900kE2.q();
                            c5900kE2.h(4);
                            int iQ5 = c5900kE2.q();
                            switch (iQ5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                AbstractC3305ay2.f("StreamFormatChunk", "Ignoring track with unsupported compression " + iQ5);
                            } else {
                                C1106Hs1 c1106Hs12 = new C1106Hs1();
                                c1106Hs12.C(iQ3);
                                c1106Hs12.h(iQ4);
                                c1106Hs12.u(str);
                                c2151Ro12 = new C2151Ro1(c1106Hs12.D());
                            }
                        }
                        c2151Ro1 = c2151Ro12;
                        break;
                    case 1751742049:
                        c2151Ro1 = C1713No1.a(c5900kE2);
                        break;
                    case 1752331379:
                        c2151Ro1 = C1817Oo1.a(c5900kE2);
                        break;
                    case 1852994675:
                        c2151Ro1 = C2257So1.a(c5900kE2);
                        break;
                    default:
                        c2151Ro1 = c2151Ro12;
                        break;
                }
            } else {
                c2151Ro1 = b(c5900kE2.q(), c5900kE2);
            }
            if (c2151Ro1 != null) {
                if (c2151Ro1.zza() == 1752331379) {
                    int i3 = ((C1817Oo1) c2151Ro1).a;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        AbstractC3305ay2.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                lp2.g(c2151Ro1);
            }
            c5900kE2.g(iL);
            c5900kE2.f(iM);
        }
        return new C2047Qo1(i, lp2.j());
    }

    public final InterfaceC1194Io1 a(Class cls) {
        OP2 op2 = this.a;
        int size = op2.size();
        int i = 0;
        while (i < size) {
            InterfaceC1194Io1 interfaceC1194Io1 = (InterfaceC1194Io1) op2.get(i);
            i++;
            if (interfaceC1194Io1.getClass() == cls) {
                return interfaceC1194Io1;
            }
        }
        return null;
    }

    @Override // com.daaw.InterfaceC1194Io1
    public final int zza() {
        return this.b;
    }
}
