package com.daaw;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.daaw.AbstractC9878yT;
import com.daaw.C5033h8;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.qT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7640qT extends AbstractC8245se implements C5033h8.f {
    public final C2763Xl E;
    public final Set F;
    public final Account G;

    public AbstractC7640qT(Context context, Looper looper, int i, C2763Xl c2763Xl, AbstractC9878yT.a aVar, AbstractC9878yT.b bVar) {
        this(context, looper, i, c2763Xl, (InterfaceC0359Aq) aVar, (InterfaceC5787jq0) bVar);
    }

    public final Set K(Set set) {
        Set setJ = J(set);
        Iterator it = setJ.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setJ;
    }

    @Override // com.daaw.C5033h8.f
    public Set a() {
        return requiresSignIn() ? this.F : Collections.EMPTY_SET;
    }

    @Override // com.daaw.AbstractC8245se
    public Executor g() {
        return null;
    }

    @Override // com.daaw.AbstractC8245se
    public final Account getAccount() {
        return this.G;
    }

    @Override // com.daaw.AbstractC8245se
    public final Set j() {
        return this.F;
    }

    public AbstractC7640qT(Context context, Looper looper, int i, C2763Xl c2763Xl, InterfaceC0359Aq interfaceC0359Aq, InterfaceC5787jq0 interfaceC5787jq0) {
        this(context, looper, AbstractC7918rT.a(context), C9320wT.n(), i, c2763Xl, (InterfaceC0359Aq) AbstractC7506py0.l(interfaceC0359Aq), (InterfaceC5787jq0) AbstractC7506py0.l(interfaceC5787jq0));
    }

    public AbstractC7640qT(Context context, Looper looper, AbstractC7918rT abstractC7918rT, C9320wT c9320wT, int i, C2763Xl c2763Xl, InterfaceC0359Aq interfaceC0359Aq, InterfaceC5787jq0 interfaceC5787jq0) {
        super(context, looper, abstractC7918rT, c9320wT, i, interfaceC0359Aq == null ? null : new C1805Ol1(interfaceC0359Aq), interfaceC5787jq0 != null ? new C2139Rl1(interfaceC5787jq0) : null, c2763Xl.h());
        this.E = c2763Xl;
        this.G = c2763Xl.a();
        this.F = K(c2763Xl.c());
    }

    public Set J(Set set) {
        return set;
    }
}
