package com.daaw;

import android.database.Cursor;
import com.daaw.AbstractC5362iK;
import com.daaw.SL0;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class YL0 implements JG0 {
    public final SL0 a;
    public final C1872Pc0 b;
    public InterfaceC7942rZ c;

    public YL0(SL0 sl0, C1872Pc0 c1872Pc0) {
        this.a = sl0;
        this.b = c1872Pc0;
    }

    public static /* synthetic */ void h(YL0 yl0, byte[] bArr, int i, int i2, InterfaceC4832gR interfaceC4832gR, Map map) {
        C4083dm0 c4083dm0K = yl0.k(bArr, i, i2);
        if (interfaceC4832gR == null || ((Boolean) interfaceC4832gR.apply(c4083dm0K)).booleanValue()) {
            synchronized (map) {
                map.put(c4083dm0K.getKey(), c4083dm0K);
            }
        }
    }

    @Override // com.daaw.JG0
    public Map a(final C5890kC0 c5890kC0, AbstractC5362iK.a aVar, final Set set) {
        return l(Collections.singletonList(c5890kC0.m()), aVar, Integer.MAX_VALUE, new InterfaceC4832gR() { // from class: com.daaw.VL0
            @Override // com.daaw.InterfaceC4832gR
            public final Object apply(Object obj) {
                C4083dm0 c4083dm0 = (C4083dm0) obj;
                return Boolean.valueOf(c5890kC0.t(c4083dm0) || set.contains(c4083dm0.getKey()));
            }
        });
    }

    @Override // com.daaw.JG0
    public void b(InterfaceC7942rZ interfaceC7942rZ) {
        this.c = interfaceC7942rZ;
    }

    @Override // com.daaw.JG0
    public Map c(Iterable iterable) {
        final HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            arrayList.add(AbstractC9826yG.c(tc.q()));
            map.put(tc, C4083dm0.q(tc));
        }
        SL0.b bVar = new SL0.b(this.a, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        final ExecutorC4609fe executorC4609fe = new ExecutorC4609fe();
        while (bVar.d()) {
            bVar.e().e(new InterfaceC8310sr() { // from class: com.daaw.UL0
                @Override // com.daaw.InterfaceC8310sr
                public final void accept(Object obj) {
                    this.a.m(executorC4609fe, map, (Cursor) obj, null);
                }
            });
        }
        executorC4609fe.b();
        return map;
    }

    @Override // com.daaw.JG0
    public Map d(String str, AbstractC5362iK.a aVar, int i) {
        List listD = this.c.d(str);
        ArrayList arrayList = new ArrayList(listD.size());
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add((UI0) ((UI0) it.next()).c(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        if (arrayList.size() * 9 < 900) {
            return l(arrayList, aVar, i, null);
        }
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int i3 = i2 + 100;
            map.putAll(l(arrayList.subList(i2, Math.min(arrayList.size(), i3)), aVar, i, null));
            i2 = i3;
        }
        return AbstractC6838nb1.t(map, i, AbstractC5362iK.a.C);
    }

    @Override // com.daaw.JG0
    public C4083dm0 e(TC tc) {
        return (C4083dm0) c(Collections.singletonList(tc)).get(tc);
    }

    @Override // com.daaw.JG0
    public void f(C4083dm0 c4083dm0, CU0 cu0) {
        AbstractC6557mb.d(!cu0.equals(CU0.C), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        TC key = c4083dm0.getKey();
        Timestamp timestampC = cu0.c();
        this.a.t("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", AbstractC9826yG.c(key.q()), Integer.valueOf(key.q().p()), Long.valueOf(timestampC.g()), Integer.valueOf(timestampC.c()), this.b.j(c4083dm0).h());
        this.c.h(c4083dm0.getKey().o());
    }

    public final C4083dm0 k(byte[] bArr, int i, int i2) {
        try {
            return this.b.c(C0428Bh0.k0(bArr)).v(new CU0(new Timestamp(i, i2)));
        } catch (P10 e) {
            throw AbstractC6557mb.a("MaybeDocument failed to parse: %s", e);
        }
    }

    public final Map l(List list, AbstractC5362iK.a aVar, int i, final InterfaceC4832gR interfaceC4832gR) {
        Timestamp timestampC = aVar.n().c();
        TC tcL = aVar.l();
        StringBuilder sbU = AbstractC6838nb1.u("SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size(), " UNION ");
        sbU.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        Object[] objArr = new Object[(list.size() * 9) + 1];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            UI0 ui0 = (UI0) it.next();
            String strC = AbstractC9826yG.c(ui0);
            objArr[i2] = strC;
            objArr[i2 + 1] = AbstractC9826yG.f(strC);
            objArr[i2 + 2] = Integer.valueOf(ui0.p() + 1);
            objArr[i2 + 3] = Long.valueOf(timestampC.g());
            objArr[i2 + 4] = Long.valueOf(timestampC.g());
            objArr[i2 + 5] = Integer.valueOf(timestampC.c());
            objArr[i2 + 6] = Long.valueOf(timestampC.g());
            int i3 = i2 + 8;
            objArr[i2 + 7] = Integer.valueOf(timestampC.c());
            i2 += 9;
            objArr[i3] = AbstractC9826yG.c(tcL.q());
        }
        objArr[i2] = Integer.valueOf(i);
        final ExecutorC4609fe executorC4609fe = new ExecutorC4609fe();
        final HashMap map = new HashMap();
        this.a.A(sbU.toString()).b(objArr).e(new InterfaceC8310sr() { // from class: com.daaw.XL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                this.a.m(executorC4609fe, map, (Cursor) obj, interfaceC4832gR);
            }
        });
        executorC4609fe.b();
        return map;
    }

    public final void m(ExecutorC4609fe executorC4609fe, final Map map, Cursor cursor, final InterfaceC4832gR interfaceC4832gR) {
        final byte[] blob = cursor.getBlob(0);
        final int i = cursor.getInt(1);
        final int i2 = cursor.getInt(2);
        Executor executor = executorC4609fe;
        if (cursor.isLast()) {
            executor = EI.b;
        }
        executor.execute(new Runnable() { // from class: com.daaw.WL0
            @Override // java.lang.Runnable
            public final void run() {
                YL0.h(this.B, blob, i, i2, interfaceC4832gR, map);
            }
        });
    }

    @Override // com.daaw.JG0
    public void removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        SY syA = NC.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            arrayList.add(AbstractC9826yG.c(tc.q()));
            syA = syA.v(tc, C4083dm0.r(tc, CU0.C));
        }
        SL0.b bVar = new SL0.b(this.a, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
        while (bVar.d()) {
            bVar.a();
        }
        this.c.i(syA);
    }
}
