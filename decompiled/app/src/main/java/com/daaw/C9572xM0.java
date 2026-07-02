package com.daaw;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.daaw.C9572xM0;
import com.google.firebase.Timestamp;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.xM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9572xM0 implements InterfaceC4153e11 {
    public final SL0 a;
    public final C1872Pc0 b;
    public int c;
    public long d;
    public CU0 e = CU0.C;
    public long f;

    /* JADX INFO: renamed from: com.daaw.xM0$b */
    public static class b {
        public UY a;

        public b() {
            this.a = TC.h();
        }
    }

    /* JADX INFO: renamed from: com.daaw.xM0$c */
    public static class c {
        public C5000h11 a;

        public c() {
        }
    }

    public C9572xM0(SL0 sl0, C1872Pc0 c1872Pc0) {
        this.a = sl0;
        this.b = c1872Pc0;
    }

    public static /* synthetic */ void k(C9572xM0 c9572xM0, Z01 z01, c cVar, Cursor cursor) {
        c9572xM0.getClass();
        C5000h11 c5000h11O = c9572xM0.o(cursor.getBlob(0));
        if (z01.equals(c5000h11O.g())) {
            cVar.a = c5000h11O;
        }
    }

    public static /* synthetic */ void l(C9572xM0 c9572xM0, Cursor cursor) {
        c9572xM0.getClass();
        c9572xM0.c = cursor.getInt(0);
        c9572xM0.d = cursor.getInt(1);
        c9572xM0.e = new CU0(new Timestamp(cursor.getLong(2), cursor.getInt(3)));
        c9572xM0.f = cursor.getLong(4);
    }

    public static /* synthetic */ void m(C9572xM0 c9572xM0, SparseArray sparseArray, int[] iArr, Cursor cursor) {
        c9572xM0.getClass();
        int i = cursor.getInt(0);
        if (sparseArray.get(i) == null) {
            c9572xM0.u(i);
            iArr[0] = iArr[0] + 1;
        }
    }

    public static /* synthetic */ void n(C9572xM0 c9572xM0, InterfaceC8310sr interfaceC8310sr, Cursor cursor) {
        c9572xM0.getClass();
        interfaceC8310sr.accept(c9572xM0.o(cursor.getBlob(0)));
    }

    @Override // com.daaw.InterfaceC4153e11
    public void a(C5000h11 c5000h11) {
        v(c5000h11);
        if (x(c5000h11)) {
            y();
        }
    }

    @Override // com.daaw.InterfaceC4153e11
    public void b(CU0 cu0) {
        this.e = cu0;
        y();
    }

    @Override // com.daaw.InterfaceC4153e11
    public void c(C5000h11 c5000h11) {
        v(c5000h11);
        x(c5000h11);
        this.f++;
        y();
    }

    @Override // com.daaw.InterfaceC4153e11
    public int d() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC4153e11
    public UY e(int i) {
        final b bVar = new b();
        this.a.A("SELECT path FROM target_documents WHERE target_id = ?").b(Integer.valueOf(i)).e(new InterfaceC8310sr() { // from class: com.daaw.tM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C9572xM0.b bVar2 = bVar;
                bVar2.a = bVar2.a.p(TC.l(AbstractC9826yG.b(((Cursor) obj).getString(0))));
            }
        });
        return bVar.a;
    }

    @Override // com.daaw.InterfaceC4153e11
    public CU0 f() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC4153e11
    public void g(UY uy, int i) {
        SQLiteStatement sQLiteStatementZ = this.a.z("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        BL0 bl0X = this.a.f();
        Iterator it = uy.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            this.a.s(sQLiteStatementZ, Integer.valueOf(i), AbstractC9826yG.c(tc.q()));
            bl0X.l(tc);
        }
    }

    @Override // com.daaw.InterfaceC4153e11
    public C5000h11 h(final Z01 z01) {
        String strC = z01.c();
        final c cVar = new c();
        this.a.A("SELECT target_proto FROM targets WHERE canonical_id = ?").b(strC).e(new InterfaceC8310sr() { // from class: com.daaw.uM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C9572xM0.k(this.a, z01, cVar, (Cursor) obj);
            }
        });
        return cVar.a;
    }

    @Override // com.daaw.InterfaceC4153e11
    public void i(UY uy, int i) {
        SQLiteStatement sQLiteStatementZ = this.a.z("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        BL0 bl0X = this.a.f();
        Iterator it = uy.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            this.a.s(sQLiteStatementZ, Integer.valueOf(i), AbstractC9826yG.c(tc.q()));
            bl0X.o(tc);
        }
    }

    public final C5000h11 o(byte[] bArr) {
        try {
            return this.b.g(C3039a11.s0(bArr));
        } catch (P10 e) {
            throw AbstractC6557mb.a("TargetData failed to parse: %s", e);
        }
    }

    public void p(final InterfaceC8310sr interfaceC8310sr) {
        this.a.A("SELECT target_proto FROM targets").e(new InterfaceC8310sr() { // from class: com.daaw.wM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C9572xM0.n(this.a, interfaceC8310sr, (Cursor) obj);
            }
        });
    }

    public long q() {
        return this.d;
    }

    public long r() {
        return this.f;
    }

    public void s(int i) {
        this.a.t("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i));
    }

    public int t(long j, final SparseArray sparseArray) {
        final int[] iArr = new int[1];
        this.a.A("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").b(Long.valueOf(j)).e(new InterfaceC8310sr() { // from class: com.daaw.vM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C9572xM0.m(this.a, sparseArray, iArr, (Cursor) obj);
            }
        });
        y();
        return iArr[0];
    }

    public final void u(int i) {
        s(i);
        this.a.t("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i));
        this.f--;
    }

    public final void v(C5000h11 c5000h11) {
        int iH = c5000h11.h();
        String strC = c5000h11.g().c();
        Timestamp timestampC = c5000h11.f().c();
        this.a.t("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(iH), strC, Long.valueOf(timestampC.g()), Integer.valueOf(timestampC.c()), c5000h11.d().W(), Long.valueOf(c5000h11.e()), this.b.n(c5000h11).h());
    }

    public void w() {
        AbstractC6557mb.d(this.a.A("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").c(new InterfaceC8310sr() { // from class: com.daaw.sM0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C9572xM0.l(this.a, (Cursor) obj);
            }
        }) == 1, "Missing target_globals entry", new Object[0]);
    }

    public final boolean x(C5000h11 c5000h11) {
        boolean z;
        if (c5000h11.h() > this.c) {
            this.c = c5000h11.h();
            z = true;
        } else {
            z = false;
        }
        if (c5000h11.e() <= this.d) {
            return z;
        }
        this.d = c5000h11.e();
        return true;
    }

    public final void y() {
        this.a.t("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e.c().g()), Integer.valueOf(this.e.c().c()), Long.valueOf(this.f));
    }
}
