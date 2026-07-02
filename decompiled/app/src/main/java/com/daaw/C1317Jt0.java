package com.daaw;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Jt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1317Jt0 {
    public boolean a = false;
    public final Set b = new C2823Ya();
    public final Map c = new HashMap();
    public final Comparator d = new a();

    /* JADX INFO: renamed from: com.daaw.Jt0$a */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0689Ds0 c0689Ds0, C0689Ds0 c0689Ds02) {
            float fFloatValue = ((Float) c0689Ds0.b).floatValue();
            float fFloatValue2 = ((Float) c0689Ds02.b).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public void a(String str, float f) {
        if (this.a) {
            C0532Ch0 c0532Ch0 = (C0532Ch0) this.c.get(str);
            if (c0532Ch0 == null) {
                c0532Ch0 = new C0532Ch0();
                this.c.put(str, c0532Ch0);
            }
            c0532Ch0.a(f);
            if (str.equals("__container")) {
                Iterator it = this.b.iterator();
                if (it.hasNext()) {
                    AbstractC6314li0.a(it.next());
                    throw null;
                }
            }
        }
    }

    public void b(boolean z) {
        this.a = z;
    }
}
