package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.AbstractC6314li0;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static a c;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new C0267a());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    public class C0267a implements Handler.Callback {
        public C0267a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            AbstractC6314li0.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    public interface b {
    }

    public static class c {
    }

    public static a b() {
        if (c == null) {
            c = new a();
        }
        return c;
    }

    public final boolean a(c cVar, int i) {
        throw null;
    }

    public void c(c cVar) {
        synchronized (this.a) {
            a(cVar, 2);
        }
    }

    public final boolean d(b bVar) {
        return false;
    }

    public void e(b bVar) {
        synchronized (this.a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
