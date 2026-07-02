package com.daaw;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8380t6 implements Q21 {
    public final View a;
    public ActionMode b;
    public final I11 c;
    public R21 d;

    /* JADX INFO: renamed from: com.daaw.t6$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m64invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m64invoke() {
            C8380t6.this.b = null;
        }
    }

    public C8380t6(View view) {
        G10.g(view, "view");
        this.a = view;
        this.c = new I11(new a(), null, null, null, null, null, 62, null);
        this.d = R21.Hidden;
    }
}
