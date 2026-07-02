package com.daaw;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.daaw.SL0;
import com.google.firebase.Timestamp;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class LL0 implements InterfaceC0344Am0 {
    public final SL0 a;
    public final C1872Pc0 b;
    public final InterfaceC7942rZ c;
    public final String d;
    public int e;
    public AbstractC4340ei f;

    public static class a implements InterfaceC8310sr {
        public final ArrayList a = new ArrayList();
        public boolean b = true;

        public a(byte[] bArr) {
            c(bArr);
        }

        @Override // com.daaw.InterfaceC8310sr
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            c(blob);
            if (blob.length < 1000000) {
                this.b = false;
            }
        }

        public final void c(byte[] bArr) {
            this.a.add(AbstractC4340ei.G(bArr));
        }

        public int d() {
            return this.a.size();
        }

        public AbstractC4340ei e() {
            return AbstractC4340ei.F(this.a);
        }
    }

    public LL0(SL0 sl0, C1872Pc0 c1872Pc0, C0722Ea1 c0722Ea1, InterfaceC7942rZ interfaceC7942rZ) {
        this.a = sl0;
        this.b = c1872Pc0;
        this.d = c0722Ea1.b() ? c0722Ea1.a() : "";
        this.f = C9395wj1.v;
        this.c = interfaceC7942rZ;
    }

    public static /* synthetic */ void l(LL0 ll0, Cursor cursor) {
        ll0.getClass();
        ll0.f = AbstractC4340ei.G(cursor.getBlob(0));
    }

    public static /* synthetic */ C9967ym0 m(LL0 ll0, Cursor cursor) {
        ll0.getClass();
        return ll0.t(cursor.getInt(0), cursor.getBlob(1));
    }

    public static /* synthetic */ C9967ym0 n(LL0 ll0, int i, Cursor cursor) {
        ll0.getClass();
        return ll0.t(i, cursor.getBlob(0));
    }

    public static /* synthetic */ void p(LL0 ll0, List list, Cursor cursor) {
        ll0.getClass();
        list.add(ll0.t(cursor.getInt(0), cursor.getBlob(1)));
    }

    public static /* synthetic */ void q(LL0 ll0, Set set, List list, Cursor cursor) {
        ll0.getClass();
        int i = cursor.getInt(0);
        if (set.contains(Integer.valueOf(i))) {
            return;
        }
        set.add(Integer.valueOf(i));
        list.add(ll0.t(i, cursor.getBlob(1)));
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void a() {
        if (u()) {
            final ArrayList arrayList = new ArrayList();
            this.a.A("SELECT path FROM document_mutations WHERE uid = ?").b(this.d).e(new InterfaceC8310sr() { // from class: com.daaw.HL0
                @Override // com.daaw.InterfaceC8310sr
                public final void accept(Object obj) {
                    arrayList.add(AbstractC9826yG.b(((Cursor) obj).getString(0)));
                }
            });
            AbstractC6557mb.d(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // com.daaw.InterfaceC0344Am0
    public List b(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC9826yG.c(((TC) it.next()).q()));
        }
        SL0.b bVar = new SL0.b(this.a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(Integer.valueOf(UtilsKt.MICROS_MULTIPLIER), this.d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        final ArrayList arrayList2 = new ArrayList();
        final HashSet hashSet = new HashSet();
        while (bVar.d()) {
            bVar.e().e(new InterfaceC8310sr() { // from class: com.daaw.FL0
                @Override // com.daaw.InterfaceC8310sr
                public final void accept(Object obj) {
                    LL0.q(this.a, hashSet, arrayList2, (Cursor) obj);
                }
            });
        }
        if (bVar.c() > 1) {
            Collections.sort(arrayList2, new Comparator() { // from class: com.daaw.GL0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC6838nb1.l(((C9967ym0) obj).e(), ((C9967ym0) obj2).e());
                }
            });
        }
        return arrayList2;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public C9967ym0 c(Timestamp timestamp, List list, List list2) {
        int i = this.e;
        this.e = i + 1;
        C9967ym0 c9967ym0 = new C9967ym0(i, timestamp, list, list2);
        this.a.t("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.d, Integer.valueOf(i), this.b.l(c9967ym0).h());
        HashSet hashSet = new HashSet();
        SQLiteStatement sQLiteStatementZ = this.a.z("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            TC tcG = ((AbstractC9688xm0) it.next()).g();
            if (hashSet.add(tcG)) {
                this.a.s(sQLiteStatementZ, this.d, AbstractC9826yG.c(tcG.q()), Integer.valueOf(i));
                this.c.h(tcG.o());
            }
        }
        return c9967ym0;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void d(C9967ym0 c9967ym0) {
        SQLiteStatement sQLiteStatementZ = this.a.z("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementZ2 = this.a.z("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int iE = c9967ym0.e();
        AbstractC6557mb.d(this.a.s(sQLiteStatementZ, this.d, Integer.valueOf(iE)) != 0, "Mutation batch (%s, %d) did not exist", this.d, Integer.valueOf(c9967ym0.e()));
        Iterator it = c9967ym0.h().iterator();
        while (it.hasNext()) {
            TC tcG = ((AbstractC9688xm0) it.next()).g();
            this.a.s(sQLiteStatementZ2, this.d, AbstractC9826yG.c(tcG.q()), Integer.valueOf(iE));
            this.a.f().g(tcG);
        }
    }

    @Override // com.daaw.InterfaceC0344Am0
    public C9967ym0 e(int i) {
        return (C9967ym0) this.a.A("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").b(Integer.valueOf(UtilsKt.MICROS_MULTIPLIER), this.d, Integer.valueOf(i + 1)).d(new InterfaceC4832gR() { // from class: com.daaw.CL0
            @Override // com.daaw.InterfaceC4832gR
            public final Object apply(Object obj) {
                return LL0.m(this.a, (Cursor) obj);
            }
        });
    }

    @Override // com.daaw.InterfaceC0344Am0
    public C9967ym0 f(final int i) {
        return (C9967ym0) this.a.A("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(Integer.valueOf(UtilsKt.MICROS_MULTIPLIER), this.d, Integer.valueOf(i)).d(new InterfaceC4832gR() { // from class: com.daaw.KL0
            @Override // com.daaw.InterfaceC4832gR
            public final Object apply(Object obj) {
                return LL0.n(this.a, i, (Cursor) obj);
            }
        });
    }

    @Override // com.daaw.InterfaceC0344Am0
    public AbstractC4340ei g() {
        return this.f;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void h(AbstractC4340ei abstractC4340ei) {
        this.f = (AbstractC4340ei) AbstractC8342sy0.b(abstractC4340ei);
        w();
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void i(C9967ym0 c9967ym0, AbstractC4340ei abstractC4340ei) {
        this.f = (AbstractC4340ei) AbstractC8342sy0.b(abstractC4340ei);
        w();
    }

    @Override // com.daaw.InterfaceC0344Am0
    public List j() {
        final ArrayList arrayList = new ArrayList();
        this.a.A("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").b(Integer.valueOf(UtilsKt.MICROS_MULTIPLIER), this.d).e(new InterfaceC8310sr() { // from class: com.daaw.EL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                LL0.p(this.a, arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // com.daaw.InterfaceC0344Am0
    public void start() {
        v();
        if (this.a.A("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").b(this.d).c(new InterfaceC8310sr() { // from class: com.daaw.DL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                LL0.l(this.a, (Cursor) obj);
            }
        }) == 0) {
            w();
        }
    }

    public final C9967ym0 t(int i, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.b.e(C8272sj1.q0(bArr));
            }
            a aVar = new a(bArr);
            while (aVar.b) {
                this.a.A("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(Integer.valueOf((aVar.d() * UtilsKt.MICROS_MULTIPLIER) + 1), Integer.valueOf(UtilsKt.MICROS_MULTIPLIER), this.d, Integer.valueOf(i)).c(aVar);
            }
            return this.b.e(C8272sj1.p0(aVar.e()));
        } catch (P10 e) {
            throw AbstractC6557mb.a("MutationBatch failed to parse: %s", e);
        }
    }

    public boolean u() {
        return this.a.A("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").b(this.d).f();
    }

    public final void v() {
        final ArrayList arrayList = new ArrayList();
        this.a.A("SELECT uid FROM mutation_queues").e(new InterfaceC8310sr() { // from class: com.daaw.IL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                arrayList.add(((Cursor) obj).getString(0));
            }
        });
        this.e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.A("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").b((String) it.next()).e(new InterfaceC8310sr() { // from class: com.daaw.JL0
                @Override // com.daaw.InterfaceC8310sr
                public final void accept(Object obj) {
                    LL0 ll0 = this.a;
                    ll0.e = Math.max(ll0.e, ((Cursor) obj).getInt(0));
                }
            });
        }
        this.e++;
    }

    public final void w() {
        this.a.t("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.d, -1, this.f.W());
    }
}
