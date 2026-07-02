package com.daaw;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.tR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8469tR0 extends AbstractC9089ve {
    public final C6796nR0 i;
    public final Path j;
    public List k;

    public C8469tR0(List list) {
        super(list);
        this.i = new C6796nR0();
        this.j = new Path();
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Path i(Y70 y70, float f) {
        this.i.c((C6796nR0) y70.b, (C6796nR0) y70.c, f);
        C6796nR0 c6796nR0D = this.i;
        List list = this.k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c6796nR0D = ((InterfaceC9034vR0) this.k.get(size)).d(c6796nR0D);
            }
        }
        AbstractC9678xk0.h(c6796nR0D, this.j);
        return this.j;
    }

    public void q(List list) {
        this.k = list;
    }
}
