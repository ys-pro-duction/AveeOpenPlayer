package com.daaw;

import android.content.Context;
import com.daaw.C0642Dg1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2537Vg1 {
    public static C2537Vg1 b = new C2537Vg1();
    public List a = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.Vg1$a */
    public class a implements C0642Dg1.a {
        public a() {
        }

        @Override // com.daaw.C0642Dg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(Context context, G3 g3, InterfaceC7381pY interfaceC7381pY, Integer num, Integer num2) {
            new E3().q(false, g3.a, g3.b, g3.c, interfaceC7381pY, num.intValue(), num2.intValue(), 0, -1, true, null, null);
        }
    }

    public C2537Vg1() {
        AbstractC0857Fi0.a.b(new a(), this.a);
    }

    public static C2537Vg1 a() {
        return b;
    }
}
