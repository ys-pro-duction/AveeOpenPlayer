package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.cX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3733cX1 implements VT1 {
    public C5017h43 b;
    public final C7104oY1 c;

    public C3733cX1(Context context, C5017h43 c5017h43) {
        this.c = new C7104oY1(context);
        this.b = c5017h43;
    }

    @Override // com.daaw.VT1
    public final void a(ZU2 zu2) {
        if (zu2 == null) {
            return;
        }
        try {
            A83 a83B = E83.B();
            a83B.l(this.b);
            a83B.k(zu2);
            this.c.a((E83) a83B.e());
        } catch (Throwable th) {
            JC1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.daaw.VT1
    public final void b(ZU2 zu2, int i) {
        try {
            G33 g33 = (G33) this.b.f();
            g33.j(i);
            this.b = (C5017h43) g33.e();
            a(zu2);
        } catch (Throwable th) {
            JC1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.daaw.VT1
    public final void c(JS2 js2, int i) {
        try {
            G33 g33 = (G33) this.b.f();
            g33.j(i);
            this.b = (C5017h43) g33.e();
            e(js2);
        } catch (Throwable th) {
            JC1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.daaw.VT1
    public final void d(C4474f93 c4474f93) {
        if (c4474f93 == null) {
            return;
        }
        try {
            A83 a83B = E83.B();
            a83B.l(this.b);
            a83B.m(c4474f93);
            this.c.a((E83) a83B.e());
        } catch (Throwable th) {
            JC1.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.daaw.VT1
    public final void e(JS2 js2) {
        if (js2 == null) {
            return;
        }
        try {
            A83 a83B = E83.B();
            a83B.l(this.b);
            a83B.j(js2);
            this.c.a((E83) a83B.e());
        } catch (Throwable th) {
            JC1.k("BillingLogger", "Unable to log.", th);
        }
    }
}
