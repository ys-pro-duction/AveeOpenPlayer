package com.daaw;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
public abstract class B40 {
    public static final AP a;
    public static final String b;
    public static final C2352Tm0 c;
    public static final AP d;
    public static final AP e;
    public static final AP f;
    public static final AP g;
    public static final AP h;
    public static final AP i;
    public static final AP j;
    public static final AP k;
    public static final AP l;
    public static final AP m;
    public static final AP n;
    public static final AP o;
    public static final AP p;
    public static final AP q;
    public static final AP r;
    public static final AP s;
    public static final AP t;
    public static final String u;
    public static final AP v;
    public static final AP w;

    static {
        AP ap = new AP("kotlin.Metadata");
        a = ap;
        b = "L" + Y40.c(ap).f() + ";";
        c = C2352Tm0.l("value");
        d = new AP(Target.class.getName());
        e = new AP(ElementType.class.getName());
        f = new AP(Retention.class.getName());
        g = new AP(RetentionPolicy.class.getName());
        h = new AP(Deprecated.class.getName());
        i = new AP(Documented.class.getName());
        j = new AP("java.lang.annotation.Repeatable");
        k = new AP(Override.class.getName());
        l = new AP("org.jetbrains.annotations.NotNull");
        m = new AP("org.jetbrains.annotations.Nullable");
        n = new AP("org.jetbrains.annotations.Mutable");
        o = new AP("org.jetbrains.annotations.ReadOnly");
        p = new AP("kotlin.annotations.jvm.ReadOnly");
        q = new AP("kotlin.annotations.jvm.Mutable");
        r = new AP("kotlin.jvm.PurelyImplements");
        s = new AP("kotlin.jvm.internal");
        AP ap2 = new AP("kotlin.jvm.internal.SerializedIr");
        t = ap2;
        u = "L" + Y40.c(ap2).f() + ";";
        v = new AP("kotlin.jvm.internal.EnhancedNullability");
        w = new AP("kotlin.jvm.internal.EnhancedMutability");
    }
}
