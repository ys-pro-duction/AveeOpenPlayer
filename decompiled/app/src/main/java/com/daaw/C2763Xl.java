package com.daaw;

import android.accounts.Account;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2763Xl {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final int e;
    public final View f;
    public final String g;
    public final String h;
    public final C5675jS0 i;
    public Integer j;

    /* JADX INFO: renamed from: com.daaw.Xl$a */
    public static final class a {
        public Account a;
        public C2823Ya b;
        public String c;
        public String d;
        public final C5675jS0 e = C5675jS0.k;

        public C2763Xl a() {
            return new C2763Xl(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.b == null) {
                this.b = new C2823Ya();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.a = account;
            return this;
        }

        public final a e(String str) {
            this.d = str;
            return this;
        }
    }

    public C2763Xl(Account account, Set set, Map map, int i, View view, String str, String str2, C5675jS0 c5675jS0, boolean z) {
        this.a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.d = map;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = c5675jS0 == null ? C5675jS0.k : c5675jS0;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.a;
    }

    public Account b() {
        Account account = this.a;
        return account != null ? account : new Account(AbstractC8245se.DEFAULT_ACCOUNT, "com.google");
    }

    public Set c() {
        return this.c;
    }

    public String d() {
        return this.g;
    }

    public Set e() {
        return this.b;
    }

    public final C5675jS0 f() {
        return this.i;
    }

    public final Integer g() {
        return this.j;
    }

    public final String h() {
        return this.h;
    }

    public final void i(Integer num) {
        this.j = num;
    }
}
