package com.daaw;

import android.content.Context;
import com.daaw.C10217zg1;
import com.daaw.C2078Qw0;
import com.daaw.avee.MainActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9839yJ0 {
    public List a = new ArrayList(1);

    /* JADX INFO: renamed from: com.daaw.yJ0$a */
    public class a implements C10217zg1.a {
        public a() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Collection collection) {
            MainActivity mainActivityE1;
            C2078Qw0 c2078Qw0;
            Context contextI = com.daaw.avee.a.i();
            if (contextI == null || (mainActivityE1 = MainActivity.e1()) == null) {
                return;
            }
            if (!C3465ba.b(contextI, mainActivityE1)) {
                AbstractC5075hI.a.a(contextI.getResources().getString(JD0.M4));
                return;
            }
            if (collection.size() <= 0) {
                return;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext() || (c2078Qw0 = (C2078Qw0) it.next()) == null) {
                return;
            }
            C2078Qw0.c cVarK = c2078Qw0.k(contextI);
            if (cVarK.a.b.length() <= 0) {
                AbstractC5075hI.a.a(contextI.getResources().getString(JD0.N4));
            } else {
                AbstractC10118zJ0.a(contextI, cVarK.a.b, cVarK.g, cVarK.e, cVarK.c);
            }
        }
    }

    public C9839yJ0() {
        FragmentC10191zb0.N.b(new a(), this.a);
    }
}
