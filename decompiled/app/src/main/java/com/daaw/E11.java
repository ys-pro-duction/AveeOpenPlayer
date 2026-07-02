package com.daaw;

import android.os.Bundle;
import com.daaw.C5033h8;

/* JADX INFO: loaded from: classes.dex */
public class E11 implements C5033h8.d {
    public static final E11 c = a().a();
    public final String b;

    public static class a {
        public String a;

        public /* synthetic */ a(AbstractC1905Pk1 abstractC1905Pk1) {
        }

        public E11 a() {
            return new E11(this.a, null);
        }
    }

    public /* synthetic */ E11(String str, AbstractC2135Rk1 abstractC2135Rk1) {
        this.b = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E11) {
            return AbstractC8022rp0.a(this.b, ((E11) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC8022rp0.b(this.b);
    }
}
