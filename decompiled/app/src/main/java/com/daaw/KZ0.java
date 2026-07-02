package com.daaw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface KZ0 extends Closeable {

    public static class b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;

        public static class a {
            public Context a;
            public String b;
            public a c;
            public boolean d;

            public a(Context context) {
                this.a = context;
            }

            public b a() {
                if (this.c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.d && TextUtils.isEmpty(this.b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.a, this.b, this.c, this.d);
            }

            public a b(a aVar) {
                this.c = aVar;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }

            public a d(boolean z) {
                this.d = z;
                return this;
            }
        }

        public b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    public interface c {
        KZ0 a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    JZ0 e0();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);

    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }

        public void c(JZ0 jz0) {
            jz0.i();
            if (!jz0.isOpen()) {
                a(jz0.i());
                return;
            }
            List listR = null;
            try {
                try {
                    listR = jz0.r();
                } finally {
                    if (listR != null) {
                        Iterator it = listR.iterator();
                        while (it.hasNext()) {
                            a((String) ((Pair) it.next()).second);
                        }
                    } else {
                        a(jz0.i());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                jz0.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(JZ0 jz0);

        public abstract void e(JZ0 jz0, int i, int i2);

        public abstract void g(JZ0 jz0, int i, int i2);

        public void b(JZ0 jz0) {
        }

        public void f(JZ0 jz0) {
        }
    }
}
