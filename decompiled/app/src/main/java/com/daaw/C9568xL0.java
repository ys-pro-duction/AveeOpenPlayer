package com.daaw;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.daaw.AbstractC5362iK;
import com.daaw.C0355Ap;
import com.daaw.C4515fK;
import com.daaw.C4954gr0;
import com.daaw.C7435pj0;
import com.daaw.InterfaceC7942rZ;
import com.daaw.SL0;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.daaw.xL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9568xL0 implements InterfaceC7942rZ {
    public static final String k = "xL0";
    public static final byte[] l = new byte[0];
    public final SL0 a;
    public final C1872Pc0 b;
    public final String c;
    public final Map d = new HashMap();
    public final C7435pj0.a e = new C7435pj0.a();
    public final Map f = new HashMap();
    public final Queue g = new PriorityQueue(10, new Comparator() { // from class: com.daaw.pL0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C9568xL0.n((AbstractC5362iK) obj, (AbstractC5362iK) obj2);
        }
    });
    public boolean h = false;
    public int i = -1;
    public long j = -1;

    public C9568xL0(SL0 sl0, C1872Pc0 c1872Pc0, C0722Ea1 c0722Ea1) {
        this.a = sl0;
        this.b = c1872Pc0;
        this.c = c0722Ea1.b() ? c0722Ea1.a() : "";
    }

    public static /* synthetic */ void l(C9568xL0 c9568xL0, Map map, Cursor cursor) {
        c9568xL0.getClass();
        try {
            int i = cursor.getInt(0);
            c9568xL0.I(AbstractC5362iK.b(i, cursor.getString(1), c9568xL0.b.b(C5702jZ.b0(cursor.getBlob(2))), map.containsKey(Integer.valueOf(i)) ? (AbstractC5362iK.b) map.get(Integer.valueOf(i)) : AbstractC5362iK.a));
        } catch (P10 e) {
            throw AbstractC6557mb.a("Failed to decode index: " + e, new Object[0]);
        }
    }

    public static /* synthetic */ int n(AbstractC5362iK abstractC5362iK, AbstractC5362iK abstractC5362iK2) {
        int iCompare = Long.compare(abstractC5362iK.g().d(), abstractC5362iK2.g().d());
        return iCompare == 0 ? abstractC5362iK.d().compareTo(abstractC5362iK2.d()) : iCompare;
    }

    public final Object[] A(Z01 z01, int i, List list, Object[] objArr, String str, Object[] objArr2, String str2, Object[] objArr3) {
        int i2;
        StringBuilder sb;
        List list2;
        int size = (list != null ? list.size() : 1) * Math.max(objArr.length, objArr2.length);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT document_key, directional_value FROM index_entries ");
        sb2.append("WHERE index_id = ? AND uid = ? ");
        sb2.append("AND array_value = ? ");
        sb2.append("AND directional_value ");
        sb2.append(str);
        sb2.append(" ? ");
        sb2.append("AND directional_value ");
        sb2.append(str2);
        sb2.append(" ? ");
        CharSequence charSequenceU = AbstractC6838nb1.u(sb2, size, " UNION ");
        if (objArr3 != null) {
            StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb3.append(charSequenceU);
            sb3.append(") WHERE directional_value NOT IN (");
            sb3.append((CharSequence) AbstractC6838nb1.u("?", objArr3.length, ", "));
            sb3.append(")");
            list2 = list;
            i2 = size;
            sb = sb3;
        } else {
            i2 = size;
            sb = charSequenceU;
            list2 = list;
        }
        Object[] objArrZ = z(i2, i, list2, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        arrayList.addAll(Arrays.asList(objArrZ));
        return arrayList.toArray();
    }

    public final Object[] B(List list) {
        Object[] objArr = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            objArr[i] = ((C7385pZ) list.get(i)).c();
        }
        return objArr;
    }

    public final SortedSet C(final TC tc, final AbstractC5362iK abstractC5362iK) {
        final TreeSet treeSet = new TreeSet();
        this.a.A("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").b(Integer.valueOf(abstractC5362iK.f()), tc.toString(), this.c).e(new InterfaceC8310sr() { // from class: com.daaw.uL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                treeSet.add(AbstractC7664qZ.c(abstractC5362iK.f(), tc, cursor.getBlob(0), cursor.getBlob(1)));
            }
        });
        return treeSet;
    }

    public final AbstractC5362iK D(Z01 z01) {
        AbstractC6557mb.d(this.h, "IndexManager not started", new Object[0]);
        C5838k11 c5838k11 = new C5838k11(z01);
        Collection<AbstractC5362iK> collectionE = E(z01.d() != null ? z01.d() : z01.n().l());
        AbstractC5362iK abstractC5362iK = null;
        if (collectionE.isEmpty()) {
            return null;
        }
        for (AbstractC5362iK abstractC5362iK2 : collectionE) {
            if (c5838k11.d(abstractC5362iK2) && (abstractC5362iK == null || abstractC5362iK2.h().size() > abstractC5362iK.h().size())) {
                abstractC5362iK = abstractC5362iK2;
            }
        }
        return abstractC5362iK;
    }

    public Collection E(String str) {
        AbstractC6557mb.d(this.h, "IndexManager not started", new Object[0]);
        Map map = (Map) this.f.get(str);
        return map == null ? Collections.EMPTY_LIST : map.values();
    }

    public final AbstractC5362iK.a F(Collection collection) {
        AbstractC6557mb.d(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        AbstractC5362iK.a aVarC = ((AbstractC5362iK) it.next()).g().c();
        int iM = aVarC.m();
        while (it.hasNext()) {
            AbstractC5362iK.a aVarC2 = ((AbstractC5362iK) it.next()).g().c();
            if (aVarC2.compareTo(aVarC) < 0) {
                aVarC = aVarC2;
            }
            iM = Math.max(aVarC2.m(), iM);
        }
        return AbstractC5362iK.a.g(aVarC.n(), aVarC.l(), iM);
    }

    public final List G(Z01 z01) {
        if (this.d.containsKey(z01)) {
            return (List) this.d.get(z01);
        }
        ArrayList arrayList = new ArrayList();
        if (z01.h().isEmpty()) {
            arrayList.add(z01);
        } else {
            Iterator it = AbstractC2940Zd0.i(new C0355Ap(z01.h(), C0355Ap.a.AND)).iterator();
            while (it.hasNext()) {
                arrayList.add(new Z01(z01.n(), z01.d(), ((ZK) it.next()).b(), z01.m(), z01.j(), z01.p(), z01.f()));
            }
        }
        this.d.put(z01, arrayList);
        return arrayList;
    }

    public final boolean H(Z01 z01, C6488mK c6488mK) {
        for (ZK zk : z01.h()) {
            if (zk instanceof C4515fK) {
                C4515fK c4515fK = (C4515fK) zk;
                if (c4515fK.g().equals(c6488mK)) {
                    C4515fK.b bVarH = c4515fK.h();
                    if (bVarH.equals(C4515fK.b.IN) || bVarH.equals(C4515fK.b.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final void I(AbstractC5362iK abstractC5362iK) {
        Map map = (Map) this.f.get(abstractC5362iK.d());
        if (map == null) {
            map = new HashMap();
            this.f.put(abstractC5362iK.d(), map);
        }
        AbstractC5362iK abstractC5362iK2 = (AbstractC5362iK) map.get(Integer.valueOf(abstractC5362iK.f()));
        if (abstractC5362iK2 != null) {
            this.g.remove(abstractC5362iK2);
        }
        map.put(Integer.valueOf(abstractC5362iK.f()), abstractC5362iK);
        this.g.add(abstractC5362iK);
        this.i = Math.max(this.i, abstractC5362iK.f());
        this.j = Math.max(this.j, abstractC5362iK.g().d());
    }

    public final void J(final LC lc, SortedSet sortedSet, SortedSet sortedSet2) {
        AbstractC2212Sd0.a(k, "Updating index entries for document '%s'", lc.getKey());
        AbstractC6838nb1.r(sortedSet, sortedSet2, new InterfaceC8310sr() { // from class: com.daaw.qL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                this.a.r(lc, (AbstractC7664qZ) obj);
            }
        }, new InterfaceC8310sr() { // from class: com.daaw.rL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                this.a.t(lc, (AbstractC7664qZ) obj);
            }
        });
    }

    @Override // com.daaw.InterfaceC7942rZ
    public InterfaceC7942rZ.a a(Z01 z01) {
        InterfaceC7942rZ.a aVar = InterfaceC7942rZ.a.FULL;
        List listG = G(z01);
        Iterator it = listG.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Z01 z012 = (Z01) it.next();
            AbstractC5362iK abstractC5362iKD = D(z012);
            if (abstractC5362iKD == null) {
                aVar = InterfaceC7942rZ.a.NONE;
                break;
            }
            if (abstractC5362iKD.h().size() < z012.o()) {
                aVar = InterfaceC7942rZ.a.PARTIAL;
            }
        }
        return (z01.r() && listG.size() > 1 && aVar == InterfaceC7942rZ.a.FULL) ? InterfaceC7942rZ.a.PARTIAL : aVar;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public void b(String str, AbstractC5362iK.a aVar) {
        AbstractC6557mb.d(this.h, "IndexManager not started", new Object[0]);
        this.j++;
        for (AbstractC5362iK abstractC5362iK : E(str)) {
            AbstractC5362iK abstractC5362iKB = AbstractC5362iK.b(abstractC5362iK.f(), abstractC5362iK.d(), abstractC5362iK.h(), AbstractC5362iK.b.a(this.j, aVar));
            this.a.t("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(abstractC5362iK.f()), this.c, Long.valueOf(this.j), Long.valueOf(aVar.n().c().g()), Integer.valueOf(aVar.n().c().c()), AbstractC9826yG.c(aVar.l().q()), Integer.valueOf(aVar.m()));
            I(abstractC5362iKB);
        }
    }

    @Override // com.daaw.InterfaceC7942rZ
    public String c() {
        AbstractC6557mb.d(this.h, "IndexManager not started", new Object[0]);
        AbstractC5362iK abstractC5362iK = (AbstractC5362iK) this.g.peek();
        if (abstractC5362iK != null) {
            return abstractC5362iK.d();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public List d(String str) {
        AbstractC6557mb.d(this.h, "IndexManager not started", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        this.a.A("SELECT parent FROM collection_parents WHERE collection_id = ?").b(str).e(new InterfaceC8310sr() { // from class: com.daaw.sL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                arrayList.add(AbstractC9826yG.b(((Cursor) obj).getString(0)));
            }
        });
        return arrayList;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public AbstractC5362iK.a e(Z01 z01) {
        ArrayList arrayList = new ArrayList();
        Iterator it = G(z01).iterator();
        while (it.hasNext()) {
            AbstractC5362iK abstractC5362iKD = D((Z01) it.next());
            if (abstractC5362iKD != null) {
                arrayList.add(abstractC5362iKD);
            }
        }
        return F(arrayList);
    }

    @Override // com.daaw.InterfaceC7942rZ
    public AbstractC5362iK.a f(String str) {
        Collection collectionE = E(str);
        AbstractC6557mb.d(!collectionE.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return F(collectionE);
    }

    @Override // com.daaw.InterfaceC7942rZ
    public List g(Z01 z01) {
        AbstractC6557mb.d(this.h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (Z01 z012 : G(z01)) {
            AbstractC5362iK abstractC5362iKD = D(z012);
            if (abstractC5362iKD == null) {
                return null;
            }
            arrayList3.add(Pair.create(z012, abstractC5362iKD));
        }
        for (Pair pair : arrayList3) {
            Z01 z013 = (Z01) pair.first;
            AbstractC5362iK abstractC5362iK = (AbstractC5362iK) pair.second;
            List listA = z013.a(abstractC5362iK);
            Collection collectionL = z013.l(abstractC5362iK);
            C7976rg c7976rgK = z013.k(abstractC5362iK);
            C7976rg c7976rgQ = z013.q(abstractC5362iK);
            if (AbstractC2212Sd0.c()) {
                AbstractC2212Sd0.a(k, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", abstractC5362iK, z013, listA, c7976rgK, c7976rgQ);
            }
            Object[] objArrA = A(z013, abstractC5362iK.f(), listA, u(abstractC5362iK, z013, c7976rgK), c7976rgK.c() ? ">=" : ">", u(abstractC5362iK, z013, c7976rgQ), c7976rgQ.c() ? "<=" : "<", x(abstractC5362iK, z013, collectionL));
            arrayList.add(String.valueOf(objArrA[0]));
            arrayList2.addAll(Arrays.asList(objArrA).subList(1, objArrA.length));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(" UNION ", arrayList));
        sb.append("ORDER BY directional_value, document_key ");
        sb.append(z01.i().equals(C4954gr0.a.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb.toString() + ")";
        if (z01.r()) {
            str = str + " LIMIT " + z01.j();
        }
        AbstractC6557mb.d(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        SL0.d dVarB = this.a.A(str).b(arrayList2.toArray());
        final ArrayList arrayList4 = new ArrayList();
        dVarB.e(new InterfaceC8310sr() { // from class: com.daaw.tL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                arrayList4.add(TC.l(UI0.u(((Cursor) obj).getString(0))));
            }
        });
        AbstractC2212Sd0.a(k, "Index scan returned %s documents", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public void h(UI0 ui0) {
        AbstractC6557mb.d(this.h, "IndexManager not started", new Object[0]);
        AbstractC6557mb.d(ui0.p() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.e.a(ui0)) {
            this.a.t("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", ui0.l(), AbstractC9826yG.c((UI0) ui0.r()));
        }
    }

    @Override // com.daaw.InterfaceC7942rZ
    public void i(SY sy) {
        AbstractC6557mb.d(this.h, "IndexManager not started", new Object[0]);
        Iterator it = sy.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            for (AbstractC5362iK abstractC5362iK : E(((TC) entry.getKey()).n())) {
                SortedSet sortedSetC = C((TC) entry.getKey(), abstractC5362iK);
                SortedSet sortedSetS = s((LC) entry.getValue(), abstractC5362iK);
                if (!sortedSetC.equals(sortedSetS)) {
                    J((LC) entry.getValue(), sortedSetC, sortedSetS);
                }
            }
        }
    }

    public final void r(LC lc, AbstractC7664qZ abstractC7664qZ) {
        this.a.t("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(abstractC7664qZ.l()), this.c, abstractC7664qZ.g(), abstractC7664qZ.h(), lc.getKey().toString());
    }

    public final SortedSet s(LC lc, AbstractC5362iK abstractC5362iK) {
        TreeSet treeSet = new TreeSet();
        byte[] bArrV = v(abstractC5362iK, lc);
        if (bArrV != null) {
            AbstractC5362iK.c cVarC = abstractC5362iK.c();
            if (cVarC == null) {
                treeSet.add(AbstractC7664qZ.c(abstractC5362iK.f(), lc.getKey(), new byte[0], bArrV));
                return treeSet;
            }
            C6564mc1 c6564mc1E = lc.e(cVarC.g());
            if (AbstractC0513Cc1.t(c6564mc1E)) {
                Iterator it = c6564mc1E.l0().g().iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC7664qZ.c(abstractC5362iK.f(), lc.getKey(), w((C6564mc1) it.next()), bArrV));
                }
            }
        }
        return treeSet;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public void start() {
        final HashMap map = new HashMap();
        this.a.A("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").b(this.c).e(new InterfaceC8310sr() { // from class: com.daaw.vL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                map.put(Integer.valueOf(cursor.getInt(0)), AbstractC5362iK.b.b(cursor.getLong(1), new CU0(new Timestamp(cursor.getLong(2), cursor.getInt(3))), TC.l(AbstractC9826yG.b(cursor.getString(4))), cursor.getInt(5)));
            }
        });
        this.a.A("SELECT index_id, collection_group, index_proto FROM index_configuration").e(new InterfaceC8310sr() { // from class: com.daaw.wL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C9568xL0.l(this.a, map, (Cursor) obj);
            }
        });
        this.h = true;
    }

    public final void t(LC lc, AbstractC7664qZ abstractC7664qZ) {
        this.a.t("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(abstractC7664qZ.l()), this.c, abstractC7664qZ.g(), abstractC7664qZ.h(), lc.getKey().toString());
    }

    public final Object[] u(AbstractC5362iK abstractC5362iK, Z01 z01, C7976rg c7976rg) {
        return x(abstractC5362iK, z01, c7976rg.b());
    }

    public final byte[] v(AbstractC5362iK abstractC5362iK, LC lc) {
        C7385pZ c7385pZ = new C7385pZ();
        for (AbstractC5362iK.c cVar : abstractC5362iK.e()) {
            C6564mc1 c6564mc1E = lc.e(cVar.g());
            if (c6564mc1E == null) {
                return null;
            }
            BM.a.e(c6564mc1E, c7385pZ.b(cVar.h()));
        }
        return c7385pZ.c();
    }

    public final byte[] w(C6564mc1 c6564mc1) {
        C7385pZ c7385pZ = new C7385pZ();
        BM.a.e(c6564mc1, c7385pZ.b(AbstractC5362iK.c.a.ASCENDING));
        return c7385pZ.c();
    }

    public final Object[] x(AbstractC5362iK abstractC5362iK, Z01 z01, Collection collection) {
        if (collection == null) {
            return null;
        }
        List<C7385pZ> arrayList = new ArrayList();
        arrayList.add(new C7385pZ());
        Iterator it = collection.iterator();
        for (AbstractC5362iK.c cVar : abstractC5362iK.e()) {
            C6564mc1 c6564mc1 = (C6564mc1) it.next();
            for (C7385pZ c7385pZ : arrayList) {
                if (H(z01, cVar.g()) && AbstractC0513Cc1.t(c6564mc1)) {
                    arrayList = y(arrayList, cVar, c6564mc1);
                } else {
                    BM.a.e(c6564mc1, c7385pZ.b(cVar.h()));
                }
            }
        }
        return B(arrayList);
    }

    public final List y(List list, AbstractC5362iK.c cVar, C6564mc1 c6564mc1) {
        ArrayList<C7385pZ> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (C6564mc1 c6564mc12 : c6564mc1.l0().g()) {
            for (C7385pZ c7385pZ : arrayList) {
                C7385pZ c7385pZ2 = new C7385pZ();
                c7385pZ2.d(c7385pZ.c());
                BM.a.e(c6564mc12, c7385pZ2.b(cVar.h()));
                arrayList2.add(c7385pZ2);
            }
        }
        return arrayList2;
    }

    public final Object[] z(int i, int i2, List list, Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = i / (list != null ? list.size() : 1);
        int i3 = 0;
        Object[] objArr4 = new Object[(i * 5) + (objArr3 != null ? objArr3.length : 0)];
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            objArr4[i4] = Integer.valueOf(i2);
            int i6 = i4 + 2;
            objArr4[i4 + 1] = this.c;
            int i7 = i4 + 3;
            objArr4[i6] = list != null ? w((C6564mc1) list.get(i5 / size)) : l;
            int i8 = i4 + 4;
            int i9 = i5 % size;
            objArr4[i7] = objArr[i9];
            i4 += 5;
            objArr4[i8] = objArr2[i9];
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (i3 < length) {
                objArr4[i4] = objArr3[i3];
                i3++;
                i4++;
            }
        }
        return objArr4;
    }
}
