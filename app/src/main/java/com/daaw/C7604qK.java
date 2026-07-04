package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC6315li1;
import com.daaw.InterfaceC2026Qj0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.qK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7604qK {
    public static final C7604qK d = new C7604qK(true);
    public boolean b;
    public boolean c = false;
    public final ST0 a = ST0.o(16);

    /* JADX INFO: renamed from: com.daaw.qK$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AbstractC6315li1.b.values().length];
            b = iArr;
            try {
                iArr[AbstractC6315li1.b.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[AbstractC6315li1.b.E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[AbstractC6315li1.b.F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[AbstractC6315li1.b.G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[AbstractC6315li1.b.H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[AbstractC6315li1.b.I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[AbstractC6315li1.b.J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[AbstractC6315li1.b.K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[AbstractC6315li1.b.L.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[AbstractC6315li1.b.O.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[AbstractC6315li1.b.P.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[AbstractC6315li1.b.R.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[AbstractC6315li1.b.S.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[AbstractC6315li1.b.T.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[AbstractC6315li1.b.U.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[AbstractC6315li1.b.M.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[AbstractC6315li1.b.N.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[AbstractC6315li1.b.Q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[AbstractC6315li1.c.values().length];
            a = iArr2;
            try {
                iArr2[AbstractC6315li1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[AbstractC6315li1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[AbstractC6315li1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[AbstractC6315li1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[AbstractC6315li1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[AbstractC6315li1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[AbstractC6315li1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[AbstractC6315li1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[AbstractC6315li1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.qK$b */
    public interface b extends Comparable {
        int b();

        boolean d();

        AbstractC6315li1.b e();

        boolean f();

        InterfaceC2026Qj0.a i(InterfaceC2026Qj0.a aVar, InterfaceC2026Qj0 interfaceC2026Qj0);

        AbstractC6315li1.c j();
    }

    public C7604qK() {
    }

    public static int d(AbstractC6315li1.b bVar, int i, Object obj) {
        int iC = C0343Am.C(i);
        if (bVar == AbstractC6315li1.b.M) {
            iC *= 2;
        }
        return iC + e(bVar, obj);
    }

    public static int e(AbstractC6315li1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return C0343Am.g(((Double) obj).doubleValue());
            case 2:
                return C0343Am.m(((Float) obj).floatValue());
            case 3:
                return C0343Am.q(((Long) obj).longValue());
            case 4:
                return C0343Am.E(((Long) obj).longValue());
            case 5:
                return C0343Am.p(((Integer) obj).intValue());
            case 6:
                return C0343Am.k(((Long) obj).longValue());
            case 7:
                return C0343Am.j(((Integer) obj).intValue());
            case 8:
                return C0343Am.b(((Boolean) obj).booleanValue());
            case 9:
                return C0343Am.B((String) obj);
            case 10:
                return obj instanceof AbstractC4629fi ? C0343Am.e((AbstractC4629fi) obj) : C0343Am.c((byte[]) obj);
            case 11:
                return C0343Am.D(((Integer) obj).intValue());
            case 12:
                return C0343Am.w(((Integer) obj).intValue());
            case 13:
                return C0343Am.x(((Long) obj).longValue());
            case 14:
                return C0343Am.y(((Integer) obj).intValue());
            case 15:
                return C0343Am.A(((Long) obj).longValue());
            case 16:
                return C0343Am.n((InterfaceC2026Qj0) obj);
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return C0343Am.s((InterfaceC2026Qj0) obj);
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return obj instanceof AbstractC3595c10.a ? C0343Am.i(((AbstractC3595c10.a) obj).b()) : C0343Am.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        AbstractC6315li1.b bVarE = bVar.e();
        int iB = bVar.b();
        if (!bVar.d()) {
            return d(bVarE, iB, obj);
        }
        int iD = 0;
        if (bVar.f()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(bVarE, it.next());
            }
            return C0343Am.C(iB) + iD + C0343Am.u(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(bVarE, iB, it2.next());
        }
        return iD;
    }

    public static C7604qK g() {
        return d;
    }

    public static int l(AbstractC6315li1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.c();
    }

    public static C7604qK t() {
        return new C7604qK();
    }

    public static Object u(C9687xm c9687xm, AbstractC6315li1.b bVar, boolean z) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(c9687xm.l());
            case 2:
                return Float.valueOf(c9687xm.p());
            case 3:
                return Long.valueOf(c9687xm.s());
            case 4:
                return Long.valueOf(c9687xm.L());
            case 5:
                return Integer.valueOf(c9687xm.r());
            case 6:
                return Long.valueOf(c9687xm.o());
            case 7:
                return Integer.valueOf(c9687xm.n());
            case 8:
                return Boolean.valueOf(c9687xm.j());
            case 9:
                return z ? c9687xm.I() : c9687xm.H();
            case 10:
                return c9687xm.k();
            case 11:
                return Integer.valueOf(c9687xm.K());
            case 12:
                return Integer.valueOf(c9687xm.D());
            case 13:
                return Long.valueOf(c9687xm.E());
            case 14:
                return Integer.valueOf(c9687xm.F());
            case 15:
                return Long.valueOf(c9687xm.G());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(com.daaw.AbstractC6315li1.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = com.daaw.C7604qK.a.a
            com.daaw.li1$c r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L2d;
                case 7: goto L24;
                case 8: goto L18;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L3e
        L15:
            boolean r1 = r3 instanceof com.daaw.InterfaceC2026Qj0
            goto L3e
        L18:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof com.daaw.AbstractC3595c10.a
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            r1 = r0
            goto L3e
        L24:
            boolean r2 = r3 instanceof com.daaw.AbstractC4629fi
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L21
            goto L22
        L2d:
            boolean r1 = r3 instanceof java.lang.String
            goto L3e
        L30:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r1 = r3 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r1 = r3 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r1 = r3 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r1 = r3 instanceof java.lang.Integer
        L3e:
            if (r1 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7604qK.w(com.daaw.li1$b, java.lang.Object):void");
    }

    public static void x(C0343Am c0343Am, AbstractC6315li1.b bVar, int i, Object obj) throws IOException {
        if (bVar == AbstractC6315li1.b.M) {
            c0343Am.X(i, (InterfaceC2026Qj0) obj);
        } else {
            c0343Am.v0(i, l(bVar, false));
            y(c0343Am, bVar, obj);
        }
    }

    public static void y(C0343Am c0343Am, AbstractC6315li1.b bVar, Object obj) throws IOException {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                c0343Am.Q(((Double) obj).doubleValue());
                break;
            case 2:
                c0343Am.W(((Float) obj).floatValue());
                break;
            case 3:
                c0343Am.b0(((Long) obj).longValue());
                break;
            case 4:
                c0343Am.y0(((Long) obj).longValue());
                break;
            case 5:
                c0343Am.a0(((Integer) obj).intValue());
                break;
            case 6:
                c0343Am.U(((Long) obj).longValue());
                break;
            case 7:
                c0343Am.T(((Integer) obj).intValue());
                break;
            case 8:
                c0343Am.L(((Boolean) obj).booleanValue());
                break;
            case 9:
                c0343Am.u0((String) obj);
                break;
            case 10:
                if (!(obj instanceof AbstractC4629fi)) {
                    c0343Am.M((byte[]) obj);
                } else {
                    c0343Am.O((AbstractC4629fi) obj);
                }
                break;
            case 11:
                c0343Am.x0(((Integer) obj).intValue());
                break;
            case 12:
                c0343Am.p0(((Integer) obj).intValue());
                break;
            case 13:
                c0343Am.q0(((Long) obj).longValue());
                break;
            case 14:
                c0343Am.r0(((Integer) obj).intValue());
                break;
            case 15:
                c0343Am.t0(((Long) obj).longValue());
                break;
            case 16:
                c0343Am.Y((InterfaceC2026Qj0) obj);
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                c0343Am.d0((InterfaceC2026Qj0) obj);
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (!(obj instanceof AbstractC3595c10.a)) {
                    c0343Am.S(((Integer) obj).intValue());
                } else {
                    c0343Am.S(((AbstractC3595c10.a) obj).b());
                }
                break;
        }
    }

    public static void z(b bVar, Object obj, C0343Am c0343Am) throws IOException {
        AbstractC6315li1.b bVarE = bVar.e();
        int iB = bVar.b();
        if (!bVar.d()) {
            x(c0343Am, bVarE, iB, obj);
            return;
        }
        List list = (List) obj;
        if (!bVar.f()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(c0343Am, bVarE, iB, it.next());
            }
            return;
        }
        c0343Am.v0(iB, 2);
        Iterator it2 = list.iterator();
        int iE = 0;
        while (it2.hasNext()) {
            iE += e(bVarE, it2.next());
        }
        c0343Am.n0(iE);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(c0343Am, bVarE, it3.next());
        }
    }

    public void a(b bVar, Object obj) {
        List arrayList;
        if (!bVar.d()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(bVar.e(), obj);
        Object objH = h(bVar);
        if (objH == null) {
            arrayList = new ArrayList();
            this.a.p(bVar, arrayList);
        } else {
            arrayList = (List) objH;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7604qK clone() {
        C7604qK c7604qKT = t();
        for (int i = 0; i < this.a.j(); i++) {
            Map.Entry entryI = this.a.i(i);
            c7604qKT.v((b) entryI.getKey(), entryI.getValue());
        }
        for (Map.Entry entry : this.a.k()) {
            c7604qKT.v((b) entry.getKey(), entry.getValue());
        }
        c7604qKT.c = this.c;
        return c7604qKT;
    }

    public final Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public Object h(b bVar) {
        return this.a.get(bVar);
    }

    public Object i(b bVar, int i) {
        if (!bVar.d()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH != null) {
            return ((List) objH).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(b bVar) {
        if (!bVar.d()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH == null) {
            return 0;
        }
        return ((List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i = 0; i < this.a.j(); i++) {
            Map.Entry entryI = this.a.i(i);
            iF += f((b) entryI.getKey(), entryI.getValue());
        }
        for (Map.Entry entry : this.a.k()) {
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(b bVar) {
        if (bVar.d()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.a.get(bVar) != null;
    }

    public boolean n() {
        for (int i = 0; i < this.a.j(); i++) {
            if (!o(this.a.i(i))) {
                return false;
            }
        }
        Iterator it = this.a.k().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.j() != AbstractC6315li1.c.MESSAGE) {
            return true;
        }
        if (!bVar.d()) {
            Object value = entry.getValue();
            if (value instanceof InterfaceC2026Qj0) {
                return ((InterfaceC2026Qj0) value).e();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((InterfaceC2026Qj0) it.next()).e()) {
                return false;
            }
        }
        return true;
    }

    public Iterator p() {
        return this.c ? new S90(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void q() {
        if (this.b) {
            return;
        }
        this.a.n();
        this.b = true;
    }

    public void r(C7604qK c7604qK) {
        for (int i = 0; i < c7604qK.a.j(); i++) {
            s(c7604qK.a.i(i));
        }
        Iterator it = c7604qK.a.k().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public final void s(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.d()) {
            Object objH = h(bVar);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.a.p(bVar, objH);
            return;
        }
        if (bVar.j() != AbstractC6315li1.c.MESSAGE) {
            this.a.p(bVar, c(value));
            return;
        }
        Object objH2 = h(bVar);
        if (objH2 == null) {
            this.a.p(bVar, c(value));
        } else {
            this.a.p(bVar, bVar.i(((InterfaceC2026Qj0) objH2).f(), (InterfaceC2026Qj0) value).a());
        }
    }

    public void v(b bVar, Object obj) {
        if (!bVar.d()) {
            w(bVar.e(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(bVar.e(), it.next());
            }
            obj = arrayList;
        }
        this.a.p(bVar, obj);
    }

    public C7604qK(boolean z) {
        q();
    }
}
