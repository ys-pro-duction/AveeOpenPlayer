package com.daaw;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F implements YW {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public int h;
    public int i;
    public byte[] j;
    public boolean k;
    public final Map l;

    public F(byte[] bArr) {
        this(bArr, false);
    }

    private void k(byte[] bArr) throws C5428ia1, C6344lo0, M10 {
        AbstractC4288eX.c(bArr);
        int iJ = j(bArr);
        try {
            if (this.b) {
                iJ = f(bArr, iJ);
            }
            int i = this.h;
            if (this.d) {
                i -= 10;
            }
            i(bArr, iJ, i);
            if (this.d) {
                h(bArr, this.h);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new M10("Premature end of tag", e);
        }
    }

    @Override // com.daaw.YW
    public byte[] a() {
        C4010dX c4010dXD = d(this.k ? "PIC" : "APIC");
        if (c4010dXD != null) {
            return c4010dXD.c();
        }
        return null;
    }

    public void b(ZW zw, boolean z) {
        C3174aX c3174aX = (C3174aX) this.l.get(zw.b());
        if (c3174aX == null) {
            C3174aX c3174aX2 = new C3174aX(zw.b());
            c3174aX2.a(zw);
            this.l.put(zw.b(), c3174aX2);
        } else if (!z) {
            c3174aX.a(zw);
        } else {
            c3174aX.b();
            c3174aX.a(zw);
        }
    }

    public ZW c(byte[] bArr, int i) {
        return this.k ? new C3453bX(bArr, i) : new ZW(bArr, i);
    }

    public final C4010dX d(String str) {
        C3174aX c3174aX = (C3174aX) this.l.get(str);
        if (c3174aX == null) {
            return null;
        }
        ZW zw = (ZW) c3174aX.c().get(0);
        try {
            return this.k ? new C3731cX(l(), zw.a()) : new C4010dX(l(), zw.a());
        } catch (M10 unused) {
            return null;
        }
    }

    public Map e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        F f = (F) obj;
        if (this.a != f.a || this.b != f.b || this.c != f.c || this.d != f.d || this.e != f.e || this.h != f.h || this.i != f.i) {
            return false;
        }
        String str = this.g;
        if (str != null) {
            String str2 = f.g;
            if (str2 == null || !str.equals(str2)) {
                return false;
            }
        } else if (f.g != null) {
            return false;
        }
        Map map = this.l;
        if (map != null) {
            Map map2 = f.l;
            if (map2 == null || !map.equals(map2)) {
                return false;
            }
        } else if (f.l != null) {
            return false;
        }
        return true;
    }

    public final int f(byte[] bArr, int i) {
        int iM = AbstractC6308lh.m(bArr[i], bArr[i + 1], bArr[i + 2], bArr[i + 3]) + 4;
        this.i = iM;
        this.j = AbstractC6308lh.e(bArr, i + 4, iM);
        return this.i;
    }

    public abstract void g(byte[] bArr);

    public final int h(byte[] bArr, int i) throws M10 {
        if ("3DI".equals(AbstractC6308lh.c(bArr, i, 3))) {
            return 10;
        }
        throw new M10("Invalid footer");
    }

    public int i(byte[] bArr, int i, int i2) {
        while (i <= i2) {
            try {
                ZW zwC = c(bArr, i);
                b(zwC, false);
                i += zwC.c();
            } catch (M10 unused) {
            }
        }
        return i;
    }

    public final int j(byte[] bArr) throws C5428ia1, M10 {
        byte b = bArr[3];
        this.g = ((int) b) + "." + ((int) bArr[4]);
        if (b != 2 && b != 3 && b != 4) {
            throw new C5428ia1("Unsupported version " + this.g);
        }
        g(bArr);
        if ((bArr[5] & 15) != 0) {
            throw new C5428ia1("Unrecognised bits in header");
        }
        int iM = AbstractC6308lh.m(bArr[6], bArr[7], bArr[8], bArr[9]);
        this.h = iM;
        if (iM >= 1) {
            return 10;
        }
        throw new M10("Zero size tag");
    }

    public boolean l() {
        return false;
    }

    public F(byte[] bArr, boolean z) throws C5428ia1, C6344lo0, M10 {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = 0;
        this.k = false;
        this.l = new TreeMap();
        this.k = z;
        k(bArr);
    }
}
