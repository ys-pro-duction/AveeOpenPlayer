package com.daaw;

import com.revenuecat.purchases.common.Constants;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.sW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8209sW {
    public static final C4908gi a = C4908gi.h(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
    public static final FU[] b;
    public static final Map c;

    /* JADX INFO: renamed from: com.daaw.sW$a */
    public static final class a {
        public final List a;
        public final InterfaceC7424ph b;
        public int c;
        public int d;
        public FU[] e;
        public int f;
        public int g;
        public int h;

        public a(int i, PU0 pu0) {
            this(i, i, pu0);
        }

        public final void a() {
            int i = this.d;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    d(i2 - i);
                }
            }
        }

        public final void b() {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        public final int c(int i) {
            return this.f + 1 + i;
        }

        public final int d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.e[length].c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                }
                FU[] fuArr = this.e;
                System.arraycopy(fuArr, i2 + 1, fuArr, i2 + 1 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        public List e() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        public final C4908gi f(int i) throws IOException {
            if (i(i)) {
                return AbstractC8209sW.b[i].a;
            }
            int iC = c(i - AbstractC8209sW.b.length);
            if (iC >= 0) {
                FU[] fuArr = this.e;
                if (iC < fuArr.length) {
                    return fuArr[iC].a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public void g(int i) {
            this.c = i;
            this.d = i;
            a();
        }

        public final void h(int i, FU fu) {
            this.a.add(fu);
            int i2 = fu.c;
            if (i != -1) {
                i2 -= this.e[c(i)].c;
            }
            int i3 = this.d;
            if (i2 > i3) {
                b();
                return;
            }
            int iD = d((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                FU[] fuArr = this.e;
                if (i4 > fuArr.length) {
                    FU[] fuArr2 = new FU[fuArr.length * 2];
                    System.arraycopy(fuArr, 0, fuArr2, fuArr.length, fuArr.length);
                    this.f = this.e.length - 1;
                    this.e = fuArr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = fu;
                this.g++;
            } else {
                this.e[i + c(i) + iD] = fu;
            }
            this.h += i2;
        }

        public final boolean i(int i) {
            return i >= 0 && i <= AbstractC8209sW.b.length - 1;
        }

        public final int j() {
            return this.b.j0() & 255;
        }

        public C4908gi k() {
            int iJ = j();
            boolean z = (iJ & 128) == 128;
            int iN = n(iJ, 127);
            return z ? C4908gi.o(FW.f().c(this.b.C0(iN))) : this.b.u(iN);
        }

        public void l() throws IOException {
            while (!this.b.K()) {
                byte bJ0 = this.b.j0();
                int i = bJ0 & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((bJ0 & 128) == 128) {
                    m(n(i, 127) - 1);
                } else if (i == 64) {
                    p();
                } else if ((bJ0 & 64) == 64) {
                    o(n(i, 63) - 1);
                } else if ((bJ0 & 32) == 32) {
                    int iN = n(i, 31);
                    this.d = iN;
                    if (iN < 0 || iN > this.c) {
                        throw new IOException("Invalid dynamic table size update " + this.d);
                    }
                    a();
                } else if (i == 16 || i == 0) {
                    r();
                } else {
                    q(n(i, 15) - 1);
                }
            }
        }

        public final void m(int i) throws IOException {
            if (i(i)) {
                this.a.add(AbstractC8209sW.b[i]);
                return;
            }
            int iC = c(i - AbstractC8209sW.b.length);
            if (iC >= 0) {
                FU[] fuArr = this.e;
                if (iC <= fuArr.length - 1) {
                    this.a.add(fuArr[iC]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public int n(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iJ = j();
                if ((iJ & 128) == 0) {
                    return i2 + (iJ << i4);
                }
                i2 += (iJ & 127) << i4;
                i4 += 7;
            }
        }

        public final void o(int i) {
            h(-1, new FU(f(i), k()));
        }

        public final void p() {
            h(-1, new FU(AbstractC8209sW.e(k()), k()));
        }

        public final void q(int i) throws IOException {
            this.a.add(new FU(f(i), k()));
        }

        public final void r() throws IOException {
            this.a.add(new FU(AbstractC8209sW.e(k()), k()));
        }

        public a(int i, int i2, PU0 pu0) {
            this.a = new ArrayList();
            this.e = new FU[8];
            this.f = r0.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = i;
            this.d = i2;
            this.b = AbstractC2468Up0.b(pu0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sW$b */
    public static final class b {
        public final C4057dh a;
        public boolean b;
        public int c;
        public int d;
        public boolean e;
        public int f;
        public FU[] g;
        public int h;
        public int i;
        public int j;

        public b(C4057dh c4057dh) {
            this(4096, false, c4057dh);
        }

        public final void a() {
            Arrays.fill(this.g, (Object) null);
            this.i = this.g.length - 1;
            this.h = 0;
            this.j = 0;
        }

        public final int b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.g.length;
                while (true) {
                    length--;
                    i2 = this.i;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.g[length].c;
                    i -= i4;
                    this.j -= i4;
                    this.h--;
                    i3++;
                }
                FU[] fuArr = this.g;
                System.arraycopy(fuArr, i2 + 1, fuArr, i2 + 1 + i3, this.h);
                this.i += i3;
            }
            return i3;
        }

        public final void c(FU fu) {
            int i = fu.c;
            int i2 = this.f;
            if (i > i2) {
                a();
                return;
            }
            b((this.j + i) - i2);
            int i3 = this.h + 1;
            FU[] fuArr = this.g;
            if (i3 > fuArr.length) {
                FU[] fuArr2 = new FU[fuArr.length * 2];
                System.arraycopy(fuArr, 0, fuArr2, fuArr.length, fuArr.length);
                this.i = this.g.length - 1;
                this.g = fuArr2;
            }
            int i4 = this.i;
            this.i = i4 - 1;
            this.g[i4] = fu;
            this.h++;
            this.j += i;
        }

        public void d(C4908gi c4908gi) throws IOException {
            if (!this.b || FW.f().e(c4908gi.x()) >= c4908gi.s()) {
                f(c4908gi.s(), 127, 0);
                this.a.j1(c4908gi);
                return;
            }
            C4057dh c4057dh = new C4057dh();
            FW.f().d(c4908gi.x(), c4057dh.p0());
            C4908gi c4908giX0 = c4057dh.x0();
            f(c4908giX0.s(), 127, 128);
            this.a.j1(c4908giX0);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(java.util.List r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8209sW.b.e(java.util.List):void");
        }

        public void f(int i, int i2, int i3) {
            if (i < i2) {
                this.a.L(i | i3);
                return;
            }
            this.a.L(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.a.L(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.a.L(i4);
        }

        public b(int i, boolean z, C4057dh c4057dh) {
            this.d = Integer.MAX_VALUE;
            this.g = new FU[8];
            this.i = r0.length - 1;
            this.c = i;
            this.f = i;
            this.b = z;
            this.a = c4057dh;
        }
    }

    static {
        FU fu = new FU(FU.h, "");
        C4908gi c4908gi = FU.e;
        FU fu2 = new FU(c4908gi, "GET");
        FU fu3 = new FU(c4908gi, "POST");
        C4908gi c4908gi2 = FU.f;
        FU fu4 = new FU(c4908gi2, "/");
        FU fu5 = new FU(c4908gi2, "/index.html");
        C4908gi c4908gi3 = FU.g;
        FU fu6 = new FU(c4908gi3, "http");
        FU fu7 = new FU(c4908gi3, "https");
        C4908gi c4908gi4 = FU.d;
        b = new FU[]{fu, fu2, fu3, fu4, fu5, fu6, fu7, new FU(c4908gi4, "200"), new FU(c4908gi4, "204"), new FU(c4908gi4, "206"), new FU(c4908gi4, "304"), new FU(c4908gi4, "400"), new FU(c4908gi4, "404"), new FU(c4908gi4, "500"), new FU("accept-charset", ""), new FU("accept-encoding", "gzip, deflate"), new FU("accept-language", ""), new FU("accept-ranges", ""), new FU("accept", ""), new FU("access-control-allow-origin", ""), new FU("age", ""), new FU("allow", ""), new FU("authorization", ""), new FU("cache-control", ""), new FU("content-disposition", ""), new FU("content-encoding", ""), new FU("content-language", ""), new FU("content-length", ""), new FU("content-location", ""), new FU("content-range", ""), new FU("content-type", ""), new FU("cookie", ""), new FU("date", ""), new FU("etag", ""), new FU("expect", ""), new FU("expires", ""), new FU("from", ""), new FU("host", ""), new FU("if-match", ""), new FU("if-modified-since", ""), new FU("if-none-match", ""), new FU("if-range", ""), new FU("if-unmodified-since", ""), new FU("last-modified", ""), new FU("link", ""), new FU("location", ""), new FU("max-forwards", ""), new FU("proxy-authenticate", ""), new FU("proxy-authorization", ""), new FU("range", ""), new FU("referer", ""), new FU("refresh", ""), new FU("retry-after", ""), new FU("server", ""), new FU("set-cookie", ""), new FU("strict-transport-security", ""), new FU("transfer-encoding", ""), new FU("user-agent", ""), new FU("vary", ""), new FU("via", ""), new FU("www-authenticate", "")};
        c = f();
    }

    public static C4908gi e(C4908gi c4908gi) throws IOException {
        int iS = c4908gi.s();
        for (int i = 0; i < iS; i++) {
            byte bK = c4908gi.k(i);
            if (bK >= 65 && bK <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c4908gi.y());
            }
        }
        return c4908gi;
    }

    public static Map f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.length);
        int i = 0;
        while (true) {
            FU[] fuArr = b;
            if (i >= fuArr.length) {
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(fuArr[i].a)) {
                linkedHashMap.put(fuArr[i].a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
