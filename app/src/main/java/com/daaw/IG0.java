package com.daaw;

import android.content.Context;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class IG0 {
    public final String a;
    public Object b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public IG0(String str) {
        this.a = str;
    }

    public abstract Object a(IBinder iBinder);

    public final Object b(Context context) throws a {
        if (this.b == null) {
            AbstractC7506py0.l(context);
            Context contextD = ET.d(context);
            if (contextD == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.b = a((IBinder) contextD.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new a("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new a("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new a("Could not instantiate creator.", e3);
            }
        }
        return this.b;
    }
}
