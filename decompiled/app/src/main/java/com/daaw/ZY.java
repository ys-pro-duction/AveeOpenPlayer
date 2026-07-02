package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ZY {
    public final ArrayList a;

    public static final class a {
        public final Set a = new HashSet();

        public a a(int i) {
            this.a.add(Integer.valueOf(i));
            return this;
        }

        public ZY b() {
            return new ZY(this.a, null);
        }
    }

    public /* synthetic */ ZY(Set set, L02 l02) {
        this.a = new ArrayList(DesugarCollections.unmodifiableList(new ArrayList(set)));
    }

    public static a a() {
        return new a();
    }

    public final ArrayList b() {
        return this.a;
    }
}
