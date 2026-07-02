package com.daaw;

import com.daaw.AbstractC4451f50;
import com.daaw.AbstractC5674jS;
import com.daaw.AbstractC7261p50;
import com.daaw.SM;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.q50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7540q50 {
    public static final C7540q50 a = new C7540q50();
    public static final C6763nJ b;

    static {
        C6763nJ c6763nJD = C6763nJ.d();
        AbstractC7261p50.a(c6763nJD);
        G10.f(c6763nJD, "apply(...)");
        b = c6763nJD;
    }

    public static /* synthetic */ AbstractC4451f50.a d(C7540q50 c7540q50, HA0 ha0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c7540q50.c(ha0, interfaceC2664Wm0, b81, z);
    }

    public static final boolean f(HA0 ha0) {
        G10.g(ha0, "proto");
        SM.b bVarA = C3337b50.a.a();
        Object objX = ha0.x(AbstractC7261p50.e);
        G10.f(objX, "getExtension(...)");
        Boolean boolD = bVarA.d(((Number) objX).intValue());
        G10.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    public static final C0576Cs0 h(byte[] bArr, String[] strArr) {
        G10.g(bArr, "bytes");
        G10.g(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C0576Cs0(a.k(byteArrayInputStream, strArr), C9245wA0.A1(byteArrayInputStream, b));
    }

    public static final C0576Cs0 i(String[] strArr, String[] strArr2) {
        G10.g(strArr, "data");
        G10.g(strArr2, "strings");
        byte[] bArrE = AbstractC1260Jf.e(strArr);
        G10.f(bArrE, "decodeBytes(...)");
        return h(bArrE, strArr2);
    }

    public static final C0576Cs0 j(String[] strArr, String[] strArr2) {
        G10.g(strArr, "data");
        G10.g(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1260Jf.e(strArr));
        return new C0576Cs0(a.k(byteArrayInputStream, strArr2), CA0.I0(byteArrayInputStream, b));
    }

    public static final C0576Cs0 l(byte[] bArr, String[] strArr) {
        G10.g(bArr, "bytes");
        G10.g(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C0576Cs0(a.k(byteArrayInputStream, strArr), FA0.h0(byteArrayInputStream, b));
    }

    public static final C0576Cs0 m(String[] strArr, String[] strArr2) {
        G10.g(strArr, "data");
        G10.g(strArr2, "strings");
        byte[] bArrE = AbstractC1260Jf.e(strArr);
        G10.f(bArrE, "decodeBytes(...)");
        return l(bArrE, strArr2);
    }

    public final C6763nJ a() {
        return b;
    }

    public final AbstractC4451f50.b b(C9524xA0 c9524xA0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81) {
        String strN0;
        G10.g(c9524xA0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        AbstractC5674jS.f fVar = AbstractC7261p50.a;
        G10.f(fVar, "constructorSignature");
        AbstractC7261p50.c cVar = (AbstractC7261p50.c) SA0.a(c9524xA0, fVar);
        String string = (cVar == null || !cVar.C()) ? "<init>" : interfaceC2664Wm0.getString(cVar.A());
        if (cVar == null || !cVar.B()) {
            List listQ = c9524xA0.Q();
            G10.f(listQ, "getValueParameterList(...)");
            List<OA0> list = listQ;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
            for (OA0 oa0 : list) {
                C7540q50 c7540q50 = a;
                G10.d(oa0);
                String strG = c7540q50.g(AbstractC3366bB0.q(oa0, b81), interfaceC2664Wm0);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strN0 = AbstractC2455Um.n0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strN0 = interfaceC2664Wm0.getString(cVar.z());
        }
        return new AbstractC4451f50.b(string, strN0);
    }

    public final AbstractC4451f50.a c(HA0 ha0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, boolean z) {
        String strG;
        G10.g(ha0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        AbstractC5674jS.f fVar = AbstractC7261p50.d;
        G10.f(fVar, "propertySignature");
        AbstractC7261p50.d dVar = (AbstractC7261p50.d) SA0.a(ha0, fVar);
        if (dVar == null) {
            return null;
        }
        AbstractC7261p50.b bVarD = dVar.I() ? dVar.D() : null;
        if (bVarD == null && z) {
            return null;
        }
        int iG0 = (bVarD == null || !bVarD.C()) ? ha0.g0() : bVarD.A();
        if (bVarD == null || !bVarD.B()) {
            strG = g(AbstractC3366bB0.n(ha0, b81), interfaceC2664Wm0);
            if (strG == null) {
                return null;
            }
        } else {
            strG = interfaceC2664Wm0.getString(bVarD.z());
        }
        return new AbstractC4451f50.a(interfaceC2664Wm0.getString(iG0), strG);
    }

    public final AbstractC4451f50.b e(CA0 ca0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81) {
        String string;
        G10.g(ca0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        AbstractC5674jS.f fVar = AbstractC7261p50.b;
        G10.f(fVar, "methodSignature");
        AbstractC7261p50.c cVar = (AbstractC7261p50.c) SA0.a(ca0, fVar);
        int iH0 = (cVar == null || !cVar.C()) ? ca0.h0() : cVar.A();
        if (cVar == null || !cVar.B()) {
            List listO = AbstractC1599Mm.o(AbstractC3366bB0.k(ca0, b81));
            List listT0 = ca0.t0();
            G10.f(listT0, "getValueParameterList(...)");
            List<OA0> list = listT0;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
            for (OA0 oa0 : list) {
                G10.d(oa0);
                arrayList.add(AbstractC3366bB0.q(oa0, b81));
            }
            List listZ0 = AbstractC2455Um.z0(listO, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(listZ0, 10));
            Iterator it = listZ0.iterator();
            while (it.hasNext()) {
                String strG = a.g((KA0) it.next(), interfaceC2664Wm0);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(AbstractC3366bB0.m(ca0, b81), interfaceC2664Wm0);
            if (strG2 == null) {
                return null;
            }
            string = AbstractC2455Um.n0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = interfaceC2664Wm0.getString(cVar.z());
        }
        return new AbstractC4451f50.b(interfaceC2664Wm0.getString(iH0), string);
    }

    public final String g(KA0 ka0, InterfaceC2664Wm0 interfaceC2664Wm0) {
        if (ka0.p0()) {
            return C7444pl.b(interfaceC2664Wm0.a(ka0.a0()));
        }
        return null;
    }

    public final C5019h50 k(InputStream inputStream, String[] strArr) {
        AbstractC7261p50.e eVarG = AbstractC7261p50.e.G(inputStream, b);
        G10.f(eVarG, "parseDelimitedFrom(...)");
        return new C5019h50(eVarG, strArr);
    }
}
