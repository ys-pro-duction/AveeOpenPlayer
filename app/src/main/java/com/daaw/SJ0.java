package com.daaw;

import android.database.Cursor;
import com.daaw.KZ0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SJ0 extends KZ0.a {
    public C3573bw b;
    public final a c;
    public final String d;
    public final String e;

    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a(JZ0 jz0);

        public abstract void b(JZ0 jz0);

        public abstract void c(JZ0 jz0);

        public abstract void d(JZ0 jz0);

        public abstract void e(JZ0 jz0);

        public abstract void f(JZ0 jz0);

        public abstract b g(JZ0 jz0);
    }

    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public SJ0(C3573bw c3573bw, a aVar, String str, String str2) {
        super(aVar.a);
        this.b = c3573bw;
        this.c = aVar;
        this.d = str;
        this.e = str2;
    }

    public static boolean j(JZ0 jz0) {
        Cursor cursorH0 = jz0.h0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorH0.moveToFirst()) {
                if (cursorH0.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorH0.close();
        }
    }

    public static boolean k(JZ0 jz0) {
        Cursor cursorH0 = jz0.h0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (cursorH0.moveToFirst()) {
                if (cursorH0.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorH0.close();
        }
    }

    @Override // com.daaw.KZ0.a
    public void b(JZ0 jz0) {
        super.b(jz0);
    }

    @Override // com.daaw.KZ0.a
    public void d(JZ0 jz0) {
        boolean zJ = j(jz0);
        this.c.a(jz0);
        if (!zJ) {
            b bVarG = this.c.g(jz0);
            if (!bVarG.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.b);
            }
        }
        l(jz0);
        this.c.c(jz0);
    }

    @Override // com.daaw.KZ0.a
    public void e(JZ0 jz0, int i, int i2) {
        g(jz0, i, i2);
    }

    @Override // com.daaw.KZ0.a
    public void f(JZ0 jz0) {
        super.f(jz0);
        h(jz0);
        this.c.d(jz0);
        this.b = null;
    }

    @Override // com.daaw.KZ0.a
    public void g(JZ0 jz0, int i, int i2) {
        List listC;
        C3573bw c3573bw = this.b;
        if (c3573bw == null || (listC = c3573bw.d.c(i, i2)) == null) {
            C3573bw c3573bw2 = this.b;
            if (c3573bw2 != null && !c3573bw2.a(i, i2)) {
                this.c.b(jz0);
                this.c.a(jz0);
                return;
            }
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.c.f(jz0);
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((AbstractC8555tk0) it.next()).a(jz0);
        }
        b bVarG = this.c.g(jz0);
        if (bVarG.a) {
            this.c.e(jz0);
            l(jz0);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + bVarG.b);
        }
    }

    public final void h(JZ0 jz0) {
        if (!k(jz0)) {
            b bVarG = this.c.g(jz0);
            if (bVarG.a) {
                this.c.e(jz0);
                l(jz0);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.b);
            }
        }
        Cursor cursorH0 = jz0.H0(new SS0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorH0.moveToFirst() ? cursorH0.getString(0) : null;
            cursorH0.close();
            if (!this.d.equals(string) && !this.e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorH0.close();
            throw th;
        }
    }

    public final void i(JZ0 jz0) {
        jz0.v("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void l(JZ0 jz0) {
        i(jz0);
        jz0.v(RJ0.a(this.d));
    }
}
