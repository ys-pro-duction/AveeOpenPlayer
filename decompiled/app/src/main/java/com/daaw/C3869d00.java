package com.daaw;

import android.view.View;
import com.daaw.C5184hh1;
import com.daaw.C8820uh1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.d00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3869d00 extends C5184hh1.b {
    public final View D;
    public int E;
    public int F;
    public final int[] G;

    public C3869d00(View view) {
        super(0);
        this.G = new int[2];
        this.D = view;
    }

    @Override // com.daaw.C5184hh1.b
    public void c(C5184hh1 c5184hh1) {
        this.D.setTranslationY(0.0f);
    }

    @Override // com.daaw.C5184hh1.b
    public void d(C5184hh1 c5184hh1) {
        this.D.getLocationOnScreen(this.G);
        this.E = this.G[1];
    }

    @Override // com.daaw.C5184hh1.b
    public C8820uh1 e(C8820uh1 c8820uh1, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C5184hh1) it.next()).c() & C8820uh1.m.c()) != 0) {
                this.D.setTranslationY(AbstractC6991o7.c(this.F, 0, r0.b()));
                break;
            }
        }
        return c8820uh1;
    }

    @Override // com.daaw.C5184hh1.b
    public C5184hh1.a f(C5184hh1 c5184hh1, C5184hh1.a aVar) {
        this.D.getLocationOnScreen(this.G);
        int i = this.E - this.G[1];
        this.F = i;
        this.D.setTranslationY(i);
        return aVar;
    }
}
