package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class TZ {

    public class a extends TZ {
        @Override // com.daaw.TZ
        public SZ a(String str) {
            return null;
        }
    }

    public static TZ c() {
        return new a();
    }

    public abstract SZ a(String str);

    public final SZ b(String str) {
        SZ szA = a(str);
        return szA == null ? SZ.a(str) : szA;
    }
}
