package com.daaw;

import android.graphics.PointF;
import com.daaw.AbstractC9089ve;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.jK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5643jK0 implements InterfaceC9034vR0, AbstractC9089ve.b {
    public final C4615ff0 a;
    public final String b;
    public final AbstractC9089ve c;
    public C6796nR0 d;

    public C5643jK0(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, C5363iK0 c5363iK0) {
        this.a = c4615ff0;
        this.b = c5363iK0.c();
        AbstractC9089ve abstractC9089veH = c5363iK0.b().h();
        this.c = abstractC9089veH;
        abstractC9647xe.j(abstractC9089veH);
        abstractC9089veH.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    public static int f(int i, int i2) {
        return i - (c(i, i2) * i2);
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        this.a.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    @Override // com.daaw.InterfaceC9034vR0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.C6796nR0 d(com.daaw.C6796nR0 r19) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5643jK0.d(com.daaw.nR0):com.daaw.nR0");
    }

    public AbstractC9089ve h() {
        return this.c;
    }

    public final C6796nR0 j(C6796nR0 c6796nR0) {
        List listA = c6796nR0.a();
        boolean zD = c6796nR0.d();
        int size = listA.size() - 1;
        int i = 0;
        while (size >= 0) {
            C1527Lu c1527Lu = (C1527Lu) listA.get(size);
            C1527Lu c1527Lu2 = (C1527Lu) listA.get(f(size - 1, listA.size()));
            PointF pointFC = (size != 0 || zD) ? c1527Lu2.c() : c6796nR0.b();
            i = (((size != 0 || zD) ? c1527Lu2.b() : pointFC).equals(pointFC) && c1527Lu.a().equals(pointFC) && !(!c6796nR0.d() && size == 0 && size == listA.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        C6796nR0 c6796nR02 = this.d;
        if (c6796nR02 == null || c6796nR02.a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C1527Lu());
            }
            this.d = new C6796nR0(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.d.e(zD);
        return this.d;
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
    }
}
