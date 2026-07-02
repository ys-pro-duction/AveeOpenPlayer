package com.daaw;

import android.view.View;
import android.view.animation.Animation;
import com.daaw.XS;

/* JADX INFO: renamed from: com.daaw.Pd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1877Pd1 implements XS {
    public final a a;

    /* JADX INFO: renamed from: com.daaw.Pd1$a */
    public interface a {
        Animation a();
    }

    public C1877Pd1(a aVar) {
        this.a = aVar;
    }

    @Override // com.daaw.XS
    public boolean a(Object obj, XS.a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.a.a());
        return false;
    }
}
