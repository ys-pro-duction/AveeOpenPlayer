package com.daaw;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class G23 {
    public static final G23 b = new G23(new H23());
    public static final G23 c = new G23(new L23());
    public static final G23 d = new G23(new N23());
    public static final G23 e = new G23(new M23());
    public static final G23 f = new G23(new I23());
    public static final G23 g = new G23(new K23());
    public static final G23 h = new G23(new J23());
    public final F23 a;

    public G23(O23 o23) {
        if (UW2.b()) {
            this.a = new E23(o23, null);
        } else if (V23.a()) {
            this.a = new C9208w23(o23, null);
        } else {
            this.a = new C23(o23, null);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.a.zza(str);
    }
}
