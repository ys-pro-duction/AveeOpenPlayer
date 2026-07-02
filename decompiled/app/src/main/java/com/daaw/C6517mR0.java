package com.daaw;

import android.graphics.Path;
import com.daaw.AbstractC9089ve;

/* JADX INFO: renamed from: com.daaw.mR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6517mR0 implements InterfaceC6648mt0, AbstractC9089ve.b {
    public final String b;
    public final boolean c;
    public final C4615ff0 d;
    public final C8469tR0 e;
    public boolean f;
    public final Path a = new Path();
    public final C2571Vp g = new C2571Vp();

    public C6517mR0(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, C9592xR0 c9592xR0) {
        this.b = c9592xR0.b();
        this.c = c9592xR0.d();
        this.d = c4615ff0;
        C8469tR0 c8469tR0H = c9592xR0.c().h();
        this.e = c8469tR0H;
        abstractC9647xe.j(c8469tR0H);
        c8469tR0H.a(this);
    }

    private void c() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // com.daaw.InterfaceC2371Tr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            com.daaw.Tr r1 = (com.daaw.InterfaceC2371Tr) r1
            boolean r2 = r1 instanceof com.daaw.C4178e61
            if (r2 == 0) goto L26
            r2 = r1
            com.daaw.e61 r2 = (com.daaw.C4178e61) r2
            com.daaw.BR0$a r3 = r2.k()
            com.daaw.BR0$a r4 = com.daaw.BR0.a.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            com.daaw.Vp r1 = r5.g
            r1.a(r2)
            r2.c(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof com.daaw.InterfaceC9034vR0
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            com.daaw.vR0 r1 = (com.daaw.InterfaceC9034vR0) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            com.daaw.tR0 r6 = r5.e
            r6.q(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6517mR0.b(java.util.List, java.util.List):void");
    }

    @Override // com.daaw.InterfaceC6648mt0
    public Path i() {
        if (this.f) {
            return this.a;
        }
        this.a.reset();
        if (this.c) {
            this.f = true;
            return this.a;
        }
        Path path = (Path) this.e.h();
        if (path == null) {
            return this.a;
        }
        this.a.set(path);
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.g.b(this.a);
        this.f = true;
        return this.a;
    }
}
