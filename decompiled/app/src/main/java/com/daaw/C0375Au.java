package com.daaw;

import j$.util.Comparator$CC;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: com.daaw.Au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0375Au {
    public final EnumC8325su a;
    public final UJ b;
    public final C6209lK c;
    public final boolean d;

    public C0375Au(EnumC8325su enumC8325su, UJ uj) {
        this(enumC8325su, uj, false);
    }

    public static Comparator b() {
        return Comparator$CC.comparingInt(new ToIntFunction() { // from class: com.daaw.zu
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((C0375Au) obj).c().a();
            }
        });
    }

    public EnumC8325su c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public C8046ru e(String str) {
        Integer numF;
        if (c().equals(EnumC8325su.DAY_OF_WEEK) && str.endsWith("L") && (numF = this.b.f(str.substring(0, str.length() - 1))) != null) {
            str = numF + "L";
        }
        return new C8046ru(this.a, this.c.h(str), this.b);
    }

    public String toString() {
        return "CronParserField{field=" + this.a + '}';
    }

    public C0375Au(EnumC8325su enumC8325su, UJ uj, boolean z) {
        this.a = (EnumC8325su) AbstractC6948ny0.c(enumC8325su, "CronFieldName must not be null");
        this.b = (UJ) AbstractC6948ny0.c(uj, "FieldConstraints must not be null");
        this.c = new C6209lK(uj);
        this.d = z;
    }
}
