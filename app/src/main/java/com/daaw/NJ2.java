package com.daaw;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class NJ2 implements QJ2 {
    public static final NJ2 f = new NJ2(new RJ2());
    public final C7607qK2 a = new C7607qK2();
    public Date b;
    public boolean c;
    public final RJ2 d;
    public boolean e;

    public NJ2(RJ2 rj2) {
        this.d = rj2;
    }

    public static NJ2 a() {
        return f;
    }

    @Override // com.daaw.QJ2
    public final void b(boolean z) {
        if (!this.e && z) {
            Date date = new Date();
            Date date2 = this.b;
            if (date2 == null || date.after(date2)) {
                this.b = date;
                if (this.c) {
                    Iterator it = PJ2.a().b().iterator();
                    while (it.hasNext()) {
                        ((CJ2) it.next()).g().e(c());
                    }
                }
            }
        }
        this.e = z;
    }

    public final Date c() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void d(Context context) {
        if (this.c) {
            return;
        }
        this.d.d(context);
        this.d.e(this);
        this.d.f();
        this.e = this.d.C;
        this.c = true;
    }
}
