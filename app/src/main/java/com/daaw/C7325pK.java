package com.daaw;

import com.daaw.AbstractC3317b10;
import com.daaw.AbstractC6027ki1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.pK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7325pK {
    public static final C7325pK d = new C7325pK(true);
    public final TT0 a;
    public boolean b;
    public boolean c;

    /* JADX INFO: renamed from: com.daaw.pK$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AbstractC6027ki1.b.values().length];
            b = iArr;
            try {
                iArr[AbstractC6027ki1.b.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[AbstractC6027ki1.b.E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[AbstractC6027ki1.b.F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[AbstractC6027ki1.b.G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[AbstractC6027ki1.b.H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[AbstractC6027ki1.b.I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[AbstractC6027ki1.b.J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[AbstractC6027ki1.b.K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[AbstractC6027ki1.b.M.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[AbstractC6027ki1.b.N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[AbstractC6027ki1.b.L.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[AbstractC6027ki1.b.O.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[AbstractC6027ki1.b.P.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[AbstractC6027ki1.b.R.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[AbstractC6027ki1.b.S.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[AbstractC6027ki1.b.T.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[AbstractC6027ki1.b.U.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[AbstractC6027ki1.b.Q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[AbstractC6027ki1.c.values().length];
            a = iArr2;
            try {
                iArr2[AbstractC6027ki1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[AbstractC6027ki1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[AbstractC6027ki1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[AbstractC6027ki1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[AbstractC6027ki1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[AbstractC6027ki1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[AbstractC6027ki1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[AbstractC6027ki1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[AbstractC6027ki1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.pK$b */
    public interface b extends Comparable {
        int b();

        boolean d();

        AbstractC6027ki1.b e();

        boolean f();
    }

    public C7325pK() {
        this.a = TT0.s(16);
    }

    public static int b(AbstractC6027ki1.b bVar, int i, Object obj) {
        int iQ = AbstractC10245zm.Q(i);
        if (bVar == AbstractC6027ki1.b.M) {
            iQ *= 2;
        }
        return iQ + c(bVar, obj);
    }

    public static int c(AbstractC6027ki1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return AbstractC10245zm.k(((Double) obj).doubleValue());
            case 2:
                return AbstractC10245zm.s(((Float) obj).floatValue());
            case 3:
                return AbstractC10245zm.z(((Long) obj).longValue());
            case 4:
                return AbstractC10245zm.U(((Long) obj).longValue());
            case 5:
                return AbstractC10245zm.x(((Integer) obj).intValue());
            case 6:
                return AbstractC10245zm.q(((Long) obj).longValue());
            case 7:
                return AbstractC10245zm.o(((Integer) obj).intValue());
            case 8:
                return AbstractC10245zm.f(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC10245zm.u((InterfaceC1900Pj0) obj);
            case 10:
                return AbstractC10245zm.C((InterfaceC1900Pj0) obj);
            case 11:
                return obj instanceof AbstractC4340ei ? AbstractC10245zm.i((AbstractC4340ei) obj) : AbstractC10245zm.P((String) obj);
            case 12:
                return obj instanceof AbstractC4340ei ? AbstractC10245zm.i((AbstractC4340ei) obj) : AbstractC10245zm.g((byte[]) obj);
            case 13:
                return AbstractC10245zm.S(((Integer) obj).intValue());
            case 14:
                return AbstractC10245zm.H(((Integer) obj).intValue());
            case 15:
                return AbstractC10245zm.J(((Long) obj).longValue());
            case 16:
                return AbstractC10245zm.L(((Integer) obj).intValue());
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return AbstractC10245zm.N(((Long) obj).longValue());
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return obj instanceof AbstractC3317b10.a ? AbstractC10245zm.m(((AbstractC3317b10.a) obj).b()) : AbstractC10245zm.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        AbstractC6027ki1.b bVarE = bVar.e();
        int iB = bVar.b();
        if (!bVar.d()) {
            return b(bVarE, iB, obj);
        }
        int iB2 = 0;
        if (bVar.f()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iB2 += c(bVarE, it.next());
            }
            return AbstractC10245zm.Q(iB) + iB2 + AbstractC10245zm.S(iB2);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iB2 += b(bVarE, iB, it2.next());
        }
        return iB2;
    }

    public static int i(AbstractC6027ki1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.c();
    }

    public static boolean l(Map.Entry entry) {
        AbstractC6314li0.a(entry.getKey());
        throw null;
    }

    public static boolean m(AbstractC6027ki1.b bVar, Object obj) {
        AbstractC3317b10.a(obj);
        switch (a.a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC4340ei) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof AbstractC3317b10.a)) {
                }
                break;
            case 9:
                if (!(obj instanceof InterfaceC1900Pj0)) {
                }
                break;
        }
        return false;
    }

    public static C7325pK r() {
        return new C7325pK();
    }

    public static void u(AbstractC10245zm abstractC10245zm, AbstractC6027ki1.b bVar, int i, Object obj) {
        if (bVar == AbstractC6027ki1.b.M) {
            abstractC10245zm.v0(i, (InterfaceC1900Pj0) obj);
        } else {
            abstractC10245zm.R0(i, i(bVar, false));
            v(abstractC10245zm, bVar, obj);
        }
    }

    public static void v(AbstractC10245zm abstractC10245zm, AbstractC6027ki1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                abstractC10245zm.m0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC10245zm.u0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC10245zm.C0(((Long) obj).longValue());
                break;
            case 4:
                abstractC10245zm.V0(((Long) obj).longValue());
                break;
            case 5:
                abstractC10245zm.A0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC10245zm.s0(((Long) obj).longValue());
                break;
            case 7:
                abstractC10245zm.q0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC10245zm.g0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC10245zm.x0((InterfaceC1900Pj0) obj);
                break;
            case 10:
                abstractC10245zm.E0((InterfaceC1900Pj0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC4340ei)) {
                    abstractC10245zm.Q0((String) obj);
                } else {
                    abstractC10245zm.k0((AbstractC4340ei) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC4340ei)) {
                    abstractC10245zm.h0((byte[]) obj);
                } else {
                    abstractC10245zm.k0((AbstractC4340ei) obj);
                }
                break;
            case 13:
                abstractC10245zm.T0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC10245zm.I0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC10245zm.K0(((Long) obj).longValue());
                break;
            case 16:
                abstractC10245zm.M0(((Integer) obj).intValue());
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                abstractC10245zm.O0(((Long) obj).longValue());
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (!(obj instanceof AbstractC3317b10.a)) {
                    abstractC10245zm.o0(((Integer) obj).intValue());
                } else {
                    abstractC10245zm.o0(((AbstractC3317b10.a) obj).b());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C7325pK clone() {
        C7325pK c7325pKR = r();
        for (int i = 0; i < this.a.l(); i++) {
            Map.Entry entryK = this.a.k(i);
            AbstractC6314li0.a(entryK.getKey());
            c7325pKR.s(null, entryK.getValue());
        }
        for (Map.Entry entry : this.a.n()) {
            AbstractC6314li0.a(entry.getKey());
            c7325pKR.s(null, entry.getValue());
        }
        c7325pKR.c = this.c;
        return c7325pKR;
    }

    public Iterator e() {
        return this.c ? new T90(this.a.i().iterator()) : this.a.i().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7325pK) {
            return this.a.equals(((C7325pK) obj).a);
        }
        return false;
    }

    public int f() {
        int iG = 0;
        for (int i = 0; i < this.a.l(); i++) {
            iG += g(this.a.k(i));
        }
        Iterator it = this.a.n().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public final int g(Map.Entry entry) {
        AbstractC6314li0.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int iD = 0;
        for (int i = 0; i < this.a.l(); i++) {
            Map.Entry entryK = this.a.k(i);
            AbstractC6314li0.a(entryK.getKey());
            iD += d(null, entryK.getValue());
        }
        for (Map.Entry entry : this.a.n()) {
            AbstractC6314li0.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean j() {
        return this.a.isEmpty();
    }

    public boolean k() {
        for (int i = 0; i < this.a.l(); i++) {
            if (!l(this.a.k(i))) {
                return false;
            }
        }
        Iterator it = this.a.n().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.c ? new T90(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void o() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.l(); i++) {
            Map.Entry entryK = this.a.k(i);
            if (entryK.getValue() instanceof AbstractC5394iS) {
                ((AbstractC5394iS) entryK.getValue()).J();
            }
        }
        this.a.r();
        this.b = true;
    }

    public void p(C7325pK c7325pK) {
        for (int i = 0; i < c7325pK.a.l(); i++) {
            q(c7325pK.a.k(i));
        }
        Iterator it = c7325pK.a.n().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        AbstractC6314li0.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void s(b bVar, Object obj) {
        if (!bVar.d()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.a.t(bVar, obj);
    }

    public final void t(b bVar, Object obj) {
        if (!m(bVar.e(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.b()), bVar.e().a(), obj.getClass().getName()));
        }
    }

    public C7325pK(boolean z) {
        this(TT0.s(0));
        o();
    }

    public C7325pK(TT0 tt0) {
        this.a = tt0;
        o();
    }
}
