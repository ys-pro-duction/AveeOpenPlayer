package com.daaw;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.Ll0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1493Ll0 {
    public static final String[] m = {null, "I", "II", "III"};
    public String a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public String l;

    public C1493Ll0(byte b, byte b2, byte b3, byte b4) throws M10 {
        p(AbstractC6308lh.l(b, b2, b3, b4));
    }

    public int a(long j, long j2) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 > 31) {
                break;
            }
            if (((j2 >> i2) & 1) != 0) {
                i = i2;
                break;
            }
            i2++;
        }
        return (int) ((j & j2) >> i);
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.l;
    }

    public String e() {
        return m[this.b];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int f() {
        int i;
        int i2;
        ?? r0 = this.f;
        if (this.b == 1) {
            i = (this.d * 48000) / this.e;
            i2 = r0 * 4;
        } else {
            i = (this.d * 144000) / this.e;
            i2 = r0;
        }
        return i + i2;
    }

    public String g() {
        return this.i;
    }

    public int h() {
        return this.e;
    }

    public String i() {
        return this.a;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }

    public final void l(int i) throws M10 {
        if ("1.0".equals(this.a)) {
            int i2 = this.b;
            if (i2 == 1) {
                switch (i) {
                    case 1:
                        this.d = 32;
                        return;
                    case 2:
                        this.d = 64;
                        return;
                    case 3:
                        this.d = 96;
                        return;
                    case 4:
                        this.d = 128;
                        return;
                    case 5:
                        this.d = 160;
                        return;
                    case 6:
                        this.d = 192;
                        return;
                    case 7:
                        this.d = 224;
                        return;
                    case 8:
                        this.d = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        return;
                    case 9:
                        this.d = 288;
                        return;
                    case 10:
                        this.d = 320;
                        return;
                    case 11:
                        this.d = 352;
                        return;
                    case 12:
                        this.d = 384;
                        return;
                    case 13:
                        this.d = 416;
                        return;
                    case 14:
                        this.d = 448;
                        return;
                }
            }
            if (i2 == 2) {
                switch (i) {
                    case 1:
                        this.d = 32;
                        return;
                    case 2:
                        this.d = 48;
                        return;
                    case 3:
                        this.d = 56;
                        return;
                    case 4:
                        this.d = 64;
                        return;
                    case 5:
                        this.d = 80;
                        return;
                    case 6:
                        this.d = 96;
                        return;
                    case 7:
                        this.d = 112;
                        return;
                    case 8:
                        this.d = 128;
                        return;
                    case 9:
                        this.d = 160;
                        return;
                    case 10:
                        this.d = 192;
                        return;
                    case 11:
                        this.d = 224;
                        return;
                    case 12:
                        this.d = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        return;
                    case 13:
                        this.d = 320;
                        return;
                    case 14:
                        this.d = 384;
                        return;
                }
            }
            if (i2 == 3) {
                switch (i) {
                    case 1:
                        this.d = 32;
                        return;
                    case 2:
                        this.d = 40;
                        return;
                    case 3:
                        this.d = 48;
                        return;
                    case 4:
                        this.d = 56;
                        return;
                    case 5:
                        this.d = 64;
                        return;
                    case 6:
                        this.d = 80;
                        return;
                    case 7:
                        this.d = 96;
                        return;
                    case 8:
                        this.d = 112;
                        return;
                    case 9:
                        this.d = 128;
                        return;
                    case 10:
                        this.d = 160;
                        return;
                    case 11:
                        this.d = 192;
                        return;
                    case 12:
                        this.d = 224;
                        return;
                    case 13:
                        this.d = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        return;
                    case 14:
                        this.d = 320;
                        return;
                }
            }
        } else if ("2.0".equals(this.a) || "2.5".equals(this.a)) {
            int i3 = this.b;
            if (i3 == 1) {
                switch (i) {
                    case 1:
                        this.d = 32;
                        return;
                    case 2:
                        this.d = 48;
                        return;
                    case 3:
                        this.d = 56;
                        return;
                    case 4:
                        this.d = 64;
                        return;
                    case 5:
                        this.d = 80;
                        return;
                    case 6:
                        this.d = 96;
                        return;
                    case 7:
                        this.d = 112;
                        return;
                    case 8:
                        this.d = 128;
                        return;
                    case 9:
                        this.d = 144;
                        return;
                    case 10:
                        this.d = 160;
                        return;
                    case 11:
                        this.d = 176;
                        return;
                    case 12:
                        this.d = 192;
                        return;
                    case 13:
                        this.d = 224;
                        return;
                    case 14:
                        this.d = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        return;
                }
            }
            if (i3 == 2 || i3 == 3) {
                switch (i) {
                    case 1:
                        this.d = 8;
                        return;
                    case 2:
                        this.d = 16;
                        return;
                    case 3:
                        this.d = 24;
                        return;
                    case 4:
                        this.d = 32;
                        return;
                    case 5:
                        this.d = 40;
                        return;
                    case 6:
                        this.d = 48;
                        return;
                    case 7:
                        this.d = 56;
                        return;
                    case 8:
                        this.d = 64;
                        return;
                    case 9:
                        this.d = 80;
                        return;
                    case 10:
                        this.d = 96;
                        return;
                    case 11:
                        this.d = 112;
                        return;
                    case 12:
                        this.d = 128;
                        return;
                    case 13:
                        this.d = 144;
                        return;
                    case 14:
                        this.d = 160;
                        return;
                }
            }
        }
        throw new M10("Invalid bitrate in frame header");
    }

    public final void m(int i) throws M10 {
        if (i == 0) {
            this.h = "Stereo";
            return;
        }
        if (i == 1) {
            this.h = "Joint stereo";
        } else if (i == 2) {
            this.h = "Dual mono";
        } else {
            if (i != 3) {
                throw new M10("Invalid channel mode in frame header");
            }
            this.h = "Mono";
        }
    }

    public final void n(int i) {
        this.j = i == 1;
    }

    public final void o(int i) throws M10 {
        if (i == 0) {
            this.l = "None";
        } else if (i == 1) {
            this.l = "50/15 ms";
        } else {
            if (i != 3) {
                throw new M10("Invalid emphasis in frame header");
            }
            this.l = "CCITT J.17";
        }
    }

    public final void p(long j) throws M10 {
        if (a(j, 4292870144L) != 2047) {
            throw new M10("Frame sync missing");
        }
        x(a(j, 1572864L));
        q(a(j, 393216L));
        v(a(j, 65536L));
        l(a(j, 61440L));
        w(a(j, 3072L));
        t(a(j, 512L));
        u(a(j, 256L));
        m(a(j, 192L));
        r(a(j, 48L));
        n(a(j, 8L));
        s(a(j, 4L));
        o(a(j, 3L));
    }

    public final void q(int i) throws M10 {
        if (i == 1) {
            this.b = 3;
        } else if (i == 2) {
            this.b = 2;
        } else {
            if (i != 3) {
                throw new M10("Invalid mpeg layer description in frame header");
            }
            this.b = 1;
        }
    }

    public final void r(int i) throws M10 {
        if (!"Joint stereo".equals(this.h)) {
            this.i = "n/a";
            return;
        }
        int i2 = this.b;
        if (i2 == 1 || i2 == 2) {
            if (i == 0) {
                this.i = "Bands 4-31";
                return;
            }
            if (i == 1) {
                this.i = "Bands 8-31";
                return;
            } else if (i == 2) {
                this.i = "Bands 12-31";
                return;
            } else if (i == 3) {
                this.i = "Bands 16-31";
                return;
            }
        } else if (i2 == 3) {
            if (i == 0) {
                this.i = "None";
                return;
            }
            if (i == 1) {
                this.i = "Intensity stereo";
                return;
            } else if (i == 2) {
                this.i = "M/S stereo";
                return;
            } else if (i == 3) {
                this.i = "Intensity & M/S stereo";
                return;
            }
        }
        throw new M10("Invalid mode extension in frame header");
    }

    public final void s(int i) {
        this.k = i == 1;
    }

    public final void t(int i) {
        this.f = i == 1;
    }

    public final void u(int i) {
        this.g = i == 1;
    }

    public final void v(int i) {
        this.c = i == 1;
    }

    public final void w(int i) throws M10 {
        if ("1.0".equals(this.a)) {
            if (i == 0) {
                this.e = 44100;
                return;
            } else if (i == 1) {
                this.e = 48000;
                return;
            } else if (i == 2) {
                this.e = 32000;
                return;
            }
        } else if ("2.0".equals(this.a)) {
            if (i == 0) {
                this.e = 22050;
                return;
            } else if (i == 1) {
                this.e = 24000;
                return;
            } else if (i == 2) {
                this.e = 16000;
                return;
            }
        } else if ("2.5".equals(this.a)) {
            if (i == 0) {
                this.e = 11025;
                return;
            } else if (i == 1) {
                this.e = 12000;
                return;
            } else if (i == 2) {
                this.e = 8000;
                return;
            }
        }
        throw new M10("Invalid sample rate in frame header");
    }

    public final void x(int i) throws M10 {
        if (i == 0) {
            this.a = "2.5";
        } else if (i == 2) {
            this.a = "2.0";
        } else {
            if (i != 3) {
                throw new M10("Invalid mpeg audio version in frame header");
            }
            this.a = "1.0";
        }
    }
}
