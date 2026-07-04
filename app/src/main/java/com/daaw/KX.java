package com.daaw;

import com.daaw.C0437Bj1;
import com.daaw.C2138Rl0;

/* JADX INFO: loaded from: classes.dex */
public abstract class KX {

    public class a implements C0437Bj1.a {
        @Override // com.daaw.C0437Bj1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public B61 a(String str, String str2, int i, String str3) {
            return new B61(new C2078Qw0(-1L, str2, str, null), new C4011dX0(str, str2, i, str3));
        }
    }

    public static JX a() {
        return new JX("https://dir.xiph.org/yp.xml", "xiph_org_yp", new a(), new C2138Rl0.a());
    }
}
