package com.daaw;

import com.daaw.AbstractC8719uK;
import com.daaw.C0745Eg0;
import com.daaw.C3748cb;
import com.google.firebase.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Na1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1657Na1 {
    public final C3851cw a;

    public C1657Na1(C3851cw c3851cw) {
        this.a = c3851cw;
    }

    public C6564mc1 a(Object obj, C1242Ja1 c1242Ja1) {
        return b(AbstractC2173Ru.c(obj), c1242Ja1);
    }

    public final C6564mc1 b(Object obj, C1242Ja1 c1242Ja1) {
        if (obj instanceof Map) {
            return d((Map) obj, c1242Ja1);
        }
        if (obj instanceof AbstractC8719uK) {
            g((AbstractC8719uK) obj, c1242Ja1);
            return null;
        }
        if (c1242Ja1.h() != null) {
            c1242Ja1.a(c1242Ja1.h());
        }
        if (!(obj instanceof List)) {
            return f(obj, c1242Ja1);
        }
        if (!c1242Ja1.i() || c1242Ja1.g() == EnumC1450La1.ArrayArgument) {
            return c((List) obj, c1242Ja1);
        }
        throw c1242Ja1.f("Nested arrays are not supported");
    }

    public final C6564mc1 c(List list, C1242Ja1 c1242Ja1) {
        C3748cb.b bVarJ0 = C3748cb.j0();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C6564mc1 c6564mc1B = b(it.next(), c1242Ja1.c(i));
            if (c6564mc1B == null) {
                c6564mc1B = (C6564mc1) C6564mc1.x0().H(EnumC2464Uo0.NULL_VALUE).n();
            }
            bVarJ0.y(c6564mc1B);
            i++;
        }
        return (C6564mc1) C6564mc1.x0().x(bVarJ0).n();
    }

    public final C6564mc1 d(Map map, C1242Ja1 c1242Ja1) {
        if (map.isEmpty()) {
            if (c1242Ja1.h() != null && !c1242Ja1.h().n()) {
                c1242Ja1.a(c1242Ja1.h());
            }
            return (C6564mc1) C6564mc1.x0().G(C0745Eg0.b0()).n();
        }
        C0745Eg0.b bVarJ0 = C0745Eg0.j0();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw c1242Ja1.f(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
            }
            String str = (String) entry.getKey();
            C6564mc1 c6564mc1B = b(entry.getValue(), c1242Ja1.e(str));
            if (c6564mc1B != null) {
                bVarJ0.z(str, c6564mc1B);
            }
        }
        return (C6564mc1) C6564mc1.x0().E(bVarJ0).n();
    }

    public C6564mc1 e(Object obj, boolean z) {
        C1138Ia1 c1138Ia1 = new C1138Ia1(z ? EnumC1450La1.ArrayArgument : EnumC1450La1.Argument);
        C6564mc1 c6564mc1A = a(obj, c1138Ia1.e());
        AbstractC6557mb.d(c6564mc1A != null, "Parsed data should not be null.", new Object[0]);
        AbstractC6557mb.d(c1138Ia1.d().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return c6564mc1A;
    }

    public final C6564mc1 f(Object obj, C1242Ja1 c1242Ja1) {
        if (obj == null) {
            return (C6564mc1) C6564mc1.x0().H(EnumC2464Uo0.NULL_VALUE).n();
        }
        if (obj instanceof Integer) {
            return (C6564mc1) C6564mc1.x0().D(((Integer) obj).intValue()).n();
        }
        if (obj instanceof Long) {
            return (C6564mc1) C6564mc1.x0().D(((Long) obj).longValue()).n();
        }
        if (obj instanceof Float) {
            return (C6564mc1) C6564mc1.x0().B(((Float) obj).doubleValue()).n();
        }
        if (obj instanceof Double) {
            return (C6564mc1) C6564mc1.x0().B(((Double) obj).doubleValue()).n();
        }
        if (obj instanceof Boolean) {
            return (C6564mc1) C6564mc1.x0().z(((Boolean) obj).booleanValue()).n();
        }
        if (obj instanceof String) {
            return (C6564mc1) C6564mc1.x0().K((String) obj).n();
        }
        if (obj instanceof Date) {
            return h(new Timestamp((Date) obj));
        }
        if (obj instanceof Timestamp) {
            return h((Timestamp) obj);
        }
        if (obj instanceof C8193sS) {
            C8193sS c8193sS = (C8193sS) obj;
            return (C6564mc1) C6564mc1.x0().C(C4471f90.f0().x(c8193sS.c()).y(c8193sS.g())).n();
        }
        if (obj instanceof C2843Yf) {
            return (C6564mc1) C6564mc1.x0().A(((C2843Yf) obj).g()).n();
        }
        if (obj instanceof com.google.firebase.firestore.a) {
            com.google.firebase.firestore.a aVar = (com.google.firebase.firestore.a) obj;
            if (aVar.b() != null) {
                C3851cw c3851cwD = aVar.b().d();
                if (!c3851cwD.equals(this.a)) {
                    throw c1242Ja1.f(String.format("Document reference is for database %s/%s but should be for database %s/%s", c3851cwD.k(), c3851cwD.h(), this.a.k(), this.a.h()));
                }
            }
            return (C6564mc1) C6564mc1.x0().J(String.format("projects/%s/databases/%s/documents/%s", this.a.k(), this.a.h(), aVar.d())).n();
        }
        if (obj.getClass().isArray()) {
            throw c1242Ja1.f("Arrays are not supported; use a List instead");
        }
        throw c1242Ja1.f("Unsupported type: " + AbstractC6838nb1.w(obj));
    }

    public final void g(AbstractC8719uK abstractC8719uK, C1242Ja1 c1242Ja1) {
        if (!c1242Ja1.j()) {
            throw c1242Ja1.f(String.format("%s() can only be used with set() and update()", abstractC8719uK.a()));
        }
        if (c1242Ja1.h() == null) {
            throw c1242Ja1.f(String.format("%s() is not currently supported inside arrays", abstractC8719uK.a()));
        }
        if (!(abstractC8719uK instanceof AbstractC8719uK.a)) {
            if (!(abstractC8719uK instanceof AbstractC8719uK.b)) {
                throw AbstractC6557mb.a("Unknown FieldValue type: %s", AbstractC6838nb1.w(abstractC8719uK));
            }
            c1242Ja1.b(c1242Ja1.h(), C3426bQ0.d());
        } else if (c1242Ja1.g() == EnumC1450La1.MergeSet) {
            c1242Ja1.a(c1242Ja1.h());
        } else {
            if (c1242Ja1.g() != EnumC1450La1.Update) {
                throw c1242Ja1.f("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
            }
            AbstractC6557mb.d(c1242Ja1.h().p() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
            throw c1242Ja1.f("FieldValue.delete() can only appear at the top level of your update data");
        }
    }

    public final C6564mc1 h(Timestamp timestamp) {
        return (C6564mc1) C6564mc1.x0().L(Q31.f0().y(timestamp.g()).x((timestamp.c() / 1000) * 1000)).n();
    }

    public C1346Ka1 i(List list) {
        AbstractC6557mb.d(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        C1138Ia1 c1138Ia1 = new C1138Ia1(EnumC1450La1.Update);
        C1242Ja1 c1242Ja1E = c1138Ia1.e();
        C7465pp0 c7465pp0 = new C7465pp0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z = next instanceof String;
            AbstractC6557mb.d(z || (next instanceof C6767nK), "Expected argument to be String or FieldPath.", new Object[0]);
            C6488mK c6488mKB = z ? C6767nK.a((String) next).b() : ((C6767nK) next).b();
            if (next2 instanceof AbstractC8719uK.a) {
                c1242Ja1E.a(c6488mKB);
            } else {
                C6564mc1 c6564mc1A = a(next2, c1242Ja1E.d(c6488mKB));
                if (c6564mc1A != null) {
                    c1242Ja1E.a(c6488mKB);
                    c7465pp0.l(c6488mKB, c6564mc1A);
                }
            }
        }
        return c1138Ia1.f(c7465pp0);
    }
}
