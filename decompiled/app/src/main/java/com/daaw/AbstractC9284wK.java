package com.daaw;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.wK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9284wK {
    public C8046ru a;

    public AbstractC9284wK(C8046ru c8046ru) {
        this.a = (C8046ru) AbstractC6948ny0.c(c8046ru, "CronField must not be null");
        AbstractC6948ny0.a(f(c8046ru.d()), "FieldExpression does not match required class");
    }

    public final List a(int i, int i2) {
        List listB = b(i, i2);
        if (e(i)) {
            listB.add(Integer.valueOf(i));
        }
        if (e(i2)) {
            listB.add(Integer.valueOf(i2));
        }
        LinkedList linkedList = new LinkedList(new HashSet(listB));
        Collections.sort(linkedList);
        return linkedList;
    }

    public abstract List b(int i, int i2);

    public abstract int c(int i);

    public abstract int d(int i);

    public abstract boolean e(int i);

    public abstract boolean f(AbstractC3958dK abstractC3958dK);
}
