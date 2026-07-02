package com.daaw;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class CJ2 extends AbstractC9841yJ2 {
    public static final Pattern i = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final AJ2 a;
    public final C10120zJ2 b;
    public LK2 d;
    public AbstractC4807gK2 e;
    public final List c = new ArrayList();
    public boolean f = false;
    public boolean g = false;
    public final String h = UUID.randomUUID().toString();

    public CJ2(C10120zJ2 c10120zJ2, AJ2 aj2) {
        this.b = c10120zJ2;
        this.a = aj2;
        k(null);
        if (aj2.d() == BJ2.HTML || aj2.d() == BJ2.JAVASCRIPT) {
            this.e = new C5086hK2(aj2.a());
        } else {
            this.e = new C5924kK2(aj2.i(), null);
        }
        this.e.k();
        PJ2.a().d(this);
        ZJ2.a().d(this.e.a(), c10120zJ2.b());
    }

    @Override // com.daaw.AbstractC9841yJ2
    public final void b(View view, FJ2 fj2, String str) {
        SJ2 sj2;
        if (this.g) {
            return;
        }
        if (!i.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                sj2 = null;
                break;
            } else {
                sj2 = (SJ2) it.next();
                if (sj2.b().get() == view) {
                    break;
                }
            }
        }
        if (sj2 == null) {
            this.c.add(new SJ2(view, fj2, "Ad overlay"));
        }
    }

    @Override // com.daaw.AbstractC9841yJ2
    public final void c() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.clear();
        }
        this.g = true;
        ZJ2.a().c(this.e.a());
        PJ2.a().e(this);
        this.e.c();
        this.e = null;
    }

    @Override // com.daaw.AbstractC9841yJ2
    public final void d(View view) {
        if (this.g || f() == view) {
            return;
        }
        k(view);
        this.e.b();
        Collection<CJ2> collectionC = PJ2.a().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (CJ2 cj2 : collectionC) {
            if (cj2 != this && cj2.f() == view) {
                cj2.d.clear();
            }
        }
    }

    @Override // com.daaw.AbstractC9841yJ2
    public final void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        PJ2.a().f(this);
        this.e.i(C3125aK2.c().a());
        this.e.e(NJ2.a().c());
        this.e.g(this, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f() {
        return (View) this.d.get();
    }

    public final AbstractC4807gK2 g() {
        return this.e;
    }

    public final String h() {
        return this.h;
    }

    public final List i() {
        return this.c;
    }

    public final boolean j() {
        return this.f && !this.g;
    }

    public final void k(View view) {
        this.d = new LK2(view);
    }
}
