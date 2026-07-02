package com.daaw;

import android.content.Context;
import com.daaw.C10217zg1;
import com.daaw.NW;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8021rp implements NW {
    public NW.c a;
    public NW[] b;
    public b[] c;
    public c[] e;
    public HX g;
    public int h;
    public a i;
    public NW.a d = null;
    public NW.b f = null;

    /* JADX INFO: renamed from: com.daaw.rp$a */
    public interface a {
        C1773Od1 a(Context context, int i, NW nw);
    }

    /* JADX INFO: renamed from: com.daaw.rp$b */
    public class b implements NW.a {
        public int a = 0;
        public int b = 0;
        public boolean c = false;
        public boolean d = false;
        public String e = "";

        public b() {
        }

        @Override // com.daaw.NW.a
        public void a(String str) {
            this.e = str;
            C8021rp.this.B();
        }

        @Override // com.daaw.NW.a
        public void b(int i, int i2, boolean z, boolean z2) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            C8021rp.this.A();
        }
    }

    /* JADX INFO: renamed from: com.daaw.rp$c */
    public class c implements NW.b {
        public int B;

        public c(int i) {
            this.B = i;
        }

        @Override // com.daaw.NW.b
        public void a(String str, String str2) {
            C8021rp.this.f.a(str, C8021rp.v(this.B) + str2);
        }

        @Override // com.daaw.NW.b
        public void b(C10217zg1.a aVar, List list) {
            C8021rp.this.f.b(aVar, list);
        }

        @Override // com.daaw.NW.b
        public int c() {
            return C8021rp.this.f.c();
        }

        @Override // com.daaw.NW.b
        public int d() {
            return C8021rp.this.f.d();
        }

        @Override // com.daaw.NW.b
        public void e(C10217zg1.a aVar, List list) {
            C8021rp.this.f.e(aVar, list);
        }

        @Override // com.daaw.NW.b
        public String f(String str, String str2) {
            return C8021rp.this.f.f(str, C8021rp.v(this.B) + str2);
        }

        @Override // com.daaw.NW.b
        public void g(C10217zg1.a aVar, List list) {
            C8021rp.this.f.g(aVar, list);
        }
    }

    public C8021rp(NW[] nwArr, HX hx, int i, a aVar) {
        this.b = nwArr;
        this.g = hx;
        this.h = i;
        this.i = aVar;
        this.c = new b[nwArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            b[] bVarArr = this.c;
            if (i3 >= bVarArr.length) {
                break;
            }
            bVarArr[i3] = new b();
            i3++;
        }
        this.e = new c[nwArr.length];
        while (true) {
            c[] cVarArr = this.e;
            if (i2 >= cVarArr.length) {
                return;
            }
            cVarArr[i2] = new c(i2);
            i2++;
        }
    }

    public static String v(int i) {
        return String.format(Locale.US, "%05d", Integer.valueOf(i));
    }

    public final void A() {
        if (this.d == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        for (b bVar : this.c) {
            i += bVar.a;
            i2 += bVar.b;
            if (bVar.c) {
                z = true;
            }
            if (bVar.d) {
                z2 = true;
            }
        }
        this.d.b(i, i2, z, z2);
    }

    public final void B() {
        if (this.d == null) {
            return;
        }
        String str = "";
        for (b bVar : this.c) {
            str = str + bVar.e;
        }
        this.d.a(str);
    }

    @Override // com.daaw.NW, com.daaw.C1773Od1.a
    public int a() {
        int iA = 0;
        for (NW nw : this.b) {
            iA += nw.a();
        }
        return iA;
    }

    @Override // com.daaw.NW
    public boolean b() {
        return this.b[0].b();
    }

    @Override // com.daaw.NW
    public C1773Od1 d(Context context, String str) {
        if (str.length() <= 5) {
            AbstractC0441Bk1.c("invalid relativeAddressItem <" + str + ">");
            return null;
        }
        String strSubstring = str.substring(0, 5);
        String strSubstring2 = str.substring(5);
        int iX = AbstractC0405Bb1.x(strSubstring, -1);
        if (iX >= 0) {
            NW[] nwArr = this.b;
            if (iX < nwArr.length) {
                return nwArr[iX].d(context, strSubstring2);
            }
        }
        AbstractC0441Bk1.c("invalid prefix value " + iX);
        return null;
    }

    @Override // com.daaw.NW
    public String e() {
        return this.b[0].e();
    }

    @Override // com.daaw.NW
    public boolean g(boolean z) {
        boolean z2 = true;
        int i = 0;
        while (true) {
            NW[] nwArr = this.b;
            if (i >= nwArr.length) {
                return z2;
            }
            if (!nwArr[i].g(z)) {
                z2 = false;
            }
            i++;
        }
    }

    @Override // com.daaw.NW
    public int h() {
        return this.h;
    }

    @Override // com.daaw.NW
    public HX k() {
        return this.g;
    }

    @Override // com.daaw.NW
    public void l(int i) {
        for (NW nw : this.b) {
            nw.l(i);
        }
    }

    @Override // com.daaw.NW
    public boolean m(int i, Context context) {
        AbstractC6278lb.j();
        return false;
    }

    @Override // com.daaw.NW
    public void n(WeakReference weakReference) {
        this.d = (NW.a) weakReference.get();
        int i = 0;
        while (true) {
            NW[] nwArr = this.b;
            if (i >= nwArr.length) {
                return;
            }
            nwArr[i].n(new WeakReference(this.c[i]));
            i++;
        }
    }

    @Override // com.daaw.NW
    public void o(Context context, String str) {
        for (NW nw : this.b) {
            nw.o(context, str);
        }
    }

    @Override // com.daaw.NW
    public String p(String str) {
        return this.b[0].p(str);
    }

    @Override // com.daaw.NW
    public void q(WeakReference weakReference) {
        this.f = (NW.b) weakReference.get();
        int i = 0;
        while (true) {
            NW[] nwArr = this.b;
            if (i >= nwArr.length) {
                return;
            }
            nwArr[i].q(new WeakReference(this.e[i]));
            i++;
        }
    }

    public C1773Od1 r(Context context) {
        return t(context, -1);
    }

    @Override // com.daaw.NW
    public B61 s() {
        return this.b[0].s();
    }

    public C1773Od1 t(Context context, int i) {
        return this.i.a(context, i, this);
    }

    @Override // com.daaw.NW
    public NW.c u() {
        return this.a;
    }

    @Override // com.daaw.NW
    public NW.b w() {
        NW[] nwArr = this.b;
        if (nwArr.length > 0) {
            return nwArr[0].w();
        }
        return null;
    }

    @Override // com.daaw.NW
    public void x(Context context, String[] strArr, InterfaceC5694jX[] interfaceC5694jXArr) {
        this.b[0].x(context, strArr, interfaceC5694jXArr);
    }

    @Override // com.daaw.NW
    public boolean y(InterfaceC5694jX interfaceC5694jX) {
        for (NW nw : this.b) {
            if (nw.y(interfaceC5694jX)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.NW
    public boolean z() {
        return true;
    }

    @Override // com.daaw.NW
    public void c(boolean z) {
    }
}
