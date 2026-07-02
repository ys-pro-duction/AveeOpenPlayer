package com.daaw;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class PL0 implements InterfaceC0364Ar0 {
    public final SL0 a;

    public PL0(SL0 sl0) {
        this.a = sl0;
    }

    public static /* synthetic */ void a(PL0 pl0) {
        if (pl0.f()) {
            Set setE = pl0.e();
            JG0 jg0G = pl0.a.g();
            Iterator it = setE.iterator();
            while (it.hasNext()) {
                C0722Ea1 c0722Ea1 = new C0722Ea1((String) it.next());
                SL0 sl0 = pl0.a;
                InterfaceC0344Am0 interfaceC0344Am0D = sl0.d(c0722Ea1, sl0.c(c0722Ea1));
                HashSet hashSet = new HashSet();
                Iterator it2 = interfaceC0344Am0D.j().iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(((C9967ym0) it2.next()).f());
                }
                new C1768Oc0(jg0G, interfaceC0344Am0D, pl0.a.b(c0722Ea1), pl0.a.c(c0722Ea1)).n(hashSet);
            }
            pl0.g();
        }
    }

    public static /* synthetic */ void c(Boolean[] boolArr, Cursor cursor) {
        try {
            if (AbstractC1940Pt0.b.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e) {
            throw AbstractC6557mb.a("SQLitePersistence.DataMigration failed to parse: %s", e);
        }
    }

    public final void d() {
        this.a.k("build overlays", new Runnable() { // from class: com.daaw.ML0
            @Override // java.lang.Runnable
            public final void run() {
                PL0.a(this.B);
            }
        });
    }

    public final Set e() {
        final HashSet hashSet = new HashSet();
        this.a.A("SELECT DISTINCT uid FROM mutation_queues").e(new InterfaceC8310sr() { // from class: com.daaw.OL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                hashSet.add(((Cursor) obj).getString(0));
            }
        });
        return hashSet;
    }

    public boolean f() {
        final Boolean[] boolArr = {Boolean.FALSE};
        this.a.A("SELECT migration_name FROM data_migrations").e(new InterfaceC8310sr() { // from class: com.daaw.NL0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                PL0.c(boolArr, (Cursor) obj);
            }
        });
        return boolArr[0].booleanValue();
    }

    public final void g() {
        this.a.t("DELETE FROM data_migrations WHERE migration_name = ?", AbstractC1940Pt0.b);
    }

    @Override // com.daaw.InterfaceC0364Ar0
    public void run() {
        d();
    }
}
