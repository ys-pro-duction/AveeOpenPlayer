package com.daaw;

import com.daaw.C5033h8;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: com.daaw.Cl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0549Cl1 {
    public static final C5033h8.g a;
    public static final C5033h8.g b;
    public static final C5033h8.a c;
    public static final C5033h8.a d;
    public static final Scope e;
    public static final Scope f;
    public static final C5033h8 g;
    public static final C5033h8 h;

    static {
        C5033h8.g gVar = new C5033h8.g();
        a = gVar;
        C5033h8.g gVar2 = new C5033h8.g();
        b = gVar2;
        C1593Mk1 c1593Mk1 = new C1593Mk1();
        c = c1593Mk1;
        C2657Wk1 c2657Wk1 = new C2657Wk1();
        d = c2657Wk1;
        e = new Scope("profile");
        f = new Scope("email");
        g = new C5033h8("SignIn.API", c1593Mk1, gVar);
        h = new C5033h8("SignIn.INTERNAL_API", c2657Wk1, gVar2);
    }
}
