package com.daaw;

import android.database.Cursor;
import com.daaw.SL0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class LK0 implements VC {
    public final SL0 a;
    public final C1872Pc0 b;
    public final String c;

    public LK0(SL0 sl0, C1872Pc0 c1872Pc0, C0722Ea1 c0722Ea1) {
        this.a = sl0;
        this.b = c1872Pc0;
        this.c = c0722Ea1.b() ? c0722Ea1.a() : "";
    }

    public static /* synthetic */ void g(LK0 lk0, byte[] bArr, int i, Map map) {
        AbstractC10271zr0 abstractC10271zr0M = lk0.m(bArr, i);
        synchronized (map) {
            map.put(abstractC10271zr0M.b(), abstractC10271zr0M);
        }
    }

    public static /* synthetic */ AbstractC10271zr0 i(LK0 lk0, Cursor cursor) {
        lk0.getClass();
        return lk0.m(cursor.getBlob(0), cursor.getInt(1));
    }

    public static /* synthetic */ void k(LK0 lk0, int[] iArr, String[] strArr, String[] strArr2, ExecutorC4609fe executorC4609fe, Map map, Cursor cursor) {
        lk0.getClass();
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        lk0.n(executorC4609fe, map, cursor);
    }

    @Override // com.daaw.VC
    public AbstractC10271zr0 a(TC tc) {
        return (AbstractC10271zr0) this.a.A("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").b(this.c, AbstractC9826yG.c((UI0) tc.q().r()), tc.q().l()).d(new InterfaceC4832gR() { // from class: com.daaw.GK0
            @Override // com.daaw.InterfaceC4832gR
            public final Object apply(Object obj) {
                return LK0.i(this.a, (Cursor) obj);
            }
        });
    }

    @Override // com.daaw.VC
    public Map b(SortedSet sortedSet) {
        AbstractC6557mb.d(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap map = new HashMap();
        ExecutorC4609fe executorC4609fe = new ExecutorC4609fe();
        UI0 ui0O = UI0.C;
        ArrayList arrayList = new ArrayList();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            if (!ui0O.equals(tc.o())) {
                o(map, executorC4609fe, ui0O, arrayList);
                ui0O = tc.o();
                arrayList.clear();
            }
            arrayList.add(tc.p());
        }
        o(map, executorC4609fe, ui0O, arrayList);
        executorC4609fe.b();
        return map;
    }

    @Override // com.daaw.VC
    public Map c(UI0 ui0, int i) {
        final HashMap map = new HashMap();
        final ExecutorC4609fe executorC4609fe = new ExecutorC4609fe();
        this.a.A("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").b(this.c, AbstractC9826yG.c(ui0), Integer.valueOf(i)).e(new InterfaceC8310sr() { // from class: com.daaw.FK0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                this.a.n(executorC4609fe, map, (Cursor) obj);
            }
        });
        executorC4609fe.b();
        return map;
    }

    @Override // com.daaw.VC
    public void d(int i) {
        this.a.t("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.c, Integer.valueOf(i));
    }

    @Override // com.daaw.VC
    public void e(int i, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            TC tc = (TC) entry.getKey();
            p(i, tc, (AbstractC9688xm0) AbstractC8342sy0.d((AbstractC9688xm0) entry.getValue(), "null value for key: %s", tc));
        }
    }

    @Override // com.daaw.VC
    public Map f(String str, int i, int i2) {
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final ExecutorC4609fe executorC4609fe = new ExecutorC4609fe();
        this.a.A("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").b(this.c, str, Integer.valueOf(i), Integer.valueOf(i2)).e(new InterfaceC8310sr() { // from class: com.daaw.JK0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                LK0.k(this.a, iArr, strArr, strArr2, executorC4609fe, map, (Cursor) obj);
            }
        });
        if (strArr[0] == null) {
            return map;
        }
        SL0.d dVarA = this.a.A("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = this.c;
        String str3 = strArr[0];
        dVarA.b(str2, str, str3, str3, strArr2[0], Integer.valueOf(iArr[0])).e(new InterfaceC8310sr() { // from class: com.daaw.KK0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                this.a.n(executorC4609fe, map, (Cursor) obj);
            }
        });
        executorC4609fe.b();
        return map;
    }

    public final AbstractC10271zr0 m(byte[] bArr, int i) {
        try {
            return AbstractC10271zr0.a(i, this.b.d(C7993rj1.w0(bArr)));
        } catch (P10 e) {
            throw AbstractC6557mb.a("Overlay failed to parse: %s", e);
        }
    }

    public final void n(ExecutorC4609fe executorC4609fe, final Map map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i = cursor.getInt(1);
        Executor executor = executorC4609fe;
        if (cursor.isLast()) {
            executor = EI.b;
        }
        executor.execute(new Runnable() { // from class: com.daaw.IK0
            @Override // java.lang.Runnable
            public final void run() {
                LK0.g(this.B, blob, i, map);
            }
        });
    }

    public final void o(final Map map, final ExecutorC4609fe executorC4609fe, UI0 ui0, List list) {
        if (list.isEmpty()) {
            return;
        }
        SL0.b bVar = new SL0.b(this.a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.c, AbstractC9826yG.c(ui0)), list, ")");
        while (bVar.d()) {
            bVar.e().e(new InterfaceC8310sr() { // from class: com.daaw.HK0
                @Override // com.daaw.InterfaceC8310sr
                public final void accept(Object obj) {
                    this.a.n(executorC4609fe, map, (Cursor) obj);
                }
            });
        }
    }

    public final void p(int i, TC tc, AbstractC9688xm0 abstractC9688xm0) {
        this.a.t("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.c, tc.n(), AbstractC9826yG.c((UI0) tc.q().r()), tc.q().l(), Integer.valueOf(i), this.b.k(abstractC9688xm0).h());
    }
}
