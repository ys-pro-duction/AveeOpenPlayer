package com.daaw;

import j$.util.Comparator$CC;
import java.io.Serializable;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes.dex */
public class YJ implements Serializable {
    public final EnumC8325su B;
    public final UJ C;
    public final boolean D;

    public YJ(EnumC8325su enumC8325su, UJ uj, boolean z) {
        this.B = (EnumC8325su) AbstractC6948ny0.c(enumC8325su, "CronFieldName must not be null");
        this.C = (UJ) AbstractC6948ny0.c(uj, "FieldConstraints must not be null");
        this.D = z;
    }

    public static Comparator b() {
        return Comparator$CC.comparingInt(new ToIntFunction() { // from class: com.daaw.XJ
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((YJ) obj).d().a();
            }
        });
    }

    public UJ c() {
        return this.C;
    }

    public EnumC8325su d() {
        return this.B;
    }

    public boolean e() {
        return this.D;
    }
}
