package com.daaw;

import j$.util.Comparator$CC;
import java.io.Serializable;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: com.daaw.ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8046ru implements Serializable {
    public final EnumC8325su B;
    public final AbstractC3958dK C;
    public final UJ D;

    public C8046ru(EnumC8325su enumC8325su, AbstractC3958dK abstractC3958dK, UJ uj) {
        this.B = enumC8325su;
        this.C = (AbstractC3958dK) AbstractC6948ny0.c(abstractC3958dK, "FieldExpression must not be null");
        this.D = (UJ) AbstractC6948ny0.c(uj, "FieldConstraints must not be null");
    }

    public static Comparator b() {
        return Comparator$CC.comparingInt(new ToIntFunction() { // from class: com.daaw.qu
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((C8046ru) obj).e().a();
            }
        });
    }

    public UJ c() {
        return this.D;
    }

    public AbstractC3958dK d() {
        return this.C;
    }

    public EnumC8325su e() {
        return this.B;
    }

    public String toString() {
        return "CronField{field=" + this.B + '}';
    }
}
