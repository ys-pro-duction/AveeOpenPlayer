package com.daaw;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5232hr {
    public static final String f = AbstractC1772Od0.f("ConstraintTracker");
    public final InterfaceC8357t11 a;
    public final Context b;
    public final Object c = new Object();
    public final Set d = new LinkedHashSet();
    public Object e;

    /* JADX INFO: renamed from: com.daaw.hr$a */
    public class a implements Runnable {
        public final /* synthetic */ List B;

        public a(List list) {
            this.B = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((InterfaceC4953gr) it.next()).a(AbstractC5232hr.this.e);
            }
        }
    }

    public AbstractC5232hr(Context context, InterfaceC8357t11 interfaceC8357t11) {
        this.b = context.getApplicationContext();
        this.a = interfaceC8357t11;
    }

    public void a(InterfaceC4953gr interfaceC4953gr) {
        synchronized (this.c) {
            try {
                if (this.d.add(interfaceC4953gr)) {
                    if (this.d.size() == 1) {
                        this.e = b();
                        AbstractC1772Od0.c().a(f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.e), new Throwable[0]);
                        e();
                    }
                    interfaceC4953gr.a(this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object b();

    public void c(InterfaceC4953gr interfaceC4953gr) {
        synchronized (this.c) {
            try {
                if (this.d.remove(interfaceC4953gr) && this.d.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Object obj) {
        synchronized (this.c) {
            try {
                Object obj2 = this.e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.e = obj;
                    this.a.a().execute(new a(new ArrayList(this.d)));
                }
            } finally {
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
