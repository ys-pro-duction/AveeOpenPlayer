package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class SZ {
    public static final String a = AbstractC1772Od0.f("InputMerger");

    public static SZ a(String str) {
        try {
            return (SZ) Class.forName(str).newInstance();
        } catch (Exception e) {
            AbstractC1772Od0.c().b(a, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract androidx.work.b b(List list);
}
