package com.daaw;

import android.database.Cursor;
import android.util.SparseArray;
import com.daaw.C0524Cf0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BL0 implements InterfaceC7585qF0, InterfaceC9932yf0 {
    public final SL0 a;
    public C7957rc0 b;
    public long c = -1;
    public final C0524Cf0 d;
    public C7863rF0 e;

    public BL0(SL0 sl0, C0524Cf0.b bVar) {
        this.a = sl0;
        this.d = new C0524Cf0(this, bVar);
    }

    public static /* synthetic */ void q(BL0 bl0, int[] iArr, List list, Cursor cursor) {
        bl0.getClass();
        TC tcL = TC.l(AbstractC9826yG.b(cursor.getString(0)));
        if (bl0.t(tcL)) {
            return;
        }
        iArr[0] = iArr[0] + 1;
        list.add(tcL);
        bl0.v(tcL);
    }

    private boolean u(TC tc) {
        return !this.a.A("SELECT 1 FROM document_mutations WHERE path = ?").b(AbstractC9826yG.c(tc.q())).f();
    }

    @Override // com.daaw.InterfaceC9932yf0
    public int a(long j, SparseArray sparseArray) {
        return this.a.h().t(j, sparseArray);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void b() {
        AbstractC6557mb.d(this.c != -1, "Committing a transaction without having started one", new Object[0]);
        this.c = -1L;
    }

    @Override // com.daaw.InterfaceC9932yf0
    public C0524Cf0 c() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void d() {
        AbstractC6557mb.d(this.c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.c = this.b.a();
    }

    @Override // com.daaw.InterfaceC9932yf0
    public void e(InterfaceC8310sr interfaceC8310sr) {
        this.a.h().p(interfaceC8310sr);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public long f() {
        AbstractC6557mb.d(this.c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.c;
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void g(TC tc) {
        x(tc);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void h(TC tc) {
        x(tc);
    }

    @Override // com.daaw.InterfaceC9932yf0
    public long i() {
        return this.a.h().r() + ((Long) this.a.A("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").d(new InterfaceC4832gR() { // from class: com.daaw.zL0
            @Override // com.daaw.InterfaceC4832gR
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        })).longValue();
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void j(C7863rF0 c7863rF0) {
        this.e = c7863rF0;
    }

    @Override // com.daaw.InterfaceC9932yf0
    public int k(long j) {
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        while (this.a.A("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? LIMIT ?").b(Long.valueOf(j), 100).e(new InterfaceC8310sr() { // from class: com.daaw.yL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                BL0.q(this.a, iArr, arrayList, (Cursor) obj);
            }
        }) == 100) {
        }
        this.a.g().removeAll(arrayList);
        return iArr[0];
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void l(TC tc) {
        x(tc);
    }

    @Override // com.daaw.InterfaceC9932yf0
    public long m() {
        return this.a.u();
    }

    @Override // com.daaw.InterfaceC9932yf0
    public void n(final InterfaceC8310sr interfaceC8310sr) {
        this.a.A("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").e(new InterfaceC8310sr() { // from class: com.daaw.AL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                interfaceC8310sr.accept(Long.valueOf(((Cursor) obj).getLong(0)));
            }
        });
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void o(TC tc) {
        x(tc);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void p(C5000h11 c5000h11) {
        this.a.h().a(c5000h11.l(f()));
    }

    public final boolean t(TC tc) {
        if (this.e.c(tc)) {
            return true;
        }
        return u(tc);
    }

    public final void v(TC tc) {
        this.a.t("DELETE FROM target_documents WHERE path = ? AND target_id = 0", AbstractC9826yG.c(tc.q()));
    }

    public void w(long j) {
        this.b = new C7957rc0(j);
    }

    public final void x(TC tc) {
        this.a.t("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", AbstractC9826yG.c(tc.q()), Long.valueOf(f()));
    }
}
